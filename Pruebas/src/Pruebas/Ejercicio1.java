package Pruebas;

import java.awt.EventQueue;
import java.util.Scanner;
import javax.swing.JFrame;
//import javax.swing.JTextField;
//import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
public class Ejercicio1 {
	//MATRICULA(0),MARCA(1),MODELO(2),COMBUSTIBLE(3),KMs(4)
	Scanner teclado=new Scanner(System.in);
	ArrayList<ArrayList<String>> ventas=new ArrayList<ArrayList<String>>();
	int contCoches;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 window = new Ejercicio1();
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
	public Ejercicio1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 310, 329);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel MENU = new JLabel("MEN\u00DA");
		MENU.setFont(new Font("Tahoma", Font.PLAIN, 27));
		MENU.setBounds(10, 11, 72, 32);
		frame.getContentPane().add(MENU);
		
		JButton btnNewButton = new JButton("Introducir nuevos coches");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//ventas.add(new ArrayList<String>());
				String matricula, marca, modelo, combustible;
				int km=-1, numIntroducir, contcochesintroduc=0;
				System.out.println("¿Cuantos vehiculos desea introducir?");
				numIntroducir=teclado.nextInt();
				if(numIntroducir>0) {
					while(contcochesintroduc<numIntroducir) {
						ventas.add(new ArrayList<String>());
						if(numIntroducir>1) {
							System.out.println("Coche "+(contcochesintroduc+1));
						}
						System.out.println("Introduce la matricula del coche");
						matricula=teclado.next();
						System.out.println("Introduce la marca del coche");
						marca=teclado.next();
						System.out.println("Introduce el modelo del coche");
						modelo=teclado.next();
						System.out.println("Introduce el tipo de combustible");
						combustible=teclado.next();
						System.out.println("Introduce los kilometros del coche (numero entero)");
						km=teclado.nextInt();
						ventas.get(contCoches).add(matricula);
						ventas.get(contCoches).add(marca);
						ventas.get(contCoches).add(modelo);
						ventas.get(contCoches).add(combustible);
						ventas.get(contCoches).add(String.valueOf(km));
						contcochesintroduc++;
						contCoches++;
						km=-1;
					}
				}
			}
		});
		btnNewButton.setBounds(10, 54, 274, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Informacion de los coches introducidos");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<ventas.size(); i++) {
					//MATRICULA(0),MARCA(1),MODELO(2),COMBUSTIBLE(3),KMs(4)
					System.out.println("Coche "+(i+1));
					System.out.println("Matricula: "+ventas.get(i).get(0));
					System.out.println("Marca: "+ventas.get(i).get(1));
					System.out.println("Modelo: "+ventas.get(i).get(2));
					System.out.println("Combustible: "+ventas.get(i).get(3));
					System.out.println("Kms: "+ventas.get(i).get(4));
					System.out.println("**********************************************");
				}
			}
		});
		btnNewButton_1.setBounds(10, 88, 274, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Marca");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String marca0;
				System.out.println("Introduce la marca");
				marca0=teclado.next();
				for(int i=0; i<ventas.size(); i++) {
					//MATRICULA(0),MARCA(1),MODELO(2),COMBUSTIBLE(3),KMs(4)
					if(marca0.equals(ventas.get(i).get(1))) {
						System.out.println("Matricula: "+ventas.get(i).get(0));
						System.out.println("Marca: "+ventas.get(i).get(1));
						System.out.println("Modelo: "+ventas.get(i).get(2));
						System.out.println("Combustible: "+ventas.get(i).get(3));
						System.out.println("Kms: "+ventas.get(i).get(4));
						System.out.println("**********************************************");
					}
				}
			}
		});
		btnNewButton_2.setBounds(10, 122, 274, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Menos kilometros que");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int kmlim, contcocheskmlim=0;
				System.out.println("Introduce los kilometros limite (Numero entero)");
				kmlim=teclado.nextInt();
				for(int i=0; i<ventas.size(); i++) {
					//MATRICULA(0),MARCA(1),MODELO(2),COMBUSTIBLE(3),KMs(4)
					if(kmlim>=Integer.parseInt(ventas.get(i).get(4))) {
						System.out.println("Matricula: "+ventas.get(i).get(0));
						System.out.println("Marca: "+ventas.get(i).get(1));
						System.out.println("Modelo: "+ventas.get(i).get(2));
						System.out.println("Combustible: "+ventas.get(i).get(3));
						System.out.println("Kms: "+ventas.get(i).get(4));
						System.out.println("**********************************************");
						contcocheskmlim++;
					}
				}	
				System.out.println("Cantidad de coches: "+contcocheskmlim);
			}
		});
		btnNewButton_3.setBounds(10, 156, 274, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Mas kilometros");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int kmbase=0;
				System.out.println("Estos son los coches que con el mayor numero de kilometros:");
				//System.out.println("Introduce los kilometros base (Numero entero)");
				//kmbase=teclado.nextInt();
				for(int i=0; i<ventas.size(); i++) {
					//MATRICULA(0),MARCA(1),MODELO(2),COMBUSTIBLE(3),KMs(4)
					if(kmbase<Integer.parseInt(ventas.get(i).get(4))) {
						/*System.out.println("Matricula: "+ventas.get(i).get(0));
						System.out.println("Marca: "+ventas.get(i).get(1));
						System.out.println("Modelo: "+ventas.get(i).get(2));
						System.out.println("**********************************************");*/
						kmbase=Integer.parseInt(ventas.get(i).get(4));
					}
				}
				for(int i=0; i<ventas.size(); i++) {
					if(kmbase==Integer.parseInt(ventas.get(i).get(4))) {
						System.out.println("Matricula: "+ventas.get(i).get(0));
						System.out.println("Marca: "+ventas.get(i).get(1));
						System.out.println("Modelo: "+ventas.get(i).get(2));
						System.out.println("Combustible: "+ventas.get(i).get(3));
						System.out.println("Kms: "+ventas.get(i).get(4));
						System.out.println("**********************************************");
					}
				}
			}
		});
		btnNewButton_4.setBounds(10, 190, 274, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Combustible");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String combustible0;
				int cantidadcochescomb=0;
				System.out.println("Introduce el combustible");
				combustible0=teclado.next();
				for(int i=0; i<ventas.size(); i++) {
					//MATRICULA(0),MARCA(1),MODELO(2),COMBUSTIBLE(3),KMs(4)
					if(combustible0.equals(ventas.get(i).get(3))) {
						System.out.println("Matricula: "+ventas.get(i).get(0));
						System.out.println("Marca: "+ventas.get(i).get(1));
						System.out.println("Modelo: "+ventas.get(i).get(2));
						System.out.println("Combustible: "+ventas.get(i).get(3));
						System.out.println("Kms: "+ventas.get(i).get(4));
						System.out.println("**********************************************");
						cantidadcochescomb++;
					}
				}
				System.out.println("Cantidad de coches: "+cantidadcochescomb);
			}
		});
		btnNewButton_5.setBounds(10, 224, 274, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Ordenar por kilometros");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i=0; i<ventas.size()-1; i++) {
					for(int j=i+1; j<ventas.size(); j++) {
						if(Integer.parseInt(ventas.get(i).get(4))>Integer.parseInt(ventas.get(j).get(4))) {
							ArrayList<String> aux=new ArrayList<String>();
							aux.addAll(ventas.get(j));
							ventas.set(j, ventas.get(i));
							ventas.set(i, aux);
						}
					}
				}
				for(int i=0; i<ventas.size(); i++) {
					//MATRICULA(0),MARCA(1),MODELO(2),COMBUSTIBLE(3),KMs(4)
					System.out.println("Coche "+(i+1));
					System.out.println("Matricula: "+ventas.get(i).get(0));
					System.out.println("Marca: "+ventas.get(i).get(1));
					System.out.println("Modelo: "+ventas.get(i).get(2));
					System.out.println("Combustible: "+ventas.get(i).get(3));
					System.out.println("Kms: "+ventas.get(i).get(4));
					System.out.println("**********************************************");
				}
			}
		});
		btnNewButton_6.setBounds(10, 258, 274, 23);
		frame.getContentPane().add(btnNewButton_6);
	//teclado.close();
	}
}
