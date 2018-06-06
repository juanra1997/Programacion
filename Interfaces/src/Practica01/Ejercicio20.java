package Practica01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio20 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	String[] ingredientes= {"Atun", "Jamon York", "Jamon Serrano", "Bacon", "Chorizo", "Morcilla", "Salsa Barbacoa", "Salsa Boloñesa",
			"Champiñones", "Gambas", "Queso", "Cebolla", "Carne picada"};
	JComboBox<String> combo=new JComboBox<String>(ingredientes);
	JButton annadir=new JButton("AÑADIR");
	JRadioButton peque=new JRadioButton("Pizza pequeña");
	JRadioButton mediana=new JRadioButton("Pizza mediana");
	JRadioButton familiar=new JRadioButton("Pizza familiar");
	ButtonGroup prueba=new ButtonGroup();
	JTextPane precios=new JTextPane();
	//JTextPane annadidos=new JTextPane();
	JTextPane annadidos=new JTextPane();
	JLabel label=new JLabel("Ingredientes extra");
	JLabel label1=new JLabel("Pizza:");
	int cont=0;
	JButton calculo=new JButton("TOTAL");
	JTextField field=new JTextField();
	JButton limpiar=new JButton("LIMPIAR");
	JLabel label2=new JLabel("Total con IVA:");
	JTextField field2=new JTextField();

	public static void main(String[] args){

		Ejercicio20 obj=new Ejercicio20();
		obj.miVentana();
	}

	public void miVentana() {
		
		setLayout(null);
		setSize(700, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		
		//JRadioButton peque=new JRadioButton("Pizza pequeña");
		
		peque.setBounds(30, 80, 110, 20);
		peque.setBackground(Color.WHITE);
		add(peque);
		
		//JRadioButton mediana=new JRadioButton("Pizza mediana");
		
		mediana.setBounds(30, 100, 110, 20);
		mediana.setBackground(Color.WHITE);
		add(mediana);
		
		//JRadioButton familiar=new JRadioButton("Pizza familiar");
		
		familiar.setBounds(30, 120, 110, 20);
		familiar.setBackground(Color.WHITE);
		add(familiar);
		
		//JTextPane precios=new JTextPane();
		
		precios.setText(" PRECIOS:\n\n Pequeña: 8€\n\n Mediana: 10€\n\n Familiar: 12€\n\n Ingrediente\n extra: 0.50€");
		precios.setBounds(580, 15, 90, 165);
		precios.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		precios.setEditable(false);
		precios.setBackground(Color.WHITE);
		add(precios);
		
		//JComboBox<String> combo=new JComboBox<String>(ingredientes);
		
		combo.setBounds(180, 80, 120, 20);
		add(combo);
		
		//JButton annadir=new JButton("AÑADIR");
		
		annadir.setBounds(180, 110, 100, 20);
		annadir.addActionListener(this);
		add(annadir);
		
		//JTextPane annadidos=new JTextPane();
		
		/*precios.setText(" PRECIOS:\n\n Pequeña: 8€\n\n Mediana: 10€\n\n Familiar: 12€\n\n Ingrediente\n extra: 0.50€");
		precios.setBounds(580, 15, 90, 165);
		precios.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		precios.setEditable(false);
		precios.setBackground(Color.WHITE);
		add(precios);*/
		
		//JTextPane annadidos=new JTextPane();
		
		annadidos.setBounds(310, 60, 260, 80);
		annadidos.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		annadidos.setEditable(false);
		add(annadidos);
		
		//JLabel label=new JLabel("Ingredientes extra");
		
		label.setBounds(180, 50, 150, 20);
		add(label);
		
		//JLabel label1=new JLabel("Pizza:");
		
		label1.setBounds(30, 50, 150, 20);
		add(label1);
		
		//JButton calculo=new JButton("TOTAL");
		
		calculo.setBounds(30, 200, 100, 50);
		calculo.addActionListener(this);
		add(calculo);
		
		//JTextField field=new JTextField();
		
		field.setBounds(152, 200, 100, 50);
		field.setEditable(false);
		field.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		field.setBackground(Color.WHITE);
		field.setFont(new Font("TimesRoman", Font.BOLD, 25));
		//field.setText(" 100");
		field.setHorizontalAlignment(JTextField.CENTER);
		add(field);
		
		//ButtonGroup prueba=new ButtonGroup();
		
		prueba.add(peque);
		prueba.add(mediana);
		prueba.add(familiar);
		
		//JButton limpiar=new JButton("LIMPIAR");
		
		limpiar.setBounds(390, 150, 100, 20);
		limpiar.addActionListener(this);
		add(limpiar);
		
		//JLabel label2=new JLabel("Total con IVA:");
		
		label2.setBounds(270, 215, 150, 20);
		add(label2);
		
		//JTextField field2=new JTextField();
		
		field2.setBounds(357, 200, 100, 50);
		field2.setEditable(false);
		field2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		field2.setBackground(Color.WHITE);
		field2.setFont(new Font("TimesRoman", Font.BOLD, 25));
		field2.setHorizontalAlignment(JTextField.CENTER);
		//field2.setText("200");
		add(field2);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==annadir) {
			annadidos.setText(annadidos.getText()+ingredientes[combo.getSelectedIndex()]+" ");
			cont++;
		}
		
		if(e.getSource()==calculo) {
			if(peque.isSelected()) {
				double a=8+(cont*0.5), b=a*0.21;
				field.setText(String.valueOf(a)+"€");
				field2.setText(String.valueOf(a+b)+"€");
				setTitle("");
			}else if(mediana.isSelected()) {
				double a=10+(cont*0.5), b=a*0.21;
				field.setText(String.valueOf(a)+"€");
				field2.setText(String.valueOf(a+b)+"€");
				setTitle("");
			}else if(familiar.isSelected()) {
				double a=12+(cont*0.5), b=a*0.21;
				field.setText(String.valueOf(a)+"€");
				field2.setText(String.valueOf(a+b)+"€");
				setTitle("");
			}else {
				setTitle("No hay tamaño de pizza seleccionado");
			}
		}
		
		if(e.getSource()==limpiar) {
			annadidos.setText("");
			cont=0;
		}
	}

}
