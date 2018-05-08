package com.builder.liu;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BuilderTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel panel_Thin;
	private JPanel panel_Fat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuilderTest frame = new BuilderTest();
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
	public BuilderTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.EAST);

		JButton btnThin = new JButton("\u753B\u7626\u4EBA");
		btnThin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphics g = panel_Thin.getGraphics();
				g.setColor(Color.blue);
				PersonThinBuilder thinBuilder = new PersonThinBuilder(g);
				PersonDirector personDirector = new PersonDirector(thinBuilder);
				personDirector.createPerson();
			}
		});

		JButton btnFat = new JButton("\u753B\u80D6\u4EBA");
		btnFat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Graphics g = panel_Fat.getGraphics();
				g.setColor(Color.green);
				PersonFatBuilder fatBuilder = new PersonFatBuilder(g);
				PersonDirector personDirector = new PersonDirector(fatBuilder);
				personDirector.createPerson();
			}
		});
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		panel.add(btnThin);
		panel.add(btnFat);

		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(1, 0, 0, 2));

		panel_Thin = new JPanel();
		panel_1.add(panel_Thin);

		panel_Fat = new JPanel();
		panel_1.add(panel_Fat);
	}

}
