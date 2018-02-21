package Ejercicios;
import java.util.Scanner;
public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String lectura;
		int cont=0;
		System.out.println("Introduce la cadena con formato numero de un digito y letra. Ej: 2w3e4f");
		lectura=sc.next();
		for(int i=0; i<=lectura.length()-2; i=i+2) {
			while(cont<Integer.parseInt(Character.toString((lectura.charAt(i))))) {
				System.out.print(lectura.charAt(i+1));
				cont++;
			}
			cont=0;
		}
		sc.close();
	}

}
