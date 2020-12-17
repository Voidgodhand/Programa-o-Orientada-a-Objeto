package com.poo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMenu.setBounds(218, 27, 48, 14);
		contentPane.add(lblMenu);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setBounds(28, 66, 48, 14);
		contentPane.add(lblConsole);
		
		JLabel lblControle = new JLabel("Controle:");
		lblControle.setBounds(28, 120, 48, 14);
		contentPane.add(lblControle);
		
		JLabel lblJogo = new JLabel("Jogo:");
		lblJogo.setBounds(28, 172, 48, 14);
		contentPane.add(lblJogo);
		
		JButton btnConsultarConsole = new JButton("Consultar");
		btnConsultarConsole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsoleConsultar consolec = new ConsoleConsultar();
				consolec.setVisible(true);
			}
		});
		btnConsultarConsole.setBounds(345, 62, 79, 23);
		contentPane.add(btnConsultarConsole);
		
		JButton btnDeletarConsole = new JButton("Deletar");
		btnDeletarConsole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsoleDeletar consoled = new ConsoleDeletar();
				consoled.setVisible(true);
			}
		});
		btnDeletarConsole.setBounds(256, 62, 79, 23);
		contentPane.add(btnDeletarConsole);
		
		JButton btnAlterarConsole = new JButton("Alterar");
		btnAlterarConsole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsoleAlterar consolea = new ConsoleAlterar();
				consolea.setVisible(true);
			}
		});
		btnAlterarConsole.setBounds(167, 62, 79, 23);
		contentPane.add(btnAlterarConsole);
		
		JButton btnIncluirConsole = new JButton("Incluir");
		btnIncluirConsole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConsoleIncluir consolei = new ConsoleIncluir();
				consolei.setVisible(true);
			}
		});
		btnIncluirConsole.setBounds(81, 62, 79, 23);
		contentPane.add(btnIncluirConsole);
		
		JButton btnIncluirControle = new JButton("Incluir");
		btnIncluirControle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControleIncluir controlei = new ControleIncluir();
				controlei.setVisible(true);
			}
		});
		btnIncluirControle.setBounds(81, 116, 79, 23);
		contentPane.add(btnIncluirControle);
		
		JButton btnAlterarControle = new JButton("Alterar");
		btnAlterarControle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControleAlterar controlea = new ControleAlterar();
				controlea.setVisible(true);
			}
		});
		btnAlterarControle.setBounds(167, 116, 79, 23);
		contentPane.add(btnAlterarControle);
		
		JButton btnDeletarControle = new JButton("Deletar");
		btnDeletarControle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControleDeletar controled = new ControleDeletar();
				controled.setVisible(true);
			}
		});
		btnDeletarControle.setBounds(256, 116, 79, 23);
		contentPane.add(btnDeletarControle);
		
		JButton ButtonConsultarControle = new JButton("Consultar");
		ButtonConsultarControle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControleConsultar controlec = new ControleConsultar();
				controlec.setVisible(true);
			}
		});
		ButtonConsultarControle.setBounds(345, 116, 79, 23);
		contentPane.add(ButtonConsultarControle);
		
		JButton btnIncluirJogo = new JButton("Incluir");
		btnIncluirJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JogoIncluir jogoi = new JogoIncluir();
				jogoi.setVisible(true);
			}
		});
		btnIncluirJogo.setBounds(81, 168, 79, 23);
		contentPane.add(btnIncluirJogo);
		
		JButton btnAlterarJogo = new JButton("Alterar");
		btnAlterarJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JogoAlterar jogoa = new JogoAlterar();
				jogoa.setVisible(true);
			}
		});
		btnAlterarJogo.setBounds(167, 168, 79, 23);
		contentPane.add(btnAlterarJogo);
		
		JButton btnDeletarJogo = new JButton("Deletar");
		btnDeletarJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JogoDeletar jogod = new JogoDeletar();
				jogod.setVisible(true);
			}
		});
		btnDeletarJogo.setBounds(256, 168, 79, 23);
		contentPane.add(btnDeletarJogo);
		
		JButton btnConsultarJogo = new JButton("Consultar");
		btnConsultarJogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JogoConsultar jogoc = new JogoConsultar();
				jogoc.setVisible(true);
			}
		});
		btnConsultarJogo.setBounds(345, 168, 79, 23);
		contentPane.add(btnConsultarJogo);
	}
}
