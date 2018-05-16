import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input_Stream_Reader {

	public static void main(String[] args) {
		//CREACION DEL FICHERO
		File fichero = new File("C:\\prueba\\PrintStream.txt");
		try {
			if (!fichero.exists())
				fichero.createNewFile();
		} catch (IOException e) {
			System.out.println("Error al crear el fichero");
		}
		
		//LECTURA DEL FICHERO
		try(InputStreamReader fe=new InputStreamReader(new FileInputStream(fichero))){
			String leido="";
			int lector;
			lector = fe.read();
			while (lector != -1) {
				char letra=((char)lector);
				leido+=letra;
				lector = fe.read();
			}
			System.out.println(leido);
		} catch (IOException e) {
			System.out.println("Error de lectura");
		}
				

	}

}
