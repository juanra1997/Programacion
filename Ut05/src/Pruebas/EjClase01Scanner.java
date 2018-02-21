package Pruebas;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjClase01Scanner {

	public static void main(String[] args) {
		//Programa que lea 10 notas validas y escriba la media
		//No creo que haya ninguna diferencia a nivel de escitura
		//BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int cont=1;
		double nota, suma=0;
		while(cont<=10) {
			System.out.println("Introduce la nota "+cont+"/10");
			try {
				nota=sc.nextDouble();
				if(nota>10||nota<0) {
					while(nota>10||nota<0) {
						System.out.println("Nota no valida\nIntroduce la nota "+cont+"/10");
						nota=sc.nextDouble();
					}
				}
			} catch(InputMismatchException e) {
				System.out.println("Al no introducir un numero como nota valida, se supone que la nota es 0");
				nota=0;
				/*Scanner */sc=new Scanner(System.in);
			}
			suma=suma+nota;
			cont++;
		}
		System.out.println("La nota media es: "+suma/10);
		sc.close();
	}

}
