package Ejercicio1;

public class Metodos {

		public static int[] UnirArrays(int[] enteros1, int[] enteros2) {
			for (int i=0; i<enteros1.length-1; i++) {
				for(int j=i+1; j<enteros1.length; j++) {
					if(enteros1[i]>enteros1[j]) {
						int aux=enteros1[j];
						enteros1[j]=enteros1[i];
						enteros1[i]=aux;
					}
				}
			}
			for (int i=0; i<enteros2.length-1; i++) {
				for(int j=i+1; j<enteros2.length; j++) {
					if(enteros2[i]>enteros2[j]) {
						int aux=enteros2[j];
						enteros2[j]=enteros2[i];
						enteros2[i]=aux;
					}
				}
			}
			int enteros3[]=new int[enteros1.length+enteros2.length], j=0;
			//boolean primero=true, segundo=false, encontrado=false;
			for(int i=0; i<enteros3.length; i=i+2) {
				/*primero=true;
				segundo=false;
				encontrado=false;*/
				//int aux=-1;
				if(i==0&&enteros1[i]<enteros2[i]) {
					enteros3[i]=enteros1[i];
					enteros3[i+1]=enteros2[i];
				}
				if(i==0&&enteros1[j]>enteros2[j]) {
					enteros3[i]=enteros2[j];
					enteros3[i+1]=enteros1[j];
				}
				if(i!=0&&enteros1[j]<enteros2[j]) {
					enteros3[i]=enteros1[j];
					enteros3[i+1]=enteros2[j];
				}
				if(i!=0&&enteros1[j]>enteros2[j]) {
					enteros3[i]=enteros2[j];
					enteros3[i+1]=enteros1[j];
				}
				j++;
				/*if(i!=0&&enteros1[j]<enteros2[j]&&enteros1[j]>enteros3[i-1]) {
					enteros3[i]=enteros3[i-1];
					enteros3[i-1]=enteros1[j];
					enteros3[i+1]=enteros2[j];
				}
				if(i!=0&&enteros1[j]>enteros2[j]&&enteros1[j]>enteros3[i-1]) {
					enteros3[i]=enteros3[i-1];
					enteros3[i-1]=enteros2[j];
					enteros3[i+1]=enteros1[j];
				}
				/**/
				/*if(i!=0&&enteros1[j]>enteros2[j]&&enteros1[j]<enteros3[i-1]&&enteros2[j]<enteros3[i-2]) {
					enteros3[i-1]=enteros3[i-2]
					enteros3[i-2]=enteros1[j];
					enteros3[i]=enteros1[j];
					enteros3[i+1]=enteros2[j];
				}
				if(i!=0&&enteros1[j]<enteros2[j]&&enteros2[j]<enteros3[i-1]&&enteros1[j]>enteros3[i-2]) {
					enteros3[i-1]=enteros2[i];
					enteros3[i-2]=enteros1[j];
					enteros3[i]=enteros2[j];
					enteros3[i+1]=enteros1[j];
				}
				if(i!=0&&enteros1[j]<enteros2[j]&&enteros1[j]>enteros3[i-1]) {
					enteros3[i]=enteros3[i-1];
					enteros3[i-1]=enteros1[j];
					enteros3[i+1]=enteros2[j];
				}
				if(i!=0&&enteros1[j]>enteros2[j]&&enteros1[j]>enteros3[i-1]) {
					enteros3[i]=enteros3[i-1];
					enteros3[i-1]=enteros2[j];
					enteros3[i+1]=enteros1[j];
				}
				j++;*/
				/*for(int j=0; j<enteros3.length; j++) {
					if(enteros1[i]>enteros2[j]&&encontrado==false) {
						primero=false;
						segundo=true;
						encontrado=true;
						aux=j;
					}
				}
				if(primero==false&&segundo==true) {
					enteros3[i]=enteros1[aux];
					//enteros3[i+1]=enteros2[x];
				}else {
					enteros3[i]=enteros2[x];
					//enteros3[i+1]=enteros1[x];
				}
				x++;*/
			}
			return enteros3;
		}
}
