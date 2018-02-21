package Practica_2_Utilizacion_de_objetos;
import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String cadena;
		int dia, mes, anno;
		System.out.println("Introduce una fecha con el formato dd/mm/aaaa");
		cadena=teclado.nextLine();
		dia=Integer.parseInt(cadena.substring(0,2));
		mes=Integer.parseInt(cadena.substring(3,5));
		anno=Integer.parseInt(cadena.substring(6,10));
		if(anno<0||mes>12||dia<0||mes<0||dia>31) {
			System.out.println("Fecha incorrecta");
		}
		else if((anno%400==0||anno%4==0&&anno%100!=0)==true&&mes==2&&dia>29||(anno%400==0||anno%4==0&&anno%100!=0)==false&&mes==2&&dia>28){
			System.out.println("Fecha incorrecta");
		}
		else if(mes==2||mes==4||mes==6||mes==9||mes==11&&dia>30) {
			System.out.println("Fecha incorrecta");
		}
		else {
			System.out.println("Fecha correcta");
			}
		teclado.close();
	}

}
