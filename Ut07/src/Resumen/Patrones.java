package Resumen;

import java.io.File;
import java.io.FilenameFilter;

public class Patrones{
	public static void main(String[] args) {
		File directorio=new File("C:\\prueba\\");
		String lista[] = directorio.list(new Filtro()); //METODO LIST CON UN FILTRADO (Clase Filtro)
		for(int i=0;i<lista.length;i++) {
			System.out.println(lista[i]);
		}
	}
}

/**
 * FILTRO PARA FILE
 */
class Filtro implements FilenameFilter{
	/**
	 * CONSTRUCTOR POR DEFECTO
	 */
	public Filtro() {
	}
	
	/**
	 * METODO QUE FILTRA EL RESULTADO DEL METODO LIST DE FILE
	 */
	@Override
	public boolean accept(File dir, String name) {
		File archivo=new File(dir+"\\"+name);
		if (archivo.isDirectory())
			return true;
		else
			return false;
	}
}