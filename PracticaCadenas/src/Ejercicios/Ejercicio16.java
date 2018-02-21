package Ejercicios;
import java.util.*;
public class Ejercicio16 {
	public static void main(String[] args) {
		ArrayList<String> palabra=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		String texto, palabraABuscar;
		int i=0;
		System.out.println("Introduce un texto");
		texto=sc.nextLine();
		System.out.println("Introduce la palabra a borrar");
		palabraABuscar=sc.next();
		for(int f=0; f<texto.length(); f++) {
			if(texto.charAt(f)==' '||f==texto.length()-1) {
				palabra.add(texto.substring(i, f));
				if(f==texto.length()-1) {
					palabra.remove(palabra.size()-1);
					palabra.add(texto.substring(i, f+1));
				}
				i=f+1;
			}
		}
		for(int x=0; x<palabra.size(); x++) {
			if((palabra.get(x).equals(palabraABuscar)==false)) {
				System.out.print(palabra.get(x)+" ");
			}
		}
		sc.close();
	}
}
