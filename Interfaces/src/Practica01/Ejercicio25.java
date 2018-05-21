package Practica01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio25 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	String[] monedas= {"Euros", "Yenes", "Dólares", "Libras"};
	JLabel label=new JLabel("MONEDA ORIGEN");
	JComboBox<String> combo=new JComboBox<String>(monedas);
	JTextField cantidad=new JTextField();
	Font fuente=new Font("TimesRoman", Font.BOLD, 12);
	JLabel label1=new JLabel("CANTIDAD:");
	
	public void miVentana() {
		
		setLayout(null);
		setSize(500, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		
		//JLabel label=new JLabel("MONEDA ORIGEN");
		
		label.setBounds(30, 20, 100, 10);
		add(label);
		
		//JComboBox<String> combo=new JComboBox<String>(monedas);
		
		combo.setBounds(140, 15, 100, 20);
		add(combo);
		
		//JTextField cantidad=new JTextField();
		
		cantidad.setBounds(360, 16, 100, 20);
		cantidad.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		add(cantidad);
		
		//JLabel label1=new JLabel("CANTIDAD");
		
		label1.setBounds(290, 16, 100, 20);
		add(label1);
		
		setVisible(true);
	}

	public static void main(String[] args) {

		Ejercicio25 obj=new Ejercicio25();
		obj.miVentana();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}

}
