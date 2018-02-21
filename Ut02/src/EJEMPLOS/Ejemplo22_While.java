package EJEMPLOS;
import java.util.Scanner;
public class Ejemplo22_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int x;
		System.out.println("Introduce un numero positivo diferente a 0");
		x=teclado.nextInt();
		while(x<=0) {
			System.out.println("Numero no valido");
			System.out.println("Introduce un numero valido");
			x=teclado.nextInt();
		}
		System.out.println("Teniendo en cuenta que x es el valor que has introducido, estos son los resultados de la funcion x*log(x) hasta llegar a x=0:0");
		while(x>0) {
			System.out.println(x*Math.log10(x));
			x--;
		}
		teclado.close();
	}

}
