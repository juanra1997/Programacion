package Practica01;

import javax.swing.*;

public class Ejercicio13 extends JFrame {

	private static final long serialVersionUID = 1L;

	String[] paises={"--------------------------", "España", "Alemania", "Francia", "Italia", "Holanda"};
	JComboBox<String> combo=new JComboBox<String>(paises);
	
	public static void main(String[] args) {
		Ejercicio13 ventana=new Ejercicio13();
		ventana.miVentana();
	}
	
	public void miVentana() {
		setLayout(null);
		setSize(300, 100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setResizable(false);
		setTitle("Combo");
		
		//JComboBox combo=new JComboBox();
		
		combo.setBounds(85, 20, 130, 31);
		add(combo);
		
		setVisible(true);
	}	
}