package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class TelaUsuario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaUsuario frame = new TelaUsuario();
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
	public TelaUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSenai = new JLabel("SENAI");
		lblSenai.setForeground(new Color(0, 0, 0));
		lblSenai.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSenai.setBounds(10, 23, 98, 30);
		contentPane.add(lblSenai);

		JLabel lblEducando = new JLabel("Educando");
		lblEducando.setForeground(Color.GRAY);
		lblEducando.setBounds(107, 39, 64, 14);
		contentPane.add(lblEducando);

		JButton btnEventos = new JButton("Eventos");
		btnEventos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProximosEventos pe = new ProximosEventos();
				pe.setVisible(true);
				dispose();
			}
		});
		btnEventos.setBounds(345, 35, 87, 23);
		contentPane.add(btnEventos);

		JButton btnRanking = new JButton("Ranking");
		btnRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ranking ranking = new Ranking();
				ranking.setVisible(true);
				dispose();
			}
		});
		btnRanking.setBounds(258, 35, 87, 23);
		contentPane.add(btnRanking);

		JLabel lblNewLabel = new JLabel("FOTO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 124, 98, 151);
		contentPane.add(lblNewLabel);

		JLabel lblNomeDoAluni = new JLabel("NOME DO ALUNO");
		lblNomeDoAluni.setBounds(118, 165, 151, 14);
		contentPane.add(lblNomeDoAluni);

		JLabel lblNewLabel_1 = new JLabel("Email: ");
		lblNewLabel_1.setBounds(118, 195, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("emaildoaluno@provedor.com");
		lblNewLabel_2.setBounds(167, 195, 178, 14);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Turma: ");
		lblNewLabel_3.setBounds(118, 220, 46, 14);
		contentPane.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("TURMA");
		lblNewLabel_4.setBounds(177, 220, 168, 14);
		contentPane.add(lblNewLabel_4);

		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setBounds(125, 245, 46, 14);
		contentPane.add(lblCpf);

		JLabel label = new JLabel("000.000.000-00");
		label.setBounds(171, 245, 123, 14);
		contentPane.add(label);
	}
}
