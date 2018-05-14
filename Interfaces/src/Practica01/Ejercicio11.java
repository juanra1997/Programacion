package Practica01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio11 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JFrame ventana=new JFrame();
	JButton boton=new JButton("BOTON 1");
	JButton boton1=new JButton("BOTON 2");
	JLabel bt1=new JLabel();
	JLabel bt2=new JLabel();
	int cont1=0, cont2=0;
	
	public static void main(String[] args) {
		Ejercicio11 obj=new Ejercicio11();
		obj.miVentana();
	}
	
	public void miVentana() {
		
		//JFrame ventana=new JFrame();
		
		ventana.setLayout(null);
		ventana.setSize(235, 145);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(3);
		ventana.setResizable(false);
		
		//JButton boton=new JButton("BOTON 1");
		
		boton.setBounds(10, 20, 100, 40);
		boton.addActionListener(this);
		ventana.add(boton);
		
		//JButton boton1=new JButton("BOTON 2");
		
		boton1.setBounds(120, 20, 100, 40);
		boton1.addActionListener(this);
		ventana.add(boton1);
		
		//JLabel bt1=new JLabel();
		
		bt1.setBounds(10, 30, 1000, 100);
		bt1.setText("Pulsaciones al boton 1: 0");
		ventana.add(bt1);
		
		//JLabel bt2=new JLabel();
		
		bt2.setBounds(10, 45, 1000, 100);
		bt2.setText("Pulsaciones al boton 2: 0");
		ventana.add(bt2);
		
		ventana.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			cont1=cont1+1;
			bt1.setText("Pulsaciones al boton 1: "+cont1);
		}
		
		if(e.getSource()==boton1) {
			cont2=cont2+1;
			bt2.setText("Pulsaciones al boton 2: "+cont2);
		}
	}
}