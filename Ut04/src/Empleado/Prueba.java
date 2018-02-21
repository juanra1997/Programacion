package Empleado;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="Juan", apellido="Mellado";
		int edad=47;
		double sueldo=1250;
		Empleado prueba=new Empleado(nombre, apellido, edad, sueldo);
		System.out.println(prueba.getNombre());
		System.out.println(prueba.getApellido());
		System.out.println(prueba.getEdad());
		System.out.println(prueba.getSueldo());
	}

}
