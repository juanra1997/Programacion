package Practica01;

import java.awt.Color;
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
	JTextPane precios=new JTextPane();

	public static void main(String[] args){

		Ejercicio20 obj=new Ejercicio20();
		obj.miVentana();
	}

	public void miVentana() {
		
		setLayout(null);
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		
		//JRadioButton peque=new JRadioButton("Pizza pequeña");
		
		peque.setBounds(10, 10, 150, 20);
		peque.setBackground(Color.WHITE);
		add(peque);
		
		//JRadioButton mediana=new JRadioButton("Pizza mediana");
		
		mediana.setBounds(10, 30, 150, 20);
		mediana.setBackground(Color.WHITE);
		add(mediana);
		
		//JRadioButton familiar=new JRadioButton("Pizza familiar");
		
		familiar.setBounds(10, 50, 150, 20);
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
		
		combo.setBounds(100, 80, 120, 20);
		add(combo);
		
		//JButton annadir=new JButton("AÑADIR");
		
		annadir.setBounds(300, 80, 100, 20);
		add(annadir);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
