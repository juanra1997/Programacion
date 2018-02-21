package Ejercicios;
import java.util.*;
public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> palabra=new ArrayList<String>();
		//ArrayList<Integer> tamaño=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int i=0, mayor=0, x=0, posicion=0;
		String lectura;
		System.out.println("Introduce una cadena de palabras");
		lectura=sc.nextLine();
		for(int f=0; f<lectura.length(); f++) {
			if(lectura.charAt(f)==' '||f==lectura.length()-1) {
				palabra.add(lectura.substring(i, f+1));
				i=f+1;
				if(mayor<palabra.get(x).length()) {
					mayor=palabra.get(x).length();
					posicion=x;
				}
				x++;
			}
		}
		for(i=0; i<palabra.size(); i++) {
		System.out.println(palabra.get(i));
		}
		System.out.println("La palabra mas larga de la cadena es "+palabra.get(posicion));
		sc.close();
	}

}
