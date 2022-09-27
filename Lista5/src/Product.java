
public class Product {
	private String nome;
	private double pCusto, pVenda, margem;
	private static final double DESPESAS = 0;

	public Product(String nome, double pCusto, double pVenda) {
		this.nome = nome;
		this.pCusto = pCusto;
		this.pVenda = pVenda;
	}

	public double calcMargem() {
		return margem = (((pVenda - (pCusto + DESPESAS)) / pVenda)) * 100;
	}

	public String toString() {
		return "Produto: " 
				+ nome
				+ ", Margem de lucro = " 
				+ calcMargem()+"%";
	}
}
