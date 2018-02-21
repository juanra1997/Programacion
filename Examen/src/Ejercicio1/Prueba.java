package Ejercicio1;

public class Prueba {

	public static void main(String[] args) {
		Tragaperras prueba1=new Tragaperras();
		int cont=0;
		if(prueba1.getMonedas()!=0) {
			while(cont<5) {
				prueba1.apuesta();
				cont++;
			}
		}
		else {
			System.out.println("0 monedas, introduce monedas");
		}
		System.out.println("Fin de las 5 tiradas");
		Tragaperras prueba2=new Tragaperras(20);
		int cont0=0, cont2=0, cont3=0, cont4=0;
		while(prueba2.getMonedas()>0) {
			cont4=cont4+1;
			prueba2.apuesta();
			System.out.println(prueba2.getMonedas()+" Monedas restantes");
			if(prueba2.getFig1()!=prueba2.getFig2()&&prueba2.getFig2()!=prueba2.getFig3()&&prueba2.getFig1()!=prueba2.getFig3()) {
				cont0=cont0+1;
			}
			if(prueba2.getFig1()==prueba2.getFig2()&&prueba2.getFig1()!=prueba2.getFig3()||prueba2.getFig2()==prueba2.getFig3()&&prueba2.getFig2()!=prueba2.getFig1()||prueba2.getFig1()==prueba2.getFig3()&&prueba2.getFig1()!=prueba2.getFig2()) {
				cont2=cont2+1;
			}
			if(prueba2.getFig1()==prueba2.getFig2()&&prueba2.getFig2()==prueba2.getFig3()) {
				cont3=cont3+1;
			}
		}
		System.out.println("Fin monedas");
		System.out.println(cont4+" tiradas totales "+cont0+" veces todas diferentes "+cont2+" veces 2 iguales "+cont3+" veces todas iguales");
	}

}
