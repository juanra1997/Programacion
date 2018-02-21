package EJEMPLOS;
import java.util.Scanner;
public class Raiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		double num,raiz;
		num=teclado.nextInt();
		raiz=Math.pow(num, 0.25);
		System.out.println(raiz);
		teclado.close();
	}

}
