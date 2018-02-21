package EJEMPLOS;
import java.util.Scanner;
public class Examenes01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int nota;
		System.out.print("Introduce una nota:");
		nota = teclado.nextInt();
		if(nota<0||nota>10)System.out.println("Nota no valida");
		if(nota<5&&nota>=0)System.out.println("Alumno suspenso");
		if(nota>=5&&nota<=10)System.out.println("Alumno aprobado");
		
		int edad;
		System.out.println("Introducir edad");
		edad=teclado.nextInt();
		if(edad>=18&&edad<=120)System.out.println("Es mayor de edad");
		if(edad>=0&&edad<18)System.out.println("No es mayor de edad");
		if(edad<0||edad>120)System.out.println("No es una edad valida, a mi no me engañas ¡GILIPOLLAS!");
		
		int num,den;
		System.out.println("Introduce el primer numero");
		num=teclado.nextInt();
		System.out.println("Introduce el segundo numero");
		den=teclado.nextInt();
		if(den==0)System.out.println("El segundo numero introducido no es valido");
		else if(num%den==0)System.out.println(num+" es divisible entre "+den);
		else if(num%den!=0)System.out.println(num+"no es divisible entre"+den);
		teclado.close();
	}

}