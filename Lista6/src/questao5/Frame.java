package questao5;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame {
	private static final long serialVersionUID = 4252529105088142462L;

	public Frame(){
		setTitle("Questao 5");
		setSize(350,300);
		setLocation(100, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		addLabel();
		add(new PainelCentral());
	}
	private void addLabel() {
		JLabel jl= new JLabel("Valores:");
		JLabel vazio= new JLabel("    ");
		vazio.setPreferredSize(new Dimension(100,60));
		add(BorderLayout.NORTH, vazio);
		add(BorderLayout.WEST, jl);
	}
	
}
