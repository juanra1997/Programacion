package Pruebas;
import java.io.*;
//import java.util.*;

public class Texto04 {

	public static void main(String[] args) {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	//Scanner sc=new Scanner(System.in);
	char comprueba='a';
	String fichero, ruta/*="C:\\Users\\Juanra\\Documents\\Programación\\Ficheros\\"*/;
	boolean existe=true;
	try {//Toma los datos del archivo
		System.out.println("Introduce la ruta");
		ruta=br.readLine();
		ruta=ruta+"\\";
		System.out.println("Introduzca el nombre del fichero sin su extension");
		fichero=br.readLine();
		fichero=fichero+".txt";
		File f=new File(ruta+fichero);
		//System.out.println(f.exists());
		//System.out.println(comprueba);
		/*while(comprueba!='S'&&comprueba!='N') {
			System.out.println("¿Existe el archivo? (S/N)");
			comprueba=br.readLine().toUpperCase().charAt(0);*/
		/**********************************************************/
			/*System.out.println(comprueba);
			System.out.println(comprueba!='S');*/
		//}
		/*if(!f.exists()) {
			System.out.println("El archivo no existe");
		}*/
		if(!f.exists()) {//Si no existe el archivo lo crea si el usuario lo pide
			System.out.println("El archivo no existe");
			existe=false;
			//comprueba='a';
			while(comprueba!='S'&&comprueba!='N') {
				System.out.println("¿Quieres crearlo? (S/N)");
				comprueba=br.readLine().toUpperCase().charAt(0);
			}
			if(comprueba=='S') {//Crea el archivo
				DataOutputStream dos=new DataOutputStream(new FileOutputStream(f));
				dos.writeUTF("Fichero creado");
				dos.close();
				existe=true;
			}
		}
		BufferedReader bf=new BufferedReader(new FileReader(fichero));
		if(existe==true) {
			while((bf.readLine())!=null) {
				   System.out.println(bf.readLine());
				}
		}
		bf.close();
		//System.out.println("ruta="+f+"\ncomprueba="+comprueba+"\nExiste="+existe);
	} catch (IOException e) {
		System.out.println("Algo ha ido mal :(");
		e.printStackTrace();
	}
	}
}