package Ejercicios;

public class OrdenacionYBusqueda {

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