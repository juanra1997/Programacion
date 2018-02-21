package Ejercicio04;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha fecha = new Fecha(1, 1, 2018);
		Fecha fecha2 = new Fecha(15, 1, 2002);
		System.out.println(fecha.diaAnterior());
		System.out.println(fecha.bisiesto());
		System.out.println(fecha.corta());
		System.out.println(fecha.diasMes(3));
		System.out.println(fecha.diaSemana());
		System.out.println(fecha.diasEntre(fecha2));
		System.out.println(fecha.diasTranscurridos());
		System.out.println(fecha.fechaTras(45));
		System.out.println(fecha.getAnno());
		System.out.println(fecha.getDia());
		System.out.println(fecha.getMes());
		System.out.println(fecha.igualQue(fecha2));
		System.out.println(fecha.larga());
		System.out.println(fecha.mayorQue(fecha2));
		System.out.println(fecha.menorQue(fecha2));
		fecha.setAnno(1999);
		fecha.setDia(3);
		fecha.setMes(5);
		System.out.println(fecha.diaSiguiente());
		System.out.println(fecha.toString());
		fecha.leer();
	}

}
