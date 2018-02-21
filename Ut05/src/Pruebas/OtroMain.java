package Pruebas;

public class OtroMain {
	
	public static void main(String[] args) {
		Prueba interfaz=new MainPruebas();
		int resultadoDeSumar=interfaz.sumar(2, 5);
		int resultadoDeRestar=interfaz.restar(5, 2);
		System.out.println("Resultado de sumar 2 y 5: "+resultadoDeSumar);
		System.out.println("Resultado de restar 5 y 2: "+resultadoDeRestar);
	}
}
