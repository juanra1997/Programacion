package Practica01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio10 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JFrame ventana=new JFrame();
	JButton boton=new JButton("AZUL");
	JButton boton1=new JButton("AMARILLO");
	JButton boton2=new JButton("ROJO");
	JButton boton3=new JButton("VERDE");
	boolean azul=false, amarillo=false, rojo=false, verde=false;
	
	public static void main(String[] args) {
		Ejercicio10 obj=new Ejercicio10();
		obj.miVentana();
	}
	
	public void miVentana() {
		
		//JFrame ventana=new JFrame();
		
		ventana.setLayout(null);
		ventana.setSize(235, 160);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(3);
		ventana.setResizable(false);
		
		//JButton boton=new JButton("AZUL");
		
		boton.setBounds(10, 20, 100, 40);
		boton.addActionListener(this);
		ventana.add(boton);
		
		//JButton boton1=new JButton("AMARILLO");
		
		boton1.setBounds(120, 20, 100, 40);
		boton1.addActionListener(this);
		ventana.add(boton1);
		
		//JButton boton2=new JButton("ROJO");
		
		boton2.setBounds(10, 70, 100, 40);
		boton2.addActionListener(this);
		ventana.add(boton2);
		
		//JButton boton3=new JButton("VERDE");
		
		boton3.setBounds(120, 70, 100, 40);
		boton3.addActionListener(this);
		ventana.add(boton3);
		
		ventana.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton) {
			
			if(azul==false) {
				ventana.getContentPane().setBackground(Color.CYAN);
				azul=true;
				amarillo=false;
				rojo=false;
				verde=false;
			}else {
				ventana.getContentPane().setBackground(null);
				azul=false;
			}
		}
		
		if(e.getSource()==boton1) {
			
			if(amarillo==false) {
				ventana.getContentPane().setBackground(Color.YELLOW);
				amarillo=true;
				azul=false;
				rojo=false;
				verde=false;
			}else {
				ventana.getContentPane().setBackground(null);
				amarillo=false;
			}
		}
		
		if(e.getSource()==boton2) {
			
			if(rojo==false) {
				ventana.getContentPane().setBackground(Color.RED);
				rojo=true;
				azul=false;
				amarillo=false;
				verde=false;
			}else {
				ventana.getContentPane().setBackground(null);
				rojo=false;
			}
		}
		
		if(e.getSource()==boton3) {
			
			if(verde==false) {
				ventana.getContentPane().setBackground(Color.GREEN);
				verde=true;
				azul=false;
				amarillo=false;
				rojo=false;
			}else {
				ventana.getContentPane().setBackground(null);
				verde=false;
			}
		}
	}
}