package application;

public class Presentation {

	public static void main(String[] args) {
		Janela frame = new Janela("Questao 1");
		frame.add(new FirstPanel());
		Janela frame2 = new Janela("Questao 2");
		frame2.add(new SecondPanel());
		Janela frame3 = new Janela("Questao 3");
		frame3.add(new ThirdPanel());
	}
}
