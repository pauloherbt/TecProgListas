package aulalise;

import java.util.Calendar;


public class Agendamento {

	private int id;
	private Calendar data;
	private Cliente cliente;
	private Cabelereiro cabeleireiro;
	
	
	public Agendamento (Cliente cliente, Cabelereiro cabeleireiro) {
			this.cliente= cliente;
			this.cabeleireiro= cabeleireiro;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		if(id>0)
		this.id = id;
	}


	public Calendar getData() {
		return data;
	}


	public void setData(Calendar data) {
		this.data = data;
	}

	
	public Cliente getCliente() {
		return cliente;
	}


	public Cabelereiro getCabeleireiro() {
		return cabeleireiro;
	}
	
	public String imprimir() {
		String saida="";
		saida+="          AGENDAMENTO\n";
		saida+="----------------------------------------------------\n";
		saida+="\n******* Cliente:  *******";
		saida+="\n id: " + this.cliente.getId();
		saida+="\n Nome: " + this.cliente.getNome();
		saida+="\n CPF:  "+ this.cliente.getCPF();
		
		saida+= "\n\n*******  Cabeleiro:  *******  ";
		saida+="\n id: " + this.cabeleireiro.getId();
		saida+="\n Nome: " + this.cabeleireiro.getNome();
		saida+="\n CPF:  "+ this.cabeleireiro.getCpf();
		
		saida+="\n Data do agendamento:  "+ 
		+ this.data.get(Calendar.DATE) + "/"
		+ (this.data.get(Calendar.MONTH) +1)+ "/"
		+ this.data.get(Calendar.YEAR) + " - "
		+ this.data.get(Calendar.HOUR_OF_DAY) + ":" 
		+this.data.get(Calendar.MINUTE);
		
		
		
		return saida;
	}
}

