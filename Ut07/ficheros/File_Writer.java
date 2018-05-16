import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) {
		//ESCRITURA DEL ARCHIVO
		try (FileWriter fs = new FileWriter("C:\\prueba\\FileWriter.txt");){
			fs.write("Texto de prueba con FileWriter");
		} catch (FileNotFoundException e) {
			System.out.println("Error: Archivo no encontrado");
		} catch (IOException e1) {
			System.out.println("Error de escritura");
		}
	}

}
