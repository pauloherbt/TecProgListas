package saveInMemory;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Janela extends JFrame {
	private static final long serialVersionUID = 1L;

	public Janela() {
		setTitle("Questao 4");
		setSize(350,300);
		setLocation(100, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		Dados dados= new Dados();
		InputPanel sup= new InputPanel(dados);
		add(BorderLayout.NORTH,sup);
		add(BorderLayout.CENTER,new OutputPanel(dados));
	}
	

}
