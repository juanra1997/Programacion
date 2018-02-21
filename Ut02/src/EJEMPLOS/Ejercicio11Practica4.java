package EJEMPLOS;
import java.util.Scanner;
public class Ejercicio11Practica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
        int N;
        System.out.println("Introduzca un numero de 5 cifras");
        N=teclado.nextInt();
        System.out.println(N%10);
        System.out.println((N/10)%10);
        System.out.println((N/100)%10);
        System.out.println((N/1000)%10);
        System.out.println(N/10000);
        teclado.close();
	}

}
