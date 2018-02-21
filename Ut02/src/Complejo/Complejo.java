package Complejo;
/*Ejercicio
Constructor por defecto (0,0)
Constructor de clase
Constructor de copia
Set,Get,toString(a+bi)
Suma (a+bi)+(c+di)=a+c+(b+d)i
 * resta (a-c)+(b-d)i
 * producto entero por complejo x(a+bi)= ax+bxi
 * producto entre complejos (multiplicacion de polinomios)
 * division de un complejo por un real
 * division entre complejos*/

public class Complejo {
	private double numeroReal;
	private double numeroImaginario;


	public Complejo() { //Constructor por defecto
		this.numeroReal=0;
		this.numeroImaginario=0;
	}

	public Complejo(double numeroReal0, double numeroImaginario0) { //Constructor de clase
		this.numeroReal=numeroReal0;
		this.numeroImaginario=numeroImaginario0;
	}
	
	public Complejo(Complejo c) { //Constructor de copia
		this.numeroReal=c.numeroReal;
		this.numeroImaginario=c.numeroImaginario;
	}
	
	public double getnumeroReal() { //Get
		return numeroReal;
	}
	
	public double getnumeroImaginario() { //Get
		return numeroImaginario;
	}
	
	public void setnumeroReal(double numeroReal0) { //Set
		this.numeroReal=numeroReal0;
	}
	
	public void setnumeroImaginario(double numeroImaginario0) { //Set
		this.numeroImaginario=numeroImaginario0;
	}
	
	public String toString() { //toString
		String mss="("+numeroReal+"+"+numeroImaginario+"i)";
		return mss;
	}
	
	public Complejo suma(Complejo c) {
		double resultReal, resultImaginario;
		resultReal=this.numeroReal+c.numeroReal;
		resultImaginario=this.numeroImaginario+c.numeroImaginario;
		Complejo resultado=new Complejo(resultReal, resultImaginario);
		return resultado;
	}
	
	public Complejo resta(Complejo c) {
		double resultReal, resultImaginario;
		resultReal=this.numeroReal-c.numeroReal;
		resultImaginario=this.numeroImaginario-c.numeroImaginario;
		Complejo resultado=new Complejo(resultReal, resultImaginario);
		return resultado;
	}
	
	public Complejo productoPorEntero(int e) {
		double resultReal, resultImaginario;
		resultReal=this.numeroReal*e;
		resultImaginario=this.numeroImaginario*e;
		Complejo resultado=new Complejo(resultReal, resultImaginario);
		return resultado;
	}
	
	public Complejo productoEntreComplejos(Complejo c) {
		double resultReal, resultImaginario;
		resultReal=this.numeroReal*c.numeroReal-this.numeroImaginario-c.numeroImaginario;
		resultImaginario=this.numeroReal*c.numeroImaginario+this.numeroImaginario*c.numeroReal;
		Complejo resultado=new Complejo(resultReal, resultImaginario);
		return resultado;
	}
	
	public Complejo divisionPorEntero(int e) {
		double resultReal, resultImaginario;
		resultReal=this.numeroReal/e;
		resultImaginario=this.numeroImaginario/e;
		Complejo resultado=new Complejo(resultReal, resultImaginario);
		return resultado;
	}
	
	public Complejo divisionEntreComplejos(Complejo c) {
		double resultReal, resultImaginario;
		resultReal=((this.numeroReal*c.numeroReal)+(this.numeroImaginario*c.numeroImaginario))/(Math.pow(c.numeroReal, 2)+Math.pow(c.numeroImaginario, 2));
		resultImaginario=((this.numeroImaginario*c.numeroReal)-(this.numeroReal*c.numeroImaginario))/(Math.pow(c.numeroReal, 2)+Math.pow(c.numeroImaginario, 2));
		Complejo resultado=new Complejo(resultReal, resultImaginario);
		return resultado;
	}
}

