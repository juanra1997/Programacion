package Ejercicio3;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {

	public static void main(String[] args) {
			ArrayList<ArrayList<String>> alumnos=new ArrayList<ArrayList<String>>();
			@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
			int cont=0, num=1;
			while(num<3&&num>0) {
				sc=new Scanner(System.in);
			System.out.println("MENÚ\n1. Introducir alumnos\n2. Mostrar alumnos\n3. Curso del alumno a seleccionar\n¿Qué desea hacer?");
			num=sc.nextInt();
			switch(num) {
			case 1:
				sc=new Scanner(System.in);
				alumnos.add(new ArrayList<String>());
				String nombre, apellidos, NIF, curso="ask", correo;
				boolean comprobado=false;
				System.out.println("Introduce el nombre");
				nombre=sc.nextLine();
				alumnos.get(cont).add(nombre);
				System.out.println("Introduce los apellidos");
				apellidos=sc.nextLine();
				alumnos.get(cont).add(apellidos);
				System.out.println("Introduce el NIF");
				NIF=sc.nextLine();
				Pattern dnic=Pattern.compile("[0-9]{8}[A-HJ-NP-TV-Za-hj-np-tv-z]");
				Matcher dnim=dnic.matcher(NIF);
				if(!dnim.matches()) {
					while(!dnim.matches()) {
						System.out.println("Introduce un NIF valido");
						NIF=sc.next();
						dnim=dnic.matcher(NIF);
					}
				}
				alumnos.get(cont).add(NIF);
				while(comprobado==false) {
					System.out.println("Introduce el curso (ingles, matematicas, dibujo tecnico, quimica)");
					curso=sc.nextLine();
					if(curso.equals("ingles")||curso.equals("matematicas")||curso.equals("dibujo tecnico")||curso.equals("quimica")) {
						comprobado=true;
					}
				}
				alumnos.get(cont).add(curso);
				System.out.println("Introduce el correo");
				correo=sc.next();
				Pattern emailc=Pattern.compile("[^@]+@[^@]+\\.[a-zA-Z]{2,}");
				Matcher emailm=emailc.matcher(correo);
				if(!emailm.matches()) {
					while(!emailm.matches()) {
						System.out.println("Introduce un correo valido");
						correo=sc.next();
						emailm=emailc.matcher(correo);
					}
				}
				alumnos.get(cont).add(correo);
				cont++;
				break;
			case 2:
				for(int i=0; i<alumnos.size();i++) {
					System.out.println("Alumno "+(i+1)+"\nNombre: "+alumnos.get(i).get(0)+"\nApellidos: "+alumnos.get(i).get(1)+"\nNIF: "+alumnos.get(i).get(2)+"\nCurso: "+alumnos.get(i).get(3)+"\nCorreo electronico: "+alumnos.get(i).get(4)+"\n**********************************************************");
				}
				break;
				//sc.close();
			case 3:
				int numAl;
				System.out.println("Introduce el numero de alumno para ver su curso, recuerda que el primer alumno introducido es el alumno 1");
				numAl=sc.nextInt();
				if(numAl-1>=alumnos.size()) {
					System.out.println("Este alumno no existe");
				} else {
					System.out.println("Curso: "+alumnos.get(numAl-1).get(3));
				}
			}	
		}
	}

}
