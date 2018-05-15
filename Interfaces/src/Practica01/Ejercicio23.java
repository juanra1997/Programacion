package Practica01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio23 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	String[] annos=new String[39];
	JComboBox<String> combo=new JComboBox<String>(Ejercicio23.rellenar(annos));
	JLabel label1=new JLabel("Nombre");
	JLabel label2=new JLabel("Año de nacimiento");
	JLabel label3=new JLabel("Apellido");
	JLabel label4=new JLabel("Datos");
	JTextField texto1=new JTextField();
	JTextField texto2=new JTextField();
	JTextField texto3=new JTextField();
	JButton boton=new JButton("Mostrar");	
	
	public static void main(String[] args) {
	
		Ejercicio23 obj=new Ejercicio23();
		obj.miVentana();
	}
	
	public static String[] rellenar(String[] annos) {
		
		int an=1980;
		for(int i=0; i<annos.length; i++) {
			annos[i]=String.valueOf(an);
			an=an+1;
		}
		return annos;
	}
	
	public void miVentana() {
		
		setLayout(null);
		setSize(530, 380);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setResizable(false);
		getContentPane().setBackground(Color.CYAN);
		
		//JLabel label1=new JLabel("Nombre");
		
		label1.setBounds(40, 20, 100, 20);
		add(label1);
		
		//JTextField texto1=new JTextField();
		
		texto1.setBounds(100, 20, 200, 20);
		add(texto1);
		
		//JLabel label2=new JLabel("Año de nacimiento");
		
		label2.setBounds(230, 60, 120, 20);
		add(label2);
				
		//JComboBox<String> combo=new JComboBox<String>(annos);
		
		combo.setBounds(350, 60, 100, 20);
		add(combo);
		
		//JLabel label3=new JLabel("Apellido");
		
		label3.setBounds(40, 100, 100, 20);
		add(label3);
		
		//JTextField texto2=new JTextField();
		
		texto2.setBounds(100, 100, 200, 20);
		add(texto2);
		
		//JButton boton=new JButton("Mostrar");
		
		boton.setForeground(Color.RED);
		boton.setBounds(200, 150, 100, 40);
		boton.addActionListener(this);
		add(boton);
		
		//JLabel label4=new JLabel("Datos");
		
		label4.setBounds(40, 190, 100, 20);
		add(label4);
		
		//JTextField texto3=new JTextField();
		
		texto3.setBounds(40, 210, 450, 110);
		texto3.setEditable(false);
		texto3.setBackground(Color.WHITE);
		add(texto3);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			if(texto1.getText().length()!=0&&texto2.getText().length()!=0) {
				texto3.setText(" Nombre: "+texto1.getText()+" Apellido: "+texto2.getText()+" Año de nacimiento: "+annos[combo.getSelectedIndex()]);
			}else {
				JOptionPane.showMessageDialog(null, "Tienes que introducir nombre y apellidos");
			}
		}
	}
}
