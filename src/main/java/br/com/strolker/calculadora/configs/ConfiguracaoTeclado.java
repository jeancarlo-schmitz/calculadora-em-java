package main.java.br.com.strolker.calculadora.configs;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import main.java.br.com.strolker.calculadora.view.Botao;
import main.java.br.com.strolker.calculadora.view.Teclado;

public class ConfiguracaoTeclado {

	private final static GridBagLayout tecladoLayout = new GridBagLayout();
	private final static GridBagConstraints c = new GridBagConstraints();
	public static void inicializaLayout(Teclado teclado) {
		
		teclado.setLayout(tecladoLayout);
		
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.weighty = 1;
		
		//linha 1
		adicionarBotao(teclado, "AC", DefaultConfigs.COLOR_DARK_GREY, c, 0, 0, 2);
		adicionarBotao(teclado, "±", DefaultConfigs.COLOR_DARK_GREY, c, 2, 0, 1);
		adicionarBotao(teclado, "/", DefaultConfigs.COLOR_ORANGE, c, 3, 0, 1);
		
		//linha 2
		adicionarBotao(teclado, "7", DefaultConfigs.COLOR_LIGHT_GREY, c, 0, 1, 1);
		adicionarBotao(teclado, "8", DefaultConfigs.COLOR_LIGHT_GREY, c, 1, 1, 1);
		adicionarBotao(teclado, "9", DefaultConfigs.COLOR_LIGHT_GREY, c, 2, 1, 1);
		adicionarBotao(teclado, "*", DefaultConfigs.COLOR_ORANGE, c, 3, 1, 1);
		
		//linha 3
		adicionarBotao(teclado, "4", DefaultConfigs.COLOR_LIGHT_GREY, c, 0, 2, 1);
		adicionarBotao(teclado, "5", DefaultConfigs.COLOR_LIGHT_GREY, c, 1, 2, 1);
		adicionarBotao(teclado, "6", DefaultConfigs.COLOR_LIGHT_GREY, c, 2, 2, 1);
		adicionarBotao(teclado, "-", DefaultConfigs.COLOR_ORANGE, c, 3, 2, 1);
		
		//linha 4
		adicionarBotao(teclado, "1", DefaultConfigs.COLOR_LIGHT_GREY, c, 0, 3, 1);
		adicionarBotao(teclado, "2", DefaultConfigs.COLOR_LIGHT_GREY, c, 1, 3, 1);
		adicionarBotao(teclado, "3", DefaultConfigs.COLOR_LIGHT_GREY, c, 2, 3, 1);
		adicionarBotao(teclado, "+", DefaultConfigs.COLOR_ORANGE, c, 3, 3, 1);
		
		//linha 5
		adicionarBotao(teclado, "0", DefaultConfigs.COLOR_LIGHT_GREY, c, 0, 4, 2);
		adicionarBotao(teclado, ",", DefaultConfigs.COLOR_LIGHT_GREY, c, 2, 4, 1);
		adicionarBotao(teclado, "=", DefaultConfigs.COLOR_ORANGE, c, 3, 4, 1);

		
	}
	
	private static void adicionarBotao(Teclado teclado, String texto, Color color, GridBagConstraints c, int x, int y, int gridWidth) {
		Botao botao = new Botao(texto, color);
		c.gridx = x;
		c.gridy = y;
		c.gridwidth = gridWidth;
		botao.addActionListener(teclado);
		teclado.add(botao, c);
	}
}
