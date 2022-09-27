package lista4;

public class Exerc05 {
	public static int soma(int []vet) {
		int total=0;
		for (int i = 0; i < vet.length; i++) {
			total+=vet[i];
		}
		return total;
	}
	public static float media(int[]vet) {
		float media=0;
		return media=soma(vet)/vet.length;
	}
	public static float somaFloat(float[] vet) {
		float total=0;
		for (int i = 0; i < vet.length; i++) {
			total+=vet[i];
		}
		return total;
	}
	public static float mediaFloat(float []vet) {
		float media=0;
		return media=somaFloat(vet)/vet.length;
	}
	public static int produto(int []vet) {
		int produto=1;
		for (int i = 0; i < vet.length; i++) {
			produto*=vet[i];
		}
		return produto;
	}
	public static int[]somasVetor(int[]vetA, int[]vetB,int[]vetC){
		int []vetResultante=new int[3];
		vetResultante[0]=soma(vetA);
		vetResultante[1]=soma(vetB);
		vetResultante[2]=soma(vetC);
		return vetResultante;
	}
	public static int[]produtoVetor(int[]vetA, int[]vetB,int[]vetC){
		int []vetResultante=new int[3];
		vetResultante[0]=produto(vetA);
		vetResultante[1]=produto(vetB);
		vetResultante[2]=produto(vetC);
		return vetResultante;
	}
	public static float[]mediaVetor(int[]vetA, int[]vetB,int[]vetC){
		float []vetResultante=new float[3];
		vetResultante[0]=media(vetA);
		vetResultante[1]=media(vetB);
		vetResultante[2]=media(vetC);
		return vetResultante;
	}
	
	public static void main(String[] args) {
		int vetA[]= {1,2,3,4,5}, vetB[]= {6,7,8,9,10},vetC[]= {1,3,5,9,2};
		System.out.println("A soma dos elementos do vetorA: "+soma(vetA));
		System.out.println("A soma dos elementos do vetorB: "+soma(vetB));
		System.out.println("A soma dos elementos do vetorC: "+soma(vetC));
		System.out.println("O produto dos elementos do vetorA "+produto(vetA));
		System.out.println("O produto dos elementos do vetorB "+produto(vetB));
		System.out.println("O produto dos elementos do vetorC "+produto(vetC));
		System.out.println("A media dos elementos do vetorA "+media(vetA));
		System.out.println("A media dos elementos do vetorB "+media(vetB));
		System.out.println("A media dos elementos do vetorC "+media(vetC));
		System.out.println("A soma do vetor com todas as somas: "+soma(somasVetor(vetA,vetB,vetC)));
		System.out.println("A media do vetor com todas as medias: "+mediaFloat(mediaVetor(vetA,vetB,vetC)));
		System.out.println("O produto do vetor com todos os produtos: "+produto(produtoVetor(vetA,vetB,vetC)));

	}

}
