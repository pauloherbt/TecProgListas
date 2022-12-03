package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class ActionChangeLabel implements ActionListener{
	private JLabel label;
	private String nome;
	
	
	public ActionChangeLabel(JLabel label, String nome) {
		this.label = label;
		this.nome= nome;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		label.setText(nome);
	}

}
