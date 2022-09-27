package lista;

public class Exerc05_07 {
	// Questao 5
	public static int[] juncaoVetor(int vetA[], int vetB[]) {
		int vetResultante[] = new int[vetA.length + vetB.length];
		int i, j;
		for (i = 0; i < vetA.length; i++) {
			vetResultante[i] = vetA[i];
		}
		for (j = 0; j < vetB.length; j++) {
			vetResultante[i] = vetB[j];
			i++;
		}
		return vetResultante;
	}

	// Questao 6
	public static int[] inverterOrdem(int vet[]) {
		int vetResultante[] = new int[vet.length];
		int contador = vet.length - 1;
		for (int i = 0; i < vet.length; i++) {
			vetResultante[contador] = vet[i];
			contador--;
		}
		return vetResultante;
	}

	// Questao 7
	public static void inverterVetor(int vetA[], int vetB[]) {
		int vetAux[] = new int[vetA.length];
		for (int i = 0; i < vetB.length; i++) {
			vetAux[i] = vetA[i];
			vetA[i] = vetB[i];
			vetB[i] = vetAux[i];
		}
	}

	public static void main(String[] args) {
		int vetA[] = { 0, 1, 2, 4, 6, 8, -1, -5 }, vetB[] = { -4, -6, 12, 5, 2, -11, 10, 27 };
		// Questao 5
		System.out.println("A juncao dos vetores A e B eh ");
		int vetQ5[] = juncaoVetor(vetA, vetB);
		for (int i = 0; i < vetQ5.length; i++) {
			System.out.print(vetQ5[i] + " ");
		}
		// Questao 6
		System.out.println("\nO vetor A com os elementos invertidos eh:");
		int vetQ6[] = inverterOrdem(vetA);
		for (int i = 0; i < vetQ6.length; i++) {
			System.out.print(vetQ6[i] + " ");
		}
		// Questao 7
		inverterVetor(vetA, vetB);
		System.out.println("\nO vetor A agora eh");
		for (int i = 0; i < vetA.length; i++) {
			System.out.print(vetA[i] + " ");
		}
		System.out.println("\nO vetor B agora eh");
		for (int i = 0; i < vetB.length; i++) {
			System.out.print(vetB[i] + " ");
		}

	}

}
