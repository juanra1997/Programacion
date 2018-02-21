package Empleado2;
import java.util.Vector;
//vector de 5 elementos y crecimiento 5
public class Empleado {
private String nombre, apellido, nif, telefono;
private Especialidad especialidad;
@SuppressWarnings({ "unused", "unchecked", "rawtypes" })
private Vector <String>vEmpleados=new <String>Vector(5, 5); 
//ENUMERATION E ITERATOR

	public Empleado(String nombre, String apellido, String nif, String telefono, Especialidad especialidad) {
		this.nombre=nombre;
		vEmpleados.add(this.nombre);
		this.apellido=apellido;
		vEmpleados.addElement(this.apellido);
		this.nif=nif;
		vEmpleados.add(this.nif);
		this.telefono=telefono;
		vEmpleados.add(this.telefono);
		this.especialidad=especialidad;
		vEmpleados.add(especialidad.toString());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	public String toString() {
		return "Nombre: "+this.nombre+"\nApellido: "+this.apellido+"\nNif: "+this.nif+"\nTelefono: "+this.telefono+"\nEspecialidad: "+this.especialidad;
	}
	
	public String empleadosRegistrados() {
		return "Se han registrado: "+(vEmpleados.capacity()/5)+" empleados";
	}
	
	/*public Vector empleadosProfesion(Especialidad especialidad) {
		if(this.especialidad==especialidad) {
			return this.vEmpleados;
		} else {
		Vector <String>vFin=new <String>Vector(1);
		vFin.add("No hay empleados con ese trabajo");
		return vFin;
		}
	}*/
}
