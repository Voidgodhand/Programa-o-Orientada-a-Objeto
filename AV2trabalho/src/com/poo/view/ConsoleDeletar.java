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

public class ConsoleDeletar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsoleDeletar frame = new ConsoleDeletar();
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
	public ConsoleDeletar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeletarConsole = new JLabel("Deletar Console");
		lblDeletarConsole.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDeletarConsole.setBounds(177, 11, 120, 14);
		contentPane.add(lblDeletarConsole);
		
		JLabel lblNumero = new JLabel("N\u00FAmero: ");
		lblNumero.setBounds(98, 79, 69, 14);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(177, 76, 150, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				    ConsoleDeletar();
				    JOptionPane.showMessageDialog(null, "Console deletado com sucesso");
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Erro ao deletar console");
				}
			}
			private void ConsoleDeletar()
			{
				Console console = new Console();
				ConsoleController controller = new ConsoleController();
				
				Integer myint = Integer.parseInt(txtNumero.getText());
				console.setNumero(myint);
				controller.delete(console);
			}
		});
		btnDeletar.setBounds(192, 185, 89, 23);
		contentPane.add(btnDeletar);
	}
}
