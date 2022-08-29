package main.java.br.com.strolker.calculadora.view;

import javax.swing.JPanel;

import main.java.br.com.strolker.calculadora.configs.ConfiguracaoTeclado;

@SuppressWarnings("serial")
public class Teclado extends JPanel {

	public Teclado() {
		ConfiguracaoTeclado.inicializaLayout(this);
	}
}
