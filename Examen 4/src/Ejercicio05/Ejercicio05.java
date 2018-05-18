package Ejercicio05;
import java.io.*;
import java.util.*;
//import java.util.stream.Stream;

public class Ejercicio05 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		Ejercicio05 obj=new Ejercicio05();
		String ruta;
		System.out.println("Introduce la ruta del archivo");
		ruta=sc.nextLine();
		if(obj.comprueba(ruta)) {
		obj.menu(ruta);
		}		
		sc.close();
	}

	public void menu(String ruta) {
		//String ruta0=ruta;
		System.out.print("Menú\n1. Numero de lineas del fichero\n2. Numero de cadenas\n3. Numero de números\n4. Suma de numeros\n5. Fin\nSelecciona una opcion: ");
		Scanner sc=new Scanner(System.in);
		int o;
		Ejercicio05 obj=new Ejercicio05();
		try {
			o=sc.nextInt();
			while(o!=5) {
			if(o>0&&o<6) {
				switch(o) {
					case 1:
						System.out.println("***********************");
						obj.numLineas(ruta);
						System.out.println("***********************");
						break;
					case 2:
						System.out.println("***********************");
						obj.numCadenas(ruta);
						System.out.println("***********************");
						break;
					case 3:
						System.out.println("***********************");
						obj.numNumeros(ruta);
						System.out.println("***********************");
						break;
					case 4:
						System.out.println("***********************");
						obj.suma(ruta);
						System.out.println("***********************");
						break;
				}
				System.out.print("Menú\n1. Numero de lineas del fichero\n2. Numero de cadenas\n3. Numero de números\n4. Suma de numeros\n5. Fin\nSelecciona una opcion: ");
				o=sc.nextInt();
			}
			}
		}catch(Exception e) {
			System.out.println("***********************\nNo es una opcion\n***********************");
			obj.menu(ruta);
		}
		sc.close();
	}

	public void numLineas(String ruta) {
		File f=new File(ruta+"\\numeros.txt");
		int cont=0;
		try {
		BufferedReader bf=new BufferedReader(new FileReader(f));
		int valor=bf.read();
		if(valor!=-1) {
			cont=cont+1;
		}
        while(valor!=-1){
            if((char)valor=='\n') {
            	cont=cont+1;
            }
            valor=bf.read();
        }
        System.out.println("Hay un total de "+cont+" lineas");
        bf.close();
	} catch (IOException e) {
		System.out.println("Algo ha ido mal");
	}
	}

	public void numCadenas(String ruta) {
		File f=new File(ruta+"\\numeros.txt");
		int cont=0;
		boolean entrada=false;
		try {
		BufferedReader bf=new BufferedReader(new FileReader(f));
		int valor=bf.read();
        while(valor!=-1){
        	//System.out.println((char)valor);
        	//System.out.println((char)valor!=' '&&(char)valor!='\b'&&(char)valor!='1'&&(char)valor!='2'&&(char)valor!='3'&&(char)valor!='4'&&(char)valor!='5'&&(char)valor!='6'&&(char)valor!='7'&&(char)valor!='8'&&(char)valor!='9'&&(char)valor!='0'&&entrada==false);
        	if(entrada==false&&(char)valor=='a'||(char)valor=='b'||(char)valor=='c'||(char)valor=='d'||(char)valor=='e'||(char)valor=='f'||(char)valor=='g'||(char)valor=='h'||(char)valor=='i'||(char)valor=='j'||(char)valor=='k'||(char)valor=='l'||(char)valor=='m'||(char)valor=='n'||(char)valor=='ñ'||(char)valor=='p'||(char)valor=='o'||(char)valor=='q'||(char)valor=='r'||(char)valor=='s'||(char)valor=='t'||(char)valor=='u'||(char)valor=='v'||(char)valor=='w'||(char)valor=='x'||(char)valor=='y'||(char)valor=='z'||
        			(char)valor=='A'||(char)valor=='B'||(char)valor=='C'||(char)valor=='D'||(char)valor=='E'||(char)valor=='F'||(char)valor=='G'||(char)valor=='I'||(char)valor=='H'||(char)valor=='J'||(char)valor=='K'||(char)valor=='L'||(char)valor=='M'||(char)valor=='N'||(char)valor=='Ñ'||(char)valor=='P'||(char)valor=='O'||(char)valor=='Q'||(char)valor=='R'||(char)valor=='S'||(char)valor=='T'||(char)valor=='U'||(char)valor=='V'||(char)valor=='W'||(char)valor=='X'||(char)valor=='Y'||(char)valor=='Z') {
        		cont=cont+1;
        		entrada=true;
        	}
        	if((char)valor=='\n') {
        		entrada=false;
        	}
            valor=bf.read();
        }
        System.out.println("Hay un total de "+cont+" cadenas");
        bf.close();
	} catch (IOException e) {
		System.out.println("Algo ha ido mal");
	}
	}

	public void numNumeros(String ruta) {
		File f=new File(ruta+"\\numeros.txt");
		int cont=0;
		boolean entrada=false;
		try {
		BufferedReader bf=new BufferedReader(new FileReader(f));
		int valor=bf.read();
        while(valor!=-1){
        	//System.out.println(entrada==false&&(char)valor=='1'||(char)valor=='2'||(char)valor=='3'||(char)valor=='4'||(char)valor=='5'||(char)valor=='6'||(char)valor=='7'||(char)valor=='8'||(char)valor=='9'||(char)valor=='0');
        	if(entrada==false&&((char)valor=='1'||(char)valor=='2'||(char)valor=='3'||(char)valor=='4'||(char)valor=='5'||(char)valor=='6'||(char)valor=='7'||(char)valor=='8'||(char)valor=='9'||(char)valor=='0')) {
        		cont=cont+1;
        		entrada=true;
        	}
        	if((char)valor=='\n') {
        		entrada=false;
        	}
            valor=bf.read();
        }
        System.out.println("Hay un total de "+cont+" numeros");
        bf.close();
	} catch (IOException e) {
		System.out.println("Algo ha ido mal");
	}
	}
	
	public void suma(String ruta) {
		File f=new File(ruta+"\\numeros.txt");
		String num="";
		//System.out.println("Entra");
		int cont=0, suma=0;
		boolean entrada=false, esnumero=false;
		try {
		BufferedReader bf=new BufferedReader(new FileReader(f));
		int valor=bf.read();
        while(valor!=-1){
        	if(entrada==false&&(char)valor=='1'||(char)valor=='2'||(char)valor=='3'||(char)valor=='4'||(char)valor=='5'||(char)valor=='6'||(char)valor=='7'||(char)valor=='8'||(char)valor=='9'||(char)valor=='0') {
        		cont=cont+1;
        		entrada=true;
        		esnumero=true;
        	}
        	if(esnumero==true) {
        		num=num+(char)valor;
        	}
        	if((char)valor=='\n') {
        		entrada=false;
        		esnumero=false;
        		suma=suma+Integer.parseInt(num);
        	}
            valor=bf.read();
        }
        System.out.println("La suma de los numeros es: "+suma);
        bf.close();
	} catch (IOException e) {
		System.out.println("Algo ha ido mal");
	}
	}

	public boolean comprueba(String ruta) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		char comprueba= 'a';
		try {
		File f=new File(ruta+"\\numeros.txt");
		if(!f.exists()) {//Si no existe el archivo lo crea si el usuario lo pide
			System.out.println("El archivo no existe");
			while(comprueba!='S'&&comprueba!='N') {
				System.out.println("¿Quieres crearlo? (S/N)");
				comprueba=br.readLine().toUpperCase().charAt(0);
			}
			if(comprueba=='S') {//Crea el archivo
				f.createNewFile();
				comprueba='a';
				while(comprueba!='S'&&comprueba!='N') {
					System.out.println("¿Quieres escribir algo en el fichero? (S/N)");
					comprueba=br.readLine().toUpperCase().charAt(0);
				}
				if(comprueba=='S') {
					FileWriter fw=new FileWriter(f);
					System.out.println("Escribe");
					fw.write(br.readLine());
					fw.close();
				}else {
					return true;
				}
				
			}else {
				return false;
			}
		}else {
			return true;
		}
		return true;
	}catch(IOException e) {
		System.out.println("Algo ha ido mal");
		return false;
	}
	}
}