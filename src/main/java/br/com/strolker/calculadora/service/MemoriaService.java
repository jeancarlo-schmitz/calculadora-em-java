package main.java.br.com.strolker.calculadora.service;

import main.java.br.com.strolker.calculadora.domain.AcoesCalculadora;
import main.java.br.com.strolker.calculadora.domain.Memoria;
import main.java.br.com.strolker.calculadora.service.utils.CalculadoraUtils;

public class MemoriaService {
	
	private Memoria memoria;

	public void processaComando(String novoValor) {
		memoria = Memoria.getMemoria();
		if(!executaRegrasCalculadora(novoValor)) {
			return;
		}
		memoria.getObservers().stream().forEach(o -> o.valorAlterado(memoria.getTextoAtualTratado()));
	}
	
	private boolean executaRegrasCalculadora(String novoValor) {

		AcoesCalculadora acao = detectaAcaoPassada(novoValor);
		
		if(acao == null) {
			return false;
		}
		
		if(CalculadoraUtils.isComandoZerar(acao)) {
			memoria.setComandoZerar();
		}else if(CalculadoraUtils.isComandoNumero(acao) || CalculadoraUtils.isComandoVirgula(acao)) {
			memoria.setComandoNumero(novoValor);
		}else if(CalculadoraUtils.isComandoMudaSinal(acao)) {
			memoria.setComandoMudaSinal();
		}else {
			memoria.executaResultadoOperacao();
			memoria.salvaValoresDigitados(acao);
		}
		
		return true;
	}

	private AcoesCalculadora detectaAcaoPassada(String novoValor) {
		if(memoria.isTextoAtualVazio() && novoValor == "0") {
			return null;
		}
		
		if(isNumeric(novoValor)) {
			return AcoesCalculadora.NUMERO;
		}
		
		switch (novoValor) {
			case "AC": 
				return AcoesCalculadora.ZERAR;
			case "/": 
				return AcoesCalculadora.DIVISAO;
			case "*": 
				return AcoesCalculadora.MULTIPLICACAO;
			case "-": 
				return AcoesCalculadora.SUBTRACAO;
			case "+": 
				return AcoesCalculadora.SOMA;
			case "=": 
				return AcoesCalculadora.IGUAL;
			case "±": 
				return AcoesCalculadora.MUDASINAL;
			case ",": 
				if(memoria.getTextoAtual().contains(",")) {
					return null;
				}
				return AcoesCalculadora.VIRGULA;
		}
		
		return null;
	}
	
	private boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}
