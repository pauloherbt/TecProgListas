package application;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class ThirdPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	public ThirdPanel() {
		JTextField text= new JTextField(25);
		add(text);
		criarBotao(text);
	}
	private void criarBotao(JTextField text) {
		add(new Botao("Enviar",new ActionSendButton(text)));
	}
}
