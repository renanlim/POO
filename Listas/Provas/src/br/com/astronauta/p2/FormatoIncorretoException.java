package br.com.astronauta.p2;

public class FormatoIncorretoException extends Exception{
	public FormatoIncorretoException(String linha) {
		super("O formato da String ["+linha+" ] esta incorreto.");
	}
	public FormatoIncorretoException() {
		
	}
}
