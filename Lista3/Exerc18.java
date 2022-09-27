package lista;

public class Exerc18 {
	public static boolean pesquisar(int vet[], int elemento) {
		for (int i = 0; i < vet.length; i++) {
			if (elemento == vet[i]) {
				return true;
			}
		}
		return false;
	}
	public static int contarElemento(int vet[], int elemento) {
		int contador=0;
		for (int i = 0; i < vet.length; i++) {
			if (elemento == vet[i]) {
				contador++;
			}
		}
		return contador;
	}
	//Questao 18
	public static int[]organização(int vet[]){
		int vetResultante[]=new int[vet.length];
		int aux=0, index=0;
		for(int i=0;i<vet.length;i++) {
			aux=contarElemento(vet,vet[i]);
			if(pesquisar(vetResultante,vet[i])==false) {
				for(int j=0;j<aux;j++) {
					vetResultante[index]=vet[i];
					index++;
			}
		}
		}
		return vetResultante;
	}
	public static void main(String[] args) {
		int vetA[]= {1,2,3,1,2,3,4,5,6,7,1};
		int vetResultante[]=organização(vetA);
		System.out.println("Vetor Organizado:");
		for (int i = 0; i < vetResultante.length; i++) {
			System.out.print(vetResultante[i]+" ");
		}
	}

}
