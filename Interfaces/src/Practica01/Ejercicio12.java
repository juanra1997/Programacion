package Practica01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio12 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	JFrame ventana=new JFrame("IMC");

	public static void main(String[] args) {
		Ejercicio12 obj=new Ejercicio12();
		obj.miVentana();
	}

	public void miVentana() {
		
		//JFrame ventana=new JFrame();
		
		ventana.setLayout(null);
		ventana.setSize(235, 145);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(3);
		ventana.setResizable(false);
		
		ventana.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
