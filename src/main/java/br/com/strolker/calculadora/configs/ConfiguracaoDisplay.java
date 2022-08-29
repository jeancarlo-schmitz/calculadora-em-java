package main.java.br.com.strolker.calculadora.configs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ConfiguracaoDisplay {

	/**/
	private final static int marginLeftLabel = 10;
	private final static int marginTopLabel = 25;
	private final static int width = 233;
	private final static int height = 65;
	
	private final static FlowLayout displayLabelLayout = new FlowLayout(FlowLayout.RIGHT, marginLeftLabel, marginTopLabel);
	
	public static void inicializaLayout(JPanel jPanel, JLabel label) {
		jPanel.setBackground(DefaultConfigs.COLOR_GREY);
		jPanel.setPreferredSize(new Dimension(width, height));
		label.setForeground(Color.WHITE);
		label.setFont(DefaultConfigs.DISPLAYT_FONT);
		jPanel.setLayout(displayLabelLayout);
		jPanel.add(label);
	}
}
