package Ejercicio01;

public class App {

	public static void main(String[] args) {
		/*try {
			Pelicula prueba=new Pelicula("Prueba", "Juanra","avi",1.0, "Mario", null);
			System.out.println(prueba.toString());
			System.out.println(prueba.equals());
		} catch(NullPointerException n) {
			System.out.println("Los dos actores no pueden ser nulos");
		}*/
		ListaMultimedia prueba1=new ListaMultimedia(10);
		prueba1.add(new Pelicula("Million Dollar Baby", "Clint Eastwood","avi", 133, null, "Hilary Swank"));
		prueba1.add(new Pelicula("War Horse", "Steven Spielberg", "avi",146, "Jeremy Irvine", null));
		prueba1.add(new Pelicula("Intocable", "Olivier Nakache", "avi", 113, "François Cluzet", null));
		System.out.println(prueba1.toString());
	}

}
