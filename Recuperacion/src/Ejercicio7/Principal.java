package Ejercicio7;

import java.io.*;
//import java.util.*;


public class Principal {

	public static void main(String[] args) {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//ArrayList<Cliente> arr=new ArrayList<Cliente>();
		Cliente c1=new Cliente("23334373C", "Pepe", 'M', "667005502", "Avenida Juan Carlos 1", 100);
		Cliente c2=new Cliente("23334373D", "Pep", 'M', "667005503", "Avenida Juan Carlos 2", 200);
		/*arr.add(c1);
		arr.add(c2);*/
		File f=new File("Clientes");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Algo ha ido mal");
			}
		}
		try(ObjectOutputStream fs = new ObjectOutputStream(new FileOutputStream(f))){
			fs.writeObject(c1);
			fs.writeObject(c2);
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: Archivo no encontrado");
		} catch (IOException e) {
			System.out.println("ERROR: Problema en la escritura");
		}
	//	Principal obj=new Principal();
	//	obj.menu(f);
	}
	
	/*public void menu(File f) {
		int x=0;
		int op;
		//Scanner sc=new Scanner(System.in);
	//	try {
			
			//while(x==0) {
		//		System.out.println("1. Listar clientes\n2. Buscar clientes (Distingue entre mayusculas y minusculas)\n3. Borrar cliente\n4. Borrar Fichero de clientes completamente\n5. Tratamiento de datos\n6. Salir de la aplicacion");
				//op=sc.nextInt();
				//	switch(op) {
				/*		case 1:
							try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream(f))){
								
								Cliente leido=new Cliente();
								leido=(Cliente) fs.readObject();
								System.out.println("***************************");
								do {
									System.out.println(leido.toString());
									leido= (Cliente) fs.readObject();
									System.out.println("***************************");
								}while(true);
							} catch (EOFException eof){
								System.out.println("***************************");
							} catch (ClassNotFoundException e) {
								System.out.println("ERROR: Problema al leer objeto");
							} catch (FileNotFoundException e1) {
								System.out.println("ERROR: Archivo no encontrado");
							} catch (IOException e1) {
								System.out.println("ERROR: Problema en la lectura");
							}
							break;
						case 2:
							try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream(f))){
								
								Cliente leido=new Cliente();
								leido=(Cliente) fs.readObject();
								System.out.println("Escribe el NIF");
						//		String nifb=sc.next();
								do {
							//		if(leido.getNIF().equals(nifb)) {
										System.out.println("***************************");
										System.out.println(leido.toString());
							//		}
									
									leido= (Cliente) fs.readObject();
									//System.out.println("***************************");
								}while(true);
							} catch (EOFException eof){
								System.out.println("***************************");
							} catch (ClassNotFoundException e) {
								System.out.println("ERROR: Problema al leer objeto");
							} catch (FileNotFoundException e1) {
								System.out.println("ERROR: Archivo no encontrado");
							} catch (IOException e1) {
								System.out.println("ERROR: Problema en la lectura");
							}
							break;
						case 3:
							try(ObjectInputStream fs = new ObjectInputStream(new FileInputStream(f))){
								//ObjectOutputStream fo = new ObjectOutputStream(new FileOutputStream(f));
								Cliente leido=new Cliente();
								leido=(Cliente) fs.readObject();
								System.out.println("Escribe el NIF");
							//	String nifb=sc.next();
								do {
							//		if(!leido.getNIF().equals(nifb)) {
										escribir(leido);
							//		}
									
									leido= (Cliente) fs.readObject();
									//System.out.println("***************************");
								}while(true);
							} catch (EOFException eof){
								System.out.println("***************************");
								eof.printStackTrace();
							} catch (ClassNotFoundException e) {
								System.out.println("ERROR: Problema al leer objeto");
							} catch (FileNotFoundException e1) {
								System.out.println("ERROR: Archivo no encontrado");
							} catch (IOException e1) {
								System.out.println("ERROR: Problema en la lectura");
							}finally {
							}
							break;
					}
			}
		}catch(Exception e) {
			
		}*/
//	}

	public void escribir(Cliente obj) {
		try(ObjectOutputStream fs = new ObjectOutputStream(new FileOutputStream("Clientes.txt"))){
			fs.writeObject(obj);
		} catch (EOFException eof){
			System.out.println("***************************");
		}catch (FileNotFoundException e) {
			System.out.println("ERROR: Archivo no encontrado");
		} catch (IOException e) {
			System.out.println("ERROR: Problema en la escritura");
		}
	}
	
	public void crearFichero() {
	}
}
