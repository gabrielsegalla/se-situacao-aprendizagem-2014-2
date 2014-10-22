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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ProximosEventos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProximosEventos frame = new ProximosEventos();
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
	public ProximosEventos() {
		setTitle("Pr\u00F3ximos Eventos\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton button_1 = new JButton("Ranking\r\n");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ranking r = new Ranking();
				r.setVisible(true);

				dispose();
			}
		});
		button_1.setBounds(302, 19, 91, 23);
		contentPane.add(button_1);

		JButton button_2 = new JButton("Meu Perfil\r\n");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaUsuario tu = new TelaUsuario();
				tu.setVisible(true);
				dispose();
			}
		});
		button_2.setBounds(201, 19, 91, 23);
		contentPane.add(button_2);

		JLabel label = new JLabel("Senai");
		label.setFont(new Font("Tahoma", Font.BOLD, 40));
		label.setBounds(10, 0, 146, 42);
		contentPane.add(label);

		JLabel label_1 = new JLabel("Educando");
		label_1.setForeground(Color.GRAY);
		label_1.setBounds(122, 28, 77, 14);
		contentPane.add(label_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(108, 192, 491, 181);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null },
				{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "Nome da Palestra", "Hora de Inicio",
						"Hora de T\u00E9rmino", "Pontos" }));
		table.getColumnModel().getColumn(0).setPreferredWidth(113);
		table.getColumnModel().getColumn(2).setPreferredWidth(91);
		scrollPane.setViewportView(table);

		JLabel lblEventos = new JLabel("Eventos");
		lblEventos.setFont(new Font("Code Light", Font.PLAIN, 30));
		lblEventos.setBounds(272, 102, 186, 70);
		contentPane.add(lblEventos);
	}
}
