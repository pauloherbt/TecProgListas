package saveInMemory;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class BotaoExibir extends JButton implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JTextField menor,maior,media;
	private Dados dados;
	
	
	public BotaoExibir(String text,Dados dados,JTextField menor, JTextField maior, JTextField media) {
		super(text);
		this.addActionListener(this);
		this.menor = menor;
		this.maior = maior;
		this.media = media;
		this.dados = dados;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		maior.setText((String.format("%d",dados.maiorNumero())));
		menor.setText(String.format("%d",dados.menorNumero()));
		media.setText(String.format("%.2f",dados.media()));
	}

}
