package main.java.br.com.strolker.calculadora.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import main.java.br.com.strolker.calculadora.configs.DefaultConfigs;

@SuppressWarnings("serial")
public class Botao extends JButton {
	
	public Botao(String text, Color color) {
		setText(text);
		setOpaque(true);
		setBackground(color);
		setFont(DefaultConfigs.BUTTON_FONT);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(DefaultConfigs.COLOR_GREY));
		
	}

}
