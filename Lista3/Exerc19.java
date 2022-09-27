package lista;

public class Exerc19 {
	//Questao 19
	public static void agrupamento(int vet[],int n) {
		int matriz[][]=new int[vet.length/n][n];
		int index=0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j]=vet[index];
				index++;
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int vetA[]= {1,2,3,4,5,6,7,9};
		System.out.println("Vetor agrupado:");
		agrupamento(vetA,2);

	}

}
