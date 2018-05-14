package Practica01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio04 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JFrame ventana=new JFrame();
	JButton boton=new JButton("SUMAR");
	JButton boton1=new JButton("RESTAR");
	JButton boton2=new JButton("MULTIPLICAR");
	JButton boton3=new JButton("DIVIDIR");
	JButton boton4=new JButton("RESTO");
	JTextField texto=new JTextField();
	JTextField texto1=new JTextField();
	
	public static void main(String[] args) {
		Ejercicio04 obj=new Ejercicio04();
		obj.miVentana();
	}
	
	public void miVentana() {
		
		//JFrame ventana=new JFrame();
		
		ventana.setLayout(null);
		ventana.setSize(370, 270);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(3);
		ventana.setResizable(false);
		
		//JTextField texto1=new JTextField();
		
		texto.setBounds(50,10,120,40);
		ventana.add(texto);
		
		//JTextField texto=new JTextField();
		
		texto1.setBounds(190,10,120,40);
		ventana.add(texto1);
		
		//JButton boton=new JButton("SUMAR");
		
		boton.setBounds(50, 80, 120, 40);
		boton.addActionListener(this);
		ventana.add(boton);
		
		//JButton boton1=new JButton("RESTAR");
		
		boton1.setBounds(190, 80, 120, 40);
		boton1.addActionListener(this);
		ventana.add(boton1);
		
		//JButton boton2=new JButton("MULTIPLICAR");
		
		boton2.setBounds(50, 130, 120, 40);
		boton2.addActionListener(this);
		ventana.add(boton2);
		
		//JButton boton3=new JButton("DIVIDIR");
		
		boton3.setBounds(190, 130, 120, 40);
		boton3.addActionListener(this);
		ventana.add(boton3);
		
		//JButton boton4=new JButton("SUMAR");
		
		boton4.setBounds(50, 180, 260, 40);
		boton4.addActionListener(this);
		ventana.add(boton4);
				
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
				
				ventana.setTitle(a);
			}
			
			if(e.getSource()==boton1) {
				String a=String.valueOf(Double.parseDouble(texto.getText())-Double.parseDouble(texto1.getText()));
				if(a.endsWith(".0")) {
					a=a.substring(0, a.length()-2);
				}
				
				ventana.setTitle(a);
			}
			
			if(e.getSource()==boton2) {
				String a=String.valueOf(Double.parseDouble(texto.getText())*Double.parseDouble(texto1.getText()));
				if(a.endsWith(".0")) {
					a=a.substring(0, a.length()-2);
				}
				
				ventana.setTitle(a);
			}
			
			if(e.getSource()==boton3) {
				String a=String.valueOf(Double.parseDouble(texto.getText())/Double.parseDouble(texto1.getText()));
				if(a.endsWith(".0")) {
					a=a.substring(0, a.length()-2);
				}
				
				ventana.setTitle(a);
			}
			
			if(e.getSource()==boton4) {
				String a=String.valueOf(Double.parseDouble(texto.getText())%Double.parseDouble(texto1.getText()));
				if(a.endsWith(".0")) {
					a=a.substring(0, a.length()-2);
				}
				
				ventana.setTitle(a);
			}
		} catch(ArithmeticException byzero) {
			ventana.setTitle("DIVISION ENTRE 0");
			JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
		} catch(Exception x) {
			ventana.setTitle("ENTRADA NO VALIDA");
			JOptionPane.showMessageDialog(null, "Tienen que ser dos numeros y los decimales separados por un punto");
		}
	}

}