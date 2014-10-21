package visao;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Ranking extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ranking frame = new Ranking();
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
	public Ranking() {
		setTitle("Ranking\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Meu Perfil\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaUsuario tu = new TelaUsuario();
				tu.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(195, 24, 91, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_2 = new JButton("Pr\u00F3ximos Eventos\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProximosEventos pe = new ProximosEventos();
				pe.setVisible(true);

				dispose();

			}
		});
		btnNewButton_2.setBounds(296, 24, 156, 23);
		contentPane.add(btnNewButton_2);

		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblRanking.setBounds(234, 91, 114, 32);
		contentPane.add(lblRanking);

		table = new JTable();
		table.setBounds(150, 222, 166, -76);
		contentPane.add(table);

		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null }, }, new String[] {
				"Nome", "Pontos", "Posi\u00E7\u00E3o" }));
		table_1.setBounds(428, 371, -242, -211);
		contentPane.add(table_1);

		JLabel lblSenai = new JLabel("Senai");
		lblSenai.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblSenai.setBounds(10, 5, 146, 42);
		contentPane.add(lblSenai);

		JLabel lblEducando = new JLabel("Educando");
		lblEducando.setForeground(Color.GRAY);
		lblEducando.setBounds(121, 33, 77, 14);
		contentPane.add(lblEducando);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(134, 138, 314, 183);
		contentPane.add(scrollPane);

		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null },
				{ null, null, null }, { null, null, null }, }, new String[] {
				"Nome", "Pontos", "Posi\u00E7\u00E3o" }));
		scrollPane.setViewportView(table_2);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(
				"C:\\Users\\alisson_augusto\\Pictures\\A certa.png"));
		lblNewLabel.setBounds(10, 77, 101, 93);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(
				"C:\\Users\\alisson_augusto\\Pictures\\A certa.png"));
		lblNewLabel_1.setBounds(458, 70, 106, 106);
		contentPane.add(lblNewLabel_1);

		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(337, 332, 114, 23);
		contentPane.add(btnProcurar);

		textField = new JTextField();
		textField.setBounds(135, 335, 181, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(88, 336, 46, 14);
		contentPane.add(lblNome);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
