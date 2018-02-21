package Alumnos;

public class Alumnos {
private String nombre;
private String apellido;
private String direccion;
private String curso;
private int gradoCurso;
private char regimen;
private char repetir;

public Alumnos() {
	this.nombre=null;
	this.apellido=null;
	this.direccion=null;
	this.curso=null;
	this.gradoCurso=0;
	this.regimen=' ';
	this.repetir=' ';
}

public Alumnos(String nombre, String apellido, String direccion, String curso, int gradoCurso, char regimen, char repetir) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.direccion=direccion;
	this.curso=curso;
	this.gradoCurso=gradoCurso;
	this.regimen=regimen;
	this.repetir=repetir;
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

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getCurso() {
	return curso;
}

public void setCurso(String curso) {
	this.curso = curso;
}

public int getGradoCurso() {
	return gradoCurso;
}

public void setGradoCurso(int gradoCurso) {
	this.gradoCurso = gradoCurso;
}

public char getRegimen() {
	return regimen;
}

public void setRegimen(char regimen) {
	this.regimen = regimen;
}

public char getRepetir() {
	return repetir;
}

public void setRepetir(char repetir) {
	this.repetir = repetir;
}

}
