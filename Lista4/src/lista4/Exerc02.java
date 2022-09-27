package lista4;

import java.util.Scanner;
	
public class Exerc02 {
	public static float valorAluguel(float preço, String dia, String tipo) {
		float desconto=0, acrescimo=0;
		if(dia.equals("segunda")||dia.equals("terça")||dia.equals("quinta")) {
			desconto=(float) (preço*0.4);
		}
		if(tipo.equals("nova")) {
			acrescimo=(float) (0.15*preço);
		}
		return preço-desconto+acrescimo;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Insira o preco ");
		float preco_normal=Float.parseFloat(input.nextLine());
		System.out.println("Qual o dia da semana?");
		String dia=input.nextLine();
		System.out.println("A ferramenta eh nova ou comum?");
		String tipo=input.nextLine();
		System.out.println("O valor do aluguel eh " + valorAluguel(preco_normal, dia, tipo));
		
		input.close();
	}

}
