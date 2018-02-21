package Pruebas;
import java.util.*;
public class Ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		ArrayList<ArrayList<String>> ventas=new ArrayList<ArrayList<String>>();
		int contCoches=0;
		int num;
		System.out.println("MENÚ\n1. Introducir coches\n2. Informacion de los coches introducidos\n3. Marca\n4. Menos kilometros que\n5. Mas kilometros\n6. Combustible\n7. Ordenar por kilometros\n8. Salir\n¿Qué desea hacer?");
		num=teclado.nextInt();
		while(num!=8) {
			switch(num) {
			case 1: {
				String matricula, marca, modelo, combustible;
				int km=-1, numIntroducir, contcochesintroduc=0;
				System.out.println("¿Cuantos vehiculos desea introducir?");
				numIntroducir=teclado.nextInt();
				if(numIntroducir>0) {
					while(contcochesintroduc<numIntroducir) {
						ventas.add(new ArrayList<String>());
						if(numIntroducir>1) {
							System.out.println("Coche "+(contcochesintroduc+1));
						}
						System.out.println("Introduce la matricula del coche");
						matricula=teclado.next();
						System.out.println("Introduce la marca del coche");
						marca=teclado.next();
						System.out.println("Introduce el modelo del coche");
						modelo=teclado.next();
						System.out.println("Introduce el tipo de combustible");
						combustible=teclado.next();
						System.out.println("Introduce los kilometros del coche (numero entero)");
						km=teclado.nextInt();
						ventas.get(contCoches).add(matricula);
						ventas.get(contCoches).add(marca);
						ventas.get(contCoches).add(modelo);
						ventas.get(contCoches).add(combustible);
						ventas.get(contCoches).add(String.valueOf(km));
						contcochesintroduc++;
						contCoches++;
						km=-1;
					}
					
				}
				break;
			}
			case 2: {
				for(int i=0; i<ventas.size(); i++) {
					//MATRICULA(0),MARCA(1),MODELO(2),COMBUSTIBLE(3),KMs(4)
					System.out.println("Coche "+(i+1));
					System.out.println("Matricula: "+ventas.get(i).get(0));
					System.out.println("Marca: "+ventas.get(i).get(1));
					System.out.println("Modelo: "+ventas.get(i).get(2));
					System.out.println("Combustible: "+ventas.get(i).get(3));
					System.out.println("Kms: "+ventas.get(i).get(4));
					System.out.println("**********************************************");
				}
				break;
			}
			case 3: {
				String marca0;
				System.out.println("Introduce la marca");
				marca0=teclado.next();
				for(int i=0; i<ventas.size(); i++) {
					//MATRICULA(0),MARCA(1),MODELO(2),COMBUSTIBLE(3),KMs(4)
					if(marca0.equals(ventas.get(i).get(1))) {
						System.out.println("Matricula: "+ventas.get(i).get(0));
						System.out.println("Marca: "+ventas.get(i).get(1));
						System.out.println("Modelo: "+ventas.get(i).get(2));
						System.out.println("Combustible: "+ventas.get(i).get(3));
						System.out.println("Kms: "+ventas.get(i).get(4));
						System.out.println("**********************************************");
					}
				}
				break;
			}
			case 4: {
				int kmlim, contcocheskmlim=0;
				System.out.println("Introduce los kilometros limite (Numero entero)");
				kmlim=teclado.nextInt();
				for(int i=0; i<ventas.size(); i++) {
					//MATRICULA(0),MARCA(1),MODELO(2),COMBUSTIBLE(3),KMs(4)
					if(kmlim>=Integer.parseInt(ventas.get(i).get(4))) {
						System.out.println("Matricula: "+ventas.get(i).get(0));
						System.out.println("Marca: "+ventas.get(i).get(1));
						System.out.println("Modelo: "+ventas.get(i).get(2));
						System.out.println("Combustible: "+ventas.get(i).get(3));
						System.out.println("Kms: "+ventas.get(i).get(4));
						System.out.println("**********************************************");
						contcocheskmlim++;
					}
				}	
				System.out.println("Cantidad de coches: "+contcocheskmlim);
				break;
			}
			case 5: {
				int kmbase=0;
				System.out.println("Estos son los coches que con el mayor numero de kilometros:");
				//System.out.println("Introduce los kilometros base (Numero entero)");
				//kmbase=teclado.nextInt();
				for(int i=0; i<ventas.size(); i++) {
					//MATRICULA(0),MARCA(1),MODELO(2),COMBUSTIBLE(3),KMs(4)
					if(kmbase<Integer.parseInt(ventas.get(i).get(4))) {
						/*System.out.println("Matricula: "+ventas.get(i).get(0));
						System.out.println("Marca: "+ventas.get(i).get(1));
						System.out.println("Modelo: "+ventas.get(i).get(2));
						System.out.println("**********************************************");*/
						kmbase=Integer.parseInt(ventas.get(i).get(4));
					}
				}
				for(int i=0; i<ventas.size(); i++) {
					if(kmbase==Integer.parseInt(ventas.get(i).get(4))) {
						System.out.println("Matricula: "+ventas.get(i).get(0));
						System.out.println("Marca: "+ventas.get(i).get(1));
						System.out.println("Modelo: "+ventas.get(i).get(2));
						System.out.println("Combustible: "+ventas.get(i).get(3));
						System.out.println("Kms: "+ventas.get(i).get(4));
						System.out.println("**********************************************");
					}
				}
				break;
			}
			case 6: {
				String combustible0;
				int cantidadcochescomb=0;
				System.out.println("Introduce el combustible");
				combustible0=teclado.next();
				for(int i=0; i<ventas.size(); i++) {
					//MATRICULA(0),MARCA(1),MODELO(2),COMBUSTIBLE(3),KMs(4)
					if(combustible0.equals(ventas.get(i).get(3))) {
						System.out.println("Matricula: "+ventas.get(i).get(0));
						System.out.println("Marca: "+ventas.get(i).get(1));
						System.out.println("Modelo: "+ventas.get(i).get(2));
						System.out.println("Combustible: "+ventas.get(i).get(3));
						System.out.println("Kms: "+ventas.get(i).get(4));
						System.out.println("**********************************************");
						cantidadcochescomb++;
					}
				}
				System.out.println("Cantidad de coches: "+cantidadcochescomb);
				break;
			}
			case 7: {
				for (int i=0; i<ventas.size()-1; i++) {
					for(int j=i+1; j<ventas.size(); j++) {
						if(Integer.parseInt(ventas.get(i).get(4))>Integer.parseInt(ventas.get(j).get(4))) {
							ArrayList<String> aux=new ArrayList<String>();
							aux.addAll(ventas.get(j));
							ventas.set(j, ventas.get(i));
							ventas.set(i, aux);
						}
					}
				}
				for(int i=0; i<ventas.size(); i++) {
					//MATRICULA(0),MARCA(1),MODELO(2),COMBUSTIBLE(3),KMs(4)
					System.out.println("Coche "+(i+1));
					System.out.println("Matricula: "+ventas.get(i).get(0));
					System.out.println("Marca: "+ventas.get(i).get(1));
					System.out.println("Modelo: "+ventas.get(i).get(2));
					System.out.println("Combustible: "+ventas.get(i).get(3));
					System.out.println("Kms: "+ventas.get(i).get(4));
					System.out.println("**********************************************");
				}
				break;
			}
			}
			System.out.println("¿Qué desea hacer ahora?");
			num=teclado.nextInt();
		}
		teclado.close();
	}
}
