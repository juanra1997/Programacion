package PracticaFicherosDeObjetos;

import java.io.*;


public class LeerEmpleados {

	public static void main(String[] args) {
		try {
			Object lec;
			int cont=1;
			FileInputStream ggwp=new FileInputStream("C:\\Users\\Juanra\\Documents\\Programación\\Ficheros\\Empleados");
			ObjectInputStream objo=new ObjectInputStream(ggwp);
			//BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Juanra\\Documents\\Programación\\Ficheros\\Empleados"));
			System.out.println(objo.readObject());
			lec=objo.readObject();
			String l=lec.toString();
			for(int i=0; i<l.length(); i++) {
				if(l.charAt(i)=='[') {
					System.out.println("Empleado "+cont+":");
					cont++;
				} else if(l.charAt(i)==',') {
					i++;
					System.out.println("\nEmpleado "+cont+":");
					cont++;
				} else if(l.charAt(i)==']'){
				} else {
					System.out.print(l.charAt(i));
				}
			}
			//System.out.println(lec);
			/*int valor=br.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=br.read();
            }
            br.close();*/
			objo.close();
		} catch (IOException e) {
			System.out.println("Algo ha ido mal :(");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Algo ha ido mal :(");
			//e.printStackTrace();
		}
	}
}
