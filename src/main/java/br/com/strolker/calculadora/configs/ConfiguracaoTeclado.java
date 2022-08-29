package main.java.br.com.strolker.calculadora.configs;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

import main.java.br.com.strolker.calculadora.view.Botao;

public class ConfiguracaoTeclado {

	private final static GridBagLayout tecladoLayout = new GridBagLayout();
	private final static GridBagConstraints c = new GridBagConstraints();
	public static void inicializaLayout(JPanel jPanel) {
		jPanel.setLayout(tecladoLayout);
		
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1;
		c.weighty = 1;
		
		//linha 1
		adicionarBotao(jPanel, "AC", DefaultConfigs.COLOR_DARK_GREY, c, 0, 0, 3);
		adicionarBotao(jPanel, "/", DefaultConfigs.COLOR_ORANGE, c, 3, 0, 1);
		
		//linha 2
		adicionarBotao(jPanel, "7", DefaultConfigs.COLOR_LIGHT_GREY, c, 0, 1, 1);
		adicionarBotao(jPanel, "8", DefaultConfigs.COLOR_LIGHT_GREY, c, 1, 1, 1);
		adicionarBotao(jPanel, "9", DefaultConfigs.COLOR_LIGHT_GREY, c, 2, 1, 1);
		adicionarBotao(jPanel, "*", DefaultConfigs.COLOR_ORANGE, c, 3, 1, 1);
		
		//linha 3
		adicionarBotao(jPanel, "4", DefaultConfigs.COLOR_LIGHT_GREY, c, 0, 2, 1);
		adicionarBotao(jPanel, "5", DefaultConfigs.COLOR_LIGHT_GREY, c, 1, 2, 1);
		adicionarBotao(jPanel, "6", DefaultConfigs.COLOR_LIGHT_GREY, c, 2, 2, 1);
		adicionarBotao(jPanel, "-", DefaultConfigs.COLOR_ORANGE, c, 3, 2, 1);
		
		//linha 4
		adicionarBotao(jPanel, "1", DefaultConfigs.COLOR_LIGHT_GREY, c, 0, 3, 1);
		adicionarBotao(jPanel, "2", DefaultConfigs.COLOR_LIGHT_GREY, c, 1, 3, 1);
		adicionarBotao(jPanel, "3", DefaultConfigs.COLOR_LIGHT_GREY, c, 2, 3, 1);
		adicionarBotao(jPanel, "+", DefaultConfigs.COLOR_ORANGE, c, 3, 3, 1);
		
		//linha 5
		adicionarBotao(jPanel, "0", DefaultConfigs.COLOR_LIGHT_GREY, c, 0, 4, 2);
		adicionarBotao(jPanel, ",", DefaultConfigs.COLOR_LIGHT_GREY, c, 2, 4, 1);
		adicionarBotao(jPanel, "=", DefaultConfigs.COLOR_ORANGE, c, 3, 4, 1);

		
	}
	
	private static void adicionarBotao(JPanel jPanel, String texto, Color color, GridBagConstraints c, int x, int y, int gridWidth) {
		Botao botao = new Botao(texto, color);
		c.gridx = x;
		c.gridy = y;
		c.gridwidth = gridWidth;
		jPanel.add(botao, c);
	}
}
