package main.java.br.com.strolker.calculadora.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import main.java.br.com.strolker.calculadora.configs.ConfiguracaoTeclado;
import main.java.br.com.strolker.calculadora.service.MemoriaService;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {

	MemoriaService memoriaService;
	public Teclado() {
		memoriaService = new MemoriaService();
		ConfiguracaoTeclado.inicializaLayout(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JButton botao = (JButton) e.getSource();
			memoriaService.processaComando(botao.getText());
		}
	}
}
