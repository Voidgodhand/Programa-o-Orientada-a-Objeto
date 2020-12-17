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

public class JogoDeletar extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JogoDeletar frame = new JogoDeletar();
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
	public JogoDeletar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeletarJogo = new JLabel("Deletar Jogo");
		lblDeletarJogo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDeletarJogo.setBounds(190, 11, 100, 14);
		contentPane.add(lblDeletarJogo);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setBounds(104, 83, 48, 14);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(190, 80, 139, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				    JogoDeletar();
				    JOptionPane.showMessageDialog(null, "Jogo deletado com sucesso");
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Erro ao deletar Jogo");
				}
			}
			private void JogoDeletar()
			{
				Jogo jogo = new Jogo();
				JogoController controller = new JogoController();
				
				Integer myint = Integer.parseInt(txtCodigo.getText());
				jogo.setCodigo(myint);
				
				controller.delete(jogo);
			}
		});
		btnDeletar.setBounds(189, 171, 89, 23);
		contentPane.add(btnDeletar);
	}

}
