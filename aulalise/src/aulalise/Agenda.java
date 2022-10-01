package aulalise;

import java.util.ArrayList;
import java.util.Calendar;

public class Agenda {
	private ArrayList<Agendamento> agendamento=new ArrayList<>();

	public ArrayList<Agendamento> getAgendamento() {
		return agendamento;
	}
	public String buscarData(Calendar dataInformada) {
		String saida="AGENDAMENTOS ENCONTRADOS:\n";
		for (Agendamento agendamentos : agendamento) {
			if(agendamentos.getData().get(Calendar.DATE)==dataInformada.get(Calendar.DATE)) {
				if(agendamentos.getData().get(Calendar.MONTH)==dataInformada.get(Calendar.MONTH)) {
					if(agendamentos.getData().get(Calendar.YEAR)==dataInformada.get(Calendar.YEAR)){
						saida+=agendamentos.imprimir()+"\n";
					}
				}
			}
		}
		if(saida.equals("AGENDAMENTOS ENCONTRADOS:\n")) {
			saida="Agendamento nao encontrado";
		}
		return saida;
	}
	public void addAgendamento(Agendamento agendamento) {
		this.agendamento.add(agendamento);
	}
	
	public String horarioOcupado(int id) {
		String saida= "Horarios Ocupados:\n";
		for (Agendamento agendamentos : agendamento) {
			if(id==agendamentos.getCabeleireiro().getId()) {
				saida+= "Hora:"+agendamentos.getData().get(Calendar.HOUR_OF_DAY)+":"+agendamentos.getData().get(Calendar.MINUTE)+"\n";
			}
		}
		return saida;
	}
	public String horarioCliente(int id) {
		String saida="Horario Marcado\n";
		for (Agendamento agendamentos : agendamento) {
			if(id==agendamentos.getCliente().getId()) {
				saida+=agendamentos.getData().get(Calendar.HOUR_OF_DAY)+":"+agendamentos.getData().get(Calendar.MINUTE)+"\n";
			}
		}
		return saida;
	}
}
