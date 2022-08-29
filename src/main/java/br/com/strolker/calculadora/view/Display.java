package main.java.br.com.strolker.calculadora.view;

import javax.swing.JPanel;

import main.java.br.com.strolker.calculadora.configs.ConfiguracaoDisplay;

@SuppressWarnings("serial")
public class Display extends JPanel {
	
	public Display() {
		ConfiguracaoDisplay.inicializaLayout(this);
	}

}
