package Ejercicio01;

//import java.util.*;
public class ListaMultimedia {

	//private ArrayList<Multimedia> array=new ArrayList<Multimedia>();
	private Multimedia[] array;
	private int cont=0;
	
	public ListaMultimedia(int cantidad) {
		array=new Multimedia[cantidad];
	}
	
	public int size() {
		return this.cont;
	}
	
	public boolean add(Multimedia m) {
		if(this.array.length==cont) {
			return false;
		} else {
			array[this.cont]=m;
			this.cont=this.cont+1;
			return true;
		}
	}
	
	public Multimedia get(int position) {
		return array[position];
	}
	
	public String pruebatostring() {
		return this.array[0].toString();
	}
	public String toString() {
		//int contt=0;
		String mss="Lista:\nPosicion 0:\n";
		try {
			for(int i=0; i<this.array.length; i++) {
				mss=mss+this.array[i].toString();
				if(i+1!=array.length) {
					mss=mss+"\n************************************************************************\nPosicion "+(i+1)+":\n";
					}
				}
			} catch(NullPointerException e) {
				System.out.println("Fin");
		}
		return mss;
	}
}
