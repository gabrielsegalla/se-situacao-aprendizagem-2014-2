package br.senai.sc.visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import br.senai.sc.controle.UsuarioControle;
import br.senai.sc.dao.UsuarioDao;
import br.senai.sc.entity.Evento;
import br.senai.sc.entity.Usuario;

public class ListarUsuarios extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField codigoP;
	public UsuarioControle usuarioC;
	private DefaultTableModel tableModel = new DefaultTableModel();
	private JButton btnSeleciona;
	public static String idDoUsuario = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarUsuarios frame = new ListarUsuarios();
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


	public ListarUsuarios() {
		usuarioC = new UsuarioControle();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 55, 447, 330);
		contentPane.add(scrollPane);

		table = new JTable();
		tableModel.addColumn("Codigo");
		tableModel.addColumn("Nome Do Usuario");
		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(53);
		scrollPane.setViewportView(table);

		btnSeleciona = new JButton("Selecionar");
		btnSeleciona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int indice = table.getSelectedRow();
				Usuario usuario = new Usuario();
				setId(String.valueOf(tableModel.getValueAt(indice, 0)));
				JOptionPane.showMessageDialog(
						null,
						tableModel.getValueAt(indice, 0) + "\n"
								+ tableModel.getValueAt(indice, 1));
				Instancia instancia = new Instancia();
				instancia.getInstancia().idUsuario.setText(getId());
				dispose();
			}
		});
		btnSeleciona.setBounds(357, 442, 100, 23);
		contentPane.add(btnSeleciona);

		JLabel label = new JLabel("C\u00F3digo:");
		label.setBounds(111, 25, 46, 14);
		contentPane.add(label);

		codigoP = new JTextField();
		codigoP.setColumns(10);
		codigoP.setBounds(165, 22, 86, 20);
		contentPane.add(codigoP);

		JButton button = new JButton("Buscar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (codigoP.getText() == null
						|| codigoP.getText().trim().isEmpty()) {
					UsuarioDao daoU = new UsuarioDao();
					List<Usuario> usuarios = new ArrayList<Usuario>();
					usuarios = daoU.listar();
					limpar();
					for(Usuario usuario2 : usuarios){
						tableModel.addRow((new Object[]{usuario2.getId(),usuario2.getNome()}));
						
					}
				} else {
					Usuario pessoa1 = usuarioC.buscarPorId(Integer
							.valueOf(codigoP.getText()));
					limpar();
					tableModel.addRow(new Object[] { pessoa1.getId(),
							pessoa1.getNome() });
				}
			}
		});
		button.setBounds(262, 21, 91, 23);
		contentPane.add(button);

	}

	public String getId() {
		return idDoUsuario;
	}

	public void setId(String idC) {
		this.idDoUsuario = idC;
	}

	public void listarTodos(){
		List<Usuario> usuarios = new ArrayList<Usuario>();
		limpar();
		for (Usuario usu: usuarios){
			tableModel.addRow(new Object[] {usu.getId(),usu.getNome()});
			System.out.println(usu);
		}
	}

	public void limpar() {
		while (tableModel.getRowCount() > 0) {
			tableModel.removeRow(0);
			
		}
	}


}
