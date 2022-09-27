package lista;

import java.util.Scanner;

public class Exerc12 {
	public static String interação() {
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

	public static char criptografar(char x) {
		if (x == 'a')
			return '%';
		else if (x == 'b')
			return '*';
		else if (x == 'c')
			return '(';
		else if (x == 'd')
			return '-';
		else if (x == 'e')
			return '+';
		else if (x == 'f')
			return '@';
		else if (x == 'g')
			return '#';
		else if (x == 'h')
			return '1';
		else if (x == 'i')
			return '2';
		else if (x == 'j')
			return '3';
		else if (x == 'l')
			return '4';
		else if (x == 'm')
			return '5';
		else if (x == 'n')
			return '6';
		else if (x == 'o')
			return '7';
		else if (x == 'p')
			return '8';
		else if (x == 'q')
			return '9';
		else if (x == 'r')
			return '{';
		else if (x == 's')
			return '}';
		else if (x == 't')
			return '!';
		else if (x == 'u')
			return '&';
		else if (x == 'v')
			return '$';
		else if (x == 'x')
			return '?';
		else if (x == 'z')
			return ':';
		else
			return x;
	}

	public static String criptografia(String vet) {
		char zip[] = vet.toCharArray();
		for (int i = 0; i < zip.length; i++) {
			zip[i] = criptografar(zip[i]);
		}
		return String.valueOf(zip);
	}

	public static void main(String[] args) {
		System.out.println("Digite a string para criptografar");
		String cripto=interação();
		cripto=criptografia(cripto);
		System.out.println("String criptografada");
		System.out.println(cripto);
	}
	//8+%#% %}&5%8+4%7
}
