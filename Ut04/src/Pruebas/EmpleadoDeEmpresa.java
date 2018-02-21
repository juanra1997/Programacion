package Pruebas;
import java.util.ArrayList;
import java.util.Scanner;
public class EmpleadoDeEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DNI(0), NOMBRE(1), APELLIDOS(2), EDAD(3), EMPRESA(A/B)(4)
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<String>> empleados=new ArrayList<ArrayList<String>>();
		@SuppressWarnings("unused")
		int numEmpleados, mayor=0, iMayor, iMenor, menor=99;
		String dni, nomb, apel, edad, empr;
		System.out.println("Introduce el numero de empleados de la empresa");
		numEmpleados=sc.nextInt();
		for(int i=0; i<numEmpleados; i++) {
			empleados.add(new ArrayList<String>());
			//while(cont<5) {
				System.out.println("Introduce el DNI del empleado "+(i+1)+":");
				dni=sc.next();
				empleados.get(i).add(dni);
				System.out.println("Introduce el nombre del empleado "+(i+1)+":");
				nomb=sc.next();
				empleados.get(i).add(nomb);
				System.out.println("Introduce el apellido del empleado "+(i+1)+":");
				apel=sc.next();
				empleados.get(i).add(apel);
				System.out.println("Introduce la edad del empleado "+(i+1)+":");
				edad=sc.next();
				empleados.get(i).add(edad);
				System.out.println("Introduce la empresa del empleado (A/B) "+(i+1)+":");
				empr=sc.next();
				empleados.get(i).add(empr);
				//cont++;			
			//}
		}
		for(int i=0; i<empleados.size(); i++) {
			System.out.println("********************************************************************");
			System.out.println("Empleado "+(i+1));
			for(int j=0; j<empleados.get(i).size(); j++) {
				if(j==0) {
					System.out.print("Dni: ");
				}
				if(j==1) {
					System.out.print("Nombre: ");
				}
				if(j==2) {
					System.out.print("Apellido: ");
				}
				if(j==3) {
					System.out.print("Edad: ");
				}
				if(j==4) {
					System.out.print("Empresa: ");
				}
				System.out.println(empleados.get(i).get(j));
			}
		}
		System.out.println("Empleados de la empresa A");
		for(int i=0; i<empleados.size(); i++) {
			if(empleados.get(i).get(4)=="A") {
				System.out.println("Empleado: "+(i+1));
			}
		}
		System.out.println("Empleados de la empresa B");
		for(int i=0; i<empleados.size(); i++) {
			if(empleados.get(i).get(4)=="B") {
				System.out.println("Empleado: "+(i+1));
			}
		}
		for(int i=0; i<empleados.size(); i++) {
			if(Integer.parseInt(empleados.get(i).get(3))>mayor) {
				iMayor=i;
				mayor=Integer.parseInt(empleados.get(i).get(3));
			}
		}
		System.out.println("El empleado mas mayor es el empleado "+mayor);
		for(int j=0; j<empleados.get(mayor).size(); j++) {
			if(j==0) {
				System.out.print("Dni: ");
			}
			if(j==1) {
				System.out.print("Nombre: ");
			}
			if(j==2) {
				System.out.print("Apellido: ");
			}
			if(j==3) {
				System.out.print("Edad: ");
			}
			if(j==4) {
				System.out.print("Empresa: ");
			}
			System.out.println(empleados.get(mayor).get(j));
		}

		for(int i=0; i<empleados.size(); i++) {
			if(Integer.parseInt(empleados.get(i).get(3))>menor) {
				iMenor=i;
				menor=Integer.parseInt(empleados.get(i).get(3));
			}
		}
		System.out.println("El empleado mas mayor es el empleado "+menor);
		for(int j=0; j<empleados.get(menor).size(); j++) {
			if(j==0) {
				System.out.print("Dni: ");
			}
			if(j==1) {
				System.out.print("Nombre: ");
			}
			if(j==2) {
				System.out.print("Apellido: ");
			}
			if(j==3) {
				System.out.print("Edad: ");
			}
			if(j==4) {
				System.out.print("Empresa: ");
			}
			System.out.println(empleados.get(menor).get(j));
		}
		sc.close();
	}
}
