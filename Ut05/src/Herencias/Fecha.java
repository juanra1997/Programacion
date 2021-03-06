package Herencias;
import java.util.Calendar;
public class Fecha {
	
	private int dia;
	private int mes;
	private int anno;
	
	public Fecha() {
		
	}
	
	public Fecha(int dia, int mes, int anno) {
		this.dia=dia;
		this.mes=mes;
		this.anno=anno;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia=dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes=mes;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno=anno;
	}
	
	public String toString() {
		if(this.dia<10&&this.mes>=10) {
			return "0"+this.dia+"/"+this.mes+"/"+this.anno;
		} else if(this.mes<10&&this.dia>=10) {
			return this.dia+"/0"+this.mes+"/"+this.anno;
		} else if(this.mes<10&&this.dia<10) {
			return "0"+this.dia+"/0"+this.mes+"/"+this.anno;
		} else {
			return this.dia+"/"+this.mes+"/"+this.anno;
			}
	}
	
	public static double tiempo(Fecha alquilado, Fecha devuelto) {
		Calendar alquiler=Calendar.getInstance();
		alquiler.set(alquilado.getAnno(), alquilado.getMes(), alquilado.getDia());
		Calendar devolver=Calendar.getInstance();
		devolver.set(devuelto.getAnno(), devuelto.getMes(), devuelto.getDia());
		long millis=alquiler.getTimeInMillis()-devolver.getTimeInMillis();
		double horas=millis/(3.6*1000000);
		return horas;
	}

}
