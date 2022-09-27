package lista4;

import java.util.Scanner;

public class Exerc10 {
	public static int contarAlgarismos(int n) {
		int cont=0,aux=n;
		while(aux>0) {
			aux=aux/10;
			cont++;
		}
		return cont;
	}
	public static int[] separarAlgarismos(int n, int cont) {
		int vet[]=new int[cont];
		int aux=n, i=0;
		while(aux>0) {
			vet[i]=aux%10;
			aux=aux/10;
			i++;
		}
		return vet;
	}
	public static void verificarNumero(int n) {
		int cont=contarAlgarismos(n);
		int vetA[]=separarAlgarismos(n, cont);
		int resultado=0;
		for (int j = 0; j < vetA.length; j++) {
			resultado+=Math.pow(vetA[j],cont);
		}
		if(resultado==n) {
			System.out.println("eh um numero de Armstrong");
		}
		else
			System.out.println("nao eh um numero de Armstrong");
		
	}
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Digite o numero");
		verificarNumero(input.nextInt());
		input.close();
	}
}
