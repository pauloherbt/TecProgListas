package lista;

public class Exerc08 {
	// Funcao aux questao 8
	public static int somatorio(int vet[]) {
		int soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		return soma;
	}	
	
	// Questao 8
	public static int[] priorização(int vet[]) {
		float media = somatorio(vet) / vet.length;
		int vetResultante[] = new int[vet.length];
		int contador = 0;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] > media) {
				vetResultante[contador] = vet[i];
				contador++;
			}
		}
		return vetResultante;
	}

	public static void main(String[] args) {
		int vetA[]={1,2,3,4,0,1,-1,-2,-10,12};
		//Questao 8
		System.out.println("O vetor 2 eh");
		int vetResultante[]=priorização(vetA);
		for (int i = 0; i < vetResultante.length; i++) {
			System.out.print(vetResultante[i]+" ");
		}
	}

}
