package EJEMPLOS;
import java.util.Scanner;
public class Ejemplo24_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		double num,numsuma=0,cont;
		for(cont=1;cont<=10;cont++) {
			System.out.println("Introduce un numero");
			num=teclado.nextDouble();
			numsuma=numsuma+num;
		}
		System.out.println("La media de estos diez numeros es: "+numsuma/10);
		teclado.close();
		}
}