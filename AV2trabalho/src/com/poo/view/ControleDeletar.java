package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.poo.controller.ConsoleController;
import com.poo.controller.ControleController;
import com.poo.model.Console;
import com.poo.model.Controle;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ControleDeletar extends JFrame {

	private JPanel contentPane;
	private JTextField txtSeq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ControleDeletar frame = new ControleDeletar();
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
	public ControleDeletar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeletarControle = new JLabel("Deletar Controle");
		lblDeletarControle.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDeletarControle.setBounds(178, 11, 130, 14);
		contentPane.add(lblDeletarControle);
		
		JLabel lblSeq = new JLabel("Sequencial:");
		lblSeq.setBounds(95, 76, 100, 14);
		contentPane.add(lblSeq);
		
		txtSeq = new JTextField();
		txtSeq.setBounds(215, 73, 111, 20);
		contentPane.add(txtSeq);
		txtSeq.setColumns(10);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{
				    ControleDeletar();
				    JOptionPane.showMessageDialog(null, "Controle deletado com sucesso");
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Erro ao deletar controle");
				}
			}
			private void ControleDeletar()
			{
				Controle controle = new Controle();
				ControleController controller = new ControleController();
				
				Integer myint = Integer.parseInt(txtSeq.getText());
				controle.setSeq(myint);
				controller.delete(controle);
			}
		});
		btnDeletar.setBounds(202, 187, 89, 23);
		contentPane.add(btnDeletar);
	}

}
