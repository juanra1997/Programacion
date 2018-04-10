package Pruebas;
import java.io.*;
//import java.util.*;

public class Texto04 {

	public static void main(String[] args) {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	//Scanner sc=new Scanner(System.in);
	char comprueba='a';
	String fichero, ruta/*="C:\\Users\\Juanra\\Documents\\Programación\\Ficheros\\"*//*, escritura*/;
	boolean existe=true;
	try {//Toma los datos del archivo
		System.out.println("Introduce la ruta");
		ruta=br.readLine();
		ruta=ruta+"\\";
		System.out.println("Introduzca el nombre del fichero sin su extension");
		fichero=br.readLine();
		//fichero=fichero+".txt";
		File f=new File(ruta+fichero+".txt");
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
				f.createNewFile();
				existe=true;
				comprueba='a';
				while(comprueba!='S'&&comprueba!='N') {
					System.out.println("¿Quieres escribir algo en el fichero? (S/N)");
					comprueba=br.readLine().toUpperCase().charAt(0);
				}
				if(comprueba=='S') {
					FileWriter fw=new FileWriter(f);
					System.out.println("Escribe");
					fw.write(br.readLine());
					/*for(int i=0; i<=50;i=i+2) {
						fw.write(i);
					}*/
					fw.close();
				}
				
			}
		}
		if(existe==true) {
			BufferedReader bf=new BufferedReader(new FileReader(f));
			System.out.println("En el archivo pone:");
			//System.out.println(br.read());
			int valor=bf.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=bf.read();
            }
			/*while((bf.readLine())!=null) {
				   System.out.println(bf.readLine());
				}*/
            comprueba='a';
    		while(comprueba!='S'&&comprueba!='N') {
    			System.out.println("\n¿Quieres copiarlo? (S/N)");
    			comprueba=br.readLine().toUpperCase().charAt(0);
    		}
    		//System.out.println("\n");
    		if(comprueba=='S') {
    			BufferedReader bfn=new BufferedReader(new FileReader(f));
    			File fn=new File(ruta+fichero+"_copia.txt");
    			FileWriter fwn=new FileWriter(fn);
    			//System.out.println(bfn.read());
    			valor=bfn.read();
    			while(valor!=-1){
    				//System.out.println((char)valor);
    				fwn.write((char)valor);
                    valor=bfn.read();
                }
    			fwn.close();
    			bfn.close();
    		}
    		bf.close();
		}
		//System.out.println("ruta="+f+"\ncomprueba="+comprueba+"\nExiste="+existe);
	} catch (IOException e) {
		System.out.println("Algo ha ido mal :(");
		//e.printStackTrace();
	}
	}
}
//Nada, una simple prueba