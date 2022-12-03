package application;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SecondPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	public SecondPanel() {
		setLayout(new BorderLayout());
		JLabel label = new JLabel("ESCOLHA UMA OPCAO");
		add(BorderLayout.NORTH, label);
		criarBotoes(label);
	}
	private void criarBotoes(JLabel label) {
		JPanel panel = new JPanel();
		String nomes[] = { "Java", "Javascript", "Python", "C++", "C#", "C" };
		for (int i = 0; i < nomes.length; i++) {
			panel.add(new Botao(nomes[i], new ActionChangeLabel(label, nomes[i])));
		}
		add(BorderLayout.CENTER, panel);
	}

}
