
package Exercicios;

public class Exerc04 {

	public static void main(String[] args) {
//		Verifique se A é maior que 10 ou se A mais B é igual a 20, se verdade
//		imprima: "número válido". Caso as afirmações não sejam verdadeiras,
//		Verificar se A é igual B, caso verdade imprima: (A é igual B; A e B são
//		diferentes de 10; A é menor que 10) caso não seja verdade imprima:
//		"número não válido".
		
		int A=5, B=5;
		if(A>10 || A+B==20) {
			System.out.println("numero valido");
		}
		else if(A==B) {
			System.out.println(" A e igual B;\n "
					+ "A e B sao diferentes de 10;\n "
					+ "A e menor que 10");
		}
		else
			System.out.println("numero nao valido");
	}

}
