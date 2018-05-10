package Pruebas;
import javax.swing.*;
import java.awt.*;
public class prueba1 extends JPanel {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame ventana=new JFrame();
		Inicializar.inicializar(ventana, "Figuras", 700, 400);
		ventana.setResizable(false);
	//	JPanel figuras=new JPanel();
	}
	
	public void rectangulo(Graphics g) {
		g.drawRect(100, 200, 100, 100);
		g.setColor(Color.BLACK);
	}

}
