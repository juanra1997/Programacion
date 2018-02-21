package EJEMPLOS;

public class prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Racionales rac1=new Racionales(1, 3);
	Racionales rac2=new Racionales(1, 2);
	Racionales rac3=new Racionales();
	System.out.println(rac1.toString());
	System.out.println(rac2.toString());
	System.out.println(rac3.toString());
	System.out.println(rac3.suma(rac1.suma(rac2)));
	}

}
