package lista4;

import java.util.Scanner;

public class Exerc08 {
	public static String decodificar(String number) {
		char aux[] = number.toLowerCase().toCharArray();

		char deco[] = new char[aux.length];
		for (int i = 0; i < aux.length; i++) {
			deco[i] = verificar(aux[i]);
		}
		number = new String(deco);
		return "(" + number.substring(0, 3) + ")" + number.substring(3);
	}

	public static char verificar(char digit) {
		char newDigit = digit;
		if (digit == '#')
			newDigit = '1';
		else if (digit == 'a' || digit == 'b' || digit == 'c')
			newDigit = '2';
		else if (digit == 'd' || digit == 'e' || digit == 'f')
			newDigit = '3';
		else if (digit == 'g' || digit == 'h' || digit == 'i')
			newDigit = '4';
		else if (digit == 'j' || digit == 'k' || digit == 'l')
			newDigit = '5';
		else if (digit == 'm' || digit == 'n' || digit == 'o')
			newDigit = '6';
		else if (digit == 'p' || digit == 'q' || digit == 'r' || digit == 's')
			newDigit = '7';
		else if (digit == 't' || digit == 'u' || digit == 'v')
			newDigit = '8';
		else if (digit == 'w' || digit == 'x' || digit == 'y' || digit == 'z')
			newDigit = '9';
		else if (digit == '+')
			newDigit = '0';
		return newDigit;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero a ser decodificado");
		System.out.println("O numero decodificado eh\n" + decodificar(sc.nextLine()));

	}

}
