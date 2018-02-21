package Ejercicio03;
import java.util.Scanner;
public class NIF {
	long num;
	char letra;
	private char sacarLetra(){
		if (String.valueOf(num).length()>8||String.valueOf(num).length()<8) {
			System.out.println("Numero no valido");
		} 
		else {
			switch((int)num%23) {
			case 0: this.letra=(char)'T';
				break;
			case 1: this.letra='R';
				break;
			case 2: this.letra='W';
				break;
			case 3: this.letra='A';
				break;
			case 4: this.letra='G';
				break;
			case 5: this.letra='M';
				break;
			case 6: this.letra='Y';
				break;
			case 7: this.letra='F';
				break;
			case 8: this.letra='P';
				break;
			case 9: this.letra='D';
				break;
			case 10: this.letra='X';
				break;
			case 11: this.letra='B';
				break;
			case 12: this.letra='N';
				break;
			case 13: this.letra='J';
				break;
			case 14: this.letra='Z';
				break;
			case 15: this.letra='S';
				break;
			case 16: this.letra='Q';
				break;
			case 17: this.letra='V';
				break;
			case 18: this.letra='H';
				break;
			case 19: this.letra='L';
				break;
			case 20: this.letra='C';
				break;
			case 21: this.letra='K';
				break;
			case 22: this.letra='E';
				break;
			}
		}
		return this.letra;
	}
	
	public NIF() {
		this.num=0;
		this.letra=' ';
	}
	
	public NIF(long numeroDNI) {
		this.num=numeroDNI;
		this.letra=sacarLetra();
	}
	
	public long getNIF() {
		return this.num;
	}
	
	public char getLetra() {
		return this.letra;
	}
	
	public void setNIF(long numeroDNI) {
		this.num=numeroDNI;
		this.letra=sacarLetra();
	}
	
	public void leer() {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el numero de DNI");
		this.num=teclado.nextLong();
		teclado.close();
		this.letra=sacarLetra();
	}
	
	public String toString() {
		String mss;
		mss=this.num+"-"+this.letra;
		return mss;
	}
	
}
