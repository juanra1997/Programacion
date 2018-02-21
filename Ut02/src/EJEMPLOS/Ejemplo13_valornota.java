package EJEMPLOS;
import java.util.Scanner;
public class Ejemplo13_valornota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int nota;
		System.out.println("Introduce una nota");
		nota=teclado.nextInt();
		switch(nota) {
		case 0: System.out.println("Cero. Suspenso");
			break;
		case 1: System.out.println("Uno. Suspenso");
			break;
		case 2: System.out.println("Dos. Suspenso");
			break;
		case 3: System.out.println("Tres. Suspenso");
			break;
			case 4: System.out.println("Cuatro. Suspenso");
			break;
		case 5: System.out.println("Cinco. Aprobado");
			break;
		case 6: System.out.println("Seis. Bien");
			break;
		case 7: System.out.println("Siete. Notable");
			break;
		case 8: System.out.println("Ocho. Notable");
			break;
		case 9: System.out.println("Nueve. Sobresaliente");
			break;
		case 10: System.out.println("Diez. Sobresaliente");
			break;
		default: System.out.println("Introduce una nota valida");
		}
		teclado.close();
	}

}
