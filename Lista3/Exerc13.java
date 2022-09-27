package lista;

import java.util.Scanner;

public class Exerc13 {
	public static String interação() {
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}

	public static char descriptografar(char x) {
		if (x == '%')
			return 'a';
		else if (x == '*')
			return 'b';
		else if (x == '(')
			return 'c';
		else if (x == '-')
			return 'd';
		else if (x == '+')
			return 'e';
		else if (x == '@')
			return 'f';
		else if (x == '#')
			return 'g';
		else if (x == '1')
			return 'h';
		else if (x == '2')
			return 'i';
		else if (x == '3')
			return 'j';
		else if (x == '4')
			return 'l';
		else if (x == '5')
			return 'm';
		else if (x == '6')
			return 'n';
		else if (x == '7')
			return 'o';
		else if (x == '8')
			return 'p';
		else if (x == '9')
			return 'q';
		else if (x == '{')
			return 'r';
		else if (x == '}')
			return 's';
		else if (x == '!')
			return 't';
		else if (x == '&')
			return 'u';
		else if (x == '$')
			return 'v';
		else if (x == '?')
			return 'x';
		else if (x == ':')
			return 'z';
		else
			return x;
	}

	public static String descriptografia(String vet) {
		char unzip[] = vet.toCharArray();
		for (int i = 0; i < unzip.length; i++) {
			unzip[i] = descriptografar(unzip[i]);
		}
		return String.valueOf(unzip);
	}

	public static void main(String[] args) {
		System.out.println("Digite a string para descriptografar");
		String descripto = interação();
		descripto = descriptografia(descripto);
		System.out.println("String descriptografada:\n" + descripto);
	}

}
