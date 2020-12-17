package com.poo.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Login {

	private JFrame frame;
	private JTextField login;
	private JTextField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		lblLogin.setBounds(89, 80, 61, 14);
		frame.getContentPane().add(lblLogin);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(89, 123, 48, 14);
		frame.getContentPane().add(lblSenha);
		
		login = new JTextField();
		login.setBounds(232, 77, 96, 20);
		frame.getContentPane().add(login);
		login.setColumns(10);
		
		senha = new JTextField();
		senha.setBounds(232, 120, 96, 20);
		frame.getContentPane().add(senha);
		senha.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String l=login.getText();
				String s=senha.getText();
				if(l.equals("admin") && s.equals("admin"))
				{
					JOptionPane.showMessageDialog(frame, "Acesso liberado");
				    Menu menu = new Menu();
				    menu.setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(frame, "Acesso negado");
			}
		});
		btnNewButton.setBounds(171, 192, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblLogin_1 = new JLabel("Login");
		lblLogin_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLogin_1.setBounds(192, 30, 48, 23);
		frame.getContentPane().add(lblLogin_1);
	}
}
