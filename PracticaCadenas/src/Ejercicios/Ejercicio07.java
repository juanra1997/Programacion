package Ejercicios;
import java.util.Scanner;
public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String lectura;
		int cont=1;
		System.out.println("Introduce la cadena");
		lectura=sc.nextLine();
		for(int i=0; i<lectura.length(); i++) {
			if(i!=0&&lectura.charAt(i)==' ') {
				cont++;
			}
		}
		if(lectura.length()==0) {
			cont=0;
		}
		System.out.println("La cadena introducida tiene "+cont+" palabra(s)");
		sc.close();
	}

}
