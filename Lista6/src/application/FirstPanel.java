package application;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class FirstPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	public FirstPanel() {
		setLayout(new BorderLayout());
		JPanel center = new JPanel();
		center.setBackground(Color.black);
		add(BorderLayout.CENTER, center);
		painelSuperior(center);
	}

	public void painelSuperior(JPanel painelBackground) {
		JPanel panel = new JPanel();
		String names[] = { "Amarelo", "Verde", "Azul" };
		Color cores[] = { Color.YELLOW, Color.green, Color.BLUE };
		for (int i = 0; i < 3; i++) {
			panel.add(new Botao(names[i],new ActionChangeColor(cores[i], painelBackground)));
		}
		add(BorderLayout.NORTH, panel);
	}
}
