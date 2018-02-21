package Ejercicios;
import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String prueba;
		System.out.println("Introduce la cadena en la que buscar vocales");
		prueba=sc.nextLine();
		//sc.nextLine();
		int consonantes=0;
		//System.out.println(prueba.substring(0, 1));
		for(int i=0; i<prueba.length(); i++) {
			//System.out.println(prueba.charAt(i));
			if(prueba.charAt(i)!='a'&&prueba.charAt(i)!='e'&&prueba.charAt(i)!='i'&&prueba.charAt(i)!='o'&&prueba.charAt(i)!='u'&&prueba.charAt(i)!='¡'&&prueba.charAt(i)!='!'&&
					prueba.charAt(i)!='?'&&prueba.charAt(i)!='¿'&&prueba.charAt(i)!='_'&&prueba.charAt(i)!='-'&&prueba.charAt(i)!='@'&&prueba.charAt(i)!='€'&&
					prueba.charAt(i)!=' '&&prueba.charAt(i)!='1'&&prueba.charAt(i)!='2'&&prueba.charAt(i)!='3'&&prueba.charAt(i)!='4'&&prueba.charAt(i)!='5'&&
					prueba.charAt(i)!='6'&&prueba.charAt(i)!='7'&&prueba.charAt(i)!='8'&&prueba.charAt(i)!='9'&&prueba.charAt(i)!='0'&&prueba.charAt(i)!='#') {
			//if(prueba.substring(i, (i+1))=="a"||prueba.substring(i, (i+1))=="e"||prueba.substring(i, (i+1))=="i"||prueba.substring(i, (i+1))=="o"||prueba.substring(i, (i+1))=="u") {
				consonantes++;
			}
		}
		System.out.println("La cadena "+prueba+" tiene "+consonantes+" consonantes.");
		sc.close();
	}

}
