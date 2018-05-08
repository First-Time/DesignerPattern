package com.singleton.liu;

import java.beans.PropertyVetoException;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class MainPane extends JDesktopPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainPane() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void showInternalFrame(JInternalFrame frame) {
		if (isFrameContained(frame)) {
			return;
		}
		this.add(frame);
		try {
			frame.setMaximum(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		frame.setVisible(true);
	}

	private boolean isFrameContained(JInternalFrame frame) {
		JInternalFrame[] frames = this.getAllFrames();
		for (int i = 0; i < frames.length; i++) {
			if (frame == frames[i]) {
				return true;
			}
		}
		return false;
	}
}
