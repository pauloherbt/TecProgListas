package aulalise;

import java.util.ArrayList;

public class Balanco {
	private ArrayList<Atendimento> atendimentos= new ArrayList<>();

	public ArrayList<Atendimento> getAtendimentos() {
		return atendimentos;
	}
	public String maisAtuou() {
		int contador[]=new int[atendimentos.size()];
		int i=0;
		for (Atendimento atendimento : atendimentos) {
			for (Atendimento atendimento2 : atendimentos) {
				if(atendimento.getCabeleireiro().getNome().equals(atendimento2.getCabeleireiro().getNome())) {
					contador[i]++;
				}
			}
			i++;
		}
		int maior=0, indice=0;
		int j;
		for (j = 0; j < contador.length; j++) {
			if(contador[j]>maior) {
				maior=contador[j];
				indice=j;
			}
		}
		return atendimentos.get(indice).getCabeleireiro().getNome();
	}

	public void addAtendimento(Atendimento atendimentos) {
		this.atendimentos.add(atendimentos);
	}
	public String maisGastou() {
		int indice=0, i=0;
		double maior=0;
		
		for (Atendimento atendimento : atendimentos) {
			if(atendimento.valorTotal()>maior) {
				maior=atendimento.valorTotal();
				indice=i;
			}
			i++;
		}
		return atendimentos.get(indice).getCliente().getNome();
	}
	
	public String verificarGratuito() {
		for (Atendimento atendimento : atendimentos) {
			for (Servico servico : atendimento.getListaServico()) {
				if(servico.getValor()==0){
					return servico.getNome();
				}
			}
		}
		return "Nao houve";
	}
	public String buscarServico(String servico) {
		for (Atendimento atendimento : atendimentos) {
			for (Servico serv : atendimento.getListaServico()) {
				if(serv.getNome().equals(servico)) {
					return serv.imprimir();
				}
			}
		}
		return "Nao encontrado";
	}
	public String imprimir() {	
		return "----------------------------------------------------"
				+"\nBalanco"
				+"\nQuantidade de Atendimentos:"
				+atendimentos.size()
				+"\nCabeleireiro que mais atuou: "
				+maisAtuou()
				+"\nCliente que mais gastou com servicos: "
				+maisGastou()
				+"\nServicos gratuitos: "
				+verificarGratuito()
				+"\n----------------------------------------------------";
	}
}
