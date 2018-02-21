package EJEMPLOS;
import java.util.Scanner;
public class CorregirNotaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int suma,numAlumnos,nota;
		suma=0;
		System.out.println("Introduce nota del alumno");
		nota=teclado.nextInt();
		numAlumnos=0;
		while(nota>0) {
			if(nota<0&&nota>=10) {
			numAlumnos++;
			suma+=nota;
			System.out.println("Introduce nota del alumno");
			nota=teclado.nextInt();
		}
			else {System.out.println("Nota no valida");}
	}
	if(numAlumnos!=0) {
	System.out.println(suma/(double)numAlumnos);}
	else {System.out.println("Error, nota incorrecta");}
	teclado.close();
}
}