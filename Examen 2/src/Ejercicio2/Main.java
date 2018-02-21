package Ejercicio2;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int tamannno=0, num;
		String cadena;
		int cont=0;
		int num1=1;
		while(num1>0&&num1<4)
		System.out.println("Introduce el numero de cadenas a introducir");
		tamannno=sc.nextInt();
		ArrayList<String> array=new ArrayList<String>(tamannno);
		System.out.println("MENÚ\n1. Introducir cadenas\n2. Eliminar cadena\n3. Introducir otra cadena(Solo si se ha eliminado 1 cadena");
		num1=sc.nextInt();
		switch(num1) {
		//String[] array=new String[tamannno];
		//Metodos.Tamanno(tamannno);
		//sc=new Scanner(System.in);
		//Metodo introducir cadenas
		case 1:
		while(cont<tamannno) {
			sc=new Scanner(System.in);
			System.out.println("Introduce cadena");
			cadena=sc.nextLine();
			array.add(cadena);
			//Metodos.IncluirCadena(cadena);
			cont++;
		}
		break;
		case 2:
		//Metodo sacar cadena
		System.out.println("Introduce la posicion de la cadena a eliminar");
		num=sc.nextInt();
		array.remove(num);
		for(int i=num; i<array.size()-1; i++) {
			array.set(i, array.get(i+1));
			}
		break;
		case 3:
		//Metodo reemplazar cadena
		System.out.println("Introduce la cadena");
		cadena=sc.nextLine();
		array.add(cadena);
		break;
		}
	}
}
