package visao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

public class CadastroEventos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JFormattedTextField textField_2;
	private JFormattedTextField textField_3;
	private JFormattedTextField tfData;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroEventos frame = new CadastroEventos();
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
	public CadastroEventos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblSenai = new JLabel("SENAI");
		lblSenai.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSenai.setBounds(10, 23, 98, 30);
		contentPane.add(lblSenai);

		JLabel lblEducando = new JLabel("Educando");
		lblEducando.setForeground(Color.GRAY);
		lblEducando.setBounds(107, 39, 64, 14);
		contentPane.add(lblEducando);

		JButton btnNewButton = new JButton("Eventos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 64, 118, 30);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Ranking");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(138, 64, 124, 30);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_3 = new JButton("Cadastro Eventos");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_3.setBounds(272, 23, 161, 30);
		contentPane.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("Cadastro Pontos");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_4.setBounds(272, 64, 161, 30);
		contentPane.add(btnNewButton_4);

		JLabel lblCadastroDeEventos = new JLabel("Cadastro de Eventos");
		lblCadastroDeEventos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastroDeEventos.setBounds(10, 95, 222, 30);
		contentPane.add(lblCadastroDeEventos);

		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(10, 136, 46, 14);
		contentPane.add(lblNome);

		textField = new JTextField();
		textField.setBounds(95, 133, 222, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Data: ");
		lblNewLabel.setBounds(10, 161, 46, 14);
		contentPane.add(lblNewLabel);

		MaskFormatter maskData = null;
		try {
			maskData = new MaskFormatter("##/##/####");
		} catch (Exception e) {
			e.printStackTrace();
		}
		tfData = new JFormattedTextField(maskData);
		tfData.setBounds(95, 158, 86, 20);
		contentPane.add(tfData);
		tfData.setColumns(10);

		MaskFormatter maskHoraInicio = null;
		try {
			maskHoraInicio = new MaskFormatter("##:##");
		} catch (Exception e) {
			e.printStackTrace();
		}
		JLabel lblHoraIncio = new JLabel("Hora in\u00EDcio: ");
		lblHoraIncio.setBounds(10, 186, 75, 14);
		contentPane.add(lblHoraIncio);

		textField_2 = new JFormattedTextField(maskHoraInicio);
		textField_2.setBounds(95, 183, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		MaskFormatter maskHoraSaida = null;
		try {
			maskHoraSaida = new MaskFormatter("##:##");
		} catch (Exception e) {
			e.printStackTrace();
		}
		JLabel lblHoraSada = new JLabel("Hora sa\u00EDda: ");
		lblHoraSada.setBounds(10, 211, 75, 14);
		contentPane.add(lblHoraSada);

		textField_3 = new JFormattedTextField(maskHoraSaida);
		textField_3.setBounds(95, 208, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		JButton btnNewButton_5 = new JButton("Salvar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_5.setBounds(341, 239, 91, 23);
		contentPane.add(btnNewButton_5);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancelar.setBounds(242, 239, 91, 23);
		contentPane.add(btnCancelar);

		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnLimpar.setBounds(141, 239, 91, 23);
		contentPane.add(btnLimpar);
	}
}
