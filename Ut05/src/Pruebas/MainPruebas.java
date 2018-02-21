package Pruebas;

public class MainPruebas implements Prueba{
	@Override
	public int sumar(int argumento1, int argumento2) {
		return argumento1+argumento2;
	}
	
	@Override
	public int restar(int argumento1, int argumento2) {
		return argumento1-argumento2;
	}
}
