package application;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class ActionChangeColor implements ActionListener {
	private Color color;
	private JPanel background;
	
	public ActionChangeColor(Color color, JPanel background) {
		this.color = color;
		this.background = background;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		background.setBackground(color);
	}

}
