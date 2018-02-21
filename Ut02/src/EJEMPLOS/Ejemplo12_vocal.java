package EJEMPLOS;
import java.util.Scanner;
public class Ejemplo12_vocal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		char letra;
		System.out.println("Introduce un carácter");
		letra=teclado.next().charAt(0);
		switch(letra){
		case 'a': System.out.println("Es vocal");
			break;
		case 'e': System.out.println("Es vocal");
			break;
		case 'i': System.out.println("Es vocal");
			break;
		case 'o': System.out.println("Es vocal");
			break;
		case 'u': System.out.println("Es vocal");
			break;
		case 'A': System.out.println("Es vocal");
			break;
		case 'E': System.out.println("Es vocal");
			break;
		case 'I': System.out.println("Es vocal");
			break;
		case 'O': System.out.println("Es vocal");
			break;
		case 'U': System.out.println("Es vocal");
			break;
		default: System.out.println("No es vocal");
		}
	teclado.close();
	}

}
