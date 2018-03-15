package Ejercicio4;

public class Raices_Cuadradas_Grado_2 {

	public static double root(double A, double B, double C) throws IllegalArgumentException{
		//Devuelve una de las raices de la ecuacion de segundro grado A*x*x+B*x+C=0
		//Lanza una excepcion si A==0 o B*B-4*A*C<0
		if(A==0) {
			throw new IllegalArgumentException("A no puede ser cero");
		} else {
			double disc=B*B-4*A*C;
			if(disc<0)
			throw new IllegalArgumentException("Disciminante<cero");
			return (-B+Math.sqrt(disc))/2*A;
		}
	}
}
