package Practica01;

import javax.swing.*;

public class Ejercicio14 extends JFrame {

	private static final long serialVersionUID = 1L;

	String[] paises={"--------------------------", "Azul", "Amarillo", "Verde", "Rojo", "Lila"};
	JComboBox<String> combo=new JComboBox<String>(paises);
	
	public static void main(String[] args) {
		Ejercicio14 ventana=new Ejercicio14();
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