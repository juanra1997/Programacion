package Ejercicios;
import java.util.Scanner;
public class Ejercicio09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String lectura;
		System.out.println("Introduce una cadena, los espacios cuentan como posicion");
		lectura=sc.nextLine();
		for(int i=1; i<lectura.length(); i=i+2) {
			if(lectura.charAt(i)==' ') {
				System.out.println("<espacio>");
			} else {
				System.out.println(lectura.charAt(i));
			}
		}
		sc.close();
	}

}
