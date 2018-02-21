package EJEMPLOS;
import java.util.Scanner;
public class Examenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ent=new Scanner(System.in);
		int nota;
		System.out.print("Introduce una nota:");
		nota = ent.nextInt();
		if(nota<5&&nota>=0)System.out.println("Alumno suspenso");
		if(nota>=5&&nota<=10)System.out.println("Alumno aprobado");
		if(nota<0&&nota>10)System.out.println("Nota no valida");
		ent.close();
	}

}
