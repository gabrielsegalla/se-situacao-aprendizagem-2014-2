package br.senai.sc.visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pperfil extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_1;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private DefaultTableModel tableModel = new DefaultTableModel();
	private DefaultTableModel tableModel_1 = new DefaultTableModel();
	private DefaultTableModel tableModel_2 = new DefaultTableModel();



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pperfil frame = new Pperfil();
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
	public Pperfil() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 73, 671, 427);
		contentPane.add(tabbedPane);
		
		panel_1 = new JPanel();
		panel_1.setToolTipText("GSDAHGADS");
		tabbedPane.addTab("Perfil", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel label_2 = new JLabel("Meu Perfil");
		label_2.setFont(new Font("Bebas Neue", Font.PLAIN, 47));
		label_2.setBounds(10, 11, 178, 34);
		panel_1.add(label_2);
		
		JLabel label_4 = new JLabel("Nome:");
		label_4.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		label_4.setBounds(10, 56, 68, 19);
		panel_1.add(label_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 81, 138, 20);
		panel_1.add(textField);
		
		JLabel label_6 = new JLabel("CPF");
		label_6.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		label_6.setBounds(10, 108, 68, 19);
		panel_1.add(label_6);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 133, 138, 20);
		panel_1.add(textField_2);
		
		JLabel label_7 = new JLabel("Data de Nascimento:");
		label_7.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		label_7.setBounds(10, 164, 157, 19);
		panel_1.add(label_7);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 189, 138, 20);
		panel_1.add(textField_3);
		
		JLabel label_8 = new JLabel("Email:");
		label_8.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		label_8.setBounds(10, 220, 68, 19);
		panel_1.add(label_8);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 245, 138, 20);
		panel_1.add(textField_4);
		
		JLabel label_9 = new JLabel("CPF");
		label_9.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		label_9.setBounds(10, 276, 68, 19);
		panel_1.add(label_9);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(10, 301, 138, 20);
		panel_1.add(textField_5);
		
		JButton button = new JButton("Alterar");
		button.setBounds(470, 365, 89, 23);
		panel_1.add(button);
		
		JButton button_1 = new JButton("Salvar");
		button_1.setBounds(567, 365, 89, 23);
		panel_1.add(button_1);
		
		JLabel lblFoto_1 = new JLabel("Foto");
		lblFoto_1.setBounds(526, 157, 46, 14);
		panel_1.add(lblFoto_1);
		
		JButton btnCarregarFoto = new JButton("Alterar Foto");
		btnCarregarFoto.setBounds(481, 244, 129, 23);
		panel_1.add(btnCarregarFoto);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Perfil");
		tabbedPane.addTab("Ranking", null, panel, null);
		panel.setLayout(null);
		
		
		JLabel label_5 = new JLabel("Nome:");
		label_5.setBounds(174, 335, 46, 14);
		panel.add(label_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(221, 334, 181, 20);
		panel.add(textField_1);
		
		JButton button_2 = new JButton("Procurar");
		button_2.setBounds(423, 331, 114, 23);
		panel.add(button_2);
		
		JLabel label_11 = new JLabel("Ranking");
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("Bebas Neue", Font.PLAIN, 47));
		label_11.setBounds(10, 11, 271, 51);
		panel.add(label_11);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Eventos", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel label_13 = new JLabel("EVENTOS");
		label_13.setFont(new Font("Bebas Neue", Font.PLAIN, 47));
		label_13.setBounds(10, 11, 142, 44);
		panel_2.add(label_13);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Cadastro de Aluno", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblCadastroDeAluno = new JLabel("Cadastro de Aluno");
		lblCadastroDeAluno.setFont(new Font("Bebas Neue", Font.PLAIN, 47));
		lblCadastroDeAluno.setBounds(10, 11, 376, 39);
		panel_3.add(lblCadastroDeAluno);
		
		JLabel label_17 = new JLabel("Nome:");
		label_17.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		label_17.setBounds(10, 84, 68, 19);
		panel_3.add(label_17);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(10, 109, 138, 20);
		panel_3.add(textField_7);
		
		JLabel label_18 = new JLabel("CPF");
		label_18.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		label_18.setBounds(10, 136, 68, 19);
		panel_3.add(label_18);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(10, 161, 138, 20);
		panel_3.add(textField_8);
		
		JLabel label_19 = new JLabel("Data de Nascimento:");
		label_19.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		label_19.setBounds(10, 192, 157, 19);
		panel_3.add(label_19);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(10, 217, 138, 20);
		panel_3.add(textField_9);
		
		JLabel label_20 = new JLabel("Email:");
		label_20.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		label_20.setBounds(10, 248, 68, 19);
		panel_3.add(label_20);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(10, 273, 138, 20);
		panel_3.add(textField_10);
		
		JLabel label_21 = new JLabel("CPF");
		label_21.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		label_21.setBounds(10, 304, 68, 19);
		panel_3.add(label_21);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(10, 329, 138, 20);
		panel_3.add(textField_11);
		
		JButton button_6 = new JButton("Salvar");
		button_6.setBounds(567, 365, 89, 23);
		panel_3.add(button_6);
		
		JButton button_7 = new JButton("Alterar Foto");
		button_7.setBounds(481, 272, 129, 23);
		panel_3.add(button_7);
		
		JLabel label_22 = new JLabel("Foto");
		label_22.setBounds(526, 185, 46, 14);
		panel_3.add(label_22);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpar.setBounds(468, 365, 89, 23);
		panel_3.add(btnLimpar);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Cadastro de Pontos", null, panel_4, null);
		panel_4.setLayout(null);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(10, 89, 198, 20);
		panel_4.add(comboBox_2);
		
		JLabel lblEvento = new JLabel("Evento");
		lblEvento.setFont(new Font("Bebas Neue", Font.PLAIN, 23));
		lblEvento.setBounds(10, 64, 84, 20);
		panel_4.add(lblEvento);
		
		JButton btnFinalizar = new JButton("Finalizar");
		btnFinalizar.setBounds(567, 365, 89, 23);
		panel_4.add(btnFinalizar);
		
		JLabel lblCadastroDePontos = new JLabel("Cadastro de Pontos");
		lblCadastroDePontos.setFont(new Font("Bebas Neue", Font.PLAIN, 47));
		lblCadastroDePontos.setBounds(10, 11, 376, 39);
		panel_4.add(lblCadastroDePontos);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Cadastro de Evento", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel label_15 = new JLabel("Nome: ");
		label_15.setFont(new Font("Bebas Neue", Font.PLAIN, 22));
		label_15.setBounds(10, 72, 83, 23);
		panel_5.add(label_15);
		
		JLabel label_16 = new JLabel("Data: ");
		label_16.setFont(new Font("Bebas Neue", Font.PLAIN, 22));
		label_16.setBounds(10, 116, 83, 33);
		panel_5.add(label_16);
		
		JLabel lblHorario = new JLabel("Horario:");
		lblHorario.setFont(new Font("Bebas Neue", Font.PLAIN, 22));
		lblHorario.setBounds(10, 175, 83, 45);
		panel_5.add(lblHorario);
		
	
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(10, 98, 222, 20);
		panel_5.add(textField_6);
		
		JButton button_3 = new JButton("Limpar");
		button_3.setBounds(365, 365, 91, 23);
		panel_5.add(button_3);
		
		JButton button_4 = new JButton("Cancelar");
		button_4.setBounds(466, 365, 91, 23);
		panel_5.add(button_4);
		
		JButton button_5 = new JButton("Salvar");
		button_5.setBounds(567, 365, 91, 23);
		panel_5.add(button_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"27/10/2014", "28/10/2014", "29/10/2014", "30/10/2014", "31/10/2014", "03/11/2014", "04/11/2014", "05/11/2014", "06/11/2014", "07/11/2014", "10/11/2014", "11/11/2014", "12/11/2014", "13/11/2014", "14/11/2014", "17/11/2014", "18/11/2014", "19/11/2014", "20/11/2014", "21/11/2014", "24/11/2014", "25/11/2014", "26/11/2014", "27/11/2014", "28/11/2014", "01/12/2014", "02/12/2014", "03/12/2014", "04/12/2014", "05/12/2014", "06/12/2014", "07/12/2014"}));
		comboBox.setBounds(10, 149, 124, 20);
		panel_5.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"00:00  -  00:00", "08:00  -  10:00", "11:00  -  12:30", "13:30  -  15:00", "15:30  -  17:00", "18:30  -  20:30", "21:30  -  22:30"}));
		comboBox_1.setBounds(10, 212, 222, 20);
		panel_5.add(comboBox_1);
		
		JLabel lblFoto = new JLabel("Foto");
		lblFoto.setBounds(60, 266, 46, 14);
		panel_5.add(lblFoto);
		
		JButton btnCarregarImagem = new JButton("Carregar Imagem");
		btnCarregarImagem.setBounds(10, 365, 139, 23);
		panel_5.add(btnCarregarImagem);
		
		JLabel lblCadastroDeEvento = new JLabel("Cadastro de Evento");
		lblCadastroDeEvento.setFont(new Font("Bebas Neue", Font.PLAIN, 47));
		lblCadastroDeEvento.setBounds(10, 11, 376, 39);
		panel_5.add(lblCadastroDeEvento);
		
		tableModel.addColumn("Nome");
		tableModel.addColumn("Pontos");
		tableModel.addColumn("Posição");
		
		tableModel_1.addColumn("Nome");
		tableModel_1.addColumn("Data");
		tableModel_1.addColumn("Inicio");
		tableModel_1.addColumn("Finalizacão");
		tableModel_1.addColumn("Pontos");
		
		
		
		

		


		
		
		/*table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"Nome", "Data", "Inicio", "Finaliza\u00E7\u00E3o", "Pontos"
			}
		));*/
		
		JLabel label = new JLabel("SENAI EDUCANDO");
		label.setForeground(Color.LIGHT_GRAY);
		label.setFont(new Font("Bebas Neue", Font.PLAIN, 54));
		label.setBounds(77, 4, 344, 66);
		contentPane.add(label);
		
		tableModel_2.addColumn("");
		
		JLabel label_10 = new JLabel("");
		label_10.setBounds(-18, -21, 152, 118);
		contentPane.add(label_10);
		label_10.setIcon(new ImageIcon("C:\\Users\\Gabriel Segalla\\git\\se-situacao-aprendizagem-2014-2\\Imagens\\P.ICON.png"));
		
		JLabel label_1 = new JLabel("SENAI EDUCANDO");
		label_1.setForeground(Color.DARK_GRAY);
		label_1.setFont(new Font("Bebas Neue", Font.PLAIN, 54));
		label_1.setBounds(71, 4, 344, 66);
		contentPane.add(label_1);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\Gabriel Segalla\\git\\se-situacao-aprendizagem-2014-2\\Imagens\\plano de Fundo.jpg"));
		label_3.setBounds(-8, -19, 726, 550);
		contentPane.add(label_3);
		
	}
}
