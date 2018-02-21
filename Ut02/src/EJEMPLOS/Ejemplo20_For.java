package EJEMPLOS;
import java.util.Scanner;
public class Ejemplo20_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int nota,cont=0, sumnota=0;
		System.out.println("Escribe una nota");
		nota=teclado.nextInt();
		while(nota<=0||nota>10){
			System.out.println("Nota no valida");
			System.out.println("Introduce una nota valida");
			nota=teclado.nextInt();
		}
		for(;nota!=0;){
			if(nota>10||nota<0) {
				System.out.println("Nota no valida");
				System.out.println("Introduce una nota valida");
				nota=teclado.nextInt();
			}
			else {
			sumnota=sumnota+nota;
			System.out.println("Escribe una nota");
			nota=teclado.nextInt();
			cont++;
			}
		}
			System.out.println("La media es: "+sumnota/cont);
			teclado.close();
		}
		

}
