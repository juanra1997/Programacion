package Ejercicio02;
import java.util.*;
public class Asignatura {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numIntroducir, contAlumnosIntroduc=0, contAlumnos=0, num;
		Vector<Vector<String>> asignatura=new Vector<Vector<String>>();
		System.out.println("MENÚ\n1. Introducir alumnos\n2. Mostrar alumnos\n3. Mostrar alumnos en semipresencial\n4. Ordenar por nota de mayor a menor\n5. Ordenar por nota de menor a mayor\n6. Salir\n¿Qué desea hacer?");
		num=teclado.nextInt();
		while(num!=6) {
			switch(num) {
			case 1: {
				System.out.println("¿Cuantos alumnos desea introducir?");
				numIntroducir=teclado.nextInt();
				String nombre, apellido, dni, sexo, condicion, notaFinal;
				//nombre(0) y apellido(1), el DNI(3), el sexo(4), condición(5) (Presencial o semipresencial) y la notafinal(6).
				if(numIntroducir>0) {
					while(contAlumnosIntroduc<numIntroducir) {
						asignatura.add(new Vector<String>());
						if(numIntroducir>1) {
							System.out.println("Alumno "+(contAlumnosIntroduc+1));
						}
						System.out.println("Introduce el nombre del alumno");
						nombre=teclado.next();
						System.out.println("Introduce el apellido del alumno");
						apellido=teclado.next();
						System.out.println("Introduce el DNI del alumno");
						dni=teclado.next();
						System.out.println("Introduce el sexo del alumno");
						sexo=teclado.next();
					System.out.println("Introduce la condicion del alumno");
					condicion=teclado.next();
					System.out.println("Introduce la nota final del alumno");
					notaFinal=teclado.next();
					asignatura.get(contAlumnos).add(nombre);
					asignatura.get(contAlumnos).add(apellido);
					asignatura.get(contAlumnos).add(dni);
					asignatura.get(contAlumnos).add(sexo);
					asignatura.get(contAlumnos).add(condicion);
					asignatura.get(contAlumnos).addElement(notaFinal);
					contAlumnosIntroduc++;
					contAlumnos++;
					}
			
				}
				break;
			}
			case 2: {
				for(int i=0; i<asignatura.size(); i++) {
					System.out.println("Nombre: "+asignatura.get(i).get(0)+"\nApellido: "+asignatura.get(i).get(1)+"\nDni: "+asignatura.get(i).get(2)+"\nSexo: "+asignatura.get(i).get(3)+"\nCondicion: "+asignatura.get(i).get(4)+"\nNota Final: "+asignatura.get(i).get(5));
				}
			}
			case 3: {
//nombre(0) y apellido(1), el DNI(2), el sexo(3), condición(4) (Presencial o semipresencial) y la notafinal(5).

				for(int i=0; i<asignatura.size(); i++) {
					if(asignatura.get(i).get(4)=="s"||asignatura.get(i).get(4)=="semipresencial") {
						System.out.println("Alumno "+(i+1));
						System.out.println("Nombre: "+asignatura.get(i).get(0)+"\nApellido: "+asignatura.get(i).get(1)+"\nDni: "+asignatura.get(i).get(2)+"\nSexo: "+asignatura.get(i).get(3)+"\nCondicion: "+asignatura.get(i).get(4)+"\nNota Final: "+asignatura.get(i).get(5));
					}
				}
				break;
			}
			case 4:{
//nombre(0) y apellido(1), el DNI(2), el sexo(3), condición(4) (Presencial o semipresencial) y la notafinal(5).
				for (int i=0; i<asignatura.size()-1; i++) {
					for(int j=i+1; j<asignatura.size(); j++) {
						if(Double.parseDouble(asignatura.get(i).get(5))>Double.parseDouble(asignatura.get(j).get(5))) {
							Vector<String> aux=new Vector<String>();
							aux.addAll(asignatura.get(j));
							asignatura.set(j, asignatura.get(i));
							asignatura.set(i, aux);
						}
					}
				}
				for(int i=0; i<asignatura.size(); i++) {
					System.out.println("Alumno "+(i+1));
					System.out.println("Nombre: "+asignatura.get(i).get(0)+"\nApellido: "+asignatura.get(i).get(1)+"\nDni: "+asignatura.get(i).get(2)+"\nSexo: "+asignatura.get(i).get(3)+"\nCondicion: "+asignatura.get(i).get(4)+"\nNota Final: "+asignatura.get(i).get(5));
				}
				break;
			}
			case 5: {
				//nombre(0) y apellido(1), el DNI(2), el sexo(3), condición(4) (Presencial o semipresencial) y la notafinal(5).
								for (int i=0; i<asignatura.size()-1; i++) {
									for(int j=i+1; j<asignatura.size(); j++) {
										if(Double.parseDouble(asignatura.get(i).get(5))<Double.parseDouble(asignatura.get(j).get(5))) {
											Vector<String> aux=new Vector<String>();
											aux.addAll(asignatura.get(j));
											asignatura.set(j, asignatura.get(i));
											asignatura.set(i, aux);
										}
									}
								}
								for(int i=0; i<asignatura.size(); i++) {
									System.out.println("Alumno "+(i+1));
									System.out.println("Nombre: "+asignatura.get(i).get(0)+"\nApellido: "+asignatura.get(i).get(1)+"\nDni: "+asignatura.get(i).get(2)+"\nSexo: "+asignatura.get(i).get(3)+"\nCondicion: "+asignatura.get(i).get(4)+"\nNota Final: "+asignatura.get(i).get(5));
								}
								break;
							}
					}
		teclado.close();
		}
	}
}
