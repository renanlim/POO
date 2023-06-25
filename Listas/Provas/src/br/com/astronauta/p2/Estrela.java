package br.com.astronauta.p2;

public class Estrela extends CorpoCeleste{
	public Estrela(String id) {
		super(id);
	}
	
	public String toString() {
		return "[Estrela] "+super.toString();	}

}
