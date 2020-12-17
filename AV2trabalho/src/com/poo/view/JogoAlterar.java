package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo.controller.JogoController;
import com.poo.model.Jogo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JogoAlterar extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNovoNome;
	private JTextField txtNovoNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogoAlterar frame = new JogoAlterar();
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
	public JogoAlterar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Alterar Jogo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(201, 11, 97, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setBounds(62, 58, 132, 14);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(232, 55, 133, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblNovoNome = new JLabel("Novo nome:");
		lblNovoNome.setBounds(62, 98, 132, 14);
		contentPane.add(lblNovoNome);
		
		txtNovoNome = new JTextField();
		txtNovoNome.setBounds(232, 95, 133, 20);
		contentPane.add(txtNovoNome);
		txtNovoNome.setColumns(10);
		
		JLabel lblNovoNumero = new JLabel("Novo n\u00FAmero do console:");
		lblNovoNumero.setBounds(62, 142, 160, 14);
		contentPane.add(lblNovoNumero);
		
		txtNovoNumero = new JTextField();
		txtNovoNumero.setBounds(232, 139, 133, 20);
		contentPane.add(txtNovoNumero);
		txtNovoNumero.setColumns(10);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				    JogoAlterar();
				    JOptionPane.showMessageDialog(null, "Jogo alterado com sucesso");
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Erro ao alterar jogo");
				}
			}
			private void JogoAlterar()
			{
				Jogo jogo = new Jogo();
				JogoController controller = new JogoController();
				
				Integer myint = Integer.parseInt(txtCodigo.getText());
				jogo.setCodigo(myint);
				jogo.setNome(txtNovoNome.getText());
				Integer myint2 = Integer.parseInt(txtNovoNumero.getText());
				jogo.setNumero(myint2);
				
				controller.update(jogo);
			}
		});
		btnAlterar.setBounds(201, 198, 89, 23);
		contentPane.add(btnAlterar);
	}

}
