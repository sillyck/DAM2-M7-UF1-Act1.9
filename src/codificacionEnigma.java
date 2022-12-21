import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	
	JTextField entrada = new JTextField();
	JTextField sortida = new JTextField();
	
	JTextField codificacio1 = new JTextField(3);
	JTextField codificacio2 = new JTextField(3);
	JTextField codificacio3 = new JTextField(3);
	
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
        
        
        entrada.setHorizontalAlignment(SwingConstants.CENTER);
        original.add(entrada);
        
        
        JLabel text = new JLabel("Escriu els numeros que codificaran:");
        text.setHorizontalAlignment(SwingConstants.CENTER);
        codificat.add(text);
                
        
        codificacio1.setHorizontalAlignment(SwingConstants.CENTER);
        codificat.add(codificacio1);
        
        
        codificacio2.setHorizontalAlignment(SwingConstants.CENTER);
        codificat.add(codificacio2);
        
        
        codificacio3.setHorizontalAlignment(SwingConstants.CENTER);
        codificat.add(codificacio3);
        
        
        JButton encriptar = new JButton("Encriptar");
        encriptar.addActionListener(new encript());
        
        JButton desencriptar = new JButton("Desencriptar");
        desencriptar.addActionListener(new decript());
        
        botons.add(encriptar);
        botons.add(desencriptar);
        
        JLabel label2 = new JLabel("Aquest es el resultat");
        label2.setHorizontalAlignment(SwingConstants.CENTER);
        resultat.add(label2);
        
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
	
	public class encript implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int cont = 1;
			String text = entrada.getText();
			char[] chars = text.toCharArray();
			char[] solucio = new char[chars.length];
			
			int num1 = Integer.parseInt(codificacio1.getText());
			int num2 = Integer.parseInt(codificacio2.getText());
			int num3 = Integer.parseInt(codificacio3.getText());
			
			int restador=0, codi=90, tope=64;
			
			for(int i=0; i<text.length(); i++) {
				restador=0;
				
				switch (cont) {
				case 1:
					int ascii1 = (int) chars[i];
					
					if((ascii1 + num1)>90) {
						restador = ascii1 + num1;
						restador = restador - codi;
						ascii1 = tope + restador;
					}else{
						ascii1 = ascii1 + num1;
					}
					solucio[i] = (char) ascii1;
					cont = 2;
					break;
					
				case 2:
					int ascii2 = (int) chars[i];
					
					if((ascii2 + num2)>90) {
						restador = ascii2 + num2;
						restador = restador - codi;
						ascii2 = tope + restador;
					}else{
						ascii2 = ascii2 + num2;
					}
					solucio[i] = (char) ascii2;
					cont = 3;
					break;
					
				case 3:
					int ascii3 = (int) chars[i];
					
					if((ascii3 + num3)>90) {
						restador = ascii3 + num3;
						restador = restador - codi;
						ascii3 = tope + restador;
					}else{
						ascii3 = ascii3 + num3;
					}
					solucio[i] = (char) ascii3;
					cont = 1;
					break;

				default:
					break;
				}
			}
			
			String str = new String(solucio);
			sortida.setText(str);
			
		}
		
	}
	
	public class decript implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int cont = 1;
			String text = entrada.getText();
			char[] chars = text.toCharArray();
			char[] solucio = new char[chars.length];
			
			int num1 = Integer.parseInt(codificacio1.getText());
			int num2 = Integer.parseInt(codificacio2.getText());
			int num3 = Integer.parseInt(codificacio3.getText());
			
			int restador=0, codi=65, tope=91;
			
			for(int i=0; i<text.length(); i++) {
				restador=0;
				
				switch (cont) {
				case 1:
					int ascii1 = (int) chars[i];
					
					if((ascii1 - num1)<65) {
						restador = ascii1 - num1;
						restador = codi - restador;
						ascii1 = tope - restador;
					}else{
						ascii1 = ascii1 - num1;
					}
					solucio[i] = (char) ascii1;
					cont = 2;
					break;
					
				case 2:
					int ascii2 = (int) chars[i];
					
					if((ascii2 - num2)<65) {
						restador = ascii2 - num2;
						restador = codi - restador;
						ascii2 = tope - restador;
					}else{
						ascii2 = ascii2 - num2;
					}
					solucio[i] = (char) ascii2;
					cont = 3;
					break;
					
				case 3:
					int ascii3 = (int) chars[i];
					
					if((ascii3 - num3)<65) {
						restador = ascii3 - num3;
						restador = codi - restador;
						ascii3 = tope - restador;
					}else{
						ascii3 = ascii3 - num3;
					}
					solucio[i] = (char) ascii3;
					cont = 1;
					break;

				default:
					break;
				}
			}
			
			String str = new String(solucio);
			sortida.setText(str);
			
		}
		
	}

}
