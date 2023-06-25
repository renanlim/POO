package br.com.astronauta.p2;

public class Planeta extends CorpoCeleste{
	public Planeta(String id) {
		super(id);
	}
	
	public String toString() {
		return "[Planeta] "+super.toString();	}

}
