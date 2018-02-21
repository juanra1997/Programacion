package Ejercicio1;

public class Tragaperras {
private char fig1;
private char fig2;
private char fig3;
private int monedas;

	public Tragaperras() {
		this.monedas=10;
	}
	
	public Tragaperras(int monedas) {
		if(monedas<0) {
			monedas=0;
		}
		this.monedas=monedas;
	}
	public char generaFigura() {
		double x;
		char figura=' ';
		x=Math.random()*5+1;
		if(x>=1&&x<=2) {
			figura='*';
		}
		if(x>=2&&x<=3) {
			figura='@';
		}
		if(x>=3&&x<=4) {
			figura='#';
		}
		if(x>=4&&x<=5) {
			figura='$';
		}
		if(x>=5&&x<=6) {
			figura='&';
		}
		return figura;
	}
	
	public void setMonedas(int monedas) {
		this.monedas=monedas;
	}
	
	public void setFig1() {
		this.fig1=generaFigura();
	}
	
	public void setFig2() {
		this.fig2=generaFigura();
	}

	public void setFig3() {
		this.fig3=generaFigura();
	}
	
	public int getMonedas() {
		return this.monedas;
	}
	
	public char getFig1() {
		return this.fig1;
	}
	
	public char getFig2() {
		return this.fig2;
	}
	
	public char getFig3() {
		return this.fig3;
	}
	
	public String toStringFiguras() {
		String mss="Las figuras son "+fig1+" "+fig2+" "+fig3;
		return mss;
	}
	
	public void apuesta() {
		Tragaperras figx=new Tragaperras();
		this.fig1=figx.generaFigura();
		this.fig2=figx.generaFigura();
		this.fig3=figx.generaFigura();
		if(this.monedas>0) {
			if(this.fig1!=this.fig2&&this.fig2!=this.fig3&&this.fig1!=this.fig3) {
				System.out.println("¡LO SIENTO HA PERDIDO SU MONEDA! "+this.fig1+" "+this.fig2+" "+this.fig3);
				this.monedas=this.monedas-1;
			}
			if(this.fig1==this.fig2&&this.fig1!=this.fig3||this.fig2==this.fig3&&this.fig2!=this.fig1||this.fig1==this.fig3&&this.fig1!=this.fig2) {
				System.out.println("¡¡¡BIEN!!! RECUPERAS TU MONEDA "+this.fig1+" "+this.fig2+" "+this.fig3);
			}
			if(this.fig1==this.fig2&&this.fig2==this.fig3) {
				System.out.println("¡¡¡ENHORABUENA!!! HA GANADO 10 MONEDAS "+this.fig1+" "+this.fig2+" "+this.fig3);
				this.monedas=this.monedas+10;
			}
		}
		else {
			System.out.println("Introduzca mas monedas, cantidad actual 0");
		}
	}
}