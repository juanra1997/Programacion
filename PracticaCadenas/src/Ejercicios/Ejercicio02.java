package Ejercicios;
import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String prueba;
		System.out.println("Introduce la cadena en la que buscar vocales");
		prueba=sc.nextLine();
		//sc.nextLine();
		int vocales=0;
		//System.out.println(prueba.substring(0, 1));
		for(int i=0; i<prueba.length(); i++) {
			//System.out.println(prueba.charAt(i));
			if(prueba.charAt(i)=='a'||prueba.charAt(i)=='e'||prueba.charAt(i)=='i'||prueba.charAt(i)=='o'||prueba.charAt(i)=='u') {
			//if(prueba.substring(i, (i+1))=="a"||prueba.substring(i, (i+1))=="e"||prueba.substring(i, (i+1))=="i"||prueba.substring(i, (i+1))=="o"||prueba.substring(i, (i+1))=="u") {
				vocales++;
			}
		}
		System.out.println("La cadena "+prueba+" tiene "+vocales+" vocales.");
		sc.close();
	}

}
