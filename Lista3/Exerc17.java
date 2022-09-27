package lista;

public class Exerc17 {
	public static int somatorio(int vet[]) {
		int soma = 0;
		for (int i = 0; i < vet.length; i++) {
			soma += vet[i];
		}
		return soma;
	}
	//Questao 17
	public static int[] explosao(int vetA[]) {
		int vetB[]=new int[somatorio(vetA)];
		int index=0;
		for(int i=0;i<vetA.length;i++) {
			for(int j=0;j<vetA[i];j++) {
				vetB[index]=vetA[i];
				index++;
			}
		}
		return vetB;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vetA[]= {1,2,3,4,5,6,7,8,9};
		int vetResultante[]=explosao(vetA);
		System.out.println("Vetor 2:");
		for (int i : vetResultante) {
			System.out.print(i+" ");
		}
	}

}