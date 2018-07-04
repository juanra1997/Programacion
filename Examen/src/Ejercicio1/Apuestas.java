package Ejercicio1;

import java.util.*;

public class Apuestas {
	
	static Scanner sc=new Scanner(System.in);
	static int monedas;
	
	public static void introducirEntero(){
		try {
			monedas=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("No es una cantidad");
			sc=new Scanner(System.in);
			System.out.println("Introduce una cantidad de monedas");
			Apuestas.introducirEntero();
		}
	}

	public static void main(String[] args) {

		Tragaperras trag;
		String resp="a";
		System.out.println("Introduce una cantidad de monedas");
		Apuestas.introducirEntero();
		trag=new Tragaperras(monedas);
		//System.out.println(trag.getMonedas());
		while(trag.getMonedas()!=0) {
			if(trag.getMonedas()<=0) {
				System.out.println("Con ese saldo no se pueden realizar apuestas\nFin del programa");
			}else {
				System.out.println("¿Quieres realizar una apuesta? S/N");
				sc=new Scanner(System.in);
				resp=sc.nextLine();
				//resp.toUpperCase();
				if(resp.length()==1&&resp.toUpperCase().charAt(0)=='S') {
					trag.apuesta();
					System.out.println("Tu saldo es de: "+trag.getMonedas());
				}else if(resp.length()==1&&resp.toUpperCase().charAt(0)=='N') {
					if(trag.getMonedas()>1) {
						System.out.println("Tu saldo acabó en: "+trag.getMonedas()+" monedas");
					}else {
						System.out.println("Tu saldo acabó en: "+trag.getMonedas()+" moneda");
					}
					trag.setMonedas(0);
				}
			}
		}
		System.out.println("Fin del programa");
	}

}
