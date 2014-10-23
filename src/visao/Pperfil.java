package visao;

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
		label_2.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		label_2.setBounds(10, 11, 166, 34);
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
		
		JPanel panel = new JPanel();
		panel.setToolTipText("Perfil");
		tabbedPane.addTab("Ranking", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 73, 615, 239);
		panel.add(scrollPane);
		
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
		
		JLabel label_10 = new JLabel("Ranking");
		label_10.setForeground(Color.ORANGE);
		label_10.setFont(new Font("Bebas Neue", Font.PLAIN, 57));
		label_10.setBounds(247, 11, 271, 51);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("Ranking");
		label_11.setForeground(Color.BLACK);
		label_11.setFont(new Font("Bebas Neue", Font.PLAIN, 57));
		label_11.setBounds(242, 11, 271, 51);
		panel.add(label_11);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Eventos", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(31, 101, 594, 237);
		panel_2.add(scrollPane_1);
		
		JLabel label_12 = new JLabel("EVENTOS");
		label_12.setForeground(Color.ORANGE);
		label_12.setFont(new Font("Bebas Neue", Font.PLAIN, 44));
		label_12.setBounds(245, 37, 142, 44);
		panel_2.add(label_12);
		
		JLabel label_13 = new JLabel("EVENTOS");
		label_13.setFont(new Font("Bebas Neue", Font.PLAIN, 44));
		label_13.setBounds(242, 36, 142, 44);
		panel_2.add(label_13);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Cadastro de Aluno", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Cadastro de Turma", null, panel_4, null);
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Cadastro de Evento", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel label_14 = new JLabel("Cadastro de Eventos");
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_14.setBounds(10, 11, 222, 30);
		panel_5.add(label_14);
		
		JLabel label_15 = new JLabel("Nome: ");
		label_15.setBounds(10, 74, 46, 14);
		panel_5.add(label_15);
		
		JLabel label_16 = new JLabel("Data: ");
		label_16.setBounds(10, 108, 46, 14);
		panel_5.add(label_16);
		
		JLabel label_17 = new JLabel("Hora in\u00EDcio: ");
		label_17.setBounds(10, 142, 75, 14);
		panel_5.add(label_17);
		
		JLabel label_18 = new JLabel("Hora sa\u00EDda: ");
		label_18.setBounds(10, 173, 75, 14);
		panel_5.add(label_18);
		
	
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(95, 71, 222, 20);
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
		
		JLabel label = new JLabel("SENAI EDUCANDO");
		label.setForeground(Color.LIGHT_GRAY);
		label.setFont(new Font("Bebas Neue", Font.PLAIN, 54));
		label.setBounds(77, 4, 344, 66);
		contentPane.add(label);
		
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
