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

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField login;
	private JTextField senha;
	private JLabel label;
	private JLabel lblLogin;
	private JLabel lblSenha;

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
		setBounds(100, 100, 308, 298);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		login = new JTextField();
		login.setBounds(34, 128, 218, 20);
		contentPane.add(login);
		login.setColumns(10);

		senha = new JTextField();
		senha.setBounds(34, 177, 218, 20);
		contentPane.add(senha);
		senha.setColumns(10);

		label = new JLabel("");
		label.setIcon(new ImageIcon(
				"C:\\Users\\Gabriel Segalla\\git\\se-situacao-aprendizagem-2014-2\\se-situacao-aprendizagem-2014-2\\resources\\Imagens\\P.ICON.png"));
		label.setBounds(0, 11, 98, 90);
		contentPane.add(label);

		lblLogin = new JLabel("Login:");
		lblLogin.setBounds(34, 112, 46, 14);
		contentPane.add(lblLogin);

		lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(34, 162, 46, 14);
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
		btnConectar.setBounds(34, 212, 119, 23);
		contentPane.add(btnConectar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar
				.setIcon(new ImageIcon(
						TelaLogin.class
								.getResource("/com/sun/java/swing/plaf/motif/icons/Error.gif")));
		btnCancelar.setBounds(147, 212, 105, 23);
		contentPane.add(btnCancelar);

		JLabel lblSenai = new JLabel("SENAI");
		lblSenai.setFont(new Font("Bebas Neue", Font.PLAIN, 35));
		lblSenai.setBounds(88, 11, 170, 44);
		contentPane.add(lblSenai);

		JLabel lblEducando = new JLabel("Educando");
		lblEducando.setFont(new Font("Bebas Neue", Font.PLAIN, 38));
		lblEducando.setBounds(98, 43, 184, 45);
		contentPane.add(lblEducando);
	}
}
