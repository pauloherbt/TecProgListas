package lista;

public class Exerc14 {
	public static int []complementação(int []vetA, int []vetB){
		int vetC[]=new int [vetA.length];
		for (int i = 0; i < vetA.length; i++) {
				vetC[i]=10-(vetA[i]+vetB[i]);
		}
		return vetC;
	}
	public static void main(String[] args) {
		int vetA[]= {1,2,4,5,6}, vetB[]= {5,1,9,4,2};
		int vetResultante[]=complementação(vetA,vetB);
		for (int i = 0; i < vetResultante.length; i++) {
			System.out.print(vetResultante[i]+" ");
		}
	}

}
