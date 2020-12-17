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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class ConsoleIncluir extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumero;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsoleIncluir frame = new ConsoleIncluir();
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
	public ConsoleIncluir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setBounds(117, 65, 59, 14);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(221, 62, 119, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(117, 118, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(221, 115, 119, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				    ConsoleIncluir();
				    JOptionPane.showMessageDialog(null, "Console incluído com sucesso");
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Erro ao incluir console");
				}
			}

			private void ConsoleIncluir() {
				// TODO Auto-generated method stub
				Console console = new Console();
				ConsoleController controller = new ConsoleController();
				
				Integer myint = Integer.parseInt(txtNumero.getText());
				console.setNumero(myint);
				console.setNome(txtNome.getText());
				
				controller.create(console);
				
				
			}
		});
		btnIncluir.setBounds(191, 189, 89, 23);
		contentPane.add(btnIncluir);
		
		JLabel lblIncluirConsole = new JLabel("Incluir Console");
		lblIncluirConsole.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIncluirConsole.setBounds(181, 11, 119, 20);
		contentPane.add(lblIncluirConsole);
	}
}