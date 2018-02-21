package EJEMPLOS;
//Declarar en la clase principal 3 objetos hora1 (defecto) hora 2(normal) hora 3(copia usando hora 2). Escribir hora 1 get, Hora 2 cambiar todos los valores, escribir valor hora2 y lo avanzamos 10 segundos escribiendo cada segundo de avance, hora 3 retrocedemos 1 segundo.
public class Hora {
	private int horas;
	private int minutos;
	private int segundos;
	
	//Constructores
	
	public Hora(){ //Por defecto
		this.minutos=0;
		this.horas=13;
		this.segundos=0;
	}
	
	public Hora(int horas,int minutos,int segundos) {//Normal
		this.horas=horas;
		this.minutos=minutos;
		this.segundos=segundos;
	}
	
	public Hora(Hora h) {//Copia
		this.horas=h.horas;
		this.minutos=h.minutos;
		this.segundos=h.segundos;
	}
	
	//To String
	
	public String toString() {
		return horas +":"+ minutos +":"+ segundos;
	}
	
	public String toString2() {
		String shoras = String.valueOf(horas);
		String sminutos = String.valueOf(minutos);
		String ssegundos = String.valueOf(segundos);
		return String.format("%02d",shoras)+":"+String.format("%02d",sminutos)+":"+String.format("%02d",ssegundos);
	}
	
	//Set y Get
	
	public int gethoras() {
		return horas;
	}
	
	public int getminutos() {
		return minutos;
	}
	
	public int getsegundos() {
		return segundos;
	}
	
	public void sethoras(int horas) {
		this.horas=horas;
	}
	
	public void setminutos(int minutos) {
		this.minutos=minutos;
	}
	
	public void setsegundos(int segundos) {
		this.segundos=segundos;
	}
	//Metodos
	
	public boolean validar() {
		boolean valido;
		if (this.horas > 23 || this.horas < 0 || this.minutos > 59 || this.minutos < 0  || this.segundos > 59 || this.segundos < 0)
			valido = false;
		else
			valido = true;
	return valido;
	}
	
	public Hora siguiente(){
		
		segundos = segundos + 1;
		if (segundos == 60){
			segundos=0;
			minutos=minutos + 1;
			if(minutos==60) {
				minutos=0;
				horas=horas+1;
				if (horas ==24)
				horas=0;
			}
		}
		
		Hora horasiguiente = new Hora(horas, minutos, segundos);
		
		return horasiguiente;
	}
	
	public Hora anterior(){
		
		segundos = segundos - 1;
		if (segundos == -1){
			segundos=59;
			minutos=minutos - 1;
			if(minutos==-1) {
				minutos=59;
				horas=horas - 1;
				if (horas == -1)
				horas=23;
			}
		}
		
		Hora horanterior = new Hora(horas, minutos, segundos);
		
		return horanterior;
	}
	
	
}