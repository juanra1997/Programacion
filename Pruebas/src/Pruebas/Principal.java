package Pruebas;

public class Principal /*Presona*/{
	
	public static void main (String []args) {
		Empleado e=new Empleado("Luis", "Calle Cita 12", 21, "Administrador");
		System.out.println(e.toString());
		Cliente c=new Cliente("Carmen", "Calle otra 121", 22, 500.0);
		System.out.println(c.toString());
		Persona[] persona=new Persona[3];
		persona[0]=new Empleado("Ana", "Calle del pez 12",25, "Jefe-RRHH");
		persona[1]=new Cliente("Eva", "Calle nueva 12", 30, 1000);
		persona[2]=new Empleado("Jose", "Calle vieja 45", 35, "Administrativo");
		for(Persona p: persona)
			System.out.println(p.toString());
	}
}

//Nombre direccion y edad

class Persona {
	private String nombre, direccion;
	private int edad;
	
	public Persona() {
		this.nombre=" ";
		this.direccion=" ";
		this.edad=0;
	}

	public Persona(String nombre, String direccion, int edad) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.edad=edad;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
}
	
//Empleado
	
class Empleado extends Persona{
	
	private String oficio;
	
	public Empleado() {
		this.oficio=" ";
	}

	public Empleado(String nombre, String direccion, int edad, String oficio) {
		super(nombre, direccion, edad);
		this.oficio=oficio;
	}
	
	public String getOficio() {
		return this.oficio;
	}
	
	public void setOficio(String oficio) {
		this.oficio=oficio;
	}
}

//Cliente

class Cliente extends Persona {
	
private double pago;
	
	public Cliente() {
		this.pago=0;
	}

	public Cliente(String nombre, String direccion, int edad, double pago) {
		super(nombre, direccion, edad);
		this.pago=pago;
	}
	
	public double getPago() {
		return this.pago;
	}
	
	public void setPago(double pago) {
		this.pago=pago;
	}
}