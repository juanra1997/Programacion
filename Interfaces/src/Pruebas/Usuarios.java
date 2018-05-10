package Pruebas;

import javax.swing.*;

public class Usuarios/* extends JFrame */{

	//private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame ventana=new JFrame();
		ventana.add(new PanelUser());
		Inicializar.inicializar(ventana, "Prueba");
	}

}
