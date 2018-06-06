package Ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {

		/*Programa  java  que  realice  lo  siguiente:  declarar  una  variable  N  de  tipo  int,
		una  variable  A  de  tipo  double  y  una  variable  C  de  tipo  char  y 
		asigna  a  cada  una  un  valor.  A  continuación,muestra  por  pantalla: 
		El  valor  de  cada  variable,  la  suma  de  N  +  A,  la  diferencia  de  A  -N
		el  valor  numérico  correspondiente  al  carácter  que  contiene  la  variable  C.*/
		
		int N=2;
		double A=4.3;
		char C='O';
		System.out.println("N: "+N+"\nA: "+A+"\nC: "+C+"\nN+A: "+(N+A)+"\nA-N: "+(A-N)+"\nCaracter numerico de C: "+Character.getNumericValue(C));
		
	}

}
