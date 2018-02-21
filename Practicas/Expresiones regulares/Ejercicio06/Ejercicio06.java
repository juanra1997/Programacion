package Ejercicio06;
import java.util.*;
import java.util.regex.*;
public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Object> persona=new ArrayList<Object>();
		String nombre, apellido, dni, fechaNac, email, fijo, movil;
		//NOMBRE
		System.out.println("Introduce el nombre");
		nombre=sc.next();
		Pattern nombrec=Pattern.compile("[a-zA-Z]+");
		Matcher cuela=nombrec.matcher(nombre);
		if(cuela.matches()) {
			persona.add(nombre);
		}else {
			while(!cuela.matches()) {
				System.out.println("Introduce un nombre valido");
				nombre=sc.next();
				cuela=nombrec.matcher(nombre);
			}
			persona.add(nombre);
		}
		//APELLIDO
		System.out.println("Introduce el apellido");
		apellido=sc.next();
		Pattern apellidoc=Pattern.compile("[a-zA-Z]+");
		Matcher apellidom=apellidoc.matcher(apellido);
		if(apellidom.matches()) {
			persona.add(apellido);
		}else {
			while(!apellidom.matches()) {
				System.out.println("Introduce un apellido valido");
				apellido=sc.next();
				apellidom=apellidoc.matcher(apellido);
			}
			persona.add(apellido);
		}
		//DNI
		System.out.println("Introduce el DNI");
		dni=sc.next();
		Pattern dnic=Pattern.compile("[0-9]{8}[A-HJ-NP-TV-Za-hj-np-tv-z]");
		Matcher dnim=dnic.matcher(dni);
		if(dnim.matches()) {
			persona.add(dni);
		}else {
			while(!dnim.matches()) {
				System.out.println("Introduce un DNI valido");
				dni=sc.next();
				dnim=dnic.matcher(dni);
			}
			persona.add(dni);
		}
		//FECHA 
		System.out.println("Introduce la fecha de nacimiento con formato dd/mm/aaaa");
		fechaNac=sc.next();
		Pattern fechaNacc=Pattern.compile("\\d{1,2}/\\d{1,2}/\\d{4}");
		Matcher fechaNacm=fechaNacc.matcher(fechaNac);
		if(fechaNacm.matches()) {
			persona.add(fechaNac);
		}else {
			while(!fechaNacm.matches()) {
				System.out.println("Introduce una fecha de nacimiento valida");
				fechaNac=sc.next();
				fechaNacm=fechaNacc.matcher(fechaNac);
			}
			persona.add(fechaNac);
		}
		//EMAIL
		System.out.println("Introduce un email");
		email=sc.next();
		Pattern emailc=Pattern.compile("[^@]+@[^@]+\\.[a-zA-Z]{2,}");
		Matcher emailm=emailc.matcher(email);
		if(emailm.matches()) {
			persona.add(email);
		}else {
			while(!emailm.matches()) {
				System.out.println("Introduce un email valido");
				email=sc.next();
				emailm=emailc.matcher(email);
			}
			persona.add(email);
		}
		//FIJO
		System.out.println("Introduce un telefono fijo");
		fijo=sc.next();
		Pattern fijoc=Pattern.compile("^(8|9)\\d{8}");
		Matcher fijom=fijoc.matcher(fijo);
		if(fijom.matches()) {
			persona.add(fijo);
		}else {
			while(!fijom.matches()) {
				System.out.println("Introduce un telefono fijo valido");
				fijo=sc.next();
				fijom=fijoc.matcher(fijo);
			}
			persona.add(fijo);
		}
		//MOVIL
		System.out.println("Introduce un telefono movil");
		movil=sc.next();
		Pattern movilc=Pattern.compile("^(7|6)\\d{8}");
		Matcher movilm=movilc.matcher(movil);
		if(movilm.matches()) {
			persona.add(movil);
		}else {
			while(!movilm.matches()) {
				System.out.println("Introduce un telefono movil valido");
				movil=sc.next();
				movilm=movilc.matcher(movil);
			}
			persona.add(movil);
		}
		System.out.println("Has introducido a esta persona:\nNombre: "+persona.get(0)+"\nApellido: "+persona.get(1)+"\nDNI: "+persona.get(2)+"\nFecha de nacimiento: "+persona.get(3)+"\nEmail: "+persona.get(4)+"\nTelefono fijo: "+persona.get(5)+"\nTelefono movil: "+persona.get(6));
		sc.close();
	}

}