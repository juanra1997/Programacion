package PruebasArrays;

public class Metodos {
	
	//ARRAYS

	public static void ordenarPorComprobacion(int[] prueba) {
		for(int i=0; i<prueba.length-1; i++) {
			int min=i;
			for(int j=i+1; j<prueba.length; j++) {
				if(prueba[j]<prueba[min]) {
					min=j;
				}
			}
			if(i!=min) {
				int aux=prueba[i];
				prueba[i]=prueba[min];
				prueba[min]=aux;
			}
		}
		System.out.println();
		System.out.println("\nArray ordenado");
		for (int i=0; i<prueba.length; i++) {
			System.out.print(prueba[i]+" ");
		}
	}

	public static void ordenarPorCambio(int[] prueba) {

		for (int i=0; i<prueba.length-1; i++) {
			for(int j=i+1; j<prueba.length; j++) {
				if(prueba[i]>prueba[j]) {
					int aux=prueba[j];
					prueba[j]=prueba[i];
					prueba[i]=aux;
				}
			}
		}
	}

	public static void ordenarPorBurbuja(int [] prueba) {
		for(int i=0; i<prueba.length-1; i++) {
			for(int j=i+1; j<prueba.length; j++) {
				if(prueba[i]>prueba[j]) {
					int aux=prueba[i];
					prueba[i]=prueba[j];
					prueba[j]=aux;
				}
			}
		}
	}
	
	public static void burbujamejorado(int[] array) {
		boolean cambio=true;
		int menor;
		for(int i=0;i<array.length-1&&cambio==true; i++) {
			cambio=false;
		}
		for (int j=0;j<array.length;j++) {
			if(array[j]>array[j+1]) {
			menor=array[j+1];
			array[j+1]=array[j];
			array[j]=menor;
			cambio=true;
			}
		}
	}

	public static String buscarEnElArray(int[] prueba, int numeroABuscar) {
		int cont=0;
		boolean encontrado=false;
		while(cont<prueba.length&&encontrado==false) {
			if(prueba[cont]==numeroABuscar) {
				encontrado=true;
			}
			cont++;
		}
		if(encontrado==false) {
			return "No se ha encontrado el numero "+numeroABuscar+" en el array";
		}
		else {
			return "Se ha encontrado el numero "+numeroABuscar+" en el hueco "+cont+" del array";
		}
	}

	public static String buscarEnElArrayLineal(int[] a, int valor) {
		boolean encontrado=false;
		int num=0;
		for(int i=0; i<a.length&&encontrado==false; i++) {
			if(a[i]==valor) {
				encontrado=true;
				num=i;
			}
		}
		if(encontrado==false) {
			return "El numero no se ha encontrado";
		} else {
			return "El numero se ha encontrado en la posicion "+num+" del array";
		}
	}

	public static String buscarEnElArrayLinealOrdenado(int[] a, int valor) {
		boolean encontrado=false;
		int num=0;
		for(int i=0; i<a.length&&a[i]<=valor&&encontrado==false; i++) {
			if(a[i]==valor) {
				encontrado=true;
				num=i;
			}
		}
		if(encontrado==false) {
			return "El numero no se ha encontrado";
		} else {
			return "El numero se ha encontrado en la posicion "+num+" del array";
		}
	}

	public static String busquedaDiatomicaArray(int[] a, int valor) {
		int primero=0, ultimo=a.length-1, centro=0, num=-1;
		boolean encontrado=false;
		while(primero<=ultimo&&encontrado==false) {
			centro=(int)((primero+ultimo)/2);
			if(valor<a[centro]) {
				ultimo=centro-1;
			} else if(valor>a[centro]) {
				primero=centro+1;
			} else {
				num=centro;
				encontrado=true;
			}
		}
		if(num!=-1) {
		return "El valor buscado se encuentra en la posicion "+num+" del array";
		} else {
			return "No se ha encontrado el valor";
		}
	}
	
	//CADENAS

	/*public static String ordenarCaracteresDeMenorAMayor(String a, String b) {
		String menor;
		int cont=0;
		if(a.length()>b.length()) {
			menor=b;
		} else {
			menor=a;
		}
		while(cont<menor.length()) {
		a.compareTo(b);
		cont++;
		}
		return "No errores";
	}*/
	
	public static void Ordenar(String cadena1, String cadena2) {
		if(cadena1.compareTo(cadena2)<0) {
			String aux=cadena1;
			cadena1=cadena2;
			cadena2=aux;
		}
	}
	
	public static String Busqueda(String lectura, char busqueda) {
		int posicion=0;
		boolean encontrado=false;
		for(int i=0; i<lectura.length()&&encontrado==false; i++) {
			if(busqueda==lectura.charAt(i)) {
				posicion=i;
				encontrado=true;
			}
		}
		if(encontrado==false) {
			return "No se ha encontrado el caracter";
		}else {
		return "Se ha encontrado el caracter "+busqueda+" en la posicion "+posicion;
		}
	}
}