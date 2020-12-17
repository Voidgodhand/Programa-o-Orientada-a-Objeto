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

public class ControleIncluir extends JFrame {

	private JPanel contentPane;
	private JTextField txtSeq;
	private JTextField txtCor;
	private JTextField txtNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControleIncluir frame = new ControleIncluir();
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
	public ControleIncluir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIncluirControle = new JLabel("Incluir Controle");
		lblIncluirControle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIncluirControle.setBounds(183, 11, 121, 14);
		contentPane.add(lblIncluirControle);
		
		JLabel lblSeq = new JLabel("Sequencial:");
		lblSeq.setBounds(73, 69, 57, 14);
		contentPane.add(lblSeq);
		
		txtSeq = new JTextField();
		txtSeq.setBounds(248, 63, 121, 20);
		contentPane.add(txtSeq);
		txtSeq.setColumns(10);
		
		JLabel lblCor = new JLabel("Cor:");
		lblCor.setBounds(73, 100, 48, 14);
		contentPane.add(lblCor);
		
		txtCor = new JTextField();
		txtCor.setBounds(248, 94, 121, 20);
		contentPane.add(txtCor);
		txtCor.setColumns(10);
		
		JLabel lblNumero = new JLabel("N\u00FAmero do console:");
		lblNumero.setBounds(73, 135, 143, 14);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(248, 129, 121, 20);
		contentPane.add(txtNumero);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				    ControleIncluir();
				    JOptionPane.showMessageDialog(null, "Controle incluído com sucesso");
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Erro ao incluir controle");
				}
			}
			private void ControleIncluir()
			{
				Controle controle = new Controle();
				ControleController controller = new ControleController();
				
				Integer myint = Integer.parseInt(txtSeq.getText());
				controle.setSeq(myint);
				controle.setCor(txtCor.getText());
				Integer myint2 = Integer.parseInt(txtNumero.getText());
				controle.setNumero(myint2);
				
				controller.create(controle);
			}
		});
		btnIncluir.setBounds(202, 195, 89, 23);
		contentPane.add(btnIncluir);
		
	}

}
