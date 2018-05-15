package Practica01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;

public class Ejercicio18 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JTextField texto=new JTextField();
	JLabel label=new JLabel();
	JButton boton=new JButton("Aceptar");
	
	public static void main(String[] args) {
		Ejercicio18 ventana=new Ejercicio18();
		ventana.miVentana();
	}
	
	public void miVentana() {
		setLayout(null);
		setSize(360, 140);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(3);
		setResizable(false);
		
		//JTextField texto=new JTextField();
		
		texto.setBounds(130, 20, 210, 25);
		texto.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		add(texto);
		/*texto.setEditable(false);
		texto.setBackground(Color.WHITE);*/
		
		//JLabel label=new JLabel();
		
		label.setBounds(10, 20, 210, 25);
		label.setText("Introduce un e-mail:");
		add(label);
		
		//JButton boton=new JButton("Aceptar");
		
		boton.setBounds(120, 60, 100, 40);
		boton.addActionListener(this);
		add(boton);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			Pattern emailc=Pattern.compile("[^@]+@[^@]+\\.[a-zA-Z]{2,}");
			Matcher emailm=emailc.matcher(texto.getText());
			if(!emailm.matches()) {
				JOptionPane.showMessageDialog(null, "El e-mail introducido no es valido");
			}else {
				setTitle("E-mail valido");
			}
		}
	}	
}