package Interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Scanner;
public class Ejercicio10 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio10 window = new Ejercicio10();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejercicio10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("1.- N\u00FAmeros primos");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner teclado=new Scanner(System.in);
				int num1;
				System.out.println("Introduce un numero postivo, entero distinto de 0");
				num1=teclado.nextInt();
				if(num1!=1&&num1%2!=0&&num1%3!=0&&num1%5!=0&&num1%7!=0||num1==2||num1==3||num1==5||num1==7) {
					System.out.println("El numero es primo");		
				}
				else {
					System.out.println("El numero no es primo");
				}
				teclado.close(); //Si no cierro el teclado, aparece un error pero no da error al cliquear por segunda vez en la opción.
			}
		});
		btnNewButton.setBounds(10, 79, 414, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2.- Suma sucesi\u00F3n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner entrada=new Scanner(System.in);
				float division=1, suma=0, numero, n=1;
				System.out.println("Introduce un numero para realizar la suma de 1 + 1/2...+ 1/n");
				numero=entrada.nextInt();
				while(n<=numero) {
					division=1/n;
					suma=suma+division;
					n++;
				}
				System.out.println(suma);
				entrada.close(); //Si no cierro el teclado, aparece un error pero no da error al cliquear por segunda vez en la opción.
			}
		});
		btnNewButton_1.setBounds(10, 113, 414, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3.- Mayor menor");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Scanner scanner=new Scanner(System.in);
				int cont=1, contceros=0, numeromayor, numeromenor, numero, lector;
				System.out.println("Introduce la cantidad de numeros que quieres introducir");
				numero=scanner.nextInt();
				if(numero<=0) {
					System.out.println("Fin");
				}
				else {
					System.out.println("Introduce un numero");
					lector=scanner.nextInt();
					if(lector==0) {
						contceros=1;
						}
					numeromayor=lector;
					numeromenor=lector;
					while(cont<numero) {
						System.out.println("Introduce un numero");
						lector=scanner.nextInt();
						if(lector>numeromayor) {
							numeromayor=lector;
						}
						if(lector<numeromenor) {
							numeromenor=lector;
						}
						if(lector==0) {
							contceros=contceros+1;
						}
						cont++;
					}
					System.out.println("El numero mas grande introducido es: "+numeromayor);
					System.out.println("El numero mas pequeño introducido es: "+numeromenor);
					System.out.println("Se han introducido "+contceros+" ceros");
					System.out.println("Fin");
				}
				scanner.close(); //Si no cierro el teclado, aparece un error pero no da error al cliquear por segunda vez en la opción.
			}
		});
		btnNewButton_2.setBounds(10, 147, 414, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4.- Ra\u00EDz cuadrada");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scanner scr=new Scanner(System.in);
				int numero;
				System.out.println("Introduce un numero positivo distinto de 0");
				numero=scr.nextInt();
				System.out.println("La raiz cuadrada de "+numero+" es: "+(int)Math.pow(numero, 0.5)+" y su resto es: "+(numero-(int)(Math.pow((int)Math.pow(numero, 0.5), 2))));
				scr.close(); //Si no cierro el teclado, aparece un error pero no da error al cliquear por segunda  vez en la opción
			}
		});
		btnNewButton_3.setBounds(10, 181, 414, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5.- Salir");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(-1);
			}
		});
		btnNewButton_4.setBounds(10, 215, 414, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblMen = new JLabel("MEN\u00DA");
		lblMen.setHorizontalAlignment(SwingConstants.CENTER);
		lblMen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblMen.setBounds(10, 11, 414, 57);
		frame.getContentPane().add(lblMen);
	}
}
