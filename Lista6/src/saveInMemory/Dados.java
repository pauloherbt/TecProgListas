package saveInMemory;

import java.util.ArrayList;

public class Dados {
	private ArrayList<Integer> numbers;

	public Dados() {
		numbers = new ArrayList<>();
	}
	
	
	public void addNumbers(int n) {
		numbers.add(n);
	}
	public int maiorNumero() {
		int maior=0;
		for (Integer n : numbers) {
			if(n>maior) {
				maior=n;
			}
		}
		return maior;
	}
	public int menorNumero() {
		int menor=numbers.get(0);
		for (Integer n : numbers) {
			menor=n<menor?n:menor;  {
			}
		}
		return menor;
	}
	public double media() {
		double total=0;
		for (Integer n : numbers) {
			total+=n;
		}
		return total/numbers.size();
	}
}
