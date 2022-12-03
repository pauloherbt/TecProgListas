package aulalise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static Cliente carregarCliente(Scanner entrada) {
		System.out.println("cpf do cliente: ");
		Cliente c = new Cliente(entrada.nextLine());
		System.out.println("nome do cliente: ");
		c.setNome(entrada.nextLine());
		System.out.println("id do cliente: ");
		c.setId(entrada.nextInt());
		entrada.nextLine();
		return c;
	}
	public static ArrayList<Servico> carregarServico(Scanner entrada) {
		ArrayList<Servico> aux = new ArrayList<Servico>();
		String op = "";
		do {
			Servico s = new Servico();
			System.out.println("Nome do servico:");
			s.setNome(entrada.nextLine());

			System.out.println("Descricao do servico:");
			s.setDescricao(entrada.nextLine());

			System.out.println("Valor do servico:");
			s.setValor(entrada.nextFloat());
			aux.add(s);
			System.out.println("Id do servico");
			s.setId(entrada.nextInt());
			entrada.nextLine();
			System.out.println("Digite sair ou qualquer tecla para adicionar novo servico:");
			op = entrada.nextLine();

		} while (!(op.equals("sair")));
		return aux;
	}

	private static Cabelereiro carregarCabelereiro(Scanner entrada) {

		System.out.println("nome do cabeleireiro: ");
		String nome = entrada.nextLine();
		System.out.println("cpf do cabeleireiro: ");
		String cpf = entrada.nextLine();
		Cabelereiro c = new Cabelereiro(nome, cpf);
		System.out.println("id do cabeleireiro: ");
		c.setId(entrada.nextInt());
		entrada.nextLine();

		return c;
	}
	public static Atendimento carregarAtendimento(Scanner entrada) {
		Cliente cliente = carregarCliente(entrada);
		Cabelereiro cabeleireiro = carregarCabelereiro(entrada);
		Atendimento a = new Atendimento(cliente, cabeleireiro);
		a.setListServico(carregarServico(entrada));
		System.out.println(a.imprimir());
		return a;
	}
	public static Agendamento carregarAgendamento() {
		Scanner entrada=new Scanner(System.in);
		Agendamento agendamento = new Agendamento(carregarCliente(entrada),carregarCabelereiro(entrada));
		agendamento.setData(Calendar.getInstance());
		System.out.println("Qual id do agendamento?");
		agendamento.setId(entrada.nextInt());
		entrada.nextLine();

		return agendamento;
	}
	public static Balanco carregarBalanco() {
		Scanner entrada = new Scanner(System.in);
		String op="";
		Balanco balanco=new Balanco();
		do {
			balanco.addAtendimento(carregarAtendimento(entrada));
			System.out.println("Digite qualquer tecla para add outro atendimento ou digite sair");
			op=entrada.nextLine();
		}while(!(op.equals("sair")));
		System.out.println(balanco.imprimir());
		return balanco;
	}
	public static Agenda carregarAgenda() {
		Agenda agendamento= new Agenda();
		Scanner sc= new Scanner(System.in);
		String op="";
		do {
			agendamento.addAgendamento(carregarAgendamento());
			System.out.println("Digite qualquer tecla para add outro agendamento ou digite sair");
			op=sc.nextLine();
		}while(!(op.equals("sair")));
		return agendamento;
	}
	
	public static void procurarAgendamento(Agenda agenda) throws ParseException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Informe a data (dd/mm/yyyy)");
		String date=sc.nextLine();
		Calendar dataInformada=Calendar.getInstance();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		dataInformada.setTime(sdf.parse(date));
		System.out.println(agenda.buscarData(dataInformada));
	}
	public static void horarioOcupado(Agenda agenda) {
		Scanner sc=new Scanner(System.in);
		System.out.println("digite o id do cabelereiro");
		System.out.println(agenda.horarioOcupado(sc.nextInt()));
		sc.nextLine();
	}
	public static void horarioCliente(Agenda agenda) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o id do cliente para verificar horario");
		System.out.println(agenda.horarioCliente(sc.nextInt()));
	}
	public static void main(String[] args) throws ParseException {
//		Atendimento atendimento=carregarAtendimento();
//		System.out.println(atendimento.imprimir());
		//System.out.println("------ AGENDAMENTO------");
//		Agendamento agendamento= carregarAgendamento();
//		System.out.println(agendamento.imprimir());
//		Scanner sc= new Scanner(System.in);
//		Balanco b1=carregarBalanco();
//		System.out.println("Digite o nome do servico a ser buscado");
//		System.out.println(b1.buscarServico(sc.nextLine()));
		Agenda agenda=carregarAgenda();
		procurarAgendamento(agenda);
		horarioOcupado(agenda);
		horarioCliente(agenda);
		
		
		

	}
	

}
