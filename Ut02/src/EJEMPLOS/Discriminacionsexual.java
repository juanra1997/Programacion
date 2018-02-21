package EJEMPLOS;
import java.util.Scanner;
public class Discriminacionsexual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int edad;
		char sexosinmalpensar;
		System.out.print("Introducir edad ");
		edad=teclado.nextInt();
		System.out.print("Introducir sexo, si es hombre, introducir una H y si es mujer introducir una M ");
		sexosinmalpensar=teclado.next().charAt(0);
		if(sexosinmalpensar=='m'&&edad<=25&&edad>=18)System.out.println("Tiene bonificacion");
		else if(sexosinmalpensar=='M'&&edad<=25&&edad>=18)System.out.println("Tiene bonificacion");
		else System.out.println("No tiene bonificacion");
		teclado.close();
	}

}
