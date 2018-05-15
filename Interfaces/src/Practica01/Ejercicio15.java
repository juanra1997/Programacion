package Practica01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio15 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	String[] paises={"--------------------------", "España", "Alemania", "Francia", "Italia", "Holanda"};
	JComboBox<String> combo=new JComboBox<String>(paises);
	JButton boton=new JButton("ACEPTAR");
	JLabel unidades=new JLabel();

	public static void main(String [] args) {
		
		Ejercicio15 obj=new Ejercicio15();
		obj.miVentana();
	}
	
	public void miVentana() {
		
		setLayout(null);
		setSize(330, 180);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setResizable(false);
		
		//JLabel unidades=new JLabel();
		
		unidades.setText("Usuario:");
		unidades.setBounds(50,10,70,20);
		add(unidades);
		
		//ComboBox<String> combo=new JComboBox<String>(paises);
		
		combo.setBounds(150,10,150,20);
		add(combo);
		
		//JButton boton=new JButton("ACEPTAR");
		
		boton.setBounds(20, 80, 100, 40);
		boton.addActionListener(this);
		add(boton);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			if(combo.getSelectedIndex()!=0) {
				setTitle("Bienvenido a Java "+paises[combo.getSelectedIndex()]);
			}
		}
	}
}
