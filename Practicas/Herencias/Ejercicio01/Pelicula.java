package Ejercicio01;

public class Pelicula extends Multimedia {

	private String actorPrincipal;
	private String actrizPrincipal;
	
	public Pelicula(String titulo, String autor, String formato, int duracion, String actor, String actriz) {
		super(titulo, autor, formato, duracion);
		if(actor==null&&actriz==null) {
			throw new NullPointerException("Los dos actores no pueden ser nulos");
		} else {
			this.actorPrincipal=actor;
			this.actrizPrincipal=actriz;
		}
	}
	
	public Pelicula(String titulo, String autor, String formato, int duracion, String actor) {
		super(titulo, autor, formato, duracion);
		this.actorPrincipal=actor;
		this.actrizPrincipal=null;
	}

	public String getActorPrincipal() {
		return this.actorPrincipal;
	}

	/*public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal=actorPrincipal;
	}*/

	public String getActrizPrincipal() {
		//if(this.actrizPrincipal!=null) {
			return this.actrizPrincipal;
		/*} else {
			return this.actorPrincipal;
		}*/
	}

	/*public void setActrizPrincipal(String actrizPrincipal) {
		//if(this.actrizPrincipal!=null) {
			this.actrizPrincipal=actrizPrincipal;
		/*} else {
			this.actorPrincipal=actrizPrincipal;
		}*/
	//}
	
	public String toString() {
		return super.toString().concat("\nActor: "+this.actorPrincipal+"\nActriz: "+this.actrizPrincipal);
	}
}
