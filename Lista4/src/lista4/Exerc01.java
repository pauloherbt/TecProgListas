package lista4;

import java.util.Scanner;

public class Exerc01 {
	public static double impostoBruto(double salarioMin, double salario) {
		if (salario > salarioMin * 12) {
			return salario * 20 / 100;
		} else if (salario > salarioMin * 5) {
			return salario * 8 / 100;
		} else
			return 0;
	}

	public static double salarioLiquido(double salarioMin, double salario, int dependentes, double taxa) {
		return impostoBruto(salarioMin, salario)
				-(dependentes * (2 / 100 * (salario - impostoBruto(salarioMin, salario))))
				+ (4 / 100 * impostoBruto(salarioMin, salario))-taxa;

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("salario min?");
		double salarioMin=sc.nextDouble();
		System.out.println("numero de dependentes?");
		int dependentes=sc.nextInt();
		System.out.println("Salario do funcionario?");
		double salario=sc.nextDouble();
		System.out.println("Taxa ja paga?");
		double taxa=sc.nextDouble();
		System.out.println("Imposto a ser pago:"+salarioLiquido(salarioMin, salario, dependentes, taxa)+" R$");
		
		
	}

}
