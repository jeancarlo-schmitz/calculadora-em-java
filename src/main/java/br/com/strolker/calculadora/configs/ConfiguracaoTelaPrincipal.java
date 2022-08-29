package main.java.br.com.strolker.calculadora.configs;

import javax.swing.JFrame;

public class ConfiguracaoTelaPrincipal {

	private final static int width = 232;
	private final static int height = 324;
	
	public static void inicializaTela(JFrame jFrame) {
		jFrame.setVisible(true);
		jFrame.setSize(width, height);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setLocationRelativeTo(null);
		
	}
}
