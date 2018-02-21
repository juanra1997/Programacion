package Practica_2_Utilizacion_de_objetos;
import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		double num, contpar=0, contimpar=0, suma=0, sumapar=0, sumaimpar=0;
		System.out.println("Introuce un numero");
		num=teclado.nextDouble();
		/*while(num<=0) {
			System.out.println("Numero no valido");
			System.out.println("Introduce un numero valido");
			num=teclado.nextDouble();
			suma=suma+num;
		}
		if(num%2==0) {
			contpar=contpar+1;
			suma=suma+num;
			sumapar=sumapar+num;
			System.out.println("Introduce otro numero");
			num=teclado.nextDouble();
		}
		else {
			contimpar=contimpar+1;
			suma=suma+num;
			sumaimpar=sumaimpar+num;
			System.out.println("Introduce otro numero");
			num=teclado.nextDouble();
		}*/
		while(num!=0) {
			/*if(num<0) {
				System.out.println("Numero no valido");
				System.out.println("Introduce un numero valido");
				num=teclado.nextDouble();
			}*/
			if(num%2==0) {
				contpar=contpar+1;
				suma=suma+num;
				sumapar=sumapar+num;
				System.out.println("Introduce otro numero");
				num=teclado.nextDouble();
			}
				else {
					contimpar=contimpar+1;
					suma=suma+num;
					sumaimpar=sumaimpar+num;
					System.out.println("Introduce otro numero");
					num=teclado.nextDouble();
				}
		}
		System.out.println("Se han introducido un total de "+(int)(contimpar+contpar)+" numeros");
		/*if(contpar==0) {
			System.out.println("Se han introducido 0 numeros impares");
		}
		else {*/
			System.out.println("Se han introducido "+(int)(contpar*1)+" numeros pares, un "+(int)(contpar/(contpar+contimpar)*100)+"%");
			System.out.println("La suma de los numeros pares introducidos es: "+sumapar);
		//}
		/*if(contimpar==0) {
			System.out.println("Se han introducido 0 numeros pares");
		}
		else {*/
			System.out.println("Se han introducido "+(int)(contimpar*1)+" numeros impares, un "+(int)(contimpar/(contpar+contimpar)*100)+"%");
			System.out.println("La suma de los numeros pares introducidos es: "+sumaimpar);
		//}
		System.out.println("La suma total de los numeros introducidos es: "+suma);
		teclado.close();
	}

}
