package Pruebas;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FicheroBinarioMas {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean respuesta=true;
		String nombre=null;
		int edad=-1;
		int anyo=-1;
		try(DataOutputStream dos=new DataOutputStream(new FileOutputStream("C:\\Users\\Juanra\\Desktop\\prueba.ddr",true))){
			while(respuesta==true) {
				//leer edad,nombre y año de nacimiento
				do{
					try {
						System.out.println("Introduce tu edad:");
						edad = Integer.parseInt(br.readLine());
					}catch(Exception e) {
						System.out.println("No es un valor válido, repitelo");
					}
				}while(edad<0);
				System.out.println("Introduce tu nombre");
				nombre = br.readLine();
				do{
					try {
						System.out.println("Introduce tu año de nacimiento:");
						anyo = Integer.parseInt(br.readLine());
					}catch(Exception e) {
						System.out.println("No es un valor válido, repitelo");
					}
				}while(anyo<0);
				//escribimos os datos en el fichero
				dos.writeInt(edad);
				dos.writeUTF(nombre);
				dos.writeInt(anyo);
				//queremos seguir??
				System.out.println("Quiere introducir mas dato? (si es así pulse S, cualuier valor para no");
				if(br.readLine().toLowerCase().charAt(0)!='s')
					respuesta=false;
			}
		}catch(IOException e){
			System.out.println("Error E/S");
		}
		try(DataInputStream dis=new DataInputStream(new FileInputStream("D:\\fich_binario.ddr"));){
			while(true) {
				System.out.println(dis.readInt());
				System.out.println(dis.readUTF());
				System.out.println(dis.readInt());
			}
		}catch(IOException e){
			System.out.println("");
		}
	}
}