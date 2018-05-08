package com.singleton.liu;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.PropertyVetoException;

public class MDIPaneTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static MDIPane mdiPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MDIPaneTest frame = new MDIPaneTest();
					mdiPane = new MDIPane(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MDIPaneTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu = new JMenu("\u83DC\u53551");
		menuBar.add(menu);

		JMenuItem menuItem = new JMenuItem("\u83DC\u53551.1");
		menu.add(menuItem);
		menuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JInternalFrame internalFrame = new JInternalFrame(
						"Internale Frame", true, true, true, true);
				internalFrame.setLocation(20, 20);
				internalFrame.setSize(new Dimension(400, 400));

				Container icontentPane = internalFrame.getContentPane();
				JTextArea textArea = new JTextArea("Hello New Page");
				JButton b = new JButton("Internale Frame Button");
				icontentPane.add(textArea, "Center");
				icontentPane.add(b, "South");

				try {
					mdiPane.showFrame(internalFrame);
				} catch (PropertyVetoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		JMenuItem menuItem_1 = new JMenuItem("\u83DC\u53551.2");
		menu.add(menuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JButton btn_Add = new JButton("\u6DFB\u52A0\u5B50\u9875\u9762");
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 4; i++) {
					JInternalFrame internalFrame = new JInternalFrame(
							"Internale Frame" + i, true, true, true, true);
					internalFrame.setLocation(20, 20);
					internalFrame.setSize(new Dimension(400, 400));

					Container icontentPane = internalFrame.getContentPane();
					JTextArea textArea = new JTextArea("Hello New Page" + i);
					JButton b = new JButton("Internale Frame Button");
					icontentPane.add(textArea, "Center");
					icontentPane.add(b, "South");

					try {
						mdiPane.showFrame(internalFrame);
					} catch (PropertyVetoException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		contentPane.add(btn_Add, BorderLayout.SOUTH);
	}

}
