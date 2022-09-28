package aula;

import java.util.Scanner;

public class Main {
	public static void item1() {
		Scanner sc=new Scanner(System.in);
		Cliente c1=new Cliente();
		c1.setId(1);
		c1.setNome("Paulo");
		c1.setCpf("12345");
		
		Cliente c2=new Cliente();
		c1.setId(2);
		c1.setNome("Pauluu");
		c1.setCpf("1234567");
		
		Cliente c3=new Cliente();
		c1.setId(3);
		c1.setNome("Paulin");
		c1.setCpf("12345678910");
		
		Servico s1=new Servico();
		s1.setId(1);
		s1.setNome("Cabelo");
		s1.setValor(50);
		s1.setDesc("cabelloooo");
		
		Servico s2=new Servico();
		s1.setId(2);
		s1.setNome("unhasss");
		s1.setValor(50);
		s1.setDesc("fazer unha");
		
		Servico s3=new Servico();
		s1.setId(3);
		s1.setNome("peeling");
		s1.setValor(50);
		s1.setDesc("limpar pele");
		
		Cabelereiro ca1=new Cabelereiro();
		ca1.setNome("Pedro");
		ca1.setId(1);
		ca1.setCpf("1234");
		
		Cabelereiro ca2=new Cabelereiro();
		ca1.setNome("henrique");
		ca1.setId(2);
		ca1.setCpf("1234");
		Cabelereiro ca3=new Cabelereiro();
		ca1.setNome("tiago");
		ca1.setId(3);
		ca1.setCpf("123456");
		
		Atendimento a1= new Atendimento(c1);
		a1.setServs(s1);
		a1.setCabelo(ca1);
		
		Atendimento a2= new Atendimento(c1);
		a1.setServs(s2);
		a1.setCabelo(ca2);
		
		Atendimento a3= new Atendimento(c1);
		a1.setServs(s3);
		a1.setCabelo(ca3);
		
		Agendamento agen=new Agendamento(c1, ca1);
		agen.setId(1234);
	}
	
	public static void item2e3() {
		Scanner sc=new Scanner(System.in);
		Cliente c1= new Cliente();
		c1.setNome(sc.nextLine());
		c1.setCpf(sc.nextLine());
		c1.setId(sc.nextInt());
		sc.nextLine();
		
		Servico s1= new Servico();
		s1.setNome(sc.nextLine());
		s1.setDesc(sc.nextLine());
		s1.setId(sc.nextInt());
		s1.setValor(sc.nextDouble());
		sc.nextLine();
		
		Cabelereiro cab= new Cabelereiro();	
		cab.setNome(sc.nextLine());
		cab.setCpf(sc.nextLine());
		cab.setId(sc.nextInt());
		
		Agendamento a1= new Agendamento(c1,cab);
		a1.setId(sc.nextInt());
		
		Atendimento at1= new Atendimento(c1);
		at1.setCabelo(cab);
		at1.setServs(s1);
		
		// cliente
		System.out.printf("%s id: %d cpf: %s \n",c1.getNome(), c1.getId(),c1.getCpf());
		System.out.printf("%s id: %d cpf: %s\n", cab.getNome(), cab.getId(), cab.getCpf());
		System.out.printf("%s id : %d preco %.2f %s\n", s1.getNome(),s1.getId(),s1.getValor(),s1.getDesc());
		System.out.printf("Cliente: %s, data %s, Cabelereiro: %s Servicos:\n",at1.getCliente().getNome(),at1.getC(),at1.getCabelo().getNome());
		at1.getServs();
	}
	public static void main(String[] args) {
		item2e3();
		
		
		
	}

}
