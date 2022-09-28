package aula;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

public class Atendimento {
	private  Cliente cliente;
	private Calendar c=Calendar.getInstance();
	private ArrayList<Servico> servs = new ArrayList<>();
	private Cabelereiro cabelo;
	
	public Atendimento(Cliente cliente) {
		this.cliente = cliente;
		c.set(2022, 9, 27);;
	}

	

	

	public void getServs() {
		for (Servico servico : servs) {
			System.out.println(servico.getNome());
		}
	}






	public void setServs(Servico servico) {
		this.servs.add(servico);
	}



	public Cabelereiro getCabelo() {
		return cabelo;
	}

	public void setCabelo(Cabelereiro cabelo) {
		this.cabelo = cabelo;
	}

	public Date getC() {
		return c.getTime();
	}

	public void setC(Calendar c) {
		this.c = c;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
}
