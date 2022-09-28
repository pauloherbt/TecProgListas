package aula;

import java.util.Calendar;

public class Agendamento {
	private int id;
	private Calendar data=Calendar.getInstance();
	private Cliente cliente;
	private Cabelereiro cab;
	
	public Agendamento(Cliente cliente, Cabelereiro cab) {
		this.cliente=cliente;
		this.cab=cab;
		this.data.set(2022, 9, 27, 14, 56);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cabelereiro getCab() {
		return cab;
	}

	public void setCab(Cabelereiro cab) {
		this.cab = cab;
	}
	
}
