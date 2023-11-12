package trabalho;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public  class Cadastro extends JFrame {

	Integer[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
	private static final long serialVersionUID = 1L;
	private JLabel labelTxt1, labelTxt2, labelTxt4,labelTxt5, labelTxt6, labelTxt3, labelTxt7, labelTxtSenha, labelTxt8, labelTxt9,labelTxt10, labelTxt11, labelTxt12, labelTxt25, labelTxt13, labelTxt14, labelTxt15, labelTxt16, labelTxt17, labelTxt18, labelTxt19, labelTxt20, labelTxt21, labelTxt22, labelTxt23, labelTxt24;
	private JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7, panel8, panelSenha;
	private JTextField caixaTxt1, caixaTxt2, caixaTxt3, caixaTxt4, caixaTxt5, caixaTxt6, caixaTxt7, caixaTxtSenha, caixaTxt8, caixaTxt9, caixaTxt10, caixaTxt11, caixaTxt12, caixaTxt25, caixaTxt13, caixaTxt14, caixaTxt15, caixaTxt16, caixaTxt17, caixaTxt18, caixaTxt19, caixaTxt20, caixaTxt21, caixaTxt22, caixaTxt23, caixaTxt24;
	private JComboBox<Integer> combobox = new JComboBox<Integer>(numeros); 
	public String novaSenha = "";
	public Cadastro() {
		this.Inicializar();
	}

	private void Inicializar() {
		setSize(1000, 720);
		setTitle("Calcular");
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		componentesCriar();
		setVisible(true);
	}

	private void componentesCriar() {
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(20, 10, 300, 200);
		panel1.setBorder(BorderFactory.createTitledBorder("Aplicar desconto em um valor (%)"));
		labelTxt1 = new JLabel("Valor inicial (R$): ");
		labelTxt1.setBounds(50, 33, 130, 25);
		labelTxt1.setForeground(Color.red);
		getContentPane().add(labelTxt1);
		caixaTxt1 = new JTextField();
		caixaTxt1.setBounds(150, 25, 130, 25);
		panel1.add(caixaTxt1);
		labelTxt2 = new JLabel("Desconto (%)");
		labelTxt2.setBounds(50, 65, 130, 25);
		labelTxt2.setForeground(Color.blue);
		getContentPane().add(labelTxt2);
		caixaTxt2 = new JTextField();
		caixaTxt2.setBounds(150, 55, 130, 25);
		panel1.add(caixaTxt2);
		labelTxt3 = new JLabel("Resultado (R$)");
		labelTxt3.setBounds(50, 97, 100, 25);
		labelTxt3.setForeground(Color.black);
		getContentPane().add(labelTxt3);
		caixaTxt3 = new JTextField();
		caixaTxt3.setBounds(150, 85, 130, 25);
		panel1.add(caixaTxt3);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(110, 130, 100, 20);
		panel1.add(btnCalcular);
		btnCalcular.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        
		            double val1 =  Double.parseDouble(caixaTxt1.getText());
		            double val2 =  Double.parseDouble(caixaTxt2.getText());
		            double resultado1 = val1 * (1-val2/100);
		            caixaTxt3.setText(String.format("%.2f",resultado1));
		    }
		});

		// Painel 2
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(343, 10, 300, 200);
		panel2.setBorder(BorderFactory.createTitledBorder("Incrementar % a um valor"));
		labelTxt4 = new JLabel("Valor inicial (R$):");
		labelTxt4.setBounds(370, 33, 130, 25);
		labelTxt4.setForeground(Color.red);
		getContentPane().add(labelTxt4);
		caixaTxt4 = new JTextField();
		caixaTxt4.setBounds(150, 25, 130, 25);
		panel2.add(caixaTxt4);
		labelTxt5 = new JLabel("Acréscimo (%)");
		labelTxt5.setBounds(370, 65, 130, 25);
		labelTxt5.setForeground(Color.blue);
		getContentPane().add(labelTxt5);
		caixaTxt5 = new JTextField();
		caixaTxt5.setBounds(150, 55, 130, 25);
		panel2.add(caixaTxt5);
		labelTxt6 = new JLabel("Resultado (R$)");
		labelTxt6.setBounds(370, 97, 100, 25);
		labelTxt6.setForeground(Color.black);
		getContentPane().add(labelTxt6);
		caixaTxt6 = new JTextField();
		caixaTxt6.setBounds(150, 85, 130, 25);
		panel2.add(caixaTxt6);
		JButton btnCalcular2 = new JButton("Calcular");
		btnCalcular2.setBounds(100, 130, 100, 20);
		panel2.add(btnCalcular2);
		btnCalcular2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		            double val3 =  Double.parseDouble(caixaTxt4.getText());
		            double val4 =  Double.parseDouble(caixaTxt5.getText());
		            double resultado2 = val3+val3 * (val4/100);
		            caixaTxt6.setText(String.format("%.2f",resultado2));
		    }
		});
		
		
		// Painel 3 
		panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBounds(665, 10, 300, 200);
		panel3.setBorder(BorderFactory.createTitledBorder("Quanto X% representa de Y?"));

		labelTxt7 = new JLabel("Total (a)");
		labelTxt7.setBounds(690, 33, 130, 25);
		labelTxt7.setForeground(Color.red);
		getContentPane().add(labelTxt7);
		caixaTxt7 = new JTextField();
		caixaTxt7.setBounds(150, 25, 130, 25);
		panel3.add(caixaTxt7);

		labelTxt8 = new JLabel("Porcentagem (b)");
		labelTxt8.setBounds(690, 65, 130, 25);
		labelTxt8.setForeground(Color.blue);

		getContentPane().add(labelTxt8);
		caixaTxt8 = new JTextField();
		caixaTxt8.setBounds(150, 55, 130, 25);
		panel3.add(caixaTxt8);

		labelTxt9 = new JLabel("Corresponde a");
		labelTxt9.setBounds(690, 97, 100, 25);
		labelTxt9.setForeground(Color.black);
		getContentPane().add(labelTxt9);
		caixaTxt9 = new JTextField();
		caixaTxt9.setBounds(150, 85, 130, 25);
		panel3.add(caixaTxt9);
		JButton btnCalcular3 = new JButton("Calcular");
		btnCalcular3.setBounds(100, 130, 100, 20);
		panel3.add(btnCalcular3);
		btnCalcular3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		            double val5 =  Double.parseDouble(caixaTxt7.getText());
		            double val6 =  Double.parseDouble(caixaTxt8.getText());
		            double resultado3 = (val5 * val6) / 100;
		            caixaTxt9.setText(String.format("%.2f",resultado3));
		    }
		});
		
		// Painel 4
		panel4 = new JPanel();
		panel4.setLayout(null);
		panel4.setBounds(20, 230, 300, 200);
		panel4.setBorder(BorderFactory.createTitledBorder("Quanto X representa de Y?:"));
		labelTxt10 = new JLabel("Total (a)");
		labelTxt10.setBounds(50, 253, 130, 25);
		labelTxt10.setForeground(Color.red);
		getContentPane().add(labelTxt10);
		caixaTxt10 = new JTextField();
		caixaTxt10.setBounds(150, 25, 130, 25);
		panel4.add(caixaTxt10);
		labelTxt11 = new JLabel("Parte (b)");
		labelTxt11.setBounds(50, 285, 130, 25);
		labelTxt11.setForeground(Color.blue);
		getContentPane().add(labelTxt11);
		caixaTxt11 = new JTextField();
		caixaTxt11.setBounds(150, 55, 130, 25);
		panel4.add(caixaTxt11);
		labelTxt12 = new JLabel("Corresponde a %");
		labelTxt12.setBounds(50, 317, 100, 25);
		labelTxt12.setForeground(Color.black);
		getContentPane().add(labelTxt12);
		caixaTxt12 = new JTextField();
		caixaTxt12.setBounds(150, 85, 130, 25);
		panel4.add(caixaTxt12);
		JButton btnCalcular4 = new JButton("Calcular");
		btnCalcular4.setBounds(100, 130, 100, 20);
		panel4.add(btnCalcular4);
		btnCalcular4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		            double val7 =  Double.parseDouble(caixaTxt10.getText());
		            double val8 =  Double.parseDouble(caixaTxt11.getText());
		            double resultado4 = (val8/val7) * 100; 
		            caixaTxt12.setText(String.format("%.2f",resultado4));
		    }
		});
		 // Painel 5
		panel5 = new JPanel();
		panel5.setLayout(null);
		panel5.setBounds(343, 230, 300, 200);
		panel5.setBorder(BorderFactory.createTitledBorder("Valor era A e paguei B, qual foi o desconto (%)?:"));

		labelTxt13 = new JLabel("Valor original (a)");
		labelTxt13.setBounds(370, 253, 130, 25);
		labelTxt13.setForeground(Color.red);
		getContentPane().add(labelTxt13);
		caixaTxt13 = new JTextField();
		caixaTxt13.setBounds(150, 25, 130, 25);
		panel5.add(caixaTxt13);

		labelTxt14 = new JLabel("Valor c/desconto (b)");
		labelTxt14.setBounds(370, 285, 130, 25);
		labelTxt14.setForeground(Color.blue);
		getContentPane().add(labelTxt14);
		caixaTxt14 = new JTextField();
		caixaTxt14.setBounds(150, 55, 130, 25);
		panel5.add(caixaTxt14);

		labelTxt15 = new JLabel("% desconto");
		labelTxt15.setBounds(370, 317, 100, 25);
		labelTxt15.setForeground(Color.black);
		getContentPane().add(labelTxt15);
		caixaTxt15 = new JTextField();
		caixaTxt15.setBounds(150, 85, 130, 25);
		panel5.add(caixaTxt15);
		JButton btnCalcular5 = new JButton("Calcular");
		btnCalcular5.setBounds(100, 130, 100, 20);
		panel5.add(btnCalcular5);
		btnCalcular5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		            double val9 =  Double.parseDouble(caixaTxt13.getText());
		            double val10 =  Double.parseDouble(caixaTxt14.getText());
		            double resultado5 = ((val9 - val10) / val9) * 100; 
		            caixaTxt15.setText(String.format("%.2f",resultado5));
		    }
		});
		 // Painel 6
		panel6 = new JPanel();
		panel6.setLayout(null);
		panel6.setBounds(665, 230, 300, 200);
		panel6.setBorder(BorderFactory.createTitledBorder("Variação Delta[%] - diferença % entre valores (%)"));

		labelTxt16 = new JLabel("Valor inicial (a)");
		labelTxt16.setBounds(690, 253, 130, 25);
		labelTxt16.setForeground(Color.red);
		getContentPane().add(labelTxt16);
		caixaTxt16 = new JTextField();
		caixaTxt16.setBounds(150, 25, 130, 25);
		panel6.add(caixaTxt16);

		labelTxt17 = new JLabel("Valor final (b):");
		labelTxt17.setBounds(690, 285, 130, 25);
		labelTxt17.setForeground(Color.blue);
		getContentPane().add(labelTxt17);
		caixaTxt17 = new JTextField();
		caixaTxt17.setBounds(150, 55, 130, 25);
		panel6.add(caixaTxt17);

		labelTxt18 = new JLabel("diferença (%):");
		labelTxt18.setBounds(690, 317, 100, 25);
		labelTxt18.setForeground(Color.black);
		getContentPane().add(labelTxt18);
		caixaTxt18 = new JTextField();
		caixaTxt18.setBounds(150, 85, 130, 25);
		panel6.add(caixaTxt18);
		JButton btnCalcular6 = new JButton("Calcular");
		btnCalcular6.setBounds(100, 130, 100, 20);
		panel6.add(btnCalcular6);
		btnCalcular6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		            double val11 =  Double.parseDouble(caixaTxt16.getText());
		            double val12 =  Double.parseDouble(caixaTxt17.getText());
		           double resultado6 = ((val12 - val11) / val11) * 100; 
		            caixaTxt18.setText(String.format("%.2f",resultado6));
		    }
		});
		
		// Painel 7
		panel7 = new JPanel();
		panel7.setLayout(null);
		panel7.setBounds(20, 450, 300, 200);
		panel7.setBorder(BorderFactory.createTitledBorder("Qual era o valor original (R$)?:"));

		labelTxt19 = new JLabel("Valor final R$ (a)");
		labelTxt19.setBounds(50, 473, 130, 25);
		labelTxt19.setForeground(Color.red);
		getContentPane().add(labelTxt19);
		caixaTxt19 = new JTextField();
		caixaTxt19.setBounds(150, 25, 130, 25);
		panel7.add(caixaTxt19);

		labelTxt20 = new JLabel("% desconto (b):");
		labelTxt20.setBounds(50, 505, 130, 25);
		labelTxt20.setForeground(Color.blue);

		getContentPane().add(labelTxt20);
		caixaTxt20 = new JTextField();
		caixaTxt20.setBounds(150, 55, 130, 25);
		panel7.add(caixaTxt20);

		labelTxt21 = new JLabel("Valor inicial");
		labelTxt21.setBounds(50, 537, 100, 25);
		labelTxt21.setForeground(Color.black);
		getContentPane().add(labelTxt21);
		caixaTxt21 = new JTextField();
		caixaTxt21.setBounds(150, 85, 130, 25);
		panel7.add(caixaTxt21);
		JButton btnCalcular7 = new JButton("Calcular");
		btnCalcular7.setBounds(100, 130, 100, 20);
		panel7.add(btnCalcular7);
		btnCalcular7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		            double val13 =  Double.parseDouble(caixaTxt19.getText());
		            double val14 =  Double.parseDouble(caixaTxt20.getText());
		           double resultado6 = (val13*100 / (100 - val14));
		            caixaTxt21.setText(String.format("%.2f",resultado6));
		    }
		});
		
		panel8 = new JPanel();
		panel8.setLayout(null);
		panel8.setBounds(343, 450, 300, 200);
		panel8.setBorder(BorderFactory.createTitledBorder("Regra de três"));

		labelTxt22 = new JLabel("a:");
		labelTxt22.setBounds(360, 490, 130, 25);
		labelTxt22.setForeground(Color.red);
		getContentPane().add(labelTxt22);
		caixaTxt22 = new JTextField();
		caixaTxt22.setBounds(40, 45, 100, 25);
		panel8.add(caixaTxt22);
		
		
		

		labelTxt23 = new JLabel("b:");
		labelTxt23.setBounds(360, 530, 130, 25);
		labelTxt23.setForeground(Color.blue);
		getContentPane().add(labelTxt23);
		caixaTxt23 = new JTextField();
		caixaTxt23.setBounds(40, 80, 100, 25);
		panel8.add(caixaTxt23);

		labelTxt24 = new JLabel("= r2:");
		labelTxt24.setBounds(490, 530, 100, 25);
		labelTxt24.setForeground(Color.gray);
		getContentPane().add(labelTxt24);
		caixaTxt24 = new JTextField();
		caixaTxt24.setBounds(180, 80, 100, 25);
		panel8.add(caixaTxt24);
		
		
		labelTxt25 = new JLabel("= r1:");
		labelTxt25.setBounds(490, 495, 100, 25);
		labelTxt25.setForeground(Color.green);
		getContentPane().add(labelTxt25);
		caixaTxt25 = new JTextField();
		caixaTxt25.setBounds(180, 45, 100, 25);
		panel8.add(caixaTxt25);
		
		JButton btnCalcular8 = new JButton("Calcular");
		btnCalcular8.setBounds(100, 130, 100, 20);
		panel8.add(btnCalcular8);
		btnCalcular8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		            double val15 =  Double.parseDouble(caixaTxt22.getText());
		            double val16 =  Double.parseDouble(caixaTxt23.getText());
		            double val17 =  Double.parseDouble(caixaTxt25.getText());
		            double resultado7 = (val17 * val16) / val15;
		            caixaTxt24.setText(String.format("%.2f",resultado7));
		    }
		});
		
		

		panelSenha = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panelSenha.setLayout(null);
		panelSenha.setBounds(665, 450, 300, 200);
		panelSenha.setBorder(BorderFactory.createTitledBorder("Gerador de senha"));
		JCheckBox ma = new JCheckBox("Letras maiúsculas");
		ma.setBounds(15, 15, 140, 30);
		panelSenha.add(ma);
		JCheckBox mi = new JCheckBox("Letras minúsculas");
		mi.setBounds(160, 15, 135, 30);
		panelSenha.add(mi);
		JCheckBox nu = new JCheckBox("Números");
		nu.setBounds(15, 40, 140, 30);
		panelSenha.add(nu);
		JCheckBox si = new JCheckBox("Símbolos");
		si.setBounds(160, 40, 135, 30);
		panelSenha.add(si);
		labelTxtSenha = new JLabel("Tamanho");
		labelTxtSenha.setBounds(690, 100, 70, 930);
		labelTxtSenha.setForeground(Color.black);
		getContentPane().add(labelTxtSenha);
		JButton btnGerar = new JButton("Gerar");
		btnGerar.setBounds(200, 100, 75, 30);
		panelSenha.add(btnGerar);
		combobox.setBounds(100, 100, 80, 30);
		panelSenha.add(combobox);
		
		
		
		
		getContentPane().add(panel1);
		getContentPane().add(panel2);
		getContentPane().add(panel3);
		getContentPane().add(panel4);
		getContentPane().add(panel5);
		getContentPane().add(panel6);
		getContentPane().add(panel7);
		getContentPane().add(panel8);
		getContentPane().add(panelSenha);
	}
	  
	public static void main(String[] args) {
		new Cadastro();
	}

}

	    

