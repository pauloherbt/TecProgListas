package application;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Botao extends JButton{
	private static final long serialVersionUID = 1L;
	public Botao(String name, ActionListener action) {
		super(name);
		addActionListener(action);
	}
}
