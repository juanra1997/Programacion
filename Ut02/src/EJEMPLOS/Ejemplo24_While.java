package EJEMPLOS;
import java.util.Scanner;
public class Ejemplo24_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		double num,numsuma=0,cont=1;
		while(cont<=10) {
			System.out.println("Introduce un numero");
			num=teclado.nextDouble();
			numsuma=numsuma+num;
			cont++;
		}
		System.out.println("La media de estos diez numeros es: "+numsuma/10);
		teclado.close();
		}
}