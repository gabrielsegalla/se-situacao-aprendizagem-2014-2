package br.senai.sc.visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

import br.senai.sc.controle.EventoControle;
import br.senai.sc.controle.UsuarioControle;
import br.senai.sc.dao.EventoDao;
import br.senai.sc.dao.UsuarioDao;
import br.senai.sc.entity.Evento;
import br.senai.sc.entity.Usuario;

import java.awt.SystemColor;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Pperfil extends JFrame {

	private JPanel contentPane;
	private JPanel panel_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1;
	private JTextField evnome;
	private JFormattedTextField nome;
	private JFormattedTextField cpf;
	private JTextField login;
	private JPasswordField senha;
	UsuarioControle ucontrole;
	private JComboBox tipop;
	UsuarioDao udao;
	private JFormattedTextField datanasc;
	private JFormattedTextField pontosu;
	private JTextField qtPontose;
	private JFormattedTextField dtevento;
	private JComboBox cbhevento;
	EventoControle evcontrole;
	EventoDao edao;
	private JTable table;
	public JTextField idUsuario;
	private JTable table_1;
	private JTextField nomechave;
	private JTextField textField_8;
	private JTable table_2;
	private DefaultTableModel tableModel_1 = new DefaultTableModel();
	private DefaultTableModel tableModel_2 = new DefaultTableModel();
	private DefaultTableModel tableModel_3 = new DefaultTableModel();
	private JPanel panel;
	List<Evento> eventooos = new ArrayList<Evento>();
	private JComboBox comboEventos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				try {
					Instancia instancia = new Instancia();
					Pperfil frame = instancia.getInstancia();

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
		udao = new UsuarioDao();
		edao = new EventoDao();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSair = new JLabel("Sair");
		lblSair.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				TelaLogin telalogin = new TelaLogin();
				telalogin.setVisible(true);
				dispose();

			}
		});
		lblSair.setIcon(new ImageIcon(
				Pperfil.class
						.getResource("/javax/swing/plaf/metal/icons/ocean/paletteClose-pressed.gif")));
		lblSair.setBounds(628, 30, 46, 14);
		contentPane.add(lblSair);

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

		JLabel lblTipoDeUsuario = new JLabel("Tipo de Usuario");
		lblTipoDeUsuario.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		lblTipoDeUsuario.setBounds(10, 164, 157, 19);
		panel_1.add(lblTipoDeUsuario);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(10, 189, 138, 20);
		panel_1.add(textField_3);

		JLabel lblLogin_1 = new JLabel("Login");
		lblLogin_1.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		lblLogin_1.setBounds(10, 220, 68, 19);
		panel_1.add(lblLogin_1);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(10, 245, 138, 20);
		panel_1.add(textField_4);

		JButton button = new JButton("Alterar");
		button.setBounds(470, 365, 89, 23);
		panel_1.add(button);

		JButton button_1 = new JButton("Salvar");
		button_1.setBounds(567, 365, 89, 23);
		panel_1.add(button_1);
		tableModel_2.addColumn("Posição");
		tableModel_2.addColumn("Nome");
		tableModel_2.addColumn("Pontos:");

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Eventos", null, panel_2, null);
		panel_2.setLayout(null);

		JLabel label_13 = new JLabel("EVENTOS");
		label_13.setFont(new Font("Bebas Neue", Font.PLAIN, 47));
		label_13.setBounds(10, 11, 142, 44);
		panel_2.add(label_13);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 66, 631, 272);
		panel_2.add(scrollPane_1);

		table_1 = new JTable();
		tableModel_3.addColumn("id");
		tableModel_3.addColumn("Data");
		tableModel_3.addColumn("Horário");
		tableModel_3.addColumn("Evento:");
		tableModel_3.addColumn("Pontos");
		table_1.setModel(tableModel_3);
		scrollPane_1.setViewportView(table_1);

		JLabel lblBuscarPorNome = new JLabel("Buscar por Nome:");
		lblBuscarPorNome.setFont(new Font("Bebas Neue", Font.PLAIN, 27));
		lblBuscarPorNome.setBounds(10, 357, 178, 27);
		panel_2.add(lblBuscarPorNome);

		nomechave = new JTextField();
		nomechave.setBounds(183, 357, 304, 20);
		panel_2.add(nomechave);
		nomechave.setColumns(10);

		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String palavra = nomechave.getText();
				// if(comboBusca.getSelectedIndex() == 1 && palavra ==null){
				// salaC.buscarPorLocalizacao(palavra);
				// }
				// if(comboBusca.getSelectedIndex() == 2 && palavra ==null){
				// salaC.buscarPorTipo(palavra);
				// }
				// if(comboBusca.getSelectedIndex() == 3 && palavra ==null){
				// salaC.buscarPorSala(palavra);
				// }
				// if(comboBusca.getSelectedIndex() == 4 && palavra ==null){
				// salaC.buscarPorLugares(palavra);
			}

			// }
		});
		btnBuscar.setBounds(497, 357, 89, 23);
		panel_2.add(btnBuscar);

		JButton btnListarTodos = new JButton("Listar Todos");
		btnListarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				listarTodos();
			}
		});
		btnListarTodos.setBounds(497, 36, 142, 23);
		panel_2.add(btnListarTodos);

		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Cadastro de Aluno", null, panel_3, null);
		panel_3.setLayout(null);

		JLabel lblCadastroDeAluno = new JLabel("Cadastro de Pessoa\r\n");
		lblCadastroDeAluno.setFont(new Font("Bebas Neue", Font.PLAIN, 47));
		lblCadastroDeAluno.setBounds(10, 11, 376, 39);
		panel_3.add(lblCadastroDeAluno);

		JLabel label_17 = new JLabel("Nome:");
		label_17.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		label_17.setBounds(10, 84, 68, 19);
		panel_3.add(label_17);

		nome = new JFormattedTextField();
		nome.setColumns(10);
		nome.setBounds(10, 109, 138, 20);
		panel_3.add(nome);

		JLabel label_18 = new JLabel("CPF");
		label_18.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		label_18.setBounds(10, 136, 68, 19);
		panel_3.add(label_18);

		MaskFormatter maskcpf = null;
		try {
			maskcpf = new MaskFormatter("###.###.###-##");
		} catch (Exception e) {
			e.printStackTrace();
		}

		cpf = new JFormattedTextField(maskcpf);
		cpf.setColumns(10);
		cpf.setBounds(10, 161, 138, 20);
		panel_3.add(cpf);

		MaskFormatter maskdata = null;
		try {
			maskdata = new MaskFormatter(" ##/##/####");
		} catch (Exception e) {
			e.printStackTrace();
		}

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		lblLogin.setBounds(10, 248, 68, 19);
		panel_3.add(lblLogin);

		login = new JTextField();
		login.setColumns(10);
		login.setBounds(10, 273, 138, 20);
		panel_3.add(login);

		JLabel lblTipoDePessoa = new JLabel("senha");
		lblTipoDePessoa.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		lblTipoDePessoa.setBounds(10, 304, 118, 19);
		panel_3.add(lblTipoDePessoa);

		senha = new JPasswordField();
		senha.setColumns(10);
		senha.setBounds(10, 329, 138, 20);
		panel_3.add(senha);

		ucontrole = new UsuarioControle();
		udao = new UsuarioDao();
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Usuario usuario = new Usuario();
				usuario.setCpf(cpf.getText());
				usuario.setNome(nome.getText());
				usuario.setTpUsuario((String) tipop.getSelectedItem());
				usuario.setLogin(login.getText());
				Integer senhaa = Integer.parseInt(senha.getText());
				usuario.setSenha(senha.getText());

				try {
					usuario.setDataNasc(sdf.parse(datanasc.getText()));
					ucontrole.salvar(usuario);
					udao.salvar(usuario);
				} catch (ParseException ee) {
					JOptionPane.showMessageDialog(null,
							"o formato de data é invalido");
					ee.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		});

		btnCadastrar.setBounds(567, 365, 89, 23);
		panel_3.add(btnCadastrar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nome.setText("");
				cpf.setText("");
				tipop.setSelectedIndex(0);
				login.setText("");
				senha.setText("");

			}
		});
		btnLimpar.setBounds(468, 365, 89, 23);
		panel_3.add(btnLimpar);

		JLabel tipo = new JLabel("Tipo de Pessoa:");
		tipo.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		tipo.setBounds(10, 192, 118, 19);
		panel_3.add(tipo);

		tipop = new JComboBox();
		tipop.setModel(new DefaultComboBoxModel(new String[] { "Selecione",
				"Aluno", "Professor" }));
		tipop.setBounds(10, 217, 118, 20);
		panel_3.add(tipop);

		JLabel lblDataDeNacimento = new JLabel("Data de Nacimento:");
		lblDataDeNacimento.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		lblDataDeNacimento.setBounds(189, 84, 138, 19);
		panel_3.add(lblDataDeNacimento);

		MaskFormatter maskdt = null;
		try {
			maskdt = new MaskFormatter("##/##/####");
		} catch (Exception e) {
			e.printStackTrace();
		}

		datanasc = new JFormattedTextField(maskdt);
		datanasc.setColumns(10);
		datanasc.setBounds(189, 109, 138, 20);
		panel_3.add(datanasc);

		JLabel lblPontos = new JLabel("Pontos:");
		lblPontos.setFont(new Font("Bebas Neue", Font.PLAIN, 18));
		lblPontos.setBounds(189, 136, 68, 19);
		panel_3.add(lblPontos);

		pontosu = new JFormattedTextField();
		pontosu.setEnabled(false);
		pontosu.setText(" O");
		pontosu.setColumns(10);
		pontosu.setBounds(189, 161, 138, 20);
		panel_3.add(pontosu);

		panel = new JPanel();
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

	

		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 62, 646, 261);
		panel.add(scrollPane_2);

		table_2 = new JTable();
		table_2.setModel(tableModel_2);
		table_2.getColumnModel().getColumn(0).setPreferredWidth(10);
		table_2.getColumnModel().getColumn(0).setResizable(true);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(111);
		table_2.getColumnModel().getColumn(2).setPreferredWidth(51);
		scrollPane_2.setViewportView(table_2);

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UsuarioDao daoU = new UsuarioDao();
				List<Usuario> usuarios = new ArrayList<Usuario>();
				usuarios = daoU.buscarRanking();
				int i = 1;
				limpar2();
				for (Usuario usuario2 : usuarios) {
					tableModel_2.addRow((new Object[] { i, usuario2.getNome(),
							usuario2.getPontosu() }));
					i = i + 1;
				}

			}
		});
		btnAtualizar.setBounds(565, 28, 91, 23);
		panel.add(btnAtualizar);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Cadastro de Pontos", null, panel_4, null);
		panel_4.setLayout(null);

		comboEventos = new JComboBox();
		comboEventos.setBounds(10, 89, 222, 20);
		panel_4.add(comboEventos);

		JLabel lblEvento = new JLabel("Evento:");
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

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 128, 646, 221);
		panel_4.add(scrollPane);

		table = new JTable();
		table.setModel(tableModel_1);

		scrollPane.setViewportView(table);

		idUsuario = new JTextField();
		idUsuario.setEnabled(false);
		idUsuario.setBounds(376, 89, 181, 20);
		panel_4.add(idUsuario);
		idUsuario.setColumns(10);

		JLabel lblCpf = new JLabel("Codigo aluno:");
		lblCpf.setFont(new Font("Bebas Neue", Font.PLAIN, 23));
		lblCpf.setBounds(375, 64, 144, 20);
		panel_4.add(lblCpf);

		JButton btnBuscar_1 = new JButton("Buscar");
		btnBuscar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ListarUsuarios usua = new ListarUsuarios();
				usua.setVisible(true);
			}
		});
		btnBuscar_1.setBounds(567, 90, 89, 20);
		panel_4.add(btnBuscar_1);

		JButton btnAtualizar_1 = new JButton("Atualizar");
		btnAtualizar_1.setBounds(242, 88, 91, 23);
		panel_4.add(btnAtualizar_1);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Cadastro de Evento", null, panel_5, null);
		panel_5.setLayout(null);

		JLabel label_15 = new JLabel("Nome: ");
		label_15.setFont(new Font("Bebas Neue", Font.PLAIN, 22));
		label_15.setBounds(10, 72, 83, 23);
		panel_5.add(label_15);

		JLabel lblDataDeInicio = new JLabel("Data de Inicio: ");
		lblDataDeInicio.setFont(new Font("Bebas Neue", Font.PLAIN, 22));
		lblDataDeInicio.setBounds(10, 116, 161, 33);
		panel_5.add(lblDataDeInicio);

		JLabel lblHorario = new JLabel("Horario:");
		lblHorario.setFont(new Font("Bebas Neue", Font.PLAIN, 22));
		lblHorario.setBounds(10, 175, 83, 45);
		panel_5.add(lblHorario);

		evnome = new JTextField();
		evnome.setColumns(10);
		evnome.setBounds(10, 98, 222, 20);
		panel_5.add(evnome);

		JButton button_3 = new JButton("Limpar");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				evnome.setText("");
				cbhevento.setSelectedItem(0);
				qtPontose.setText("");
				dtevento.setText("");
			}
		});
		button_3.setBounds(408, 365, 91, 23);
		panel_5.add(button_3);

		JButton button_4 = new JButton("Cancelar");
		button_4.setBounds(307, 365, 91, 23);
		panel_5.add(button_4);

		JButton btnCadastrarEvento = new JButton("Cadastrar Evento");
		btnCadastrarEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Evento evento = new Evento();
				evento.setNome(evnome.getText());
				evento.setHorario((String) cbhevento.getSelectedItem());
				Integer eqtPontos = Integer.parseInt(qtPontose.getText());
				evento.setPonto(eqtPontos);
				evcontrole = new EventoControle();
				edao = new EventoDao();
				try {
					evento.setData(sdf.parse(dtevento.getText()));
					evcontrole.salvar(evento);
					edao.salvar(evento);
				} catch (ParseException ee) {
					JOptionPane.showMessageDialog(null,
							"o formato de data é invalido");
					ee.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnCadastrarEvento.setBounds(509, 365, 149, 23);
		panel_5.add(btnCadastrarEvento);

		cbhevento = new JComboBox();
		cbhevento.setModel(new DefaultComboBoxModel(new String[] {
				"00:00  -  00:00", "08:00  -  10:00", "10:30  -  12:30",
				"13:30  -  15:30", "16:00  -  18:30", "19:30  -  21:00",
				"21:30  -  22:30" }));
		cbhevento.setBounds(10, 212, 222, 20);
		panel_5.add(cbhevento);

		JLabel lblCadastroDeEvento = new JLabel("Cadastro de Evento");
		lblCadastroDeEvento.setFont(new Font("Bebas Neue", Font.PLAIN, 47));
		lblCadastroDeEvento.setBounds(10, 11, 376, 39);
		panel_5.add(lblCadastroDeEvento);

		JLabel lblqtpontos = new JLabel("Quantidade de Pontos");
		lblqtpontos.setFont(new Font("Bebas Neue", Font.PLAIN, 22));
		lblqtpontos.setBounds(10, 243, 239, 23);
		panel_5.add(lblqtpontos);

		qtPontose = new JTextField();
		qtPontose.setColumns(10);
		qtPontose.setBounds(10, 269, 222, 20);
		panel_5.add(qtPontose);

		dtevento = new JFormattedTextField(maskdt);
		dtevento.setColumns(10);
		dtevento.setBounds(10, 147, 222, 20);
		panel_5.add(dtevento);

		JLabel label_1 = new JLabel("SENAI EDUCANDO");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Bebas Neue", Font.PLAIN, 54));
		label_1.setBounds(10, -4, 344, 66);
		contentPane.add(label_1);

		JLabel label = new JLabel("");
		label.setBounds(0, -22, 681, 550);
		contentPane.add(label);
		label.setIcon(new ImageIcon(
				"C:\\Users\\Gabriel Segalla\\Desktop\\Senai\\se-situacao-aprendizagem-2014-2\\resources\\Imagens\\NEW 1.jpg"));

		JLabel label_3 = new JLabel("");
		label_3.setBounds(19, 30, 46, 14);
		contentPane.add(label_3);

	}

	public void limpar2() {
		while (tableModel_2.getRowCount() > 0) {
			tableModel_2.removeRow(0);
		}
	}

	public void limpar3() {
		while (tableModel_3.getRowCount() > 0) {
			tableModel_3.removeRow(0);
		}
	}

	public void listarTodos() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		eventooos = edao.listar();
		limpar3();
		for (Evento evento : eventooos) {
			String data = sdf.format(evento.getData());
			tableModel_3.addRow(new Object[] { evento.getId(), data,
					evento.getHorario(), evento.getNome(), evento.getPonto() });
		}
	}

	public void listarTodosCombo() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		eventooos = edao.listar();
		limpar3();
		for (Evento evento : eventooos) {
			comboEventos.addItem(evento);
		}
	}

}
