package Pruebas;

import java.util.ArrayList;

//import java.io.*;
//import java.util.*;

public class paranoia {

	public static void main(String[] args) {
	/*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String a;
	try {
		a=br.readLine();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}*/
	/*String a="prueba";
	System.out.println(a);
	a=a+".txt";
	System.out.println(a);
	//a=a-".txt";
	System.out.println(a);*/
	ArrayList<String> array=new ArrayList<String>(10);
	array.add("Hola");
	array.add(" Caracola");
	for(int i=0; i<array.size(); i++) {
		System.out.print(array.get(i));
	}
	}
}