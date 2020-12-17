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

public class JogoIncluir extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtNumero;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogoIncluir frame = new JogoIncluir();
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
	public JogoIncluir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIncluirJogo = new JLabel("Incluir Jogo");
		lblIncluirJogo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblIncluirJogo.setBounds(189, 11, 91, 19);
		contentPane.add(lblIncluirJogo);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setBounds(69, 65, 48, 14);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(223, 62, 129, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(69, 104, 48, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(223, 101, 129, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNumero = new JLabel("N\u00FAmero do console:");
		lblNumero.setBounds(69, 143, 129, 14);
		contentPane.add(lblNumero);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(223, 140, 129, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JButton btnIncluir = new JButton("Incluir");
		btnIncluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				    JogoIncluir();
				    JOptionPane.showMessageDialog(null, "Jogo incluído com sucesso");
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Erro ao incluir jogo");
				}
			}
			private void JogoIncluir()
			{
				Jogo jogo = new Jogo();
				JogoController controller = new JogoController();
				
				Integer myint = Integer.parseInt(txtCodigo.getText());
				jogo.setCodigo(myint);
				jogo.setNome(txtNome.getText());
				Integer myint2 = Integer.parseInt(txtNumero.getText());
				jogo.setNumero(myint2);
				
				controller.create(jogo);
			}
		});
		btnIncluir.setBounds(191, 202, 89, 23);
		contentPane.add(btnIncluir);
	}

}
