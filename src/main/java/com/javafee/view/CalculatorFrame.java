package com.javafee.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnCE;
	private JButton btnBackspace;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn1;
	private JButton btn4;
	private JButton btn0;
	private JButton btn5;
	private JButton btn2;
	private JButton btnDot;
	private JButton btn6;
	private JButton btn3;
	private JButton btnPlusMinus;
	private JButton btnPlusSign;
	private JButton btnPercent;
	private JButton btnMultiplicationSign;
	private JButton btnMinusSign;
	private JButton btnEqualSign;
	private JButton btnDivisionSign;
	private JButton btnSquare;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorFrame frame = new CalculatorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CalculatorFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 383);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{79, 87, 86, 85, 86, 0};
		gbl_contentPane.rowHeights = new int[]{63, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 5;
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton btnC = new JButton("C");
		GridBagConstraints gbc_btnC = new GridBagConstraints();
		gbc_btnC.fill = GridBagConstraints.BOTH;
		gbc_btnC.gridwidth = 2;
		gbc_btnC.insets = new Insets(0, 0, 5, 5);
		gbc_btnC.gridx = 0;
		gbc_btnC.gridy = 1;
		contentPane.add(btnC, gbc_btnC);
		
		btnCE = new JButton("CE");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnCE = new GridBagConstraints();
		gbc_btnCE.fill = GridBagConstraints.BOTH;
		gbc_btnCE.gridwidth = 2;
		gbc_btnCE.insets = new Insets(0, 0, 5, 5);
		gbc_btnCE.gridx = 2;
		gbc_btnCE.gridy = 1;
		contentPane.add(btnCE, gbc_btnCE);
		
		btnBackspace = new JButton("<-");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnBackspace = new GridBagConstraints();
		gbc_btnBackspace.fill = GridBagConstraints.BOTH;
		gbc_btnBackspace.insets = new Insets(0, 0, 5, 0);
		gbc_btnBackspace.gridx = 4;
		gbc_btnBackspace.gridy = 1;
		contentPane.add(btnBackspace, gbc_btnBackspace);
		
		btn7 = new JButton("7");
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.fill = GridBagConstraints.BOTH;
		gbc_btn7.insets = new Insets(0, 0, 5, 5);
		gbc_btn7.gridx = 0;
		gbc_btn7.gridy = 2;
		contentPane.add(btn7, gbc_btn7);
		
		btn8 = new JButton("8");
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.fill = GridBagConstraints.BOTH;
		gbc_btn8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8.gridx = 1;
		gbc_btn8.gridy = 2;
		contentPane.add(btn8, gbc_btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.fill = GridBagConstraints.BOTH;
		gbc_btn9.insets = new Insets(0, 0, 5, 5);
		gbc_btn9.gridx = 2;
		gbc_btn9.gridy = 2;
		contentPane.add(btn9, gbc_btn9);
		
		btnSquare = new JButton("\u221A");
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btnPercent = new JButton("%");
		GridBagConstraints gbc_btnPercent = new GridBagConstraints();
		gbc_btnPercent.fill = GridBagConstraints.BOTH;
		gbc_btnPercent.insets = new Insets(0, 0, 5, 5);
		gbc_btnPercent.gridx = 3;
		gbc_btnPercent.gridy = 2;
		contentPane.add(btnPercent, gbc_btnPercent);
		GridBagConstraints gbc_btnSquare = new GridBagConstraints();
		gbc_btnSquare.fill = GridBagConstraints.BOTH;
		gbc_btnSquare.insets = new Insets(0, 0, 5, 0);
		gbc_btnSquare.gridx = 4;
		gbc_btnSquare.gridy = 2;
		contentPane.add(btnSquare, gbc_btnSquare);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.fill = GridBagConstraints.BOTH;
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 0;
		gbc_btn4.gridy = 3;
		contentPane.add(btn4, gbc_btn4);
		
		btn5 = new JButton("5");
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.fill = GridBagConstraints.BOTH;
		gbc_btn5.insets = new Insets(0, 0, 5, 5);
		gbc_btn5.gridx = 1;
		gbc_btn5.gridy = 3;
		contentPane.add(btn5, gbc_btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.fill = GridBagConstraints.BOTH;
		gbc_btn6.insets = new Insets(0, 0, 5, 5);
		gbc_btn6.gridx = 2;
		gbc_btn6.gridy = 3;
		contentPane.add(btn6, gbc_btn6);
		
		btnMultiplicationSign = new JButton("X");
		btnMultiplicationSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnMultiplicationSign = new GridBagConstraints();
		gbc_btnMultiplicationSign.fill = GridBagConstraints.BOTH;
		gbc_btnMultiplicationSign.insets = new Insets(0, 0, 5, 5);
		gbc_btnMultiplicationSign.gridx = 3;
		gbc_btnMultiplicationSign.gridy = 3;
		contentPane.add(btnMultiplicationSign, gbc_btnMultiplicationSign);
		
		btnDivisionSign = new JButton("/");
		GridBagConstraints gbc_btnDivisionSign = new GridBagConstraints();
		gbc_btnDivisionSign.fill = GridBagConstraints.BOTH;
		gbc_btnDivisionSign.insets = new Insets(0, 0, 5, 0);
		gbc_btnDivisionSign.gridx = 4;
		gbc_btnDivisionSign.gridy = 3;
		contentPane.add(btnDivisionSign, gbc_btnDivisionSign);
		
		btn1 = new JButton("1");
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.fill = GridBagConstraints.BOTH;
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 0;
		gbc_btn1.gridy = 4;
		contentPane.add(btn1, gbc_btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.fill = GridBagConstraints.BOTH;
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 1;
		gbc_btn2.gridy = 4;
		contentPane.add(btn2, gbc_btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.fill = GridBagConstraints.BOTH;
		gbc_btn3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3.gridx = 2;
		gbc_btn3.gridy = 4;
		contentPane.add(btn3, gbc_btn3);
		
		btnMinusSign = new JButton("-");
		GridBagConstraints gbc_btnMinusSign = new GridBagConstraints();
		gbc_btnMinusSign.fill = GridBagConstraints.BOTH;
		gbc_btnMinusSign.insets = new Insets(0, 0, 5, 0);
		gbc_btnMinusSign.gridx = 4;
		gbc_btnMinusSign.gridy = 4;
		contentPane.add(btnMinusSign, gbc_btnMinusSign);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btn0 = new GridBagConstraints();
		gbc_btn0.fill = GridBagConstraints.BOTH;
		gbc_btn0.insets = new Insets(0, 0, 0, 5);
		gbc_btn0.gridx = 0;
		gbc_btn0.gridy = 5;
		contentPane.add(btn0, gbc_btn0);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnDot = new GridBagConstraints();
		gbc_btnDot.fill = GridBagConstraints.BOTH;
		gbc_btnDot.insets = new Insets(0, 0, 0, 5);
		gbc_btnDot.gridx = 1;
		gbc_btnDot.gridy = 5;
		contentPane.add(btnDot, gbc_btnDot);
		
		btnPlusMinus = new JButton("+/-");
		GridBagConstraints gbc_btnPlusMinus = new GridBagConstraints();
		gbc_btnPlusMinus.fill = GridBagConstraints.BOTH;
		gbc_btnPlusMinus.insets = new Insets(0, 0, 0, 5);
		gbc_btnPlusMinus.gridx = 2;
		gbc_btnPlusMinus.gridy = 5;
		contentPane.add(btnPlusMinus, gbc_btnPlusMinus);
		
		btnPlusSign = new JButton("+");
		GridBagConstraints gbc_btnPlusSign = new GridBagConstraints();
		gbc_btnPlusSign.fill = GridBagConstraints.BOTH;
		gbc_btnPlusSign.gridheight = 2;
		gbc_btnPlusSign.insets = new Insets(0, 0, 0, 5);
		gbc_btnPlusSign.gridx = 3;
		gbc_btnPlusSign.gridy = 4;
		contentPane.add(btnPlusSign, gbc_btnPlusSign);
		
		btnEqualSign = new JButton("=");
		GridBagConstraints gbc_btnEqualSign = new GridBagConstraints();
		gbc_btnEqualSign.fill = GridBagConstraints.BOTH;
		gbc_btnEqualSign.gridx = 4;
		gbc_btnEqualSign.gridy = 5;
		contentPane.add(btnEqualSign, gbc_btnEqualSign);
	}

}
