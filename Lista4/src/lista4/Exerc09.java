package lista4;

import java.util.Scanner;

public class Exerc09 {
	public static void desenharTriangulo(int h) {
		for(int i=0;i<h;i++) {
			for(int k=0;k<h-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Qual altura do triangulo?");
		int h=input.nextInt();
		desenharTriangulo(h);
		input.close();
	}

}
