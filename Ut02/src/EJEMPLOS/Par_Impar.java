package EJEMPLOS;
import java.util.Scanner;
public class Par_Impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int numero;
		System.out.println("Introduce un numero");
		numero=teclado.nextInt();
		if(numero%2==0)System.out.println("Par");
		else System.out.println("Impar");
		teclado.close();
	}

}
