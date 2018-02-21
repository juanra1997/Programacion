package Practica_2_Utilizacion_de_objetos;
import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String hora;
		int hh, mm;
		System.out.println("Introduce una hora en formato hh:mm");
		hora=teclado.nextLine();
		hh=Integer.parseInt(hora.substring(0,2));
		mm=Integer.parseInt(hora.substring(3,5));
		if(hh>12) {
			hh=hh-12;
			System.out.println(hh+":"+mm+" pm");
		}
		else {
			System.out.println(hh+":"+mm+" am");
		}
		teclado.close();
	}

}
