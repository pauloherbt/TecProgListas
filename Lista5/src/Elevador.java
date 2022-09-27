public class Elevador {
	private int andarAtual;
	private int andarTotal;
	private int capacidade;
	private int pessoas;
	
	public Elevador(int capacidade, int andarTotal) {
		this.capacidade = capacidade;
		this.andarTotal = andarTotal;
	}
	
	public void entra() {
		if(pessoas<capacidade) {
			System.out.println("added +1");
			setPessoas(1);
		}
		else
			System.out.println("elevador cheio");
	}
	public void sai() {
		if(pessoas!=0) {
			setPessoas(-1);
		}
		else
			System.out.println("n tem ngm");
	}
	public void sobe() {
		if(andarAtual<andarTotal) {
			System.out.println("added +1");
			setAndarAtual(1);
		}
	}
	public void desce() {
		if(andarAtual!=0) {
			setAndarAtual(-1);
		}
	}
	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual += andarAtual;
	}

	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas +=pessoas;
	}
	
	
}