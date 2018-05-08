package com.singleton.liu;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * 扩展的JDesktopPane，在父窗体菜单（如果父窗体有菜单条）上自动添加windows菜单，并实现对内部窗体的切换、平铺、层叠管理
 * 
 * @version 1.0
 * @see JDesktopPane
 */
public class MDIPane extends JDesktopPane implements VetoableChangeListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JFrame parentFrame = null;
	JMenuBar parentMenuBar = null;
	JMenu jMenuWindow = new JMenu();
	JMenuItem jMenuWindowTile = new JMenuItem();
	JMenuItem jMenuWindowCascade = new JMenuItem();
	ArrayList<JCheckBoxMenuItem> frameItems = new ArrayList<JCheckBoxMenuItem>();
	ArrayList<JInternalFrame> frameHandles = new ArrayList<JInternalFrame>();
	ButtonGroup frameItemGroup = new ButtonGroup();
	private int menuCount;

	/**
	 * @param parentFrame
	 *            ，父窗体
	 */
	public MDIPane(JFrame parentFrame) {
		try {
			this.parentFrame = parentFrame;
			this.parentFrame.add(this);
			this.parentMenuBar = parentFrame.getJMenuBar();
			jbInit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 接受一个传入的JInternalFrame，如果此JInternalFrame已经在MDIPane中，把它置为当前活动窗口
	 * 如果JInternalFrame不在MDIPane中，则把它加入MDIPane
	 * 
	 * @throws PropertyVetoException
	 */
	public void showFrame(JInternalFrame frame) throws PropertyVetoException {
		if (!frameIsContained(frame)) {
			this.add(frame);
			addFrameHandleMenuItem(frame);
		}
		frame.addVetoableChangeListener(this);
		displayFrame(frame);
		frame.setSelected(true);
	}

	private void displayFrame(JInternalFrame frame) {

		if (frame.isIcon())
			try {
				frame.setIcon(false);
			} catch (PropertyVetoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		frame.setVisible(true);
	}

	private void addFrameHandleMenuItem(JInternalFrame frame) {
		String frameTitle = frame.getTitle();
		JCheckBoxMenuItem frameItem = new JCheckBoxMenuItem(frameTitle);
		frameItemGroup.add(frameItem);
		frameItem.setSelected(true);
		frameItems.add(frameItem);
		frameHandles.add(frame);
		jMenuWindow.add(frameItem);
		frameItem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showSelectedFrame(e);
			}
		});
	}

	private void showSelectedFrame(ActionEvent e) {
		JCheckBoxMenuItem frameItem = (JCheckBoxMenuItem) e.getSource();
		for (int i = 0; i < frameItems.size(); i++) {
			if (frameItem == (JCheckBoxMenuItem) frameItems.get(i)) {
				JInternalFrame frame = (JInternalFrame) frameHandles.get(i);
				try {
					frame.setSelected(true);
					displayFrame(frame);
				} catch (PropertyVetoException ex) {
					System.out.println(ex);
				}
				break;
			}
		}
	}

	public void vetoableChange(PropertyChangeEvent e) {
		JInternalFrame frame = (JInternalFrame) e.getSource();
		String name = e.getPropertyName();
		Object value = e.getNewValue();
		if (name.equals("selected") && value.equals(Boolean.TRUE)) {
			for (int i = 0; i < frameHandles.size(); i++) {
				if (frame == (JInternalFrame) frameHandles.get(i)) {
					JCheckBoxMenuItem frameItem = (JCheckBoxMenuItem) frameItems
							.get(i);
					frameItem.setSelected(true);
					break;
				}
			}
		}
		if (name.equals("closed") && value.equals(Boolean.TRUE)) {
			for (int i = 0; i < frameHandles.size(); i++) {
				if (frame == (JInternalFrame) frameHandles.get(i)) {
					jMenuWindow.remove((JCheckBoxMenuItem) frameItems.get(i));
					frameItemGroup
							.remove((JCheckBoxMenuItem) frameItems.get(i));
					frameHandles.remove(i);
					frameItems.remove(i);
					break;
				}
			}
		}
	}

	private boolean frameIsContained(JInternalFrame frame) {
		JInternalFrame[] frames = this.getAllFrames();
		for (int i = 0; i < frames.length; i++) {
			if (frame == frames[i]) {
				return true;
			}
		}
		return false;
	}

	private void tileWindows() {
		JInternalFrame[] frames = this.getAllFrames();
		if (frames.length == 0)
			return;
		int frameCount = frames.length;
		int rows = (int) Math.sqrt(frameCount);
		int cols = frameCount / rows;
		int extra = frameCount % rows;
		int width = this.getWidth() / cols;
		int height = this.getHeight() / rows;
		int r = 0;
		int c = 0;

		for (int i = 0; i < frames.length; i++) {
			try {
				frames[i].setMaximum(false);
				frames[i].setIcon(false);
				frames[i].reshape(c * width, r * height, width, height);
				r++;
				if (r == rows) {
					r = 0;
					c++;
					if (c == cols - extra) {
						rows++;
						height = this.getHeight() / rows;
					}
				}
			} catch (PropertyVetoException ex) {
				System.out.println(ex);
			}
		}
	}

	private void cascadeWindows() {
		JInternalFrame[] frames = this.getAllFrames();
		if (frames.length == 0)
			return;
		int x = 0;
		int y = 0;
		int width = this.getWidth() / 2;
		int height = this.getHeight() / 2;
		int frameDistance = frames[0].getHeight()
				- frames[0].getRootPane().getHeight();

		for (int i = 0; i < frames.length; i++) {
			try {
				frames[i].setMaximum(false);
				frames[i].setIcon(false);
				frames[i].reshape(x, y, width, height);
				x += frameDistance;
				y += frameDistance;
				if (x + width > this.getWidth())
					x = 0;
				if (y + height > this.getHeight())
					y = 0;
			} catch (PropertyVetoException ex) {
				System.out.println(ex);
			}
		}
	}

	private void jbInit() throws Exception {
		jMenuWindowTile.setText("Tile");
		jMenuWindowTile.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jMenuWindowTile_actionPerformed(e);
			}
		});
		jMenuWindowCascade.setText("Cascade");
		jMenuWindowCascade
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(ActionEvent e) {
						jMenuWindowCascade_actionPerformed(e);
					}
				});
		jMenuWindow.setText("Window");
		jMenuWindow.add(jMenuWindowTile);
		jMenuWindow.add(jMenuWindowCascade);
		jMenuWindow.addSeparator();
		if (parentMenuBar != null)

			menuCount = parentMenuBar.getComponentCount();

		// 将WinodwMenu加在parentFrame菜单倒数第二项
		parentMenuBar.add(jMenuWindow, (menuCount > 0) ? menuCount - 1 : 0);
	}

	void jMenuWindowTile_actionPerformed(ActionEvent e) {
		tileWindows();
	}

	void jMenuWindowCascade_actionPerformed(ActionEvent e) {
		cascadeWindows();
	}
}