package Pruebas;

@SuppressWarnings("serial")
public class ValorCeroException extends Exception{
	//Constructor por defecto
	public ValorCeroException() {
		super("Soy un constructor por defecto");
	}
	
	//Constructor parametrizado
	public ValorCeroException(String error) {
		super(error);
	}

}
