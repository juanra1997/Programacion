package Ejercicio6;
import java.util.*;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int sw, potencia;
		double num1, num2;
		char prueba;
		try {
		System.out.println("MENU\n1.Operaciones basicas\n2.Operaciones complejas");
		sw=sc.nextInt();
		} catch(Exception e) {
			System.out.println("No valido\nIntroduce uno valido");
			sc=new Scanner(System.in);
			sw=sc.nextInt();
		} /*catch(InputMismatchException ex) {
			System.out.println("No se va a proceder a realizar nada");
			sc=new Scanner(System.in);
			sw=sc.nextInt();
		}*/
		switch(sw) {
		case 1:
			try {
			System.out.println("A.Suma\nB.Resta\nC.Multiplicacion\nD.Division");
			prueba=sc.next().charAt(0);
			prueba=Character.toUpperCase(prueba);
			} catch(Exception e) {
				System.out.println("No valido\nIntroduce uno valido");
				sc=new Scanner(System.in);
				prueba=sc.next().charAt(0);
				prueba=Character.toUpperCase(prueba);
			}
			switch(prueba) {
			case 'A':
				try {
				System.out.println("Introduce el primer numero");
				num1=sc.nextDouble();
				} catch(Exception e) {
					System.out.println("No valido\nIntroduce uno valido");
					sc=new Scanner(System.in);
					num1=sc.nextDouble();
				}
				try {
				System.out.println("Introduce el segundo numero");
				num2=sc.nextDouble();
				} catch(Exception e) {
					System.out.println("No valido\nIntroduce uno valido");
					sc=new Scanner(System.in);
					num2=sc.nextDouble();
				}
				System.out.println(Calculadora.suma(num1, num2));
				break;
			case 'B':
				try {
					System.out.println("Introduce el primer numero");
					num1=sc.nextDouble();
					} catch(Exception e) {
						System.out.println("No valido\nIntroduce uno valido");
						sc=new Scanner(System.in);
						num1=sc.nextDouble();
					}
					try {
					System.out.println("Introduce el segundo numero");
					num2=sc.nextDouble();
					} catch(Exception e) {
						System.out.println("No valido\nIntroduce uno valido");
						sc=new Scanner(System.in);
						num2=sc.nextDouble();
					}
					System.out.println(Calculadora.resta(num1, num2));
					break;
			case 'C':
				try {
					System.out.println("Introduce el primer numero");
					num1=sc.nextDouble();
					} catch(Exception e) {
						System.out.println("No valido\nIntroduce uno valido");
						sc=new Scanner(System.in);
						num1=sc.nextDouble();
					}
					try {
					System.out.println("Introduce el segundo numero");
					num2=sc.nextDouble();
					} catch(Exception e) {
						System.out.println("No valido\nIntroduce uno valido");
						sc=new Scanner(System.in);
						num2=sc.nextDouble();
					}
					System.out.println(Calculadora.multiplicacion(num1, num2));
					break;
			case 'D':
				try {
					System.out.println("Introduce el primer numero");
					num1=sc.nextDouble();
					} catch(Exception e) {
						System.out.println("No valido\nIntroduce uno valido");
						sc=new Scanner(System.in);
						num1=sc.nextDouble();
					}
					try {
					System.out.println("Introduce el segundo numero");
					num2=sc.nextDouble();
					} catch(Exception e) {
						System.out.println("No valido\nIntroduce uno valido");
						sc=new Scanner(System.in);
						num2=sc.nextDouble();
					}
					System.out.println(Calculadora.division(num1, num2));
					break;
			}
			break;
		case 2:
			System.out.println("A.Potencia\nB.Raiz cuadrada");
			prueba=sc.next().charAt(0);
			prueba=Character.toUpperCase(prueba);
			switch(prueba) {
			case 'A':
				try {
				System.out.println("Introduce el numero base");
				num1=sc.nextDouble();
				} catch(Exception e) {
					System.out.println("No valido\nIntroduce uno valido");
					sc=new Scanner(System.in);
					num1=sc.nextDouble();
				}
				try {
				System.out.println("Introduce la potencia");
				potencia=sc.nextInt();
				} catch(Exception e) {
					System.out.println("No valido\nIntroduce uno valido");
					sc=new Scanner(System.in);
					potencia=sc.nextInt();
				}
				System.out.println(Calculadora.potencia(num1, potencia));
				break;
			case 'B':
				try {
					System.out.println("Introduce el numero a sacar la raiz cuadrada");
					num1=sc.nextDouble();
					} catch(Exception e) {
						System.out.println("No valido\nIntroduce uno valido");
						sc=new Scanner(System.in);
						num1=sc.nextDouble();
					}
				System.out.println(Calculadora.raizCuadrada(num1));
		}
		sc.close();
	}
	}
}
