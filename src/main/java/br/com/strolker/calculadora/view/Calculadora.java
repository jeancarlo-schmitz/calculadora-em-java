package main.java.br.com.strolker.calculadora.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import main.java.br.com.strolker.calculadora.configs.ConfiguracaoTelaPrincipal;

@SuppressWarnings("serial")
public class Calculadora extends JFrame{

	public Calculadora() {
		ConfiguracaoTelaPrincipal.inicializaTela(this);
		
		organizaLayoutTela();
	}

	private void organizaLayoutTela() {
		setLayout(new BorderLayout());
		
		Display display = new Display();
		Teclado teclado = new Teclado();
		
		add(display, BorderLayout.NORTH);
		add(teclado, BorderLayout.CENTER);
	}
}
