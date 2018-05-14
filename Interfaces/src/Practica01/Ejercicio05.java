package Practica01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio05 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JFrame ventana=new JFrame();
	JButton boton=new JButton("SUMAR");
	JTextField texto=new JTextField();
	JTextField texto1=new JTextField();
	JLabel total=new JLabel();
	
	public static void main(String[] args) {
		Ejercicio05 obj=new Ejercicio05();
		obj.miVentana();
	}
	
	public void miVentana() {
		
		//JFrame ventana=new JFrame();
		
		ventana.setLayout(null);
		ventana.setSize(330, 220);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(3);
		ventana.setResizable(false);
		
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
		
		//JLabel total=new JLabel();
		
		total.setBounds(120, 100, 100, 100);
		ventana.add(total);
		
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
				
				total.setText("La suma es "+a);
				
			}
		} catch(Exception x) {
			ventana.setTitle("ENTRADA NO VALIDA");
			JOptionPane.showMessageDialog(null, "Tienen que ser dos numeros y los decimales separados por un punto");
		}
	}

}