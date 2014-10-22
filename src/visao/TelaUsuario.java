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
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TelaUsuario extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable table;
	private JTable table_1;

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
		setBounds(100, 100, 641, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSenai = new JLabel("SENAI");
		lblSenai.setForeground(new Color(0, 0, 0));
		lblSenai.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSenai.setBounds(10, 11, 98, 30);
		contentPane.add(lblSenai);

		JLabel lblEducando = new JLabel("Educando");
		lblEducando.setForeground(Color.GRAY);
		lblEducando.setBounds(105, 27, 64, 14);
		contentPane.add(lblEducando);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 77, 615, 293);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Perfil", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblMeuPerfil = new JLabel("Meu Perfil");
		lblMeuPerfil.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblMeuPerfil.setBounds(10, 11, 128, 34);
		panel.add(lblMeuPerfil);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		lblNome.setBounds(10, 56, 68, 19);
		panel.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(10, 81, 138, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblTurma = new JLabel("Turma:");
		lblTurma.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		lblTurma.setBounds(10, 112, 68, 19);
		panel.add(lblTurma);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 137, 138, 20);
		panel.add(textField_1);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		lblCpf.setBounds(10, 168, 68, 19);
		panel.add(lblCpf);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 193, 138, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(175, 193, 138, 20);
		panel.add(textField_3);
		
		JLabel label = new JLabel("CPF");
		label.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		label.setBounds(175, 168, 68, 19);
		panel.add(label);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(175, 137, 138, 20);
		panel.add(textField_4);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		lblEmail.setBounds(175, 112, 68, 19);
		panel.add(lblEmail);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(175, 81, 138, 20);
		panel.add(textField_5);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		lblDataDeNascimento.setBounds(175, 56, 157, 19);
		panel.add(lblDataDeNascimento);
		
		JLabel lblFoto = new JLabel("Foto");
		lblFoto.setBounds(395, 9, 157, 178);
		panel.add(lblFoto);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(511, 231, 89, 23);
		panel.add(btnSalvar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(412, 231, 89, 23);
		panel.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(313, 231, 89, 23);
		panel.add(btnExcluir);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Ranking", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(138, 47, 313, 171);
		panel_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Nome", "Pontos", "Posi\u00E7\u00E3o"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel label_1 = new JLabel("Nome:");
		label_1.setBounds(107, 233, 46, 14);
		panel_1.add(label_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(154, 232, 181, 20);
		panel_1.add(textField_6);
		
		JButton button = new JButton("Procurar");
		button.setBounds(356, 229, 114, 23);
		panel_1.add(button);
		
		JLabel label_2 = new JLabel("Ranking");
		label_2.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_2.setBounds(251, 0, 114, 32);
		panel_1.add(label_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Eventos", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 43, 590, 211);
		panel_2.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Nome", "Data", "Horario de Inicio", "Horario de Saida"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(111);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(63);
		table_1.getColumnModel().getColumn(2).setPreferredWidth(93);
		table_1.getColumnModel().getColumn(3).setPreferredWidth(95);
		scrollPane_1.setViewportView(table_1);
		
		JLabel label_3 = new JLabel("Ranking");
		label_3.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_3.setBounds(243, 0, 114, 32);
		panel_2.add(label_3);
	}
}
