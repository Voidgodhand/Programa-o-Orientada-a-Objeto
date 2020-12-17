package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo.controller.ControleController;
import com.poo.model.Controle;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControleAlterar extends JFrame {

	private JPanel contentPane;
	private JTextField txtSeq;
	private JTextField txtNovaCor;
	private JTextField txtNovoNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControleAlterar frame = new ControleAlterar();
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
	public ControleAlterar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlterarControle = new JLabel("Alterar Controle");
		lblAlterarControle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAlterarControle.setBounds(183, 11, 122, 14);
		contentPane.add(lblAlterarControle);
		
		JLabel lblSeq = new JLabel("Sequencial:");
		lblSeq.setBounds(46, 72, 64, 14);
		contentPane.add(lblSeq);
		
		txtSeq = new JTextField();
		txtSeq.setBounds(251, 66, 111, 20);
		contentPane.add(txtSeq);
		txtSeq.setColumns(10);
		
		JLabel lblNovaCor = new JLabel("Nova cor:");
		lblNovaCor.setBounds(46, 111, 111, 14);
		contentPane.add(lblNovaCor);
		
		txtNovaCor = new JTextField();
		txtNovaCor.setBounds(251, 105, 111, 20);
		contentPane.add(txtNovaCor);
		txtNovaCor.setColumns(10);
		
		JLabel lblNovoNumero = new JLabel("Novo n\u00FAmero do console:");
		lblNovoNumero.setBounds(46, 149, 186, 14);
		contentPane.add(lblNovoNumero);
		
		txtNovoNumero = new JTextField();
		txtNovoNumero.setBounds(251, 143, 111, 20);
		contentPane.add(txtNovoNumero);
		txtNovoNumero.setColumns(10);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				    ControleAlterar();
				    JOptionPane.showMessageDialog(null, "Controle alterado com sucesso");
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Erro ao alterar controle");
				}
			}
			private void ControleAlterar()
			{
				Controle controle = new Controle();
				ControleController controller = new ControleController();
				
				Integer myint = Integer.parseInt(txtSeq.getText());
				controle.setSeq(myint);
				controle.setCor(txtNovaCor.getText());
				Integer myint2 = Integer.parseInt(txtNovoNumero.getText());
				controle.setNumero(myint2);
				
				controller.update(controle);
			}
		});
		btnAlterar.setBounds(204, 206, 89, 23);
		contentPane.add(btnAlterar);
	}

}
