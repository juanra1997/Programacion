package Ejercicio05;
import java.util.regex.*;
public class MetodosDeCambio {

	public static int deBinarioADecimal(String num) {
		Pattern patron=Pattern.compile("[0|1]+");
		Matcher cuela=patron.matcher(num);
		if(cuela.matches()) {
			int cont=0, numConvert=0;
			for(int i=num.length()-1; i>=0; i--) {
				if(num.charAt(i)=='1') {
					numConvert=numConvert+(int)Math.pow(2, cont);
				}
				cont++;
			}
		return numConvert;
		} else {
			return -1;
			}
	}
	
	public static int deOctalADecimal(String num) {
		Pattern patron=Pattern.compile("[0-7]+");
		Matcher cuela=patron.matcher(num);
		if(cuela.matches()) {
			int cont=0, numConvert=0;
			for(int i=num.length()-1; i>=0; i--) {
				numConvert=numConvert+Integer.parseInt(Character.toString(num.charAt(i)))*(int)Math.pow(8, cont);
				cont++;
			}
			return numConvert;
		} else {
			return -1;
		}
	}
	
	public static int deHexadecimalADecimal(String num) {
		Pattern patron=Pattern.compile("[0-9]*[a-e]*[A-E]*");
		Matcher cuela=patron.matcher(num);
		if(cuela.matches()) {
			int cont=0, numConvert=0;
			for(int i=num.length()-1; i>=0; i--) {
				if(num.charAt(i)=='F'||num.charAt(i)=='f') {
					numConvert=numConvert+15*(int)Math.pow(16, cont);
				} else if(num.charAt(i)=='E'||num.charAt(i)=='e') {
					numConvert=numConvert+14*(int)Math.pow(16, cont);
				}else if(num.charAt(i)=='D'||num.charAt(i)=='d') {
					numConvert=numConvert+13*(int)Math.pow(16, cont);
				}else if(num.charAt(i)=='C'||num.charAt(i)=='c') {
					numConvert=numConvert+12*(int)Math.pow(16, cont);
				}else if(num.charAt(i)=='B'||num.charAt(i)=='b') {
					numConvert=numConvert+11*(int)Math.pow(16, cont);
				}else if(num.charAt(i)=='A'||num.charAt(i)=='a') {
					numConvert=numConvert+10*(int)Math.pow(16, cont);
				}else {
					numConvert=numConvert+Integer.parseInt(Character.toString(num.charAt(i)))*(int)Math.pow(16, cont);
				}
				cont++;
			}
			return numConvert;
		}else {
			return -1;
		}
	}

}
