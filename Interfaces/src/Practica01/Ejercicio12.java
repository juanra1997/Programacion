package Practica01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio12 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	JFrame ventana=new JFrame("IMC");
	JLabel altura=new JLabel("Altura (metros)");
	JTextArea alturatext=new JTextArea();
	JLabel peso=new JLabel("Peso(kg)");
	JTextArea pesotext=new JTextArea();
	JLabel IMC=new JLabel();
	JButton boton=new JButton("Calcular");

	public static void main(String[] args) {
		Ejercicio12 obj=new Ejercicio12();
		obj.miVentana();
	}

	public void miVentana() {
		
		//JFrame ventana=new JFrame();
		
		ventana.setLayout(null);
		ventana.setSize(400, 140);
		ventana.setLocationRelativeTo(null);
		ventana.setDefaultCloseOperation(3);
		ventana.setResizable(false);
		
		//JLabel altura=new JLabel("Altura (metros)");
		
		altura.setBounds(20, 30, 100, 20);
		ventana.add(altura);
		
		//JTextArea alturatext=new JTextArea();
		
		alturatext.setBounds(115, 30, 70, 20);
		ventana.add(alturatext);
		
		//JLabel peso=new JLabel("Peso(kg)");
		
		peso.setBounds(200, 30, 100, 20);
		ventana.add(peso);
		
		//JTextArea pesotext=new JTextArea();
		
		pesotext.setBounds(260, 30, 70, 20);
		ventana.add(pesotext);
		
		//JLabel IMC=new JLabel();
		
		IMC.setBounds(230, 70, 100, 20);
		IMC.setText("IMC: ");
		ventana.add(IMC);
		
		//JButton boton=new JButton("Calcular");
		
		boton.setBounds(80, 70, 100, 20);
		boton.addActionListener(this);
		ventana.add(boton);
		
		ventana.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton) {
			try {
				String a=String.valueOf(Double.parseDouble(pesotext.getText())/Math.pow(Double.parseDouble(alturatext.getText()), 2));
				if(a.length()>=5) {
					IMC.setText("IMC: "+a.substring(0, 5));
				}else if(a.endsWith(".0")){
					IMC.setText("IMC: "+a.substring(0, a.length()-2));
				}else {
					IMC.setText("IMC: "+a);
				}
			} catch(ArithmeticException byzero) {
				ventana.setTitle("DIVISION ENTRE 0");
				JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
			}catch(Exception x){
				ventana.setTitle("ENTRADA NO VALIDA");
				JOptionPane.showMessageDialog(null, "Tienen que ser dos numeros y los decimales separados por un punto");
				x.printStackTrace();
			}
		}
	}
}