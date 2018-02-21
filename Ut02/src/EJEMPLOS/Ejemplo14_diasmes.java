package EJEMPLOS;
import java.util.Scanner;
public class Ejemplo14_diasmes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		String mes;
		System.out.println("Introduce el numero de un mes");
		mes=teclado.nextLine();
		switch(mes) {
		case "Enero": System.out.println("Enero: 31 dias");
			break;
		case "Febrero": System.out.println("Febrero: 28 dias, 29 dias si es bisiesto");
			break;
		case "Marzo": System.out.println("Marzo: 31 dias");
			break;
		case "Abril": System.out.println("Abril: 30 dias");
			break;
		case "Mayo": System.out.println("Mayo: 31 dias");
			break;
		case "Junio": System.out.println("Junio: 30 dias");
			break;
		case "Julio": System.out.println("Julio: 31 dias");
			break;
		case "Agosto": System.out.println("Agosto: 31 dias");
			break;
		case "Septiembre": System.out.println("Septiembre: 30 dias");
			break;
		case "Octubre": System.out.println("Octubre: 31 dias");
			break;
		case "Noviembre": System.out.println("Noviembre: 30 dias");
			break;
		case "Diciembre": System.out.println("Diciembre: 31 dias");
			break;
		case "enero": System.out.println("Enero: 31 dias");
			break;
		case "febrero": System.out.println("Febrero: 28 dias, 29 dias si es bisiesto");
			break;
		case "marzo": System.out.println("Marzo: 31 dias");
			break;
		case "abril": System.out.println("Abril: 30 dias");
			break;
		case "mayo": System.out.println("Mayo: 31 dias");
			break;
		case "junio": System.out.println("Junio: 30 dias");
			break;
		case "julio": System.out.println("Julio: 31 dias");
			break;
		case "agosto": System.out.println("Agosto: 31 dias");
			break;
		case "septiembre": System.out.println("Septiembre: 30 dias");
			break;
		case "octubre": System.out.println("Octubre: 31 dias");
			break;
		case "noviembre": System.out.println("Noviembre: 30 dias");
			break;
		case "diciembre": System.out.println("Diciembre: 31 dias");
			break;
		default: System.out.println("Introduce un mes valido");
		}
		teclado.close();
	}

}