package Ejercicio1;

public abstract class Complejo implements Operable {
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

	@Override
	public double suma() {
		return this.numeroReal+this.numeroImaginario;
	}

	@Override
	public double resta() {
		if(this.numeroReal>this.numeroImaginario) {
			return this.numeroReal-this.numeroImaginario;
		} else {
			return this.numeroReal-this.numeroImaginario;
		}
	}

	@Override
	public double multiplica() {
		return this.numeroReal*this.numeroImaginario*Operable.constante;
	}
	
}

