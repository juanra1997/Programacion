import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {

	public static void main(String[] args) {
		//ESCRITURA DEL ARCHIVO
		try (FileReader fs = new FileReader("C:\\prueba\\FileWriter.txt");){
			int lector=fs.read(); 
			while(lector != -1) {
				System.out.print((char)lector);
				lector=fs.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: Archivo no encontrado");
		} catch (IOException e1) {
			System.out.println("Error de escritura");
		}
	}

}
