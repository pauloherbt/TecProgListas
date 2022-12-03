package saveInMemory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

public class BotaoOk extends JButton implements ActionListener {
	private JTextField text;
	private Dados dados;
	private static final long serialVersionUID = 1L;
	
	public BotaoOk(String name,JTextField text,Dados dados) {
		super(name);
		this.dados=dados;
		this.text= text;
		addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int numero= Integer.parseInt(text.getText());
		dados.addNumbers(numero);
		text.setText("");
	}
	
}
