package Ejercicios;
import java.util.*;
public class Ejercicio24 {
	
	public static void main(String[] args) {
		//ArrayList<String> palabra=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		String texto;
		boolean a=false, e=false, i=false, o=false, u=false;
		int contVocales=0, cont=0/*, iae=0*/;
		System.out.println("Introduce un texto");
		texto=sc.nextLine();
		for(int f=0; f<texto.length(); f++) {
			if(texto.charAt(f)=='a'&&a==false) {
				contVocales++;
				a=true;
			}
			if(texto.charAt(f)=='e'&&e==false) {
				contVocales++;
				e=true;
			}
			if(texto.charAt(f)=='i'&&i==false) {
				contVocales++;
				i=true;
			}
			if(texto.charAt(f)=='o'&&o==false) {
				contVocales++;
				o=true;
			}
			if(texto.charAt(f)=='u'&&u==false) {
				contVocales++;
				u=true;
			}
			if(texto.charAt(f)==' '||f==texto.length()-1/*&&contVocales>=4*/) {
				if(contVocales>=4) {
					cont++;
				}
				/*palabra.add(texto.substring(i, f));
				if(f==texto.length()-1) {
					palabra.remove(palabra.size()-1);
					palabra.add(texto.substring(i, f+1));
				}*/
				/*iae=f+1;*/
				contVocales=0;
				a=false;
				e=false;
				i=false;
				o=false;
				u=false;
			}
		}
		System.out.println("Se han encontrado "+cont+" palabras con 4 o mas vocales diferentes");
		sc.close();
		/*iae=0;*/
	}

}
