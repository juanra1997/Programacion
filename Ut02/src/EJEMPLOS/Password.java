package EJEMPLOS;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		char resp;
		int cont=1;
		System.out.println("Introduce cualquier caracter, parará cuando introduzcas una n");
		resp=teclado.next().charAt(0);
		while(resp!='n'){
			System.out.println(cont);
			cont++;
			System.out.println("Introduce cualquier caracter, parará cuando introduzcas una n");
			resp=teclado.next().charAt(0);
		}
	teclado.close();
	}
}
