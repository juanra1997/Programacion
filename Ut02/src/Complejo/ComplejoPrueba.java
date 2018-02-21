package Complejo;

public class ComplejoPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complejo prueba=new Complejo(2, 8);
		Complejo prueba0=new Complejo(2, 3);
		System.out.println(prueba.suma(prueba0));
		System.out.println(prueba.resta(prueba0));
		System.out.println(prueba.productoPorEntero(2));
		System.out.println(prueba0.divisionPorEntero(2));
		System.out.println(prueba.divisionEntreComplejos(prueba0));
		prueba.toString();
		prueba0.toString();
	}

}
