package Exercicios;

public class Exerc09 {

	public static void main(String[] args) {
//		Verifique se A é maior que 10 e verifique se A mais B é igual a 20, se
//		verdadeiro, imprima: "A + B == 20''. Caso as afirmações não forem
//		verdadeiras imprima: "número não válido".
		
		int A=11, B=10;
		boolean teste=false;
		if(A>10) {
			teste=true;
		}
		if(A+B==20) {
			teste=true;
			System.out.println("A+B==20");		
		}
		if(!teste)
			System.out.println("numero nao valido");
	}
}
