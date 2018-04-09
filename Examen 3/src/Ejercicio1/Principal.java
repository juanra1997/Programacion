package Ejercicio1;
import java.util.*;
public class Principal {

	public static void main(String[] args) {	//Clase principal que muestra los resultados de llamar a las otras clases

		Scanner sc=new Scanner(System.in);
		ArrayList<Racional> array=new ArrayList<Racional>();
		int num=1, numerador, denominador, cual;
		while(num<7&&num>0) {
			System.out.println("MENU\n1. Añadir fracción.\n2. Metodo suma\n3. Metodo resta\n4. Metodo multiplica\n5. Metodo resto\n6. Ver introducidas\nCualquier otro numero cierra el programa\n¿Qué desea hacer?");
			num=sc.nextInt();
			switch(num) {
			case 1:
				System.out.println("1.Introducir con el metodo por defecto\n2. Introducir solo el numerador\n3. Introducirla manualmente");
				cual=sc.nextInt();
				switch(cual) {
				case 1:
					array.add(new Racional());
					break;
				case 2:
					try {
						System.out.println("Introduce el numerador");
						numerador=sc.nextInt();
						array.add(new Racional(numerador));
					} catch(Exception e) {
						array.add(new Racional());
					}
					break;
				case 3:
					try {
						System.out.println("Introduzca un numerador de tipo entero");
						numerador=sc.nextInt();
						System.out.println("Introduzca un denominador de tipo entero");
						denominador=sc.nextInt();
						array.add(new Racional(numerador, denominador));
					} catch(Exception e) {
						array.add(new Racional());
					}
					break;
				}
				break;
			case 2:
				try {
					System.out.println("Selecciona con qué fracción quieres ver el metodo. (1-"+array.size()+")");
					cual=sc.nextInt();
					System.out.println(array.get(cual-1).suma());
				} catch (Exception e) {
					if(array.size()==0) {
						System.out.println("Numero introducido no valido");
					} else {
						System.out.println("Array vacio");
					}
				}
				break;
			case 3:
				try {
					System.out.println("Selecciona con qué fracción quieres ver el metodo. (1-"+array.size()+")");
					cual=sc.nextInt();
					System.out.println(array.get(cual-1).resta());
				} catch (Exception e) {
					if(array.size()==0) {
						System.out.println("Numero introducido no valido");
					} else {
						System.out.println("Array vacio");
					}
				}
				break;
			case 4:
				try {
					System.out.println("Selecciona con qué fracción quieres ver el metodo. (1-"+array.size()+")");
					cual=sc.nextInt();
					System.out.println(array.get(cual-1).multiplica());
				} catch (Exception e) {
					if(array.size()==0) {
						System.out.println("Numero introducido no valido");
					} else {
						System.out.println("Array vacio");
					}
				}
				break;
			case 5:
				try {
					System.out.println("Selecciona con qué fracción quieres ver el metodo. (1-"+array.size()+")");
					cual=sc.nextInt();
					System.out.println(array.get(cual-1).resto());
				} catch (Exception e) {
					if(array.size()==0) {
						System.out.println("Numero introducido no valido");
					} else {
						System.out.println("Array vacio");
					}
				}
				break;
			case 6:
				for(int i=0; i<array.size(); i++) {
					System.out.println(array.get(i));
					}
					break;
			}
		}
		/*System.out.println(array.size());
		cual=sc.nextInt();
		System.out.println(array.get(cual));
		System.out.println(array.get(cual).suma());*/
		sc.close();
	}
}
