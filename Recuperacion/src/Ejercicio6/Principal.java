package Ejercicio6;

import java.util.*;

public class Principal {

	public static void main(String[] args) {

		/*ArrayList<Producto> arrp=new ArrayList<Producto>();
		Scanner sc=new Scanner(System.in);
		Principal obj=new Principal();
		int i=0;
		int op;
		try {
		while(i==0) {
			obj.menu();
			op=sc.nextInt();
			switch(op) {
				case 1:
					System.out.println("Introduce el nombre del producto");
					String nom=sc.next();
					System.out.println("Introduce el precio del producto");
					double precio=sc.nextDouble();
					arrp.add(new Producto(nom, precio));
					break;
				case 2:
					System.out.println("Introduce el nombre del producto que quieres buscar");
					String nombre=sc.next();
					for(int x=0; x<arrp.size(); x++) {
						//System.out.println(arrp.get(x).getNombre());
						if(arrp.get(x).getNombre().equals(nombre)) {
							System.out.println("*******************************************");
							System.out.println(arrp.get(x).toString());
							System.out.println("*******************************************");
						}
					}
					break;
				case 3:
					System.out.println("Introduce la posicion que quieres borrar (empieza desde 0)");
					arrp.remove(sc.nextInt());
					break;
				case 4:
					System.out.println("*******************************************");
					for(int x=0; x<arrp.size(); x++) {
						System.out.println(arrp.get(x).toString());
						System.out.println("*******************************************");
					}
					break;
				case 5:
					System.out.println("*******************************************");
					System.out.println(arrp.size());
					System.out.println("*******************************************");
					break;
				case 6:
					for(int v=0; v<arrp.size()-1; v++) {
						int min=v;
						for(int j=v+1; j<arrp.size(); j++) {
							if(arrp.get(j).getPrecio()<arrp.get(min).getPrecio()) {
								min=j;
							}
						}
						if(v!=min) {
							Producto aux=arrp.get(v);
							arrp.set(v, arrp.get(min));
							arrp.set(min, aux);
						}
					}
					break;
				case 7:
					i=1;
					break;
			}
		}
		sc.close();
	}catch(InputMismatchException e) {
		System.out.println("No has introducido los datos correctamente");
		//e.printStackTrace();
	}*/
		Principal obj=new Principal();
		obj.iniciar();
	}
	
	public void menu() {
		System.out.println("1. Añadir nuevo producto\n2. Buscar Producto\n3. Eliminar Producto\n4. Ver lista de productos\n5. Devolver número de productos\n6. Ordenar productos\n7. Salir de la aplicacion");
	}

	public void iniciar() {
		ArrayList<Producto> arrp=new ArrayList<Producto>();
		Scanner sc=new Scanner(System.in);
		Principal obj=new Principal();
		int i=0;
		int op;
		try {
		while(i==0) {
			obj.menu();
			op=sc.nextInt();
			switch(op) {
				case 1:
					System.out.println("Introduce el nombre del producto");
					String nom=sc.next();
					System.out.println("Introduce el precio del producto");
					double precio=sc.nextDouble();
					arrp.add(new Producto(nom, precio));
					break;
				case 2:
					System.out.println("Introduce el nombre del producto que quieres buscar (Distingue entre mayusculas y minusculas)");
					String nombre=sc.next();
					for(int x=0; x<arrp.size(); x++) {
						//System.out.println(arrp.get(x).getNombre());
						if(arrp.get(x).getNombre().equals(nombre)) {
							System.out.println("*******************************************");
							System.out.println(arrp.get(x).toString());
							System.out.println("*******************************************");
						}
					}
					break;
				case 3:
					System.out.println("Introduce la posicion que quieres borrar (empieza desde 0)");
					arrp.remove(sc.nextInt());
					break;
				case 4:
					System.out.println("*******************************************");
					for(int x=0; x<arrp.size(); x++) {
						System.out.println(arrp.get(x).toString());
						System.out.println("*******************************************");
					}
					break;
				case 5:
					System.out.println("*******************************************");
					System.out.println(arrp.size());
					System.out.println("*******************************************");
					break;
				case 6:
					for(int v=0; v<arrp.size()-1; v++) {
						int min=v;
						for(int j=v+1; j<arrp.size(); j++) {
							if(arrp.get(j).getPrecio()<arrp.get(min).getPrecio()) {
								min=j;
							}
						}
						if(v!=min) {
							Producto aux=arrp.get(v);
							arrp.set(v, arrp.get(min));
							arrp.set(min, aux);
						}
					}
					break;
				case 7:
					i=1;
					break;
			}
		}
		sc.close();
	}catch(InputMismatchException e) {
		System.out.println("*******************************************");
		System.out.println("No has introducido los datos correctamente\nQueda todo reseteado");
		System.out.println("*******************************************");
		//e.printStackTrace();
		obj.iniciar();
	}catch(Exception e) {
		System.out.println("*******************************************");
		System.out.println("Algo ha ido mal\nQueda todo reseteado");
		System.out.println("*******************************************");
		obj.iniciar();
	}
	}
}
