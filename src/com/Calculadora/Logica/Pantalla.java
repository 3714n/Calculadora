package com.Calculadora.Logica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

public class Pantalla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	String signo;
	int num1 , num2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantalla frame = new Pantalla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 355, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		panel.setBackground(new Color(223, 224, 247));
		panel.setBounds(0, 0, 339, 409);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(20, 11, 298, 37);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblPantalla = new JLabel("");
		lblPantalla.setForeground(new Color(0, 0, 0));
		lblPantalla.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPantalla.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		lblPantalla.setBounds(0, 0, 298, 37);
		panel_1.add(lblPantalla);
		lblPantalla.setBackground(new Color(255, 255, 255));
		lblPantalla.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblPantalla.setEnabled(false);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(223, 224, 247));
		panel_2.setBounds(20, 59, 298, 328);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("6");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPantalla.setText(lblPantalla.getText()+"6");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(152, 140, 61, 55);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("2");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPantalla.setText(lblPantalla.getText()+"2");
			}
		});
		btnNewButton_1_1.setBounds(81, 206, 61, 55);
		panel_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("3");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPantalla.setText(lblPantalla.getText()+"3");
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_2.setBounds(152, 206, 61, 55);
		panel_2.add(btnNewButton_1_2);
		
		JButton btnCero = new JButton("0");
		btnCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPantalla.setText(lblPantalla.getText()+"0");
			}
		});
		btnCero.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCero.setBounds(10, 272, 203, 45);
		panel_2.add(btnCero);
		
		JButton btnNewButton_1_3 = new JButton("4");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPantalla.setText(lblPantalla.getText()+"4");
			}
		});
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_3.setBounds(10, 140, 61, 55);
		panel_2.add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("5");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPantalla.setText(lblPantalla.getText()+"5");
			}
		});
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_4.setBounds(81, 140, 61, 55);
		panel_2.add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("1");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPantalla.setText(lblPantalla.getText()+"1");
			}
		});
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_5.setBounds(10, 206, 61, 55);
		panel_2.add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("7");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPantalla.setText(lblPantalla.getText()+"7");
			}
		});
		btnNewButton_1_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_6.setBounds(10, 74, 61, 55);
		panel_2.add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("8");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPantalla.setText(lblPantalla.getText()+"8");
			}
		});
		btnNewButton_1_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_7.setAlignmentX(Component.RIGHT_ALIGNMENT);
		btnNewButton_1_7.setBounds(81, 74, 61, 55);
		panel_2.add(btnNewButton_1_7);
		
		JButton btnNewButton_1_8 = new JButton("9");
		btnNewButton_1_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPantalla.setText(lblPantalla.getText()+"9");
			}
		});
		btnNewButton_1_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_8.setBounds(152, 74, 61, 55);
		panel_2.add(btnNewButton_1_8);
		
		JButton btnNewButton_1_9 = new JButton("c");
		btnNewButton_1_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblPantalla.setText("");
			}
		});
		btnNewButton_1_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_9.setBounds(10, 11, 61, 55);
		panel_2.add(btnNewButton_1_9);
		
		JButton btnNewButton_1_10 = new JButton("/");
		btnNewButton_1_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(lblPantalla.getText());
				signo = "/";
				lblPantalla.setText("");
			}
		});
		btnNewButton_1_10.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_10.setBounds(81, 11, 89, 55);
		panel_2.add(btnNewButton_1_10);
		
		JButton btnNewButton_1_11 = new JButton("X");
		btnNewButton_1_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(lblPantalla.getText());
				signo = "*";
				lblPantalla.setText("");
			}
		});
		btnNewButton_1_11.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_11.setBounds(180, 11, 108, 55);
		panel_2.add(btnNewButton_1_11);
		
		JButton btnNewButton_1_8_1 = new JButton("-");
		btnNewButton_1_8_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(lblPantalla.getText());
				signo = "-";
				lblPantalla.setText("");
			}
		});
		btnNewButton_1_8_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_8_1.setBounds(223, 74, 61, 88);
		panel_2.add(btnNewButton_1_8_1);
		
		JButton btnNewButton_1_8_1_1 = new JButton("+");
		btnNewButton_1_8_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Integer.parseInt(lblPantalla.getText());
				signo = "+";
				lblPantalla.setText("");
			}
		});
		btnNewButton_1_8_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_8_1_1.setBounds(223, 173, 61, 88);
		panel_2.add(btnNewButton_1_8_1_1);
		
		JButton btnNewButton_1_2_1 = new JButton("=");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Integer.parseInt(lblPantalla.getText());
				switch (signo) {
				case "+": {
					lblPantalla.setText(Integer.toString(num1 + num2));
					break;
				}
				case "-": {
					lblPantalla.setText(Integer.toString(num1 - num2));
					break;
				}
				case "*": {
					lblPantalla.setText(Integer.toString(num1 * num2));
					break;
				}
				case "/": {
					lblPantalla.setText(Integer.toString(num1 / num2));
					break;
				}
					
				}
			}
		});
		btnNewButton_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_2_1.setBounds(223, 272, 61, 45);
		panel_2.add(btnNewButton_1_2_1);
	}
}
