package Practica01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio17 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	String[] paises={"-------------------------------", "Espa�a", "Alemania", "Francia", "Italia", "Holanda"};
	JComboBox<String> combo=new JComboBox<String>(paises);
	JButton boton=new JButton("ACEPTAR");
	JTextField texto=new JTextField();
	JLabel unidades=new JLabel();
	JLabel pais=new JLabel();

	public static void main(String [] args) {
		
		Ejercicio17 obj=new Ejercicio17();
		obj.miVentana();
	}
	
	public void miVentana() {
		
		setLayout(null);
		setSize(330, 180);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setResizable(false);
		
		//JLabel unidades=new JLabel();
		
		unidades.setText("Usuario:");
		unidades.setBounds(50,10,70,20);
		add(unidades);
		
		//JTextField texto=new JTextField();
		
		texto.setBounds(150,10,150,20);
		texto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		/*texto.setEditable(false);
		texto.setBackground(Color.WHITE);*/
		add(texto);
		
		//JButton boton=new JButton("ACEPTAR");
		
		boton.setBounds(20, 80, 100, 40);
		boton.addActionListener(this);
		add(boton);
		
		//JLabel pais=new JLabel();
		
		pais.setText("Pais:");
		pais.setBounds(50,40,70,20);
		add(pais);
		
		//ComboBox<String> combo=new JComboBox<String>(paises);
		
		combo.setBounds(150,40,150,20);
		add(combo);
				
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			if(combo.getSelectedIndex()!=0&&texto.getText().length()!=0) {
				setTitle(texto.getText()+" es de "+paises[combo.getSelectedIndex()]);
			}else {
				JOptionPane.showMessageDialog(null, "Tienes que introducir un nombre de usuario y elegir un pais");
			}
		}
	}
}