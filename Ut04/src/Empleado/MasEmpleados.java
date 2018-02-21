package Empleado;
import java.util.Scanner;
public class MasEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int cont=0, i=0, edadr=0;
		String nombre, apellido;
		double sueldo=0, sumasueldos=0, sueldomayor=0, sueldomenor=3000, edad;
		Empleado array[]=new Empleado[10];
		while(cont<10) {
			System.out.println("Introduce nombre");
			nombre=sc.next();
			System.out.println("Introduce apellido");
			apellido=sc.next();
			while(edadr<18||edadr>65) {
				edad=Math.random()*65+1;
				edadr=(int)edad;
			}
			while(sueldo<1000||sueldo>2000) {
				sueldo=Math.random()*2000+1;
			}
			array[i]=new Empleado(nombre, apellido, edadr, sueldo);
			cont++;
			i++;
			sueldo=0;
			edadr=0;
		}
		System.out.println("****************************************");
		for(i=0;i<array.length;i++) {
			if(array[i].getSueldo()>sueldomayor) {
				sueldomayor=array[i].getSueldo();
			}
			if(array[i].getSueldo()<sueldomenor) {
				sueldomenor=array[i].getSueldo();
			}
			sumasueldos=sumasueldos+array[i].getSueldo();
		}
		for(i=0;i<array.length;i++) {
			if(sueldomayor==array[i].getSueldo()) {
					System.out.println("Este empleado es el que mas cobra\n"+array[i].toString()+"\n****************************************");
			}
		}
		for(i=0;i<array.length;i++) {
			if(sueldomenor==array[i].getSueldo()) {
				System.out.println("Este empleado es el que menos cobra\n"+array[i].toString()+"\n****************************************");
			}
		}
		System.out.println("La media de sueldo de la empresa es: "+sumasueldos/10);
		sc.close();
	}

}
