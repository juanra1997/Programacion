package Practica01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio19 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	String[] numeros={"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
	JComboBox<String> combo=new JComboBox<String>(numeros);
	JComboBox<String> combo1=new JComboBox<String>(numeros);
	JButton boton=new JButton("SUMAR");
	
	public static void main(String[] args) {
		Ejercicio19 obj=new Ejercicio19();
		obj.miVentana();
	}
	
	public void miVentana() {
		
		//JFrame ventana=new JFrame();
		
		setLayout(null);
		setSize(330, 180);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setResizable(false);
		
		//JComboBox<String> combo=new JComboBox<String>(numeros);
		
		combo.setBounds(50,10,100,40);
		combo.addItem("10");
		add(combo);
		
		//JComboBox<String> combo1=new JComboBox<String>(numeros);
		
		combo1.setBounds(170,10,100,40);
		combo1.addItem("10");
		add(combo1);
		
		//JButton boton=new JButton("SUMAR");
		
		boton.setBounds(110, 80, 100, 40);
		boton.addActionListener(this);
		add(boton);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource()==boton) {
				String a=String.valueOf(Integer.parseInt(numeros[combo.getSelectedIndex()])+Integer.parseInt(numeros[combo1.getSelectedIndex()]));
				if(a.endsWith(".0")) {
					a=a.substring(0, a.length()-2);
				}
				
				setTitle(a);
			}
		} catch(Exception x) {
			setTitle("ENTRADA NO VALIDA");
			JOptionPane.showMessageDialog(null, "Tienen que ser dos numeros y los decimales separados por un punto");
		}
	}
}