
public class Pessoa {
	private int idade;
	private String nome;
	private int dia, mes, ano;

	public void calculaIdade(int diaAtual, int mesAtual, int anoAtual) {
		if (mesAtual > mes) {
			idade = anoAtual - ano;
		} else if (mesAtual == mes) {
			if (diaAtual >= dia) {
				idade = anoAtual - ano;
			} else
				idade = (anoAtual - ano) - 1;
		} else {
			idade = (anoAtual - ano) - 1;
		}
	}

	public int informaIdade() {

		return idade;
	}

	public String informaNome() {
		return nome;
	}

	public void ajustaDataDeNascimento(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
