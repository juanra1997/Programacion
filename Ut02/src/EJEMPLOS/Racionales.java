package EJEMPLOS;

public class Racionales {
	private int numeroSuperior;
	private int numeroInferior;
	
	public Racionales(){ //Por defecto
		this.numeroSuperior=1;
		this.numeroInferior=1;
	}
	
	public Racionales(int numeroSuperior, int numeroInferior) { //Clase
		this.numeroSuperior=numeroSuperior;
		this.numeroInferior=numeroInferior;
	}
	
	public Racionales(Racionales r) { //Copia
		this.numeroSuperior=r.numeroSuperior;
		this.numeroInferior=r.numeroInferior;
	}
	
	public int getnumeroSuperior() {
		return numeroSuperior;
	}
	
	public int getnumeroInferior() {
		return numeroInferior;
	}
	
	public void setnumeroSuperior(int numeroSuperior) {
		this.numeroSuperior=numeroSuperior;
	}
	
	public void setnumerInferior(int numeroInferior) {
		this.numeroInferior=numeroInferior;
	}
	
	
	public String toString() { //toString
		String mss=numeroSuperior +"/"+ numeroInferior;
		return mss;
	}
	
	public Racionales suma(Racionales r) {
		int result1, result2;
		if(this.numeroInferior!=r.numeroInferior) {
			this.numeroSuperior=this.numeroSuperior*r.numeroInferior;
			r.numeroSuperior=r.numeroSuperior*this.numeroInferior;
			r.numeroInferior=r.numeroInferior*this.numeroInferior;
		}
		result1=this.numeroSuperior+r.numeroSuperior;
		result2=r.numeroInferior;
		Racionales racional=new Racionales(result1, result2);
		return racional;
	}
	
	public Racionales resta(Racionales r) {
		int result1, result2;
		if(this.numeroInferior!=r.numeroInferior) {
			this.numeroSuperior=this.numeroSuperior*r.numeroInferior;
			r.numeroSuperior=r.numeroSuperior*this.numeroInferior;
			r.numeroInferior=r.numeroInferior*this.numeroInferior;
		}
		result1=this.numeroSuperior-r.numeroSuperior;
		result2=r.numeroInferior;
		Racionales racional=new Racionales(result1, result2);
		return racional;
	}
	
	public Racionales producto(Racionales r) {
		int result1, result2;
		this.numeroSuperior=this.numeroSuperior*r.numeroInferior;
		result1=r.numeroSuperior*this.numeroSuperior;
		result2=r.numeroInferior*this.numeroInferior;
		Racionales racional=new Racionales(result1, result2);
		return racional;
	}
	
	public Racionales division(Racionales r) {
		int result1, result2;
		this.numeroSuperior=this.numeroSuperior*r.numeroInferior;
		result1=r.numeroInferior*this.numeroSuperior;
		result2=r.numeroSuperior*this.numeroInferior;
		Racionales racional=new Racionales(result1, result2);
		return racional;
	}
	
	/*public Racionales suma(Racionales r) {
		int den=this.numeroInferior, num1=this.numeroSuperior, num2=r.numeroSuperior;
		
	}*/

		// TODO Auto-generated method stub
		/*DECLARAR ATRIBUTOS
		 *CONSTRUCTORES
		 * 	POR DEFECTO
		 * 	CLASE
		 * 	COPIA
		 *SETTER Y GETTER
		 *TO STRING
		 *METODOS PARA OPERACIONES ARITMETICAS
		 *	SUMA
		 *	RESTA
		 *	PRODUCTO
		 *	DIVISION
		 *
		 *--MAIN--
		 *DECLARAR 3 OBJETOS
		 *	RACIONAL1(DEFECTO)
		 *	RACIONAL2(DE CLASE)
		 *	RACIONAL3(DE COPIA)
		 *REALIZAR Y ESCRIBIR:
		 *	RACIONAL1+RACIONAL2
		 *	RACIONAL2+RACIONAL3
		 *	RACIONAL3*RACIONAL1
		 *	RACIONAL1/RACIONAL2
		 *EN CUALQUIER CASO SIMPLIFICAR EL RACIONAL RESULTANTE
		 */
		
	
}
