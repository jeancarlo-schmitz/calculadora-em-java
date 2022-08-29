package main.java.br.com.strolker.calculadora.service.utils;

import main.java.br.com.strolker.calculadora.domain.AcoesCalculadora;

public class CalculadoraUtils {

	public static boolean isComandoZerar(AcoesCalculadora acao) {
		return acao.equals(AcoesCalculadora.ZERAR) ? true : false;
	}
	
	public static boolean isComandoIgual(AcoesCalculadora acao) {
		return acao.equals(AcoesCalculadora.IGUAL) ? true : false;
	}
	
	public static boolean isComandoSubtracao(AcoesCalculadora acao) {
		return acao.equals(AcoesCalculadora.SUBTRACAO) ? true : false;
	}
	
	public static boolean isComandoSoma(AcoesCalculadora acao) {
		return acao.equals(AcoesCalculadora.SOMA) ? true : false;
	}
	
	public static boolean isComandoVirgula(AcoesCalculadora acao) {
		return acao.equals(AcoesCalculadora.VIRGULA) ? true : false;
	}

	public static boolean isComandoMultiplicacao(AcoesCalculadora acao) {
		return acao.equals(AcoesCalculadora.MULTIPLICACAO) ? true : false;
	}
	
	public static boolean isComandoDivisao(AcoesCalculadora acao) {
		return acao.equals(AcoesCalculadora.DIVISAO) ? true : false;
	}
	
	public static boolean isComandoNumero(AcoesCalculadora acao) {
		return acao.equals(AcoesCalculadora.NUMERO) ? true : false;
	}
	
	public static boolean isComandoMudaSinal(AcoesCalculadora acao) {
		return acao.equals(AcoesCalculadora.MUDASINAL) ? true : false;
	}
	
}
