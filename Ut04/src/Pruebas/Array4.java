package Pruebas;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pares[]=new int[20];
		int par=1;
		for(int i=0; i<pares.length; i++) {
			if(par%2==0) {
				pares[i]=par;
				par++;
			}
			else {
				par++;
				--i;
			}
		}
		for(int i=0; i<pares.length; i++) {
		System.out.println(pares[i]);
		}
	}

}
