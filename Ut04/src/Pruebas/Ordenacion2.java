package Pruebas;

public class Ordenacion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prueba[]=new int[10], num;//Creamos el array y las variables necesarias
		double aux1;//Creamos las variables necesarias
		System.out.println("Array desordenado");
		for (int i=0; i<prueba.length; i++) {//Le damos valores al array
			aux1=Math.random()*50+1;//Se crean valores reales entre 1 y 50
			num=(int)aux1;//Se convierten a enteros los valores
			prueba[i]=num;//Se guarda el valor en el array
		}
		for (int i=0; i<prueba.length; i++) {
			System.out.print(prueba[i]+" ");
		}
		for (int i=0; i<prueba.length-1; i++) {
			for(int j=i+1; j<prueba.length; j++) {
				if(prueba[i]>prueba[j]) {
					int aux=prueba[j];
					prueba[j]=prueba[i];
					prueba[i]=aux;
				} else {break;}
			}
		}
		System.out.println();
		System.out.println("\nArray ordenado");
		for (int i=0; i<prueba.length; i++) {
			System.out.print(prueba[i]+" ");
		}
	}

}
