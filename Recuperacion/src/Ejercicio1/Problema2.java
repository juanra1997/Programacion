package Ejercicio1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problema2 {

	public static void main(String[] args) throws Exception {
		
		InputStreamReader iir=new InputStreamReader(System.in);
		BufferedReader rd=new BufferedReader(iir);
		System.out.println("Introduce el numero máximo: ");
		String maximo=rd.readLine();
		procesaNumeros(maximo);
	}
	
	public static void procesaNumeros(String n) {
		try {
			for(int i=0; i<=Double.parseDouble(n)/2; i++) {
				if((i+1)%7==0) {
					System.out.println(i*2);
				}else {
					System.out.println(i);
				}
			}
		}catch(Exception e) {
			System.out.println("Ha ocurrido una excepcion");
		}

	}

}
