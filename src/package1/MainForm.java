package package1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exer1_aula22.Livro;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JProgressBar;

public class MainForm extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	Candidato Cand = null;
	ArrayList<Candidato> Candidatos = new ArrayList<Candidato>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
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
	public MainForm() {
		setTitle("Concurso P\u00FAblico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 332, 319);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(24, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00BA de Incri\u00E7\u00E3o:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(24, 97, 92, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(24, 36, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Cargo:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(24, 65, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtNome = new JTextField();
		txtNome.setBackground(new Color(255, 240, 245));
		txtNome.setBounds(80, 8, 214, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Imprimir Candidado por: ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(24, 173, 214, 14);
		contentPane.add(lblNewLabel_4);
		
		JRadioButton radop1 = new JRadioButton("Masculino");
		buttonGroup.add(radop1);
		radop1.setFont(new Font("Tahoma", Font.BOLD, 10));
		radop1.setBackground(new Color(204, 204, 255));
		radop1.setBounds(76, 32, 81, 23);
		contentPane.add(radop1);
		
		JRadioButton radop2 = new JRadioButton("Feminino");
		buttonGroup.add(radop2);
		radop2.setFont(new Font("Tahoma", Font.BOLD, 10));
		radop2.setBackground(new Color(204, 204, 255));
		radop2.setBounds(160, 32, 77, 23);
		contentPane.add(radop2);
		
		JComboBox cmbCargo1 = new JComboBox();
		cmbCargo1.setModel(new DefaultComboBoxModel(new String[] {"Delegado de Pol\u00EDcia", "Analista Ambiental", "T\u00E9cnico de enfermagem", "Professor - Hist\u00F3ria", "Juiz de Direito"}));
		cmbCargo1.setBackground(new Color(255, 240, 245));
		cmbCargo1.setBounds(80, 61, 214, 22);
		contentPane.add(cmbCargo1);
		
		JRadioButton radop3 = new JRadioButton("Outro");
		buttonGroup.add(radop3);
		radop3.setFont(new Font("Tahoma", Font.BOLD, 10));
		radop3.setBackground(new Color(204, 204, 255));
		radop3.setBounds(240, 32, 67, 23);
		contentPane.add(radop3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(126, 94, 168, 20);
		spinner.getEditor().getComponent(0).setBackground(new Color(255, 240, 245));
		contentPane.add(spinner);
		
		JComboBox cmbCargo2 = new JComboBox();
		cmbCargo2.setModel(new DefaultComboBoxModel(new String[] {"Delegado de Pol\u00EDcia", "Analista Ambiental", "T\u00E9cnico de enfermagem", "Professor - Hist\u00F3ria", "Juiz de Direito"}));
		cmbCargo2.setBackground(new Color(255, 240, 245));
		cmbCargo2.setToolTipText("");
		cmbCargo2.setBounds(24, 199, 161, 22);
		contentPane.add(cmbCargo2);
		
		JComboBox cmbSexo = new JComboBox();
		cmbSexo.setBackground(new Color(255, 240, 245));
		cmbSexo.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino", "Outro"}));
		cmbSexo.setBounds(24, 232, 161, 22);
		contentPane.add(cmbSexo);
		
		JButton btnNewButton_3 = new JButton("Cadastrar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String tmp;
				tmp = "";
				if(radop1.isSelected()) {
					tmp = radop1.getText();
				}
				if(radop2.isSelected()) {
					tmp = radop2.getText();
				}
				if(radop3.isSelected()) {
					tmp = radop3.getText();
				}
				Cand = new Candidato(txtNome.getText(), tmp, cmbCargo1.getSelectedItem().toString(), (Integer) spinner.getValue());
				Candidatos.add(Cand);
				JOptionPane.showMessageDialog(null, "Candidato cadastrado com sucesso");
			}
		});
		btnNewButton_3.setBackground(new Color(255, 204, 255));
		btnNewButton_3.setBounds(24, 127, 122, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_1 = new JButton("Cargo");
		btnNewButton_1.setBackground(new Color(255, 204, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dados = "- Candidatos do Cargo de " + cmbCargo2.getSelectedItem().toString() + ": \n\n";
				for(Candidato objCandidato: Candidatos) {
					if (objCandidato.getCargo().equals(cmbCargo2.getSelectedItem().toString())) {
						dados += "Nome: " + objCandidato.getNome() + 
								 "\nSexo: " + objCandidato.getSexo() +
								 "\nCago: " + objCandidato.getCargo() +
							     "\nNº de Inscrição: " + objCandidato.getNinsc() + "\n\n";
					}
				}
				JOptionPane.showMessageDialog(null, dados);
			}
		});
		btnNewButton_1.setBounds(205, 198, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Sexo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dados = "- Candidatos do Sexo " + cmbSexo.getSelectedItem().toString() + ": \n\n";
				for(Candidato objCandidato: Candidatos) {
					if (objCandidato.getSexo().equals(cmbSexo.getSelectedItem().toString())) {
						dados += "Nome: " + objCandidato.getNome() + 
								 "\nSexo: " + objCandidato.getSexo() +
								 "\nCago: " + objCandidato.getCargo() +
							     "\nNº de Inscrição: " + objCandidato.getNinsc() + "\n\n";
					}
				}
				JOptionPane.showMessageDialog(null, dados);
			}
		});
		btnNewButton.setBackground(new Color(255, 204, 255));
		btnNewButton.setBounds(205, 232, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Imprimir");
		btnNewButton_2.setBackground(new Color(255, 204, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dados = "- Candidatos cadastrados: \n\n";
				for(Candidato objCandidato: Candidatos) {
					dados += "Nome: " + objCandidato.getNome() + 
							 "\nSexo: " + objCandidato.getSexo() +
							 "\nCago: " + objCandidato.getCargo() +
						     "\nNº de Inscrição: " + objCandidato.getNinsc() + "\n\n";
				}
				JOptionPane.showMessageDialog(null, dados);
			}
		});
		btnNewButton_2.setBounds(172, 127, 122, 23);
		contentPane.add(btnNewButton_2);
	}
}
