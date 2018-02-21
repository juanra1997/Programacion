package Pruebas;

public class Externa {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] array={1,2,3};
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}*/
	
	/*public class A() {
		
	}*/
	int datoExterno=5;
	
	class Interna{
		int datoInterno=10;
		
		void method() {
			System.out.println("DESDE LA CLASE EXTERNA: "+datoExterno);
			System.out.println("DESDE LA CLASE INTERNA: "+datoInterno);
		}
	}
	
	public static void main(String[] args) {
		Externa ce=new Externa();
		Interna ci=ce.new Interna();
		System.out.println("DESDE LA CLASE EXTERNA: "+ce.datoExterno);
		System.out.println("DESDE LA CLASE INTERNA: "+ci.datoInterno);
		ci.method();
	}

}

