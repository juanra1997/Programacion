package Ejercicios;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String lectura, mes=" ";
		System.out.println("Introduce una fecha con el formato: dd/mm/aaaa");
		lectura=sc.next();
		if(lectura.charAt(2)!='/'||lectura.charAt(5)!='/') {
			System.out.println("Formato no valido");
		} else {
			/*if(lectura.substring(3, 5).equals("01")) {
				mes="Enero";
			}
			if(lectura.substring(3, 5).equals("02")) {
				mes="Febrero";
			}
			if(lectura.substring(3, 5).equals("03")) {
				mes="Marzo";
			}
			if(lectura.substring(3, 5).equals("04")) {
				mes="Abril";
			}
			if(lectura.substring(3, 5).equals("05")) {
				mes="Mayo";
			}
			if(lectura.substring(3, 5).equals("06")) {
				mes="Junio";
			}
			if(lectura.substring(3, 5).equals("07")) {
				mes="Julio";
			}
			if(lectura.substring(3, 5).equals("08")) {
				mes="Agosto";
			}
			if(lectura.substring(3, 5).equals("09")) {
				mes="Septiembre";
			}
			if(lectura.substring(3, 5).equals("10")) {
				mes="Octubre";
			}
			if(lectura.substring(3, 5).equals("11")) {
				mes="Noviembre";
			}
			if(lectura.substring(3, 5).equals("12")) {
				mes="Diciembre";
			}*/
			switch(Integer.parseInt(lectura.substring(3,5))) {
			case 1: mes="Enero";
					break;
			case 2: mes="Febrero";
					break;
			case 3: mes="Marzo";
					break;
			case 4: mes="Abril";
					break;
			case 5: mes="Mayo";
					break;
			case 6: mes="Junio";
					break;
			case 7: mes="Julio";
					break;
			case 8: mes="Agosto";
					break;
			case 9: mes="Septiembre";
					break;
			case 10: mes="Octubre";
					break;
			case 11: mes="Noviembre";
					break;
			case 12: mes="Diciembre";
					break;
			}
			System.out.println(lectura.substring(0, 2)+" de "+mes+" de "+lectura.substring(6, 10));
		}
		sc.close();
	}

}
