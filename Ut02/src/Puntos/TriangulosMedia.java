package Puntos;
import java.util.Scanner;
public class TriangulosMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		Triangulo triangulo1=new Triangulo();
		Triangulo triangulo2=new Triangulo();
		Triangulo triangulo3=new Triangulo();
		Triangulo triangulo4=new Triangulo();
		int cont=1, x1, y1, x2, x3, y2, y3, numtriangulos, numperimetromayor=0, numperimetromenor=0, numareamayor=0, numareamenor=0;
		double perimetromayor=0, perimetromenor=0, areamayor=0, areamenor=0, perimetro, area, sumperimetro=0, sumarea=0;
		System.out.println("Introduce el numero de triangulos a introducir");
		numtriangulos=teclado.nextInt();
		if (numtriangulos!=0) {
			while(cont<=numtriangulos) {
				System.out.println("Introduce las coordenadas del primer vertice del Triangulo");
				System.out.print("x= ");
				x1=teclado.nextInt();
				System.out.print("\ny= ");
				y1=teclado.nextInt();
				Punto punto1=new Punto(x1, y1);
				System.out.println("\nIntroduce las coordenadas del segundo vertice del Triangulo");
				System.out.print("x= ");
				x2=teclado.nextInt();
				System.out.print("\ny= ");
				y2=teclado.nextInt();
				Punto punto2=new Punto(x2, y2);
				System.out.println("\nIntroduce las coordenadas del tercer vertice del Triangulo");
				System.out.print("x= ");
				x3=teclado.nextInt();
				System.out.print("\ny= ");
				y3=teclado.nextInt();
				Punto punto3=new Punto(x3, y3);
				Triangulo triangulo=new Triangulo(punto1, punto2, punto3);
				perimetro=triangulo.perimetro();
				area=triangulo.area();
				if (cont==1) {
					perimetromayor=perimetro;
					numperimetromayor=cont;
					perimetromenor=perimetro;
					numperimetromenor=cont;
					areamayor=area;
					numareamayor=cont;
					areamenor=area;
					numareamenor=cont;
				}
				if (perimetro>perimetromayor) {
					perimetromayor=perimetro;
					numperimetromayor=cont;
					triangulo1=triangulo;
				}
				if (perimetro<perimetromenor) {
					perimetromenor=perimetro;
					numperimetromenor=cont;
					triangulo2=triangulo;
				}
				if (area>areamayor) {
					areamayor=area;
					numareamayor=cont;
					triangulo3=triangulo;
				}
				if (area<areamenor) {
					areamenor=area;
					numareamenor=cont;
					triangulo4=triangulo;
				}
				sumperimetro=sumperimetro+perimetro;
				sumarea=sumarea+area;				
				cont++;
				System.out.println("Triangulo: "+triangulo);
			}
			System.out.println("El mayor perimetro introducido es el del Triantulo "+numperimetromayor+" Triangulo: "+triangulo1);
			System.out.println("El menor perimetro introducido es el del Triantulo "+numperimetromenor+" Triangulo: "+triangulo2);
			System.out.println("La mayor superficie introducida es la del Triantulo "+numareamayor+" Triangulo: "+triangulo3);
			System.out.println("La menor superficie introducida es la del Triantulo "+numareamenor+" Triangulo: "+triangulo4);
			System.out.println("La media de los perimetros introducidos es:"+(sumperimetro/cont));
			System.out.println("La media de las areas introducidas es:"+(sumarea/cont));
		}
		System.out.println("Fin");
		teclado.close();
	}

}
