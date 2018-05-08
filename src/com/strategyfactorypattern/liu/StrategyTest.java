package com.strategyfactorypattern.liu;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class StrategyTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_Price;
	private JTextField txt_Num;
	private JComboBox<String> cbxType;
	private JList<String> lbxList;
	private JLabel lblResult;

	private DefaultListModel<String> listModel;

	private double total = 0.0d;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StrategyTest frame = new StrategyTest();
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
	public StrategyTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 521, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel_North = new JPanel();
		contentPane.add(panel_North, BorderLayout.NORTH);
		panel_North.setLayout(new GridLayout(3, 3, 0, 0));

		JLabel lblNewLabel = new JLabel("\u5355\u4EF7\uFF1A");
		panel_North.add(lblNewLabel);

		txt_Price = new JTextField();

		panel_North.add(txt_Price);
		txt_Price.setColumns(10);

		JButton btn_Ok = new JButton("\u786E\u5B9A");
		btn_Ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CashContext cc = new CashContext(cbxType.getSelectedItem()
						.toString());
				double totalPrices = 0.0;
				totalPrices = cc.getResult(Double.parseDouble(txt_Price
						.getText()) * Double.parseDouble(txt_Num.getText()));
				total += totalPrices;
				listModel.addElement("单价：" + txt_Price.getText() + " 数量："
						+ txt_Num.getText() + " 总计：" + totalPrices);
				lblResult.setText(total + "");
			}
		});
		panel_North.add(btn_Ok);

		JLabel lblNewLabel_1 = new JLabel("\u6570\u91CF\uFF1A");
		panel_North.add(lblNewLabel_1);

		txt_Num = new JTextField();
		panel_North.add(txt_Num);
		txt_Num.setColumns(10);

		JButton btn_Reset = new JButton("\u91CD\u7F6E");
		btn_Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_Price.setText(null);
				txt_Num.setText(null);
				listModel.removeAllElements();
				total = 0.0d;
				lblResult.setText(null);
			}
		});
		panel_North.add(btn_Reset);

		JLabel lblNewLabel_4 = new JLabel("\u8BA1\u7B97\u65B9\u5F0F\uFF1A");
		panel_North.add(lblNewLabel_4);

		cbxType = new JComboBox<String>();
		cbxType.setModel(new DefaultComboBoxModel<String>(new String[] {
				"\u6B63\u5E38\u6536\u8D39", "\u6253\u516B\u6298",
				"\u6EE1300\u51CF100" }));
		panel_North.add(cbxType);

		JPanel panel_South = new JPanel();
		contentPane.add(panel_South, BorderLayout.SOUTH);
		panel_South.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel_2 = new JLabel("\u603B\u8BA1\uFF1A");
		panel_South.add(lblNewLabel_2, BorderLayout.WEST);

		lblResult = new JLabel("");
		lblResult.setFont(new Font("宋体", Font.PLAIN, 30));
		panel_South.add(lblResult, BorderLayout.CENTER);

		listModel = new DefaultListModel<String>();

		JPanel panel_Center = new JPanel();
		panel_Center.setLayout(new BorderLayout(0, 0));

		JScrollPane scrollPane = new JScrollPane(panel_Center);
		contentPane.add(scrollPane, BorderLayout.CENTER);
		lbxList = new JList<String>(listModel);
		panel_Center.add(lbxList, BorderLayout.CENTER);
	}

}
