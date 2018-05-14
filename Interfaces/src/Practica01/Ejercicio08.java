package Practica01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio08 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JFrame ventana=new JFrame();
	JToggleButton boton=new JToggleButton("VARON");
	JToggleButton boton1=new JToggleButton("MUJER");
	JLabel texto=new JLabel();
	boolean pulsado=false, pulsado1=false;
	
	public static void main(String[] args) {
		Ejercicio08 obj=new Ejercicio08();
		obj.miVentana();
	}
	
	public void miVentana() {
		
		//JFrame ventana=new JFrame();
		
		ventana.setLayout(null);
		ventana.setSize(235, 130);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(3);
		ventana.setResizable(false);
		
		//JToggleButton boton=new JToggleButton("VARON");
		
		boton.setBounds(10, 20, 100, 40);
		boton.addActionListener(this);
		ventana.add(boton);
		
		//JToggleButton boton1=new JToggleButton("MUJER");
		
		boton1.setBounds(120, 20, 100, 40);
		boton1.addActionListener(this);
		ventana.add(boton1);
		
		//JLabel texto=new JLabel();
		
		texto.setBounds(70, 30, 100, 100);
		ventana.add(texto);
		
		ventana.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton) {
			
			if(pulsado==false&&pulsado1==false) {
				texto.setText("VARON");
				pulsado=true;
			}else if(pulsado==false&&pulsado1==true) {
				texto.setText("MUJER Y VARON");
				pulsado=true;
			}else if(pulsado==true&&pulsado1==true) {
				texto.setText("MUJER");
				pulsado=false;
			}else {
				texto.setText("");
				pulsado=false;
			}
		}
		
		if(e.getSource()==boton1) {
			
			if(pulsado1==false&&pulsado==false) {
				texto.setText("MUJER");
				pulsado1=true;
			}else if(pulsado1==false&&pulsado==true) {
				texto.setText("VARON Y MUJER");
				pulsado1=true;
			}else if(pulsado1==true&&pulsado==true) {
				texto.setText("VARON");
				pulsado1=false;
			}else {
				texto.setText("");
				pulsado1=false;
			}
		}
	}
}