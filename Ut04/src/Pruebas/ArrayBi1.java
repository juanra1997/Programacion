package Pruebas;
import java.util.Scanner;
public class ArrayBi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int array1[][]=new int[3][6], array2[]= {0,0,0}, mayor=0, cantidad=0, menor=0, cantidad0=0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<6; j++) {
				System.out.println("Introduzca las ventas del título "+(j+1)+" en la Caseta nº "+(i+1)+":");
				array1[i][j]=sc.nextInt();
				array2[i]=array2[i]+array1[i][j];
			}
		}
		for(int i=0; i<3; i++) {
			if(i==0) {
				mayor=i;
				cantidad=array2[i];
			}
			if(cantidad<array2[i]) {
				mayor=i;
			}
		}
		if(cantidad==array2[0]&&cantidad==array2[1]&&cantidad==array2[2]) {
			System.out.println("Han vendido todas las casetas la misma cantidad de libros");
		}else if(cantidad==array2[0]&&cantidad==array2[1]) {
			System.out.println("La caseta 1 y 2 han vendido la misma cantidad de libros");
		}else if(cantidad==array2[0]&&cantidad==array2[2]) {
			System.out.println("Las casetas 1 y 3 han vendido la misma cantidad de libros");
		}else if(cantidad==array2[1]&&cantidad==array2[2]) {
			System.out.println("Las casetas 2 y 3 han vendido la misma cantidad de libros");
		}else {
			System.out.println("La caseta que mas ejemplares ha vendido es la numero "+(mayor+1));	
		}
		for(int i=0; i<3; i++) {
			System.out.println("En la caseta "+(i+1)+" se han vendido "+array1[i][5]+" ejemplares del libro");
		}
		for(int i=0; i<3; i++) {
			if(i==0) {
				menor=i;
				cantidad0=array1[i][5];
			}
			if(cantidad0>array1[i][5]) {
				menor=i;
			}
		}
		if(cantidad0==array1[0][5]&&cantidad0==array1[1][5]&&cantidad0==array1[2][5]) {
			System.out.println("Han vendido todas las casetas la misma cantidad de este libro");
		}else if(cantidad0==array1[0][5]&&cantidad0==array1[1][5]) {
			System.out.println("La caseta 1 y 2 han vendido la misma cantidad de este libro");
		}else if(cantidad0==array1[0][5]&&cantidad0==array1[2][5]) {
			System.out.println("Las casetas 1 y 3 han vendido la misma cantidad de este libro");
		}else if(cantidad0==array1[1][5]&&cantidad0==array1[2][5]) {
			System.out.println("Las casetas 2 y 3 han vendido la misma cantidad de este libro");
		}else {
			System.out.print("La caseta que menos ejemplares de este libro ha vendido ha sido la caseta "+(menor+1)+" con un total de "+array1[menor][5]+" de ejemplar(es)");	
		}
		/*for(int i=0; i<3; i++) {
			for(int j=0; j<6; j++) {
				System.out.print(array1[i][j]+" ");
			}
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.println(array2[i]);
		}*/
		sc.close();
	}

}
