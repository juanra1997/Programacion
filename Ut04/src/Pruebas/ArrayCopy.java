package Pruebas;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp[]=new int[5];
		int copia[]=new int[5];
		temp[0]=1;
		temp[1]=2;
		temp[2]=3;
		temp[3]=4;
		temp[4]=5;
		copia[0]=1;
		copia[1]=1;
		copia[2]=1;
		copia[3]=1;
		copia[4]=1;
		System.arraycopy(temp, 0, copia, 0, 5);
		for(int i=0; i<copia.length; i++) {
			System.out.println(copia[i]);
		}
	}
}