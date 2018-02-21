package Practica_2_Utilizacion_de_objetos;

public class Ejercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicio=1900, num, fin=2000;
		while(inicio<=fin) {
			num=inicio;
			System.out.print("Numero: "+num+": 1 ");
			while(num!=1) {
				if(num!=1&&num%2!=0&&num%3!=0&&num%5!=0&&num%7!=0) {
					System.out.println(num);
					num=1;
				}
				else {
					while(num%2==0) {
						System.out.print("2 ");
						num=num/2;	
					}
					while(num%3==0) {
						System.out.print("3 ");
						num=num/3;
					}
					while(num%5==0) {
						System.out.print("5 ");
						num=num/5;
					}
					while(num%7==0) {
						System.out.print("7 ");
						num=num/7;
					}
					while(num%11==0) {
						System.out.print("11 ");
						num=num/11;
					}
					while(num%13==0) {
						System.out.print("13 ");
						num=num/13;
					}
					while(num%17==0) {
						System.out.print("17 ");
						num=num/17;
					}
					while(num%19==0) {
						System.out.print("19 ");
						num=num/19;
					}
					while(num%23==0) {
						System.out.print("23 ");
						num=num/23;
					}
					while(num%29==0) {
						System.out.print("29 ");
						num=num/29;
					}
					while(num%31==0) {
						System.out.print("31 ");
						num=num/31;
					}
					while(num%37==0) {
						System.out.print("37 ");
						num=num/37;
					}
					while(num%41==0) {
						System.out.print("41 ");
						num=num/41;
					}
					while(num%43==0) {
						System.out.print("43 ");
						num=num/43;
					}
					while(num%47==0) {
						System.out.print("47 ");
						num=num/47;
					}
					while(num%53==0) {
						System.out.print("53 ");
						num=num/53;
					} 
					while(num%59==0) {
						System.out.print("59 ");
						num=num/59;
					}
					while(num%61==0) {
						System.out.print("61 ");
						num=num/61;
					}
					while(num%67==0) {
						System.out.print("67 ");
						num=num/67;
					}
					while(num%71==0) {
						System.out.print("71 ");
						num=num/71;
					}
					while(num%73==0) {
						System.out.print("73 ");
						num=num/73;
					}
					while(num%79==0) {
						System.out.print("79 ");
						num=num/79;
					}
					while(num%83==0) {
						System.out.print("83 ");
						num=num/83;
					}
					while(num%89==0) {
						System.out.print("89 ");
						num=num/89;
					}
					while(num%97==0) {
						System.out.print("97 ");
						num=num/97;
					}
				}
			}
			System.out.println("\n");
			inicio++;
		}
	}

}
