import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class codificacionEnigma extends JFrame{
	
	JPanel original = new JPanel();
	JPanel codificat = new JPanel();
	JPanel botons = new JPanel();
	JPanel resultat = new JPanel();
	Container container = getContentPane();
	
	public codificacionEnigma() {
		
        super("Enigma");
        setSize(800, 300);
        
        GridLayout gl = new GridLayout(4,1);
        
        //Assignem un Layout a cada Panel
        original.setLayout(new GridLayout(2,1));        
        codificat.setLayout(new FlowLayout());
        botons.setLayout(new FlowLayout());
        resultat.setLayout(new GridLayout(2,1));
        
        //Afegim que volem que hi hagui a cada Panel
        JLabel label1 = new JLabel("Escriu el missatge:");
        label1.setHorizontalAlignment(SwingConstants.CENTER);
        original.add(label1);
        
        JTextField entrada = new JTextField();
        entrada.setHorizontalAlignment(SwingConstants.CENTER);
        original.add(entrada);
        
        codificat.add(new JLabel("Escriu els numeros que codificaran:"));
        
        JButton encriptar = new JButton("Encriptar");
        JButton desencriptar = new JButton("Desencriptar");
        
        botons.add(encriptar);
        botons.add(desencriptar);
        
        JLabel label2 = new JLabel("Aquest es el resultat");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        resultat.add(label2);
        
        JTextField sortida = new JTextField();
        sortida.setHorizontalAlignment(SwingConstants.CENTER);
        sortida.setEditable(false);
        resultat.add(sortida);
		
        //Ho afegim al container
        container.setLayout(gl);
        container.add(original);
        container.add(codificat);
        container.add(botons);
        container.add(resultat);
        
	}

}
