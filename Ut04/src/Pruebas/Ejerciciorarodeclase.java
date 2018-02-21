package Pruebas;
import java.util.*;
public class Ejerciciorarodeclase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> prueba=new ArrayList<Integer>();//Crea un ArrayList
		for(int i=0; i<15; i++){//Rellena el ArrayList
			prueba.add((int)(Math.random()*15+1));
		}
		System.out.println("El ArrayList con for:");
		for(int i=0; i<15; i++) {//Muestra el ArrayList con for
			System.out.print(prueba.get(i)+" ");
		}
		System.out.println("\nEl ArrayList con for each:");
		for(int prueba0: prueba ) {//Muestra el ArrayList con for each
			System.out.print(prueba0+" ");
		}
		Iterator<Integer> it=prueba.iterator();
		System.out.println("\nEl Arraylist con iterator");
		while(it.hasNext()==true) {//Muestra el ArrayList con iterator
			System.out.print(it.next()+" ");
		}
		System.out.println("\nNo se puede recorrer un ArrayList con enumeration");

	}

}
