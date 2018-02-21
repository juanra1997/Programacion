package Practica_2_Utilizacion_de_objetos;

public class Ejercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicio=1000, fin=9999, num, sumapares, sumaimpares, num1, num2, num3, num4;
		String cadena;
		while(inicio<=fin) {
			num=inicio;
			cadena=String.valueOf(num);
			num1=Integer.parseInt(cadena.substring(0,1));
			num2=Integer.parseInt(cadena.substring(1,2));
			num3=Integer.parseInt(cadena.substring(2,3));
			num4=Integer.parseInt(cadena.substring(3,4));
			sumapares=num2+num4;
			sumaimpares=num1+num3;
			if(sumapares==sumaimpares) {
				System.out.println(num);
			}
			inicio++;
		}
		
	}

}
