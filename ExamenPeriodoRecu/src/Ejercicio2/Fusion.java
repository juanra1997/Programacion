package Ejercicio2;

import java.io.*;
import java.util.*;

public class Fusion {

	private static ObjectInputStream fs;
	private static ObjectInputStream fs1;
	private static ObjectOutputStream fos;
	private static MiObjectOutputStream fs3;
	private static boolean copiado=false;
	private static boolean cp2=false;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		File f=new File("fusionado.dat");
		String r1, r2;
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("Algo ha salido mal");
			}
		}
		
		System.out.println("Introduce la ruta del primer fichero con su extension");
		r1=sc.next();
		System.out.println("Introduce la ruta del segundo fichero con su extension");
		r2=sc.next();
		try {
			fs = new ObjectInputStream(new FileInputStream(r1));
				
				Inversor leido=new Inversor();
				leido=(Inversor) fs.readObject();
				do {
					try {
						fs1 = new ObjectInputStream(new FileInputStream(r2));
							
							Inversor leido2=new Inversor();
							leido2=(Inversor) fs1.readObject();
							do {
								if(leido.getDNI().equals(leido2.getDNI())) {
									if(f.length()==0) {
										try{
											fos = new ObjectOutputStream(new FileOutputStream(f, true));
											fos.writeObject(new Inversor(leido.getDNI(), leido.getNombre(), leido.getCapital()+leido2.getCapital()));
										} catch (FileNotFoundException e) {
											System.out.println("ERROR: Archivo no encontrado");
										} catch (IOException e) {
											System.out.println("ERROR: Problema en la escritura");
										} finally {
											try {
												fos.close();
												copiado=true;
											} catch (IOException e) {

											}
										}
									}else {
										try{
											fs3 = new MiObjectOutputStream(new FileOutputStream(f, true));
												fs3.writeObject(new Inversor(leido.getDNI(), leido.getNombre(), leido.getCapital()+leido2.getCapital()));
											} catch (FileNotFoundException e) {
												System.out.println("ERROR: Archivo no encontrado");
											} catch (IOException e) {
												System.out.println("ERROR: Problema en la escritura");
											}finally {
												fs3.close();
												copiado=true;
											}
									}
								}
								if(!copiado) {
									if(f.length()==0) {
										try{
											fos = new ObjectOutputStream(new FileOutputStream(f, true));
											Inversor obj1=new Inversor(leido.getDNI(), leido.getNombre(), leido.getCapital()+leido2.getCapital());
											fos.writeObject(obj1);
										} catch (FileNotFoundException e) {
											System.out.println("ERROR: Archivo no encontrado");
										} catch (IOException e) {
											System.out.println("ERROR: Problema en la escritura");
										} finally {
											try {
												fos.close();
												copiado=true;
											} catch (IOException e) {

											}
										}
									}else {
										try{
										fs3 = new MiObjectOutputStream(new FileOutputStream(f, true));
											fs3.writeObject(new Inversor(leido.getDNI(), leido.getNombre(), leido.getCapital()+leido2.getCapital()));
										} catch (FileNotFoundException e) {
											System.out.println("ERROR: Archivo no encontrado");
										} catch (IOException e) {
											System.out.println("ERROR: Problema en la escritura");
										}finally {
											fs3.close();
											copiado=true;
										}
									}
								}
								copiado=false;
								//System.out.println(leido2.toString());
								leido2= (Inversor) fs1.readObject();
							}while(true);
						} catch (EOFException eof){
							//System.out.println("Fin lectura.");
						} catch (ClassNotFoundException e) {
							System.out.println("ERROR: Problema al leer objeto");
						} catch (FileNotFoundException e1) {
							System.out.println("ERROR: Archivo no encontrado");
						} catch (IOException e1) {
							System.out.println("ERROR: Problema en la lectura");
						} finally {
							try {
								fs1.close();
							} catch (IOException e) {

							}
						}
					//System.out.println(leido.toString());
					leido= (Inversor) fs.readObject();
				}while(true);
			} catch (EOFException eof){
				//System.out.println("Fin lectura.");
			} catch (ClassNotFoundException e) {
				System.out.println("ERROR: Problema al leer objeto");
			} catch (FileNotFoundException e1) {
				System.out.println("ERROR: Archivo no encontrado");
			} catch (IOException e1) {
				System.out.println("ERROR: Problema en la lectura");
			} finally {
				try {
					fs.close();
				} catch (IOException e) {

				}
			}

		try {
			
			fs = new ObjectInputStream(new FileInputStream(r2));
				
			Inversor leido=new Inversor();
				leido=(Inversor) fs.readObject();
				do {
					try {
						fs1 = new ObjectInputStream(new FileInputStream(r2));
							
							Inversor leido2=new Inversor();
							leido2=(Inversor) fs1.readObject();
							
							
								if(leido.getDNI().equals(leido2.getDNI())) {
									cp2=true;
								}
							
						} catch (EOFException eof){
							//System.out.println("Fin lectura.");
						} catch (ClassNotFoundException e) {
							System.out.println("ERROR: Problema al leer objeto");
						} catch (FileNotFoundException e1) {
							System.out.println("ERROR: Archivo no encontrado");
						} catch (IOException e1) {
							System.out.println("ERROR: Problema en la lectura");
						} finally {
							try {
								fs1.close();
							} catch (IOException e) {

							}
						}
					if(!cp2) {
						if(f.length()==0) {
							try{
								fos = new ObjectOutputStream(new FileOutputStream(f, true));
								Inversor obj1=new Inversor(leido.getDNI(), leido.getNombre(), leido.getCapital());
								fos.writeObject(obj1);
							} catch (FileNotFoundException e) {
								System.out.println("ERROR: Archivo no encontrado");
							} catch (IOException e) {
								System.out.println("ERROR: Problema en la escritura");
							} finally {
								try {
									fos.close();
									copiado=true;
								} catch (IOException e) {

								}
							}
						}else {
							try{
								fs3 = new MiObjectOutputStream(new FileOutputStream(f, true));
									fs3.writeObject(new Inversor(leido.getDNI(), leido.getNombre(), leido.getCapital()));
								} catch (FileNotFoundException e) {
									System.out.println("ERROR: Archivo no encontrado");
								} catch (IOException e) {
									System.out.println("ERROR: Problema en la escritura");
								}finally {
									fs3.close();
								}
						}
					}
					cp2=true;
					//System.out.println(leido.toString());
					leido= (Inversor) fs.readObject();
				}while(true);
			} catch (EOFException eof){
				//System.out.println("Fin lectura.");
			} catch (ClassNotFoundException e) {
				System.out.println("ERROR: Problema al leer objeto");
			} catch (FileNotFoundException e1) {
				System.out.println("ERROR: Archivo no encontrado");
			} catch (IOException e1) {
				System.out.println("ERROR: Problema en la lectura");
			} finally {
				try {
					fs.close();
				} catch (IOException e) {

				}
			}
		System.out.println("Fusionado");
		sc.close();
	}
}
