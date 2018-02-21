package Pruebas;
import java.util.Scanner;
public class Alumnos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int alumn;
		double sumanot=0, media=0, sumamedia=0;
		System.out.println("Introduce el numero de alumnos");
		alumn=sc.nextInt();
		double arrayalumn[][]=new double[alumn][3];
		if(alumn!=0) {
			for(int i=0;i<arrayalumn.length;i++) {
				System.out.println("Introduce las notas del alumno "+(i+1));
				System.out.println();
				for(int j=0;j<arrayalumn[i].length;j++) {
					System.out.println("Introduce la nota de la "+(j+1)+" evaluacion");
					arrayalumn[i][j]=sc.nextDouble();
				}
				System.out.println();
			}
			for(int i=0;i<arrayalumn.length;i++) {
				for(int j=0;j<arrayalumn[i].length;j++) {
					sumanot=sumanot+arrayalumn[i][j];
				}
			}
			media=sumanot/3/alumn;
			for(int i=0;i<arrayalumn.length;i++) {
				for(int j=0;j<arrayalumn[i].length;j++) {
					System.out.println(arrayalumn[i][j]);
					sumamedia=sumamedia+arrayalumn[i][j];			
				}
				sumamedia=sumamedia/3;
				/*System.out.println("Media "+media);
				System.out.println("Media alumno "+(i+1)+" "+sumamedia);*/
				if(sumamedia>=5) {
					System.out.println("El alumno"+(i+1)+" esta aprobado");
				}
				if(sumamedia>media) {
					System.out.println("El alumno "+(i+1)+" esta por encima de la media");
				}
				sumamedia=0;
			}
				for(int j=0;j<arrayalumn.length;j++) {
					for(int i=0;i<arrayalumn[i].length;j++) {
						sumanot=sumanot+arrayalumn[i][j];
					}
				}
				media=sumanot/3/alumn;
				for(int i=0;i<arrayalumn.length;i++) {
					for(int j=0;j<arrayalumn[i].length;j++) {
						sumamedia=sumamedia+arrayalumn[i][j];			
					}
			}
		}
		System.out.println("Fin");
		sc.close();
	}
}
