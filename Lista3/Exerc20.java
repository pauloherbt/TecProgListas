package lista;

public class Exerc20 {
	
	public static boolean pesquisar(int vet[], int elemento) {
		for (int i = 0; i < vet.length; i++) {
			if (elemento == vet[i]) {
				return true;
			}
		}
		return false;
	}
	//Questao 20
	public static void diferença(int vetA[], int vetB[]) {
		for(int i=0;i<vetA.length;i++) {
			if(pesquisar(vetB,vetA[i])==false) {
				System.out.print(vetA[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int vetA[]= {0,-1,1,2,3,-9,4,5,6,7,8,9,10}, vetB[]= {2,4,6,8,10,12};
		System.out.println("Os elementos que estao em A mas nao estao em B:");
		diferença(vetA,vetB);
	}

}
