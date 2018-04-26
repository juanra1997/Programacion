package Pruebas;

import javax.swing.*;
import java.awt.*;

public class Inicializar {
	public static JFrame inicializar(JFrame ventana, String Titulo) {
		//JFrame ventana=new JFrame();
		ventana.setVisible(true);
		ventana.setTitle(Titulo);
		ventana.setSize(500, 300);
		ventana.setLocation(Toolkit.getDefaultToolkit().getScreenSize().height/2, Toolkit.getDefaultToolkit().getScreenSize().width/6);
		ventana.setDefaultCloseOperation(3);
		return ventana;
	}
	
	public static JFrame inicializar(JFrame ventana, String Titulo, int alto, int ancho, int posicionx, int posiciony) {
		//JFrame ventana=new JFrame();
		ventana.setVisible(true);
		ventana.setTitle(Titulo);
		ventana.setSize(alto, ancho);
		ventana.setLocation(posicionx, posiciony);
		ventana.setDefaultCloseOperation(3);
		return ventana;
	}
	
	public static JFrame inicializar(JFrame ventana, String Titulo, int alto, int ancho, int posicionx, int posiciony, Color color) {
		//JFrame ventana=new JFrame();
		ventana.setVisible(true);
		ventana.setTitle(Titulo);
		ventana.setSize(alto, ancho);
		ventana.setLocation(posicionx, posiciony);
		ventana.setDefaultCloseOperation(3);
		ventana.getContentPane().setBackground(color);
		return ventana;
	}
	
	public static JFrame inicializar(JFrame ventana, String Titulo, Color color) {
		//JFrame ventana=new JFrame();
		ventana.setVisible(true);
		ventana.setTitle(Titulo);
		ventana.setSize(500, 300);
		ventana.setLocation(Toolkit.getDefaultToolkit().getScreenSize().height/2, Toolkit.getDefaultToolkit().getScreenSize().width/6);
		ventana.setDefaultCloseOperation(3);
		ventana.getContentPane().setBackground(color);
		return ventana;
	}
}
