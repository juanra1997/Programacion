package EJEMPLOS;

public class HoraPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont=0;		
		Hora hora1=new Hora();
		Hora hora2=new Hora(22, 00, 00);
		Hora hora3=new Hora(hora2);
		Hora medianoche=new Hora(00, 00, 00);
		System.out.println(hora2.toString());		
		System.out.println("Hora siguiente");		
		hora2.sethoras(21);
		hora2.setminutos(59);
		hora2.setsegundos(59);		
		while (cont<10) {
			System.out.println(hora2);
			hora2.siguiente();
			cont++;
		}
		cont=0;		
		System.out.println("Hora anterior");		
		while(cont<10) {
			System.out.println(hora3);
			hora3.anterior();
			cont++;
		}
		
		System.out.println(hora1.validar());//Es para quitar el error de que no se usa hora1
		System.out.println(medianoche.validar());//Lo mismo
	}

}
