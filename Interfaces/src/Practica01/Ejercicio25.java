package Practica01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Ejercicio25 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	String[] monedas= {"Euros", "Yenes", "Dólares", "Libras"};
	JLabel label=new JLabel("MONEDA ORIGEN");
	JComboBox<String> combo=new JComboBox<String>(monedas);
	JTextField cantidad=new JTextField();
	Font fuente=new Font("TimesRoman", Font.BOLD, 12);
	JLabel label1=new JLabel("CANTIDAD:");
	JLabel label2=new JLabel("CONVERTIR A:");
	JButton euros=new JButton("€");
	JButton yenes=new JButton("¥");
	JButton dolares=new JButton("$");
	JButton libras=new JButton("£");
	JTextField total=new JTextField();
	JLabel label3=new JLabel("EQUIVALE A:");
	
	public void miVentana() {
		
		setLayout(null);
		setSize(500, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		setTitle("Conversor de monedas");
		
		//JLabel label=new JLabel("MONEDA ORIGEN");
		
		label.setBounds(30, 20, 100, 10);
		add(label);
		
		//JComboBox<String> combo=new JComboBox<String>(monedas);
		
		combo.setBounds(140, 15, 100, 20);
		add(combo);
		
		//JTextField cantidad=new JTextField();
		
		cantidad.setBounds(360, 16, 100, 20);
		cantidad.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		cantidad.setHorizontalAlignment(JTextField.CENTER);
		add(cantidad);
		
		//JLabel label1=new JLabel("CANTIDAD");
		
		label1.setBounds(290, 16, 100, 20);
		add(label1);
		
		//JLabel label2=new JLabel("CONVERTIR A:");
		
		label2.setBounds(30, 100, 100, 10);
		add(label2);
		
		//JButton euros=new JButton("€");
		
		euros.setBounds(145, 85, 50, 40);
		euros.addActionListener(this);
		add(euros);
		
		//JButton yenes=new JButton("¥");
		
		yenes.setBounds(230, 85, 50, 40);
		yenes.addActionListener(this);
		add(yenes);
		
		//JButton dolares=new JButton("$");
		
		dolares.setBounds(315, 85, 50, 40);
		dolares.addActionListener(this);
		add(dolares);
		
		//JButton libras=new JButton("£");
		
		libras.setBounds(400, 85, 50, 40);
		libras.addActionListener(this);
		add(libras);
		
		//JTextField total=new JTextField();
		
		total.setBounds(190, 160, 100, 25);
		total.setEditable(false);
		total.setBackground(Color.WHITE);
		total.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		total.setText(" ");
		total.setHorizontalAlignment(JTextField.CENTER);
		add(total);
		
		//JLabel label3=new JLabel("EQUIVALE A:");
		
		label3.setBounds(100, 168, 100, 10);
		add(label3);
		
		setVisible(true);
	}

	public static void main(String[] args) {

		Ejercicio25 obj=new Ejercicio25();
		obj.miVentana();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			if(e.getSource()==euros) {
				if(combo.getSelectedIndex()==0) {
					if(cantidad.getText().length()!=0) {
						String a=String.valueOf(Double.parseDouble(cantidad.getText()));
						/*if(a.endsWith(".0")) {
							total.setText(a.substring(0, a.length()-2));
						}else {*/
							total.setText(a);
						//}
					}
				}else if(combo.getSelectedIndex()==1){
					String a=String.valueOf(Double.parseDouble(cantidad.getText())/131.068);
					boolean encontrado=false;
					int f=0;
					for(; encontrado==false&&f<a.length(); f++) {
						if(a.charAt(f)=='.') {
							encontrado=true;
						}
					}
					if(encontrado==true) {
						total.setText(a.substring(0, f+3));
					}else {
						total.setText(a);
					}
				}else if(combo.getSelectedIndex()==2) {
					String a=String.valueOf(Double.parseDouble(cantidad.getText())/1.18121);
					boolean encontrado=false;
					int f=0;
					for(; encontrado==false&&f<a.length(); f++) {
						if(a.charAt(f)=='.') {
							encontrado=true;
						}
					}
					if(encontrado==true) {
						total.setText(a.substring(0, f+3));
					}else {
						total.setText(a);
					}
				}else if(combo.getSelectedIndex()==3) {
					String a=String.valueOf(Double.parseDouble(cantidad.getText())/0.877104);
					boolean encontrado=false;
					int f=0;
					for(; encontrado==false&&f<a.length(); f++) {
						if(a.charAt(f)=='.') {
							encontrado=true;
						}
					}
					if(encontrado==true) {
						total.setText(a.substring(0, f+3));
					}else {
						total.setText(a);
					}
				}
			}
			
			if(e.getSource()==yenes) {
				if(combo.getSelectedIndex()==1) {
					String a=String.valueOf(Double.parseDouble(cantidad.getText()));
					total.setText(a);
				}else if(combo.getSelectedIndex()==0){
					String a=String.valueOf(Double.parseDouble(cantidad.getText())/0.00763016);
					boolean encontrado=false;
					int f=0;
					for(; encontrado==false&&f<a.length(); f++) {
						if(a.charAt(f)=='.') {
							encontrado=true;
						}
					}
					if(encontrado==true) {
						total.setText(a.substring(0, f+3));
					}else {
						total.setText(a);
					}
				}else if(combo.getSelectedIndex()==2) {
					String a=String.valueOf(Double.parseDouble(cantidad.getText())/0.00901586);
					boolean encontrado=false;
					int f=0;
					for(; encontrado==false&&f<a.length(); f++) {
						if(a.charAt(f)=='.') {
							encontrado=true;
						}
					}
					if(encontrado==true) {
						total.setText(a.substring(0, f+3));
					}else {
						total.setText(a);
					}
				}else if(combo.getSelectedIndex()==3) {
					String a=String.valueOf(Double.parseDouble(cantidad.getText())/0.00668857);
					boolean encontrado=false;
					int f=0;
					for(; encontrado==false&&f<a.length(); f++) {
						if(a.charAt(f)=='.') {
							encontrado=true;
						}
					}
					if(encontrado==true) {
						total.setText(a.substring(0, f+3));
					}else {
						total.setText(a);
					}
				}
			}
			
			if(e.getSource()==libras) {
				if(combo.getSelectedIndex()==3) {
					String a=String.valueOf(Double.parseDouble(cantidad.getText()));
					total.setText(a);
				}else if(combo.getSelectedIndex()==0){
					String a=String.valueOf(Double.parseDouble(cantidad.getText())/1.13998);
					boolean encontrado=false;
					int f=0;
					for(; encontrado==false&&f<a.length(); f++) {
						if(a.charAt(f)=='.') {
							encontrado=true;
						}
					}
					if(encontrado==true) {
						total.setText(a.substring(0, f+3));
					}else {
						total.setText(a);
					}
				}else if(combo.getSelectedIndex()==2) {
					String a=String.valueOf(Double.parseDouble(cantidad.getText())/1.34609);
					boolean encontrado=false;
					int f=0;
					for(; encontrado==false&&f<a.length(); f++) {
						if(a.charAt(f)=='.') {
							encontrado=true;
						}
					}
					if(encontrado==true) {
						total.setText(a.substring(0, f+3));
					}else {
						total.setText(a);
					}
				}else if(combo.getSelectedIndex()==1) {
					String a=String.valueOf(Double.parseDouble(cantidad.getText())/149.415);
					boolean encontrado=false;
					int f=0;
					for(; encontrado==false&&f<a.length(); f++) {
						if(a.charAt(f)=='.') {
							encontrado=true;
						}
					}
					if(encontrado==true) {
						total.setText(a.substring(0, f+3));
					}else {
						total.setText(a);
					}
				}
			}
			
			if(e.getSource()==dolares) {
				if(combo.getSelectedIndex()==2) {
					String a=String.valueOf(Double.parseDouble(cantidad.getText()));
					total.setText(a);
				}else if(combo.getSelectedIndex()==0){
					String a=String.valueOf(Double.parseDouble(cantidad.getText())/0.846480);
					boolean encontrado=false;
					int f=0;
					for(; encontrado==false&&f<a.length(); f++) {
						if(a.charAt(f)=='.') {
							encontrado=true;
						}
					}
					if(encontrado==true) {
						total.setText(a.substring(0, f+3));
					}else {
						total.setText(a);
					}
				}else if(combo.getSelectedIndex()==1) {
					String a=String.valueOf(Double.parseDouble(cantidad.getText())/111.013);
					boolean encontrado=false;
					int f=0;
					for(; encontrado==false&&f<a.length(); f++) {
						if(a.charAt(f)=='.') {
							encontrado=true;
						}
					}
					if(encontrado==true) {
						total.setText(a.substring(0, f+3));
					}else {
						total.setText(a);
					}
				}else if(combo.getSelectedIndex()==3) {
					String a=String.valueOf(Double.parseDouble(cantidad.getText())/0.742669);
					boolean encontrado=false;
					int f=0;
					for(; encontrado==false&&f<a.length(); f++) {
						if(a.charAt(f)=='.') {
							encontrado=true;
						}
					}
					if(encontrado==true) {
						total.setText(a.substring(0, f+3));
					}else {
						total.setText(a);
					}
				}
			}
			
			setTitle("Conversor de monedas");
			
		}catch(NumberFormatException a) {
			cantidad.setText(" ");
			total.setText(" ");
			setTitle("No es un numero separado por punto");
		}
	}

}
