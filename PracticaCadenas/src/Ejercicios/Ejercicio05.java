package Ejercicios;
import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int veces=0/*, tamanno*/;
		String lectura, busqueda;
		System.out.println("Introduce una cadena");
		lectura=sc.nextLine();
		System.out.println("Introduce la subcadena a contar");
		busqueda=sc.next();
		//tamanno=busqueda.length();
		//System.out.println((lectura.length()-1)-/*tamanno*/busqueda.length());
		//System.out.println();
		for(int i=0; i<=(lectura.length())-/*tamanno*/busqueda.length(); i++) {
			//System.out.println(lectura.substring(i, i+tamanno).equals(busqueda));
			//System.out.println("Lo que lee fuera del if "+lectura.substring(i, i+/*tamanno*/busqueda.length()));
			if(lectura.substring(i, i+/*tamanno*/busqueda.length()).equals(busqueda)) {
				veces++;
				i=i+/*tamanno*/busqueda.length()-1;
				//System.out.println("Lo coje");
			}
			//System.out.println("Lo que vale la i: "+i);
			//System.out.println("Lo que vale el final: "+(lectura.length()-/*tamanno*/busqueda.length()));
		}
		System.out.println("La subcadena aparece "+veces+" veces");
		sc.close();
	}

}
