package Practica01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio01 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	JFrame ventana=new JFrame();
	JButton boton=new JButton("ACEPTAR");
	JTextField texto=new JTextField();
	JLabel unidades=new JLabel();
	//String nom;

	public static void main(String [] args) {
		
		Ejercicio01 obj=new Ejercicio01();
		//String nombre;
		obj.miVentana();
	}
	
	public void miVentana() {
		
		//JFrame ventana=new JFrame();
		
		ventana.setLayout(null);
		ventana.setSize(330, 180);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(3);
		ventana.setResizable(false);
		
		//JLabel unidades=new JLabel();
		
		unidades.setText("Usuario:");
		unidades.setBounds(50,10,70,20);
		ventana.add(unidades);
		
		//JTextField texto=new JTextField();
		
		texto.setBounds(150,10,150,20);
		texto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		ventana.add(texto);
		
		//JButton boton=new JButton("ACEPTAR");
		
		boton.setBounds(20, 80, 100, 40);
		boton.addActionListener(this);
		ventana.add(boton);
		
		ventana.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			//nom=boton.getText();
			ventana.setTitle("Bienvenido a Java "+texto.getText());
		}
	}
}
