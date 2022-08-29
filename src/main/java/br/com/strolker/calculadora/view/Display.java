package main.java.br.com.strolker.calculadora.view;

import javax.swing.JLabel;
import javax.swing.JPanel;

import main.java.br.com.strolker.calculadora.configs.ConfiguracaoDisplay;
import main.java.br.com.strolker.calculadora.domain.Memoria;
import main.java.br.com.strolker.calculadora.service.MemoriaObserver;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObserver {
	
	private final JLabel label = new JLabel(Memoria.getMemoria().getTextoAtualTratado());
	public Display() {
		Memoria.getMemoria().addObserver(this);
		ConfiguracaoDisplay.inicializaLayout(this, label);
	}

	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
		
	}

}
