import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_Writer {

	public static void main(String[] args) {
		//ESCRITURA DEL ARCHIVO
		try (PrintWriter fs = new PrintWriter("C:\\prueba\\PrintWriter.txt");){
			fs.write("Texto de prueba, ");
			fs.println("SegundoTexto");
		} catch (FileNotFoundException e) {
			System.out.println("Error: Archivo no encontrado");
		}
		
	}

}
