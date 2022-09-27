import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void questao1() {
		RemoteControl controle=new RemoteControl();
		System.out.println(controle);
		controle.toChannel(5);
		System.out.println(controle);
		controle.increaseVolume();
		System.out.println(controle);
	}
	public static void questao2() {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		p1.setNome("Albert Einsten");
		p1.ajustaDataDeNascimento(14, 03, 1879);
		p2.setNome("Isaac Newton");
		p2.ajustaDataDeNascimento(04, 01, 1643);
		p1.calculaIdade(24, 9, 2022);
		System.out.println(p1.informaNome());
		System.out.println(p1.informaIdade());
		p2.calculaIdade(24, 9, 2022);
		System.out.println(p2.informaNome());
		System.out.println(p2.informaIdade());
	}

	public static void questao3() {
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle();
		System.out.println("What's the radius?");
		c1.setRadius(sc.nextDouble());
		System.out.println(c1);
		System.out.println("What's the percent to increase the circle?");
		c1.increaseRadius(sc.nextDouble());
		System.out.println(c1);
	}

	public static void questao4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("qual nome do produto?");
		String nome = sc.nextLine();
		System.out.println("Qual o preco de custo?");
		double pCusto = sc.nextDouble();
		System.out.println("qual o preco de venda?");
		double pVenda = sc.nextDouble();
		Product produto = new Product(nome, pCusto, pVenda);
		System.out.println(produto);
	}
	public static void questao5() {
		Scanner sc=new Scanner(System.in);
		Empregado e1;
		System.out.println("First name?");
		String firstName=sc.nextLine();
		System.out.println("Last name?");
		String lastName=sc.nextLine();
		System.out.println("Add ID? [y/n]");
		char test=sc.next().charAt(0);
		if(test=='y') {
			System.out.println("digite o ID");
			e1=new Empregado(firstName, lastName, sc.nextInt());
		}
		else
			e1=new Empregado(firstName, lastName);
		System.out.println("What's your salary?");
		e1.setSalary(sc.nextDouble());
		//preencher dias trabalhados
		Random rd=new Random();
		for (int i = 0; i < 30; i++) {
			e1.setWorkDay(rd.nextBoolean(), i);
		}
		System.out.println(e1);
	}
	public static void questao6() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Qual a capacidade do elevador?");
		int capacidade=sc.nextInt();
		System.out.println("Total  de andares?");
		int andarTotal=sc.nextInt();
		Elevador e1=new Elevador(capacidade, andarTotal);
		e1.entra();
		e1.sobe();
		System.out.println(e1.getPessoas()+" andar:"+e1.getAndarAtual());
		e1.sai();
		e1.sobe();
		System.out.println(e1.getPessoas()+" andar"+e1.getAndarAtual());
	}

	public static void main(String[] args) {
//		questao1();
//		questao2();
//		questao3();
//		questao4();
//		questao5();
		questao6();
	}

}
