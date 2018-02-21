package Ejercicios;
import java.util.Scanner;
import java.util.ArrayList;
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Character> invertida=new ArrayList<Character>();
		String prueba;
		System.out.println("Escribe la cadena que quieras invertir");
		prueba=sc.nextLine();
		for(int i=0; i<prueba.length(); i++){
			invertida.add(prueba.charAt(i));
		}
		for(int i=invertida.size()-1; i>=0; i--){
			System.out.print(invertida.get(i));
		}
		sc.close();
	}

}
