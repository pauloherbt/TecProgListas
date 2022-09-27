package lista4;

public class Exerc11 {
	public static void showMatriz(int [][]mat) {
		for (int j = 0;j<mat[0].length; j++) {
			for (int i=mat.length-1; i>=0; i--) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int mat[][]= {{5,3 },{8,5},{6,0}};
		System.out.println("Matriz original:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print("[");
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.print("]");
			System.out.println();
		}
		System.out.println("Matriz nova");
		showMatriz(mat);
	}

}
