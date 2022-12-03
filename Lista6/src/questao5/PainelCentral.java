package questao5;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PainelCentral extends JPanel{
	private JTextField text;
	public PainelCentral() {
		setLayout(new GridLayout(2, 1));
		text=new JTextField(5);
		add(text);
		JComboBox<String> box= new JComboBox<>();
		add(box);
		
	}
	
}
