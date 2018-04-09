package Ejercicio6;

public class Calculadora {

	public static double suma(double num1, double num2) {
		return num1+num2;
	}
	
	public static double resta(double num1, double num2) {
		return num1-num2;
	}
	
	public static double multiplicacion(double num1, double num2) {
		return num1*num2;
	}
	
	public static double division(double num1, double num2) {
		return num1/num2;
	}
	
	public static double potencia(double num1, int num2) {
		return Math.pow(num1, num2);
	}
	
	public static double raizCuadrada(double num) {
		return Math.pow(num, 0.5);
	}
	
}
