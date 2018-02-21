package EJEMPLOS;
import java.util.Scanner;
public class Ejercicio10Practica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
	    int n;
        System.out.print("Introduzca un numero de 3 cifras");
        n=teclado.nextInt();
        System.out.println(n/100); 
        System.out.println((n/10)%10);
        System.out.println(n%10);
        teclado.close();
	}

}
