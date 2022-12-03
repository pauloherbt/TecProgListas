package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionSendButton implements ActionListener {
	private JTextField text;
	public ActionSendButton(JTextField text) {
		this.text = text;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,text.getText() ,"mensagem", 1);
	}

}
