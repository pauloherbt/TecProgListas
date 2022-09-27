package Exercicios;

public class Exerc10 {

	public static void main(String[] args) {
		//10)Verifique se A é maior que 10 se não for imprima: "número menor que
		//10". Verifique se A mais B é igual a 20 se não for verdade imprima
		//"número diferente de 20"
		
		int A=9, B=11;
		if(!(A>10)) {
			System.out.println("numero menor que 10");
		}
		if(!(A+B==20)) {
			System.out.println("numero diferente de 20");
		}
	}

}
