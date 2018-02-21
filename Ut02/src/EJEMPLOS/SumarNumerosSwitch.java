package EJEMPLOS;
import java.util.Scanner;
public class SumarNumerosSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int suma,num;
		boolean negativos=false;//Interruptor será falso si no se han leido negativos, true en el caso contrario
		suma=0;
		while(!negativos){
			System.out.print("Introduce un valor entero");
			num=teclado.nextInt();
			if(num<0) {
				negativos=true;
			}
				else {suma+=num;
			}
		}
		System.out.println("La suma de los valores introducidos es "+suma);
		teclado.close();

	}
	
}
