package Practica01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio02 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JFrame ventana=new JFrame();
	JButton boton=new JButton("SUMAR");
	JTextField texto=new JTextField();
	JTextField texto1=new JTextField();
	
	public static void main(String[] args) {
		Ejercicio02 obj=new Ejercicio02();
		obj.miVentana();
	}
	
	public void miVentana() {
		
		//JFrame ventana=new JFrame();
		
		ventana.setLayout(null);
		ventana.setSize(330, 180);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(3);
		
		//JTextField texto1=new JTextField();
		
		texto.setBounds(50,10,100,40);
		ventana.add(texto);
		
		//JTextField texto=new JTextField();
		
		texto1.setBounds(170,10,100,40);
		ventana.add(texto1);
		
		//JButton boton=new JButton("SUMAR");
		
		boton.setBounds(110, 80, 100, 40);
		boton.addActionListener(this);
		ventana.add(boton);
		
		ventana.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==boton) {
				String a=String.valueOf(Double.parseDouble(texto.getText())+Double.parseDouble(texto1.getText()));
				if(a.endsWith(".0")) {
					a=a.substring(0, a.length()-2);
				}
				/*if(a.contains(",")) {
					a.replace(",", ".");
				}*/
				ventana.setTitle(a);
			}
		} catch(Exception x) {
			System.out.println("Tienen que ser dos numeros y los decimales separados por un punto");
		}
	}

}
//HACER QUE SALTE EL AVISO