package saveInMemory;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField textBox;
	private Dados dados;
	public InputPanel(Dados dados) {
		this.dados=dados;
		setLayout(new BorderLayout());
		setPreferredSize(new Dimension(00,60));
		addLabel();
		addTextBoxButton();
		
		
		// TODO Auto-generated constructor stub
	}
	private void addLabel() {
		JLabel insert = new JLabel("Digite um numero:");
		add(BorderLayout.NORTH,insert);
	}
	private void addTextBoxButton() {
		JPanel inferior= new JPanel();
		inferior.setLayout(new GridLayout(1,1));
		inferior.setPreferredSize(new Dimension(00,30));
		add(BorderLayout.SOUTH, inferior);
		textBox= new JTextField(5);
		inferior.add(textBox);
		BotaoOk okButton= new BotaoOk("OK",textBox,dados);
		inferior.add(okButton);
		
	}
	
	public JTextField getTextBox() {
		return textBox;
	}
	
	
}
