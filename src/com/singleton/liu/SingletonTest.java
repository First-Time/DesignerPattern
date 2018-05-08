package com.singleton.liu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JButton;

public class SingletonTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private MainPane mainPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingletonTest frame = new SingletonTest();
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
	public SingletonTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		mainPane = new MainPane();
		getContentPane().add(mainPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
				panel.setLayout(new BorderLayout(0, 0));
		
				JMenuBar menuBar = new JMenuBar();
				panel.add(menuBar, BorderLayout.NORTH);
				
						JMenu mnNewMenu = new JMenu("\u5DE5\u5177");
						menuBar.add(mnNewMenu);
						
								JMenuItem toolboxMenuItem = new JMenuItem("\u5DE5\u5177\u7BB1");
								toolboxMenuItem.addActionListener(new ActionListener() {

									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										ToolBoxInternalFrame toolBoxInternalFrame = ToolBoxInternalFrame
												.getInstance();
										mainPane.showInternalFrame(toolBoxInternalFrame);
									}
								});
								mnNewMenu.add(toolboxMenuItem);
								
								JToolBar toolBar = new JToolBar();
								panel.add(toolBar, BorderLayout.SOUTH);
								
								JButton btnNewButton = new JButton("\u5DE5\u5177\u4E00");
								btnNewButton.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										ToolBoxInternalFrame toolBoxInternalFrame = ToolBoxInternalFrame
												.getInstance();
										mainPane.showInternalFrame(toolBoxInternalFrame);
									}
								});
								toolBar.add(btnNewButton);
								
								JButton btnNewButton_1 = new JButton("\u5DE5\u5177\u4E8C");
								toolBar.add(btnNewButton_1);
								
								JButton btnNewButton_2 = new JButton("\u5DE5\u5177\u4E09");
								toolBar.add(btnNewButton_2);
	}
}
