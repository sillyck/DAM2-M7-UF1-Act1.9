import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class codificacionEnigma extends JFrame{

	private JTextField frase = new JTextField(3);
	
	public codificacionEnigma() {
		
        JFrame frame = new JFrame("GridBagLayout Example");
        frame.setSize(600, 600);
        
        frame.setLayout(new GridBagLayout());

        GridBagConstraints constraints = new GridBagConstraints();

        constraints.gridx = 0;
        constraints.gridy = 0;
        frame.add(new JButton("Encriptar"), constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        frame.add(new JButton("Desencriptar"), constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        frame.add(new JTextField("aa"), constraints);
        
        constraints.gridx = 1;
        constraints.gridy = 1;
        frame.add(new JTextField("aa"), constraints);
        
        constraints.gridx = 2;
        constraints.gridy = 1;
        frame.add(new JTextField("aa"), constraints);
        
        frame.setVisible(true);
		
	}

}
