package Empleado;
/*import java.util.Scanner;*/
public class Arrays {

	public static void main(String[] args) {
		Empleado prueba=new Empleado("Juan", "Mellado0", 47, 1250);
		System.out.println(prueba.toString());
		// TODO Auto-generated method stub
		/*Scanner teclado=new Scanner(System.in);
		String nombre, apellido;
		int edad;
		double sueldo;
		Empleado empleado[]=new Empleado[3];
		empleado[0]=new Empleado("Pepe", "Garcia", 20, 1000);
		empleado[1]=new Empleado("Manolo", "Perez", 30, 1500);
		empleado[2]=new Empleado("Juan", "Mellado", 40, 2000);
		for(int i=0;i<3;i++) {
			System.out.println("Introduce el nombre del empleado "+(i+1));
			nombre=teclado.next();
			empleado[i]=empleado[i].setNombre(nombre);
			apellido=teclado.next();
			empleado[i]=empleado[i].setApellido(apellido);
			edad=teclado.nextInt();
			empleado[i]=empleado[i].setEdad(edad);
			sueldo=teclado.nextDouble();
			empleado[i]=empleado[i].setSueldo(sueldo);
		}*/
	}

}
