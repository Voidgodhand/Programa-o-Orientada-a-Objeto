package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo.controller.ConsoleController;
import com.poo.model.Console;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsoleAlterar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;
	private JTextField txtNovoNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsoleAlterar frame = new ConsoleAlterar();
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
	public ConsoleAlterar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlterarConsole = new JLabel("Alterar Console");
		lblAlterarConsole.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAlterarConsole.setBounds(181, 11, 122, 20);
		contentPane.add(lblAlterarConsole);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setBounds(107, 71, 104, 14);
		contentPane.add(lblNmero);
		
		JLabel lblNovoNome = new JLabel("Novo nome:");
		lblNovoNome.setBounds(107, 127, 104, 14);
		contentPane.add(lblNovoNome);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(227, 68, 112, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		txtNovoNome = new JTextField();
		txtNovoNome.setBounds(227, 124, 112, 20);
		contentPane.add(txtNovoNome);
		txtNovoNome.setColumns(10);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				    ConsoleAlterar();
				    JOptionPane.showMessageDialog(null, "Console alterado com sucesso");
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Erro ao alterar console");
				}
			}
			private void ConsoleAlterar() {
				Console console = new Console();
				ConsoleController controller = new ConsoleController();
				
				Integer myint = Integer.parseInt(txtNumero.getText());
				console.setNumero(myint);
				console.setNome(txtNovoNome.getText());
				
				controller.update(console);
			}
		});
		btnAlterar.setBounds(198, 190, 89, 23);
		contentPane.add(btnAlterar);
	}
}
