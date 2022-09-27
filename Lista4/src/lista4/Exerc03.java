package lista4;

import java.util.Random;

public class Exerc03 {
	public static void preencherVetor(int vet[]) {
		Random rd = new Random();
		int i=0;
		for (; i < vet.length/2; i++) {
				vet[i]=rd.nextInt(100);
		}
		for (; i < 100; i++) {
			vet[i]=-rd.nextInt(100);
	}
	}

	public static int[][] preencherVetores(int vet[]) {
		int matriz[][] = new int[4][vet.length];
		int count[] = new int[4];
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] >= 0) {
				if (vet[i]%3 == 0) {
					matriz[0][count[0]] = vet[i];
					count[0]++;
				} else {
					matriz[1][count[1]] = vet[i];
					count[1]++;
				}
			} else {
				if (vet[i]%3 == 0) {
					matriz[2][count[2]] = vet[i];
					count[2]++;
				} else {
					matriz[3][count[3]] = vet[i];
					count[3]++;
				}
			}
		}
		return matriz;
	}

	public static void main(String[] args) {
		int vetA[] = new int[100];
		preencherVetor(vetA);
		int matrizA[][] = preencherVetores(vetA);
		System.out.println("Valores positivos e multiplos de 3");	
		for (int j = 0; j < matrizA[0].length; j++) {
				if(matrizA[0][j]!=0) {
					System.out.print(matrizA[0][j]+" ");
				}
			}
		System.out.println("\nValores positivos e nao multiplos de 3");	
		for (int j = 0; j < matrizA[0].length; j++) {
				if(matrizA[1][j]!=0) {
					System.out.print(matrizA[1][j]+" ");
				}
			}
		System.out.println("\nValores negativos e multiplos de 3");	
		for (int j = 0; j < matrizA[0].length; j++) {
				if(matrizA[2][j]!=0) {
					System.out.print(matrizA[2][j]+" ");
				}
			}
		System.out.println("\nValores negativos e nao multiplos de 3");	
		for (int j = 0; j < matrizA[0].length; j++) {
				if(matrizA[3][j]!=0) {
					System.out.print(matrizA[3][j]+" ");
				}
			}
		}

	}
