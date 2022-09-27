
package Exercicios;

public class Exerc02 {

	public static void main(String[] args) {
		//Verifique se A é menor que 10, se verdade imprima: "A < 10", e verifique
		//se o A mais B é igual a 20, se verdade imprima: "A + B == 20". Caso
		//nenhumas das afirmação não seja verdadeira, imprima: "número não
		//válido", (obs: apenas uma impressão é permitida na saída do programa).
		
		int A=9, B=11;
		if(A<10 || A+B==20) {
			if(A<10)
				System.out.println("A<10");
			if(A+B==20)
				System.out.println("A+B==20");
		}
		else
			System.out.println("numero nao valido");

	}
}
