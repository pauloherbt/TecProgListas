package aula;

public class Servico {
	private int id;
	private String nome;
	private double valor;
	private String desc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0)
			this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 5)
			this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor >= 0)
			this.valor = valor;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		if (desc.length() > 10)
			this.desc = desc;
	}

}
