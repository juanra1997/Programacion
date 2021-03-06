package Ejercicio04;
import java.util.Scanner;
public class Fecha {
	private int dia;
	private int mes;
	private int anno;
	
	private void valida() {
		if(this.anno<1900||this.anno>2050) {
			System.out.println("A�o incorrecto");
			this.anno=1900;
		}
		if(this.mes<1||this.mes>12) {
			System.out.println("Mes incorrecto");
			this.mes=1;
		}
		if((this.anno%400==0||this.anno%4==0&&this.anno%100!=0)==true&&this.mes==2&&this.dia>29){
			System.out.println("Dia incorrecto");
			this.dia=1;
		}
		if((this.anno%400==0||this.anno%4==0&&this.anno%100!=0)==false&&this.mes==2&&this.dia>28) {
			System.out.println("Dia incorrecto");
			this.dia=1;
		}
		if(this.mes==2||this.mes==4||this.mes==6||this.mes==9||this.mes==11&&this.dia>30) {
			System.out.println("Dia incorrecto");
			this.dia=1;
		}
		if(this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10||this.mes==12&&dia>31) {
			System.out.println("Dia incorrecto");
			this.dia=1;
		}
	}
	
	public Fecha() {
		this.dia=1;
		this.mes=1;
		this.anno=1900;
		valida();
	}
	
	public Fecha(int dia, int mes, int anno) {
		this.dia=dia;
		this.mes=mes;
		this.anno=anno;
	}
	
