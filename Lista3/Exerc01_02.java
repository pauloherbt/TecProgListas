package lista;

public class Exerc01_02 {
	// Questao 1
	public static int pesquisar(int vet[], int elemento) {
		for (int i = 0; i < vet.length; i++) {
			if (elemento == vet[i]) {
				return i;
			}
		}
		return -100;
	}

	// Questao 2
	public static int pesquisarIndice(int vet[], int indice) {
		if (indice >= vet.length) {
			return -999999999;
		} else
			return vet[indice];
	}

	public static void main(String[] args) {
		int vetA[] = { 2, 4, 5, 8, 4, 99, 77, 11, -1 };
		System.out.println("posicao do elemento: " + pesquisar(vetA, 99));
		System.out.println("elemento do indice: " + pesquisarIndice(vetA, 8));

	}

}
