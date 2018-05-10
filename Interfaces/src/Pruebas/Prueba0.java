package Pruebas;
//import java.awt.*;
import javax.swing.*;

public class Prueba0 {

	public static void main(String[] args) {
		//JCheckBox windows=new JCheckBox("Windows");
		JFrame ventana=new JFrame();
		JPanel panel=new JPanel();
		panel.add(new JCheckBox("Windows", true));
		panel.add(new JCheckBox("Linux"));
		panel.add(new JCheckBox("Mac", true));
		ventana.add(panel);
		Inicializar.inicializar(ventana, "Prueba0");
	}

}
