package EJEMPLOS;
import java.util.Scanner;
public class Factoriales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int x=1,c,y;
		int suma=0;
		System.out.println("Introducir un valor");
		c=teclado.nextInt();
		for(y=1;y<=c;y++) {
			x=y*x;
			suma=suma+x;
		}
		System.out.print("La suma es: "+suma);
		teclado.close();
	}
}
