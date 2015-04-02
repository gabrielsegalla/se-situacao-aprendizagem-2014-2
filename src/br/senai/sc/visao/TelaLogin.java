package br.senai.sc.visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import br.senai.sc.entity.Usuario;

import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DropMode;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField login;
	private JLabel lblLogin;
	private JLabel lblSenha;
	private JLabel label;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin frame = new TelaLogin();
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
	public TelaLogin() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("LOGIN - SENAI EDUCANDO");
		setBounds(100, 100, 489, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		login = new JTextField();
		login.setToolTipText("Usuario\r\n");
		login.setForeground(new Color(0, 0, 0));
		login.setBackground(new Color(46, 139, 87));
		login.setBounds(111, 306, 290, 20);
		contentPane.add(login);
		login.setColumns(10);

		lblLogin = new JLabel("Login:");
		lblLogin.setBounds(111, 281, 46, 14);
		contentPane.add(lblLogin);

		lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(111, 346, 46, 14);
		contentPane.add(lblSenha);

		JButton btnConectar = new JButton("Conectar");
		btnConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnConectar
				.setIcon(new ImageIcon(
						TelaLogin.class
								.getResource("/javax/swing/plaf/metal/icons/ocean/hardDrive.gif")));
		btnConectar.setBounds(111, 414, 119, 23);
		contentPane.add(btnConectar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar
				.setIcon(new ImageIcon(
						TelaLogin.class
								.getResource("/com/sun/java/swing/plaf/motif/icons/Error.gif")));
		btnCancelar.setBounds(296, 414, 105, 23);
		contentPane.add(btnCancelar);

		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(46, 139, 87));
		passwordField.setBounds(111, 371, 290, 20);
		contentPane.add(passwordField);

		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\gabriel_segalla\\git\\se-situacao-aprendizagem-2014-2\\resources\\Imagens\\new login.jpg"));
		label.setBounds(0, 0, 484, 461);
		contentPane.add(label);
	}
}
