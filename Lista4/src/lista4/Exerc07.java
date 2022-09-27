package lista4;

import java.util.Scanner;

public class Exerc07 {
	public static String reverterString(String string) {
		char str[]=string.toCharArray();
		char aux[]=new char[str.length];
		for (int i = str.length-1,j=0; i >=0; i--,j++) {
			 aux[j]=str[i];
		}
		return string=new String(aux);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite a string");
		System.out.println("A string revertida eh\n"+reverterString(input.nextLine()));
		input.close();
	}

}
