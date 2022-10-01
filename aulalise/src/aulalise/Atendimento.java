package aulalise;

import java.util.ArrayList;
import java.util.Calendar;

public class Atendimento {

	private Cliente cliente;
	private ArrayList<Servico> listaServico;
	private Calendar data;
	private Cabelereiro cabeleireiro;

	public Atendimento(Cliente cliente, Cabelereiro cabeleireiro) {
		this.cliente = cliente;
		this.data = Calendar.getInstance();
		this.cabeleireiro = cabeleireiro;
		listaServico = new ArrayList<Servico>();
	}

	public void setListServico(ArrayList<Servico> lista) {
		listaServico= lista;
	}
	public void addServico(Servico serv) {
		listaServico.add(serv);
	}
	public double valorTotal() {
		double total=0;
		for (Servico servico : listaServico) {
			total+=servico.getValor();
		}
		return total;
	}
	public int qtdServico() {
		int total=0;
		for (Servico servico : listaServico) {
			total++;
		}
		return total;
	}
	public String nomeIgual() {
		if(cliente.getNome().equals(cabeleireiro.getNome())){
			return "Existe um cliente com mesmo nome que o cabeleireiro";
		}
		else
			return "Nao existe um cliente com mesmo nome que o cabeleireiro!!";
	}

	public Cliente getCliente() {
		return cliente;
	}


	public Cabelereiro getCabeleireiro() {
		return cabeleireiro;
	}
	public ArrayList<Servico> getListaServico() {
		return listaServico;
	}

	public String imprimir() {
		String saida = "";

		saida += "----------------------------------------------------\n";
		saida += "\n******* Cliente:  *******";
		saida += "\n id: " + this.cliente.getId();
		saida += "\n Nome: " + this.cliente.getNome();
		saida += "\n CPF:  " + this.cliente.getCPF();

		saida += "\n\n*******  Cabeleiro:  *******  ";
		saida += "\n id: " + this.cabeleireiro.getId();
		saida += "\n Nome: " + this.cabeleireiro.getNome();
		saida += "\n CPF:  " + this.cabeleireiro.getCpf();

		saida += "\n\n*******  Servicos:  *******  ";
		for (Servico servico : listaServico) {
			saida += "\n id: " + servico.getId();
			saida += "\n nome: " + servico.getNome();
			saida += "\n descricao: " + servico.getDescricao();
			saida += "\n valor: " + servico.getValor() + "\n";
		}
		saida+="Quantidade de servicos: "+qtdServico();
		saida+="\nValor total dos servicos:"+valorTotal();

		saida += "\n----------------------------------------------------";
		saida+="\nVerificador de Nome:\n";
		saida+= nomeIgual();
		return saida;
	}

}

