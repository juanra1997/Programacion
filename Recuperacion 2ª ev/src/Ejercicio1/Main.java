package Ejercicio1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		int empleados, cont, contventas=0/*, posicion=0*/;
		double venta, importetotal=0, totalcomisiones=0/*, comision*/;
		ArrayList<Double> arrventas=new ArrayList<Double>();
		String nombre, mes/*, comisions*/;
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Cuántos empleados son en total?");
		empleados=sc.nextInt();
		//sc=new Scanner(System.in);
		String[] arrempleados=new String[empleados];
		int[] arrventasempleados=new int[empleados];
		int[] meses=new int[12];
		for(int i=0; i<empleados; i++) {
			System.out.println("Introduce el nombre del empleado "+(i+1));
			nombre=sc.next();
			//sc=new Scanner(System.in);
			arrempleados[i]=nombre;
			for(int j=0; j<12; j++) {
				if(j==0) {
					mes="Enero";
				} else if(j==11) {
					mes="Diciembre";
				} else if(j==2) {
					mes="Marzo";
				} else if(j==1) {
					mes="Febrero";
				} else if(j==3) {
					mes="Abril";
				} else if(j==4) {
					mes="Mayo";
				} else if(j==5) {
					mes="Junio";
				} else if(j==6) {
					mes="Julio";
				} else if(j==7) {
					mes="Agosto";
				} else if(j==8) {
					mes="Septiembre";
				} else if(j==9) {
					mes="Octubre";
				} else {
					mes="Noviembre";
				}
				System.out.println("Introduce las ventas de "+nombre+" en "+mes);
				cont=sc.nextInt();
				if(j==0) {
					meses[j]=cont;	
				} else {
					meses[j]=meses[j]+cont;
				}
				contventas=contventas+cont;
				for(int x=0; x<cont; x++) {
					if(x==0) {
						arrventas.add((double)0);
					}
					System.out.println("Introduce el precio de la venta "+(x+1));
					venta=sc.nextDouble();
					arrventas.set(i, arrventas.get(i)+venta);
				}
			}
			//sc.close();
			//sc=new Scanner(System.in);
			arrventasempleados[i]=contventas;
			contventas=0;
		}
		for(int i=0; i<arrventas.size(); i++) {
			importetotal=importetotal+arrventas.get(i);
		}
		for(int i=0; i<arrventas.size(); i++) {
			totalcomisiones=totalcomisiones+arrventas.get(i)*0.1;
		}
		sc.close();
		for(int i=0; i<arrempleados.length; i++) {
			/*comision=arrventas.get(i)*0.1;
			comisions=Double.toString(comision);
			for(int j=0; j<comisions.length(); j++) {
				if(comisions.substring(i)==".") {
					posicion=i;
				}
			}
			comisions=comisions.substring(0, i+3);
			comision=Double.parseDouble(comisions);*/
			sc.close();
			System.out.println("El empleado "+arrempleados[i]+" ha realizado "+arrventasempleados[i]+" ventas este año y se lleva una comision de "+arrventas.get(i)*0.1+"€");
			//System.out.println(arrventas.get(i));
		}	
		System.out.println("El importe total de las ventas es de "+importetotal+"€");
		System.out.println("El total a pagar por las comisiones es de "+totalcomisiones+"€");
		for(int j=0; j<12; j++) {
			if(j==0) {
				mes="Enero";
			} else if(j==11) {
				mes="Diciembre";
			} else if(j==2) {
				mes="Marzo";
			} else if(j==1) {
				mes="Febrero";
			} else if(j==3) {
				mes="Abril";
			} else if(j==4) {
				mes="Mayo";
			} else if(j==5) {
				mes="Junio";
			} else if(j==6) {
				mes="Julio";
			} else if(j==7) {
				mes="Agosto";
			} else if(j==8) {
				mes="Septiembre";
			} else if(j==9) {
				mes="Octubre";
			} else {
				mes="Noviembre";
			}
			System.out.println("En el mes de "+mes+" se han realizdo un total de "+meses[j]+" ventas");
		}
	}
}
