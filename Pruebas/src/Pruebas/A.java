package Pruebas;

public class A {
	
	int a=10;
	static int b=5;
	//public void metodo() {
		//final int x=0;
		static class B{
			//void otroMetodo() {
			B(){
				A s=new A();
				//System.out.println(a);
				System.out.println(s.a);
				System.out.println(b);
				//System.out.println(x);
			}
		}
		
		/*B in=new B();
		in.otroMetodo();*/
	//}
	
	public static void main(String argh[]) {
		//A.B ab=new A.B();
	}
	
	/*public A() {
		B ab=new B();
		ab.metodo();
		
		A.B ac=new A.B();
		ac.metodo();
	}
	
	class B{
		void metodo() {
			System.out.println(a);
		}
	}
	public static void main(String argh[]) {
		new A();
	}*/
}
