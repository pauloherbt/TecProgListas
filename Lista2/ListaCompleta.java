package lista;

import java.util.Scanner;

public class ListaCompleta {
	public static int entradaint() {
		Scanner input= new Scanner(System.in);
		return input.nextInt();
	}
	public static void main(String[] args) {
		
//		1) Faça um programa que fique em loop infinito, imprimindo sucessivos zeros;
//		
//		int i=0;
//		for(;i<10;) {
//			System.out.print(i + " - ");
//		}

		//2) Imprima a saída: {1,2,3, ... 100}
//		
//		int i=0;
//		for(i=1;i<=100;i++) {
//			System.out.print(i + " - ");
//		}
		
		//3) Imprima a saída: {100, 99, 98, ... 1}
		
//		int i=0;
//		for(i=100;i>=1;i--) {
//			System.out.print(i + " - ");
//		}
		
		//4) Imprima a saída: {0,2,4,6,8 ... 100}
		
//		int i=0;
//		for(;i<=100;i+=2) {
//			System.out.print(i + " - ");
//		}
		
		//5) Imprima a saída: {0,3,6,9 ...99}
		
//		int i=0;
//		for(;i<100;i+=3) {
//			System.out.print(i + " - ");
//		}
		
		//6) Imprima a saída:
//			0 - 33
//			1 - 32
//			2 - 31
//			...
//			99 - -66
		
//		int i=0;
//		int j=0;
//		for(i=0,j=33;i<100 && j>=-66;i++,j-- ){
//			System.out.print(i + " - " + j + "\n");
//		}
		
//		7)Imprima a saída:
//			0 - 0
//			1 - 3
//			2 - 6
//			...
//			100 - 300
		
//		int i=0;
//		int j=0;
//		for(;i<=100 && j<=300;i++,j+=3 ){
//			System.out.print(i + " - " + j + "\n");
//		}
		
//		8) Imprima a saída:
//			0 - 100
//			1 - 99
//			2 - 98
//			...
//			49 - 51
		
//		int i=0;
//		int j=0;
//		for(j=100;i<50 && j>=51;i++,j-- ){
//			System.out.print(i + " - " + j + "\n");
//		}
		
//		9) Imprima a saída:
//			0 - 33
//			2 - 36
//			4 - 39
//			...
//			26 - 72	
		
//		int i=0;
//		int j=0;
//		for(j=33;i<=26 && j<=72;i+=2,j+=3 ){
//			System.out.print(i + " - " + j + "\n");
//		}
		
//		10)Faça um programa que possa exibir uma sequência como a abaixo,
//		sendo o teto dos pares da esquerda e direita informados pelo usuário.
//		Exemplo: com pares da esquerda e direta com o teto de 2 unidades.
//		
		
//		int i=0,j=0;
//		System.out.println("Digite o teto da esquerda");
//		int teto_esquerda=entradaint();
//		System.out.println("Digite o teto da direita");
//		int teto_direita=entradaint();
//		for(;i<=teto_esquerda+1;i++) {
//			for(j=0;j<=teto_direita;j++) {
//				System.out.print(i + " - "+ j + "\n");
//			}
//		}
		
//		11)Faça um programa que possa gerar uma segûencia como a seguinte.
		
//		int i=0,j=0;
//		System.out.println("Digite o teto da coluna esquerda");
//		int teto_esquerda=entradaint();
//		for(;i<=teto_esquerda;i++) {
//			for(j=0;j<=1;j++) {
//				System.out.print(i + " - "+ j + "\n");
//			}
//			for(j=0;j<=2;j++) {
//				System.out.print(i + " - "+ j + "\n");
//			}
//		}
		
//		12)Para cada item abaixo imprima as formas apresentadas. Permita que o
//		usuário escolha o número de linhas e colunas desejado, para os itens
//		abaixo foram utilizados com 6 linhas e 6 colunas. Porém,
//		independentemente do número de linhas e colunas, as formas devem
//		ser mantidas para cada item.
		
//		A)
		
//		int i=0, j=0;
//		System.out.println("Digite o numero de linhas");
//		int linhas=entradaint();
//		System.out.println("Digite o numero de colunas");
//		int colunas=entradaint();
//		for(i=0;i<linhas;i++) {
//			for(j=0;j<=i&&j<colunas;j++) {
//				System.out.print("*");
//			}
//				System.out.print("\n");
//		}
		
//		B)
		
//		int i=0,j=0;
//		System.out.println("Digite o numero de linhas");
//		int linhas=entradaint();
//		System.out.println("Digite o numero de colunas");
//		int colunas=entradaint();
//		for(i=0;i<linhas;i++) {
//			for(j=0;j<colunas;j++) {
//				if(i==j|| i+j== colunas-1) {
//					System.out.print("#");
//				}
//				else
//					System.out.print("*");
//			}
//			System.out.print("\n");
//		}

//		C)
		
//		int i=0,j=0;
//		System.out.println("Digite o numero de linhas");
//		int linhas=entradaint();
//		System.out.println("Digite o numero de colunas");
//		int colunas=entradaint();
//		for(;i<linhas;i++) {
//			for(j=0;j<colunas;j++) {
//				if(i%2==0) {
//					System.out.print("#");
//				}
//				else
//					System.out.print("*");
//			}
//			System.out.print("\n");
//		}
		
//		D)
		
//		int i=0,j=0;
//		System.out.println("Digite o numero de linhas");
//		int linhas=entradaint();
//		System.out.println("Digite o numero de colunas");
//		int colunas=entradaint();
//		for(;i<linhas;i++) {
//			for(j=0;j<colunas;j++) {
//				if(i==linhas-1|| i==0||j==colunas-1||j==0) {
//					System.out.print("#");
//				}
//				else
//					System.out.print("*");
//			}
//			System.out.print("\n");
//		}
		
//		E)
		
//		int i=0,j=0;
//		System.out.println("Digite o numero de linhas");
//		int linhas=entradaint();
//		System.out.println("Digite o numero de colunas");
//		int colunas=entradaint();
//		for(;i<linhas;i++) {
//			for(j=0;j<colunas;j++) {
//				if(i<linhas/2) {
//					System.out.print("*");
//				}
//				else if(j%2==0)
//					System.out.print("#");
//				else
//					System.out.print("$");
//			}
//			System.out.print("\n");
//			
//		}
	}
	}
