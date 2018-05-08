package com.singleton.liu;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class ToolBoxInternalFrame extends JInternalFrame {

	private static ToolBoxInternalFrame toolBoxInternalFrame = null;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ToolBoxInternalFrame(String title, boolean resizable,
			boolean closable, boolean maximizable, boolean iconifiable) {
		super(title, resizable, closable, maximizable, iconifiable);
		// TODO Auto-generated constructor stub
		setBounds(100, 100, 423, 300);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JButton btnNewButton_1 = new JButton("\u5DE5\u5177\u4E00");
		btnNewButton_1.setBounds(10, 10, 93, 23);
		panel.add(btnNewButton_1);

		JButton btnNewButton = new JButton("\u5DE5\u5177\u4E8C");
		btnNewButton.setBounds(10, 43, 93, 23);
		panel.add(btnNewButton);

		JButton btnNewButton_2 = new JButton("\u5DE5\u5177\u4E09");
		btnNewButton_2.setBounds(10, 75, 93, 23);
		panel.add(btnNewButton_2);
	}

	public static ToolBoxInternalFrame getInstance() {
		if (toolBoxInternalFrame == null) {
			synchronized (ToolBoxInternalFrame.class) {
				if (toolBoxInternalFrame == null) {
					toolBoxInternalFrame = new ToolBoxInternalFrame("π§æﬂœ‰",
							true, true, true, true);
				}
			}
		}
		return toolBoxInternalFrame;
	}
	
}
