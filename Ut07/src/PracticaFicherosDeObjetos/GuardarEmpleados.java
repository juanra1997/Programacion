package PracticaFicherosDeObjetos;

import java.io.*;
import java.util.*;

public class GuardarEmpleados {

	public static void main(String[] args) {
		char resp, categoria;
		int cont, cont0=0;
		String nombre, direccion, nif;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Empleados> array=new ArrayList<Empleados>();
		File f=new File("C:\\Users\\Juanra\\Documents\\Programación\\Ficheros\\Empleados");
		try {
		if(!f.exists()) {
				f.createNewFile();
		}
		System.out.println("¿Quieres crear empleados? (S/N)");
		resp=br.readLine().toUpperCase().charAt(0);
		if(resp=='S') {
			System.out.println("¿Cuantos quieres crear?");
			cont=Integer.parseInt(br.readLine());
			while(cont0<cont) {
				System.out.println("Empleado nº "+(cont0+1));
				System.out.println("Introduce nombre");
				nombre=br.readLine();
				System.out.println("Introduce direccion");
				direccion=br.readLine();
				System.out.println("Introduce NIF");
				nif=br.readLine();
				System.out.println("Introduce categoria");
				categoria=resp=br.readLine().toUpperCase().charAt(0);
				array.add(new Empleados(nombre, direccion, nif, categoria));
				cont0++;
			}
		}
		FileOutputStream ggwp=new FileOutputStream("C:\\Users\\Juanra\\Documents\\Programación\\Ficheros\\Empleados", true);
		ObjectOutputStream objo=new ObjectOutputStream(ggwp);
		//objo.writeObject(new Empleados("Juanra", "Ahm", "23334373e", 'p'));
		objo.writeObject(array);
		objo.close();
		br.close();
		} catch (IOException e) {
			System.out.println("Algo ha ido mal :(");
			//e.printStackTrace();
		}
	}

}