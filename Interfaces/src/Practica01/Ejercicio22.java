package Practica01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio22 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;

	JButton boton=new JButton("Introducir fecha de nacimiento");
	/*JButton boton1=new JButton("Aceptar");
	JButton boton2=new JButton("Cancelar");*/
	JTextField fecha=new JTextField();
	JTextField fechal=new JTextField();
	/*JTextField fecha2=new JTextField();
	JTextField fecha3=new JTextField();
	JTextField fecha4=new JTextField();
	JLabel label=new JLabel();
	JLabel label1=new JLabel();
	Font fuente=new Font("TimesRoman", Font.BOLD, 25);
	JFrame ventana=new JFrame();*/
	
	public static void main(String[] args) {
		
		Ejercicio22 obj=new Ejercicio22();
		obj.miVentana();
	}
	
	public void miVentana() {
		
		setLayout(null);
		setSize(500, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		//JButton boton=new JButton("Introducir fecha de nacimiento");
		
		boton.setBounds(120, 20, 250, 20);
		boton.addActionListener(this);
		add(boton);
		
		//JTextField fecha=new JTextField();
		
		fecha.setBounds(120, 80, 250, 20);
		fecha.setEditable(false);
		fecha.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		fecha.setText("");
		add(fecha);
		
		//JTextField fechal=new JTextField();
		
		fechal.setBounds(100, 140, 290, 20);
		fechal.setEditable(false);
		fechal.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		add(fechal);
		
		setVisible(true);
	}
	
	/*public void miVentana2() {
		
		//JFrame ventana=new JFrame();
		
		ventana.setLayout(null);
		ventana.setSize(500, 150);
		ventana.setLocation(Toolkit.getDefaultToolkit().getScreenSize().height/2, Toolkit.getDefaultToolkit().getScreenSize().width/6);
		ventana.setDefaultCloseOperation(HIDE_ON_CLOSE);
		ventana.setResizable(false);
		
		//JButton boton1=new JButton("Aceptar");
		
		boton1.setBounds(120, 70, 100, 20);
		boton1.addActionListener(this);
		ventana.add(boton1);
		
		//JButton boton2=new JButton("Cancelar");
		
		boton2.setBounds(240, 70, 100, 20);
		boton2.addActionListener(this);
		ventana.add(boton2);
		
		//JTextField fecha2=new JTextField();
		
		fecha2.setBounds(183, 30, 25, 20);
		ventana.add(fecha2);
		
		//JTextField fecha3=new JTextField();
		
		fecha3.setBounds(222, 30, 25, 20);
		ventana.add(fecha3);
				
		//JTextField fecha4=new JTextField();
				
		fecha4.setBounds(260, 30, 40, 20);
		ventana.add(fecha4);
		
		//JLabel label=new JLabel();
		
		label.setBounds(250, 28, 20, 20);
		label.setFont(fuente);
		label.setText("/");
		ventana.add(label);
		
		//JLabel label1=new JLabel();
		
		label1.setBounds(212, 28, 20, 20);
		label1.setFont(fuente);
		label1.setText("/");
		ventana.add(label1);

		ventana.setVisible(true);
	}*/
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==boton) {
			miVentana2 obj=new miVentana2();
			//obj.setDefaultCloseOperation(HIDE_ON_CLOSE);
			fecha.setText(obj.getFecha());
			//obj.miVentana2();
		}
		
		/*if(e.getSource()==boton1) {
			try {
				if(Integer.parseInt(fecha3.getText())==2&&(Integer.parseInt(fecha4.getText())%400==0||Integer.parseInt(fecha4.getText())%4==0&&Integer.parseInt(fecha4.getText())%100!=0)&&(Integer.parseInt(fecha2.getText())>29||Integer.parseInt(fecha2.getText())<0)) {
					JOptionPane.showMessageDialog(null, "Introduce una fecha valida");
				}else if(Integer.parseInt(fecha3.getText())==2&&!(Integer.parseInt(fecha4.getText())%400==0||Integer.parseInt(fecha4.getText())%4==0&&Integer.parseInt(fecha4.getText())%100!=0)&&(Integer.parseInt(fecha2.getText())>28||Integer.parseInt(fecha2.getText())<0)) {
					JOptionPane.showMessageDialog(null, "Introduce una fecha valida");
				}else if((Integer.parseInt(fecha2.getText())>31||Integer.parseInt(fecha2.getText())<0)&&Integer.parseInt(fecha3.getText())%2==0||fecha4.getText().length()!=4) {
					JOptionPane.showMessageDialog(null, "Introduce una fecha valida");
				}else if((Integer.parseInt(fecha2.getText())>30||Integer.parseInt(fecha2.getText())<0)&&Integer.parseInt(fecha3.getText())%2!=0||fecha4.getText().length()!=4) {
					JOptionPane.showMessageDialog(null, "Introduce una fecha valida");
				}else if(Integer.parseInt(fecha3.getText())>12||Integer.parseInt(fecha3.getText())<0){
					JOptionPane.showMessageDialog(null, "Introduce una fecha valida");
				}else if(Integer.parseInt(fecha3.getText())>=8&&Integer.parseInt(fecha3.getText())%2==0&&Integer.parseInt(fecha2.getText())>31) {
					JOptionPane.showMessageDialog(null, "Introduce una fecha valida");					
				}else if(Integer.parseInt(fecha3.getText())>8&&Integer.parseInt(fecha3.getText())%2!=0&&Integer.parseInt(fecha2.getText())>30) {
					JOptionPane.showMessageDialog(null, "Introduce una fecha valida");
				}else {
					fecha.setText("prueba");
					ventana.setVisible(false);
				}
			}catch(Exception x) {
				JOptionPane.showMessageDialog(null, "No es una entrada valida");
			}
		}
		
		if(e.getSource()==boton2) {
			fecha2.setText("");
			fecha3.setText("");
			fecha4.setText("");
		}*/
	}

}

