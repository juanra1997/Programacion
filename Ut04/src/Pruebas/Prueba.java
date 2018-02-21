package Pruebas;
import java.util.ArrayList;
import java.util.Scanner;
public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		ArrayList<ArrayList<String>> ventas=new ArrayList<ArrayList<String>>();
		ventas.add(new ArrayList<String>());
		ventas.get(0).add("matricula");
		ventas.get(0).add("123");
		int marca0, aux;
		System.out.println("Introduce la marca");
		marca0=teclado.nextInt();
		for(int i=0; i<ventas.size(); i++) {
			//MATRICULA(0),MARCA(1),MODELO(2),COMBUSTIBLE(3),KMs(4)
			//if(marca0==ventas.get(i).get(1)) {
				System.out.println("Matricula: "+ventas.get(i).get(0));
				System.out.println(ventas.get(i).get(1));
				System.out.println(marca0);
			//}
				aux=Integer.parseInt(ventas.get(i).get(1));
				System.out.println(marca0==Integer.parseInt(ventas.get(i).get(1)));
				System.out.println(marca0==aux);
		}
		teclado.close();
	}

}
