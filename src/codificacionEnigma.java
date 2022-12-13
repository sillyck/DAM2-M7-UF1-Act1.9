import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class codificacionEnigma extends JFrame{

	private JTextField frase = new JTextField(3);
	
	public codificacionEnigma() {
		
		super("Enigma");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 300);
		
		JPanel frasePanel = new JPanel();
		frasePanel.setLayout(new FlowLayout());
		frasePanel.add(frase);
		
	}

}
