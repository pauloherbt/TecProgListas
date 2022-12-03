package application;

import javax.swing.JFrame;

public class Janela extends JFrame {
	private static final long serialVersionUID = 1L;
	public Janela(String title) {
		setTitle(title);
		setSize(300,300);
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
}
