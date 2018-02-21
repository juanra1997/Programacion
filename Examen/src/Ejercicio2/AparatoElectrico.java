package Ejercicio2;

public class AparatoElectrico {
private int potencia;
private int consumo;
private String aparato;
private Estado estado;
private int potenciatotal;
	public AparatoElectrico() {
		this.aparato="Televisor";
		this.potencia=0;
		this.consumo=0;
		this.estado=Estado.APAGADO;
	}
	
	public AparatoElectrico(String aparato, int potencia, int consumo, Estado estado) {
		this.aparato=aparato;
		this.potencia=potencia;
		this.consumo=consumo;
		this.estado=estado;
		if(this.estado==Estado.ENCENDIDO) {
			this.potenciatotal=this.potenciatotal-this.potencia;
		}
	}
	
	public void setPotenciaTotal(int potencia) {
		this.potenciatotal=potencia;
	}
	
	public int getPotenciaTotal() {
		return this.potenciatotal;
	}
	public void setEstado(Estado estado) {
		this.estado=estado;
		
	}
	
	public Estado getEstado() {
		return this.estado;		
	}
	
	public void setConsumo(int consumo) {
		this.consumo=consumo;
	}
	
	public int getConsumo() {
		return this.consumo;
	}
	
	public void setPotencia(int potencia) {
		this.potencia=potencia;
		if(this.estado==Estado.ENCENDIDO) {
			this.potenciatotal=this.potenciatotal-this.potencia;
		}
	}
	
	public int getPotencia() {
		return this.potencia;
	}
	
	public String toString() {
		String mss;
		mss=this.aparato+" consume "+getConsumo()+", su potencia es "+getPotencia()+" la potencia restante es "+this.potenciatotal;
		return mss;
	}
	
	public String corriente() {
		if(this.potenciatotal<this.potencia) {
			return "Demasiados aparatos conectado, no hay corriente";
		}
		else {
			return "Hay corriente";
		}
	}
}
