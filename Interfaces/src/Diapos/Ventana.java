package Diapos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;

public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	//JFrame ventana=new JFrame();
	JButton boton1=new JButton("CALCULAR");
	JButton boton2=new JButton("CONFIGURAR");

	public static void main(String [] args) {
		
		Ventana obj=new Ventana();
		obj.miVentana();
	}

	public void miVentana() {
		JFrame ventana=new JFrame();
		
		ventana.setLayout(null);
		ventana.setTitle("Prueba");
		ventana.setSize(300, 250);
		//ventana.setLocation(Toolkit.getDefaultToolkit().getScreenSize().height/2, Toolkit.getDefaultToolkit().getScreenSize().width/6);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(3);
		
		JLabel unidades=new JLabel();
		
		unidades.setText("Unidades");
		unidades.setBounds(50,10,70,20);
		ventana.add(unidades);
		
		JTextField texto1=new JTextField();
		
		texto1.setBounds(150,10,100,20);
		ventana.add(texto1);
		
		JLabel precio=new JLabel();
		
		precio.setText("Precio");
		precio.setBounds(50,50,70,20);
		ventana.add(precio);
		
		JTextField texto2=new JTextField();
		
		texto2.setBounds(150,50,100,20);
		ventana.add(texto2);
		
		JLabel descuento=new JLabel();
		
		descuento.setText("Descuento");
		descuento.setBounds(50,90,70,20);
		ventana.add(descuento);
		
		JTextField texto3=new JTextField();
		
		texto3.setBounds(150,90,100,20);
		texto3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		ventana.add(texto3);
		
		//JButton boton1=new JButton("CALCULAR");

		boton1.setBounds(20, 150, 120, 20);
		boton1.addActionListener(this);
		ventana.add(boton1);
		
		//JButton boton2=new JButton("CONFIGURAR");

		boton2.setBounds(140, 150, 120, 20);
		boton2.addActionListener(this);
		ventana.add(boton2);
		
		ventana.setVisible(true);
		
		//return ventana;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==boton2) {
			miVentana2 ventana2 = new miVentana2();
			ventana2.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		}
		
		if(e.getSource()==boton1){
			
		}
	}
}

class miVentana2 extends JFrame implements ActionListener {
	
	JButton boton3=new JButton("ACEPTAR");
	JButton boton4=new JButton("CANCELAR");
	
	private static final long serialVersionUID = 1L;

	public miVentana2() {
		
		JFrame ventana = new JFrame();
		
		ventana.setLayout(null);
		ventana.setTitle("Prueba");
		ventana.setSize(300, 200);
		ventana.setLocation(Toolkit.getDefaultToolkit().getScreenSize().height/2, Toolkit.getDefaultToolkit().getScreenSize().width/6);
		//ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(1);
	
		JLabel IVA=new JLabel();
	
		IVA.setText("IVA");
		IVA.setBounds(50,10,70,20);
		ventana.add(IVA);
	
		JTextField texto1=new JTextField();
	
		texto1.setBounds(150,10,100,20);
		ventana.add(texto1);
	
		JLabel descuento=new JLabel();
	
		descuento.setText("Descuento");
		descuento.setBounds(50,50,70,20);
		ventana.add(descuento);
		
		JTextField texto2=new JTextField();
	
		texto2.setBounds(150,50,100,20);
		ventana.add(texto2);
		
		//JButton boton3=new JButton("ACEPTAR");
		
		boton3.setBounds(20, 100, 120, 20);
		boton3.addActionListener(this);
		ventana.add(boton3);
		
		//JButton boton4=new JButton("CANCELAR");
		
		boton4.setBounds(140, 100, 120, 20);
		boton4.addActionListener(this);
		ventana.add(boton4);
		
		ventana.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}