class miVentana2 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	String fecha;
	JTextField fecha2=new JTextField();
	JTextField fecha3=new JTextField();
	JTextField fecha4=new JTextField();
	JLabel label=new JLabel();
	JLabel label1=new JLabel();
	Font fuente=new Font("TimesRoman", Font.BOLD, 25);
	//JFrame ventana=new JFrame();
	JButton boton1=new JButton("Aceptar");
	JButton boton2=new JButton("Cancelar");

	public String getFecha() {
		return this.fecha;
	}
	public miVentana2() {
		
		//JFrame ventana=new JFrame();
		
		setLayout(null);
		setSize(500, 150);
		setLocation(Toolkit.getDefaultToolkit().getScreenSize().height/2, Toolkit.getDefaultToolkit().getScreenSize().width/6);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setResizable(false);
		
		//JButton boton1=new JButton("Aceptar");
		
		boton1.setBounds(120, 70, 100, 20);
		boton1.addActionListener(this);
		add(boton1);
		
		//JButton boton2=new JButton("Cancelar");
		
		boton2.setBounds(240, 70, 100, 20);
		boton2.addActionListener(this);
		add(boton2);
		
		//JTextField fecha2=new JTextField();
		
		fecha2.setBounds(183, 30, 25, 20);
		add(fecha2);
		
		//JTextField fecha3=new JTextField();
		
		fecha3.setBounds(222, 30, 25, 20);
		add(fecha3);
				
		//JTextField fecha4=new JTextField();
				
		fecha4.setBounds(260, 30, 40, 20);
		add(fecha4);
		
		//JLabel label=new JLabel();
		
		label.setBounds(250, 28, 20, 20);
		label.setFont(fuente);
		label.setText("/");
		add(label);
		
		//JLabel label1=new JLabel();
		
		label1.setBounds(212, 28, 20, 20);
		label1.setFont(fuente);
		label1.setText("/");
		add(label1);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==boton1) {
			try {
				if(Integer.parseInt(fecha3.getText())==2&&(Integer.parseInt(fecha4.getText())%400==0||Integer.parseInt(fecha4.getText())%4==0&&Integer.parseInt(fecha4.getText())%100!=0)&&(Integer.parseInt(fecha2.getText())>29||Integer.parseInt(fecha2.getText())<0)) {
					JOptionPane.showMessageDialog(null, "Introduce una fecha valida");
				}else if(Integer.parseInt(fecha3.getText())==2&&!(Integer.parseInt(fecha4.getText())%400==0||Integer.parseInt(fecha4.getText())%4==0&&Integer.parseInt(fecha4.getText())%100!=0)&&(Integer.parseInt(fecha2.getText())>28||Integer.parseInt(fecha2.getText())<0)) {
					JOptionPane.showMessageDialog(null, "Introduce una fecha valida");
				}else if((Integer.parseInt(fecha2.getText())>31||Integer.parseInt(fecha2.getText())<0)&&Integer.parseInt(fecha3.getText())%2==0||fecha4.getText().length()!=4) {
					JOptionPane.showMessageDialog(null, "Introduce una fecha valida");
				}else if((Integer.parseInt(fecha2.getText())>30||Integer.parseInt(fecha2.getText())<0)&&Integer.parseInt(fecha3.getText())%2!=0||fecha4.getText().length()!=4) {
					JOptionPane.showMessageDialog(null, "Introduce una fecha valida");
				}else if(Integer.parseInt(fecha3.getText())>12||Integer.parseInt(fecha3.getText())<0){
					JOptionPane.showMessageDialog(null, "Introduce una fecha valida");
				}else if(Integer.parseInt(fecha3.getText())>=8&&Integer.parseInt(fecha3.getText())%2==0&&Integer.parseInt(fecha2.getText())>31) {
					JOptionPane.showMessageDialog(null, "Introduce una fecha valida");					
				}else if(Integer.parseInt(fecha3.getText())>8&&Integer.parseInt(fecha3.getText())%2!=0&&Integer.parseInt(fecha2.getText())>30) {
					JOptionPane.showMessageDialog(null, "Introduce una fecha valida");
				}else {
					this.fecha=fecha2.getText()+"/"+fecha3.getText()+"/"+fecha4.getText();
					setVisible(false);
					
				}
			}catch(Exception x) {
				JOptionPane.showMessageDialog(null, "No es una entrada valida");
			}
		}
		
		if(e.getSource()==boton2) {
			fecha2.setText("");
			fecha3.setText("");
			fecha4.setText("");
		}
	}
	
}
