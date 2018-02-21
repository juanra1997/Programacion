package Pruebas;
import java.util.Scanner;
public class BusquedaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int prueba[]=new int[10], cont=0, numeroABuscar;
		boolean encontrado=false;
		for (int i=0;i<prueba.length;i++) {
			prueba[i]=(int)(Math.random()*10+1);
		}
		//Busqueda en el array
		System.out.println("Introduce el numero a buscar (entre 1 y 10 sino no encontrara nada)");
		numeroABuscar=sc.nextInt();
		while(cont<prueba.length) {
			if(prueba[cont]==numeroABuscar) {
				System.out.println("Se ha encontrado el numero "+numeroABuscar+" en el hueco "+cont+" del array");
				encontrado=true;
			}
			cont++;
		}
		if(encontrado==false) {
			System.out.println("No se ha encontrado el numero "+numeroABuscar+" en el array");
		}
		System.out.println("\nComprobar que la busca en el array es correcta");
		for (int i=0;i<prueba.length;i++) {
			System.out.print(prueba[i]+" ");
		}
		sc.close();
	}

}
