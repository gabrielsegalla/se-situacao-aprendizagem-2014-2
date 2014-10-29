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
import javax.swing.ImageIcon;
import java.awt.Toolkit;

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
		setResizable(false);
		setTitle("SENAI EDUCANDO");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Gabriel Segalla\\git\\se-situacao-aprendizagem-2014-2\\Imagens\\iCON.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(8, 79, 671, 427);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Perfil", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblMeuPerfil = new JLabel("Meu Perfil");
		lblMeuPerfil.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		lblMeuPerfil.setBounds(10, 11, 166, 34);
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
		textField_3.setBounds(10, 361, 138, 20);
		panel.add(textField_3);
		
		JLabel label = new JLabel("CPF");
		label.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		label.setBounds(10, 336, 68, 19);
		panel.add(label);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 305, 138, 20);
		panel.add(textField_4);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		lblEmail.setBounds(10, 280, 68, 19);
		panel.add(lblEmail);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 249, 138, 20);
		panel.add(textField_5);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento:");
		lblDataDeNascimento.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		lblDataDeNascimento.setBounds(10, 224, 157, 19);
		panel.add(lblDataDeNascimento);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(567, 365, 89, 23);
		panel.add(btnSalvar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(470, 365, 89, 23);
		panel.add(btnAlterar);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("C:\\Users\\Gabriel Segalla\\git\\se-situacao-aprendizagem-2014-2\\Imagens\\extra Perfil.png"));
		label_7.setBounds(-44, -603, 1227, 1472);
		panel.add(label_7);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Ranking", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 73, 615, 239);
		contentPane.add(scrollPane);
		
		/*table = new JTable(tableModel);*/
		
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
		label_1.setBounds(168, 335, 46, 14);
		panel_1.add(label_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(215, 334, 181, 20);
		panel_1.add(textField_6);
		
		JButton button = new JButton("Procurar");
		button.setBounds(417, 331, 114, 23);
		panel_1.add(button);
		
		JLabel label_2 = new JLabel("Ranking");
		label_2.setForeground(Color.ORANGE);
		label_2.setFont(new Font("Bebas Neue", Font.PLAIN, 57));
		label_2.setBounds(241, 11, 271, 51);
		panel_1.add(label_2);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("C:\\Users\\Gabriel Segalla\\git\\se-situacao-aprendizagem-2014-2\\Imagens\\Extra Ranking.png"));
		label_5.setBounds(-24, -26, 722, 455);
		panel_1.add(label_5);
		
		JLabel label_8 = new JLabel("Ranking");
		label_8.setForeground(Color.BLACK);
		label_8.setFont(new Font("Bebas Neue", Font.PLAIN, 57));
		label_8.setBounds(236, 11, 271, 51);
		panel_1.add(label_8);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Eventos", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(38, 89, 594, 237);
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
		
		JLabel label_10 = new JLabel("EVENTOS");
		label_10.setForeground(Color.ORANGE);
		label_10.setFont(new Font("Bebas Neue", Font.PLAIN, 44));
		label_10.setBounds(252, 25, 258, 44);
		panel_2.add(label_10);
		
		JLabel lblEventos = new JLabel("EVENTOS");
		lblEventos.setFont(new Font("Bebas Neue", Font.PLAIN, 44));
		lblEventos.setBounds(249, 24, 142, 44);
		panel_2.add(lblEventos);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("C:\\Users\\Gabriel Segalla\\git\\se-situacao-aprendizagem-2014-2\\Imagens\\extra evento.png"));
		label_6.setBounds(-26, 0, 716, 480);
		panel_2.add(label_6);
		
		JLabel label_9 = new JLabel("SENAI EDUCANDO");
		label_9.setForeground(Color.LIGHT_GRAY);
		label_9.setFont(new Font("Bebas Neue", Font.PLAIN, 54));
		label_9.setBounds(103, 2, 344, 66);
		contentPane.add(label_9);
		
		JLabel lblSenai = new JLabel("SENAI EDUCANDO");
		lblSenai.setForeground(Color.DARK_GRAY);
		lblSenai.setFont(new Font("Bebas Neue", Font.PLAIN, 54));
		lblSenai.setBounds(97, 2, 344, 66);
		contentPane.add(lblSenai);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("C:\\Users\\Gabriel Segalla\\git\\se-situacao-aprendizagem-2014-2\\Imagens\\P.ICON.png"));
		label_4.setBounds(0, -23, 146, 116);
		contentPane.add(label_4);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\Gabriel Segalla\\git\\se-situacao-aprendizagem-2014-2\\Imagens\\plano de Fundo.jpg"));
		label_3.setBounds(-16, -23, 726, 550);
		contentPane.add(label_3);
	}
}
