package Pruebas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import Practica01.Ejercicio22;

public class Prueba02 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField fecha=new JTextField();
	JTextField fecha1=new JTextField();
	JButton boton=new JButton("Introducir fecha de nacimiento");
	JButton boton1=new JButton("Introducir fecha de nacimiento");
	JFrame ventana=new JFrame();
	JFrame ventana1=new JFrame();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prueba02 obj=new Prueba02();
		obj.miVentana();

	}
public void miVentana2() {
		
	ventana1.setLayout(null);
		ventana1.setSize(500, 250);
		ventana1.setLocationRelativeTo(null);
		ventana1.setDefaultCloseOperation(HIDE_ON_CLOSE);
		ventana1.setResizable(false);
		
		//JTextField fecha=new JTextField();
		
				fecha1.setBounds(120, 80, 250, 20);
				fecha1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
				ventana1.add(fecha1);
				
				boton1.setBounds(120, 20, 250, 20);
				boton1.addActionListener(this);
				ventana1.add(boton1);
				
				ventana1.setVisible(true);
}
	public void miVentana() {
		
		ventana.setLayout(null);
		ventana.setSize(500, 250);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventana.setResizable(false);
		
		//JTextField fecha=new JTextField();
		
				fecha.setBounds(120, 80, 250, 20);
				fecha.setEditable(false);
				fecha.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
				ventana.add(fecha);
				
				boton.setBounds(120, 20, 250, 20);
				boton.addActionListener(this);
				ventana.add(boton);
				
				ventana.setVisible(true);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==boton) {
			Prueba02 obj=new Prueba02();
			obj.miVentana2();
			
		}
		
		if(e.getSource()==boton1) {
			fecha.setText(fecha1.getText());
			ventana.add(fecha);
			ventana1.setVisible(false);
		}
	}
}
