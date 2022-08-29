package main.java.br.com.strolker.calculadora.domain;

import java.util.ArrayList;
import java.util.List;

import main.java.br.com.strolker.calculadora.service.MemoriaObserver;
import main.java.br.com.strolker.calculadora.service.utils.CalculadoraUtils;

public class Memoria {
	private static final Memoria memoria = new Memoria();
	private final List<MemoriaObserver> observers = new ArrayList<>();
	private String textoAtual = "";
	private String textoBuffer = "";
	private boolean limparDisplay = false;
	private AcoesCalculadora acaoSalva = null;

	private Memoria() {
		
	}

	public static Memoria getMemoria() {
		return memoria;
	}

	public String getTextoAtual() {
		return textoAtual;
	}
	
	public String getTextoAtualTratado() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}

	public List<MemoriaObserver> getObservers() {
		return observers;
	}
	
	public void addObserver(MemoriaObserver observer){
		observers.add(observer);
	}
	
	public String getTextoBuffer() {
		return textoBuffer;
	}

	public boolean isLimparDisplay() {
		return limparDisplay;
	}

	public AcoesCalculadora getAcaoSalva() {
		return acaoSalva;
	}
	
	public boolean isTextoAtualVazio() {
		return textoAtual.isEmpty();
	}
	
	public void setComandoZerar() {
		textoAtual = "";
		textoBuffer = "";
		limparDisplay = false;
		acaoSalva = null;
	}
	
	public void setComandoNumero(String novoValor) {
		textoAtual = limparDisplay ? novoValor : textoAtual + novoValor;
		limparDisplay = false;
	}
	
	public void executaResultadoOperacao() {
		limparDisplay = true;
		if(acaoSalva != null && !CalculadoraUtils.isComandoIgual(acaoSalva)) {
			double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
			double numeroAtual = Double.parseDouble(textoAtual.replace(",", "."));
			double resultado = 0;
			
			if(CalculadoraUtils.isComandoSoma(acaoSalva)) {
				resultado = numeroBuffer + numeroAtual;
			}else if(CalculadoraUtils.isComandoSubtracao(acaoSalva)) {
				resultado = numeroBuffer - numeroAtual;
			}else if(CalculadoraUtils.isComandoMultiplicacao(acaoSalva)) {
				resultado = numeroBuffer * numeroAtual;
			}else if(CalculadoraUtils.isComandoDivisao(acaoSalva)) {
				resultado = numeroBuffer / numeroAtual;
			}
			
			String resultadoString = Double.toString(resultado).replace(".", ",");
			
			boolean inteiro = resultadoString.endsWith(",0");
			textoAtual = inteiro ? resultadoString.replace(",0", "") : resultadoString;
		}
		
	}
	
	public void salvaValoresDigitados(AcoesCalculadora acao) {
		textoBuffer = textoAtual;
		acaoSalva = acao;
	}
	
	public void setComandoMudaSinal() {
		if(textoAtual.contains("-")) {
			textoAtual = textoAtual.substring(1);
		}else {
			textoAtual = "-" + textoAtual;
		}
	}
	
}
