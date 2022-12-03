package saveInMemory;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OutputPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Dados dados;
	private JTextField Tmenor;
	private JTextField Tmedia;
	private JTextField Tmaior;
	
	public OutputPanel(Dados dados) {
		this.dados=dados;
		setLayout(new GridLayout(3,3));
		setPreferredSize(new Dimension(100,10));
		JLabel ma= new JLabel("Maior>>>>");
		add(ma);
		Tmaior= new JTextField(5);
		Tmaior.setEditable(false);
		add(Tmaior);
		JLabel vazio= new JLabel();
		add(vazio);
		JLabel me= new JLabel("Menor>>>>");
		add(me);
		Tmenor= new JTextField(5);
		Tmenor.setEditable(false);
		add(Tmenor);
		Tmedia= new JTextField(5);
		BotaoExibir botao= new BotaoExibir("EXIBIR",dados,Tmenor,Tmaior,Tmedia);
		add(botao);
		JLabel media= new JLabel("Media>>>>");
		add(media);
		Tmedia.setEditable(false);
		add(Tmedia);
		}
	
}
