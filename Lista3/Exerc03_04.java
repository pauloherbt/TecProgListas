package lista;

public class Exerc03_04 {
	// Questao 3
	public static int[] separarValor(int vet[]) {
		int vetResultante[] = new int[vet.length];
		int contador = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < 0) {
				vetResultante[contador] = vet[i];
				contador++;
			}
		}
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] >= 0) {
				vetResultante[contador] = vet[i];
				contador++;
			}
		}
		return vetResultante;
	}

	// Questao 4
	public static int somatorio(int vet[]) {
		int soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		return soma;
	}

	public static void main(String[] args) {
		int vetA[] = { 1, -2, 0, 3, -9, -3, -1, 50, 4 };
		// Questao 3
		System.out.println("Novo vetor:");
		int vetResultante[] = separarValor(vetA);
		for (int i = 0; i < vetResultante.length; i++) {
			System.out.print(vetResultante[i] + " ");
		}
		// Questao 4
		System.out.println("\nSoma dos elementos do vetor A eh " + somatorio(vetA));
	}
}
