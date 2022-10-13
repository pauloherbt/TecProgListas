package aula11_10_22;

public class PlayDoPauloH implements IPlay {

	@Override
	public void start() {
		System.out.println("Inicializando...");
		
	}

	@Override
	public void stop() {
		System.out.println("Parado!");
		
	}

	@Override
	public void next(int quantidade) {
		System.out.println("Avançando para o som"+quantidade);
		
	}

	@Override
	public void back(int quantidade) {
		// TODO Auto-generated method stub
		System.out.println("Voltando para o som"+ quantidade);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println("Reproducao pausada");
	}

	@Override
	public String fabricante() {
		// TODO Auto-generated method stub
		return "Samsung";
	}
	
}