	public void leer() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce dia (1-31)");
		this.dia=teclado.nextInt();
		System.out.println("Introduce mes (1-12)");
		this.mes=teclado.nextInt();
		System.out.println("Introduce a�o (1900-2050)");
		this.anno=teclado.nextInt();
		teclado.close();
		valida();
	}
	
	public String bisiesto() {
		if (anno%400==0||anno%4==0&&anno%100!=0==true) {
			return "El a�o es bisiesto";
		}
		else {
			return "El a�o no es bisiesto";
		}
	}
	
	public String diasMes(int mes) {
		if (mes<0||mes>12) {
			return "No es un mes valido";
		}
		else if(mes==4||mes==6||mes==9||mes==11) {
			return 30+" dias";
		}
		else if(mes==2&&(anno%400==0||anno%4==0&&anno%100!=0)==true) {
			return 29+" dias";
		}
		else if(mes==2&&(anno%400==0||anno%4==0&&anno%100!=0)==false) {
			return 28+" dias";
		}
		else {
			return 31+" dias";
		}
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public int getAnno() {
		return this.anno;
	}
	
	public void setDia(int dia) {
		this.dia=dia;
	}
	
	public void setMes(int mes) {
		this.mes=mes;
	}
	
	public void setAnno(int anno) {
		this.anno=anno;
	}

	public String corta() {
		String mss;
		mss=this.dia+"-"+this.mes+"-"+this.anno;
		return mss;
	}
	
	public String diasTranscurridos() {
		int sumDias=0, x=1900, m=1, d=1;
		while(x<this.anno) {
			if((anno%400==0||anno%4==0&&anno%100!=0)==true) {
				sumDias=sumDias+366;
			}
			else {
				sumDias=sumDias+365;
			}
			x++;
		}
		while(m<this.mes) {
			if(m==2&&(anno%400==0||anno%4==0&&anno%100!=0)==true) {
				sumDias=sumDias+29;
			}
			if(m==2&&(anno%400==0||anno%4==0&&anno%100!=0)==false) {
				sumDias=sumDias+28;
			}
			if(m==4||m==6||m==9||m==11) {
				sumDias=sumDias+30;
			}
			if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
				sumDias=sumDias+31;
			}
			m++;
		}
		while(d<this.dia) {
			sumDias=sumDias+1;
			d++;
		}
		return "Han transcurrido "+sumDias+" dias desde el 1-1-1900";
	}
	
	public String diaSemana() {
		int y, x, m, d;
		String diaSemana="dia";
		y=anno-(14-this.mes)/12;
		x=y+y/4-y/100+y/400;
		m=this.mes+12*((14-mes)/12)-2;
		d=(this.dia+x+(31*m)/12)%7;
		if (d==1) {
			diaSemana="Domingo";
		}
		if (d==2) {
			diaSemana="Lunes";
		}
		if (d==3) {
			diaSemana="Martes";
		}
		if (d==4) {
			diaSemana="Miercoles";
		}
		if (d==5) {
			diaSemana="Jueves";
		}
		if (d==6) {
			diaSemana="Viernes";
		}
		if (d==0) {
			diaSemana="Sabado";
		}
		return diaSemana;
	}
	
	public String larga() {
		String mss, mes="mes";
		if(this.mes==1) {
			mes="Enero";
		}
		if(this.mes==2) {
			mes="Febrero";
		}
		if(this.mes==3) {
			mes="Marzo";
		}
		if(this.mes==4) {
			mes="Abril";
		}
		if(this.mes==5) {
			mes="Mayo";
		}
		if(this.mes==6) {
			mes="Junio";
		}
		if(this.mes==7) {
			mes="Julio";
		}
		if(this.mes==8) {
			mes="Agosto";
		}
		if(this.mes==9) {
			mes="Septiembre";
		}
		if(this.mes==10) {
			mes="Octubre";
		}
		if(this.mes==11) {
			mes="Noviembre";
		}
		if(this.mes==12) {
			mes="Diciembre";
		}
		
		mss=diaSemana()+" "+this.dia+" de "+mes+" de "+this.anno;
		return mss;
	}
	
	public Fecha fechaTras(long dias) {
		
		while (dias > 0) {
			this.dia++;
			if((this.anno%400==0||this.anno%4==0&&this.anno%100!=0)==true&&this.mes==2&&this.dia>29) {
				this.mes=this.mes+1;
				this.dia=1;
			}
			if((this.anno%400==0||this.anno%4==0&&this.anno%100!=0)==false&&this.mes==2&&this.dia>28) {
				this.mes=this.mes+1;
				this.dia=1;
			}
			if(this.mes==2||this.mes==4||this.mes==6||this.mes==9||this.mes==11&&this.dia>30) {
				this.mes=this.mes+1;
				this.dia=1;
			}
			if(this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10&&dia>31);{
				this.mes=this.mes+1;
				this.dia=1;
			}
			if(this.mes==12&&this.dia>31) {
				this.anno=this.anno+1;
				this.mes=1;
				this.dia=1;
			}
			dias--;
		}
		Fecha fecha = new Fecha(dia, mes, anno);
		return fecha;
	}

	public String diasEntre(Fecha f) {
		int sumDias=0;
		while(f.anno<this.anno) {
			if((anno%400==0||anno%4==0&&anno%100!=0)==true) {
				sumDias=sumDias+366;
			}
			else {
				sumDias=sumDias+365;
			}
			f.anno++;
		}
		while(f.mes<this.mes) {
			if(f.mes==2&&(anno%400==0||anno%4==0&&anno%100!=0)==true) {
				sumDias=sumDias+29;
			}
			if(f.mes==2&&(anno%400==0||anno%4==0&&anno%100!=0)==false) {
				sumDias=sumDias+28;
			}
			if(f.mes==4||f.mes==6||f.mes==9||f.mes==11) {
				sumDias=sumDias+30;
			}
			if(f.mes==1||f.mes==3||f.mes==5||f.mes==7||f.mes==8||f.mes==10||f.mes==12) {
				sumDias=sumDias+31;
			}
			f.mes++;
		}
		while(f.dia<this.dia) {
			sumDias=sumDias+1;
			f.dia++;
		}
		return "Han transcurrido "+sumDias+" dias entre las fechas";
	}
	
	public Fecha diaSiguiente() {
		this.dia=this.dia+1;
		if((this.anno%400==0||this.anno%4==0&&this.anno%100!=0)==true&&this.mes==2&&this.dia>29) {
			this.mes=this.mes+1;
			this.dia=1;
		}
		if((this.anno%400==0||this.anno%4==0&&this.anno%100!=0)==false&&this.mes==2&&this.dia>28) {
			this.mes=this.mes+1;
			this.dia=1;
		}
		if(this.mes==2||this.mes==4||this.mes==6||this.mes==9||this.mes==11&&this.dia>30) {
			this.mes=this.mes+1;
			this.dia=1;
		}
		if(this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10&&dia>31);{
			this.mes=this.mes+1;
			this.dia=1;
		}
		if(this.mes==12&&this.dia>31) {
			this.anno=this.anno+1;
			this.mes=1;
			this.dia=1;
		}
		Fecha fecha=new Fecha(this.dia, this.mes, this.anno);
		return fecha;
	}
	
	public Fecha diaAnterior() {
		this.dia=this.dia-1;
		if((this.anno%400==0||this.anno%4==0&&this.anno%100!=0)==true&&this.mes==3&&this.dia<1) {
			this.mes=this.mes-1;
			this.dia=29;
		}
		if((this.anno%400==0||this.anno%4==0&&this.anno%100!=0)==false&&this.mes==2&&this.dia<1) {
			this.mes=this.mes-1;
			this.dia=28;
		}
		if(this.mes==2||this.mes==4||this.mes==6||this.mes==9||this.mes==11&&this.dia<1) {
			this.mes=this.mes-1;
			this.dia=31;
		}
		if(this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10&&dia<1);{
			this.mes=this.mes-1;
			this.dia=30;
		}
		if(this.mes==12&&this.dia>31) {
			this.anno=this.anno+1;
			this.mes=1;
			this.dia=1;
		}
		Fecha fecha=new Fecha(this.dia, this.mes, this.anno);
		return fecha;
	}
	
	public Fecha copia() {
		Fecha fecha=new Fecha(this.dia, this.mes, this.anno);
		return fecha;
	}
	
	public String igualQue(Fecha f) {
		if(f.dia==this.dia&&f.mes==this.mes&&f.anno==this.anno) {
			return "Las dos fechas son iguales";
		}
		else {
			return "Las dos fechas no son iguales";
		}
	}

	public String menorQue(Fecha f) {
		if(this.anno<f.anno||this.anno==f.anno&&this.mes<f.mes||this.anno==f.anno&&this.mes==f.mes&&this.dia<f.dia) {
			return "La fecha es anterior a la proporcionada";
		}
		else {
			return "La fecha no es anterior a la proporcionada";
		}
	}

	public String mayorQue(Fecha f) {
		if (this.anno>f.anno||this.anno==f.anno&&this.mes>f.mes||this.anno==f.anno&&this.mes==f.mes&&this.dia>f.dia) {
			return "La fecha es posterior a la proporcionada";
		}
		else {
			return "La fecha no es posterior a la proporcionada";
		}
	}
}
