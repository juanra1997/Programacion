package EJEMPLOS;
import java.util.Scanner;
public class Ejemplo20_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int nota,sumnota=0,cont=0;
		System.out.println("Introduce una nota");
		nota=teclado.nextInt();
		while(nota<=0||nota>10) {
			System.out.println("Nota no valida");
			System.out.println("Introduce una nota valida");
			nota=teclado.nextInt();
		}
		while(nota!=0) {
			if(nota>10||nota<0) {
				System.out.println("Nota no valida");
				System.out.println("Introduce una nota valida");
				nota=teclado.nextInt();
			}
			else {
		cont++;
		sumnota=sumnota+nota;
		System.out.println("Introduce una nota");
		nota=teclado.nextInt();
			}
		}
		System.out.println("La nota media es: "+sumnota/cont);
		teclado.close();
	}

}