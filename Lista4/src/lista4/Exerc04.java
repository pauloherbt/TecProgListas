package lista4;

import java.util.Scanner;

public class Exerc04 {

	public static char[] convert(String nome) {
		char aux[] = nome.toCharArray();
		return aux;
	}

	public static boolean verificarVogal(char x) {
		if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
			return true;
		}
		return false;
	}

	public static void verificarLetra(String[] nome) {
		for (int i = 0; i < nome.length; i++) {
			char aux[] = convert(nome[i]);
			System.out.println("\nAs vogais do nome " + nome[i]);
			for (int j = 0; j < aux.length; j++) {
				if (verificarVogal(aux[j]) == true) {
					System.out.print(aux[j] + " ");
				}
			}
			System.out.println("\nAs consoantes do nome " + nome[i]);
			for (int j = 0; j < aux.length; j++) {
				if (verificarVogal(aux[j]) == false&&aux[j]!=' ') {
					System.out.print(aux[j] + " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		String vet[] = new String[5];
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os nomes");
		for (int i = 0; i < vet.length; i++) {
			vet[i] = entrada.nextLine();
		}
		verificarLetra(vet);
		entrada.close();
	}
}
