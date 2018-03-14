package Herencias;

public class ElectrodomesticoMain {

	public static void main(String[] args) {

		Electrodomestico[] Electrodomesticos=new Electrodomestico[10];
		Television TV1=new Television();
		Television TV2=new Television(100, 5);
		Television TV3=new Television(600, "NEGRO", 'A', 10, 50, true);
		Television TV4=new Television(600, "GRIS", 'B', 10, 20, false);
		Electrodomestico E5=new Electrodomestico(300, "ROJO", 'A', 15);
		Electrodomestico E6=new Electrodomestico();
		Electrodomestico E7=new Electrodomestico(300, 20);
		Lavadora L8=new Lavadora(150, 70);
		Lavadora L9=new Lavadora();
		Lavadora L10=new Lavadora(200, "AZUL", 'D', 75, 9);
		Electrodomesticos[0]=TV1; 
		Electrodomesticos[1]=TV2;
		Electrodomesticos[2]=TV3;
		Electrodomesticos[3]=TV4;
		Electrodomesticos[4]=E5;
		Electrodomesticos[5]=E6;
		Electrodomesticos[6]=E7;
		Electrodomesticos[7]=L8;
		Electrodomesticos[8]=L9;
		Electrodomesticos[9]=L10;
		for(int i=0; i<10; i++) {
			System.out.println("Electrodomestico "+(i+1)+": "+Electrodomesticos[i].precioFinal());
		}
	}

}
