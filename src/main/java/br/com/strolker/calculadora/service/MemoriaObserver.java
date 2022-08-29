package main.java.br.com.strolker.calculadora.service;

@FunctionalInterface
public interface MemoriaObserver {

	public void valorAlterado(String novoValor);
	
}
