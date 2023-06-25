package br.com.astronauta.p2;

public class CorpoCeleste {
	private String id;
	private String nome;
	private double distancia;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public CorpoCeleste(String id) {
		this.id = id;
	}
	
	public boolean equals(Object o) {
		if(o instanceof CorpoCeleste) {
			CorpoCeleste c =(CorpoCeleste)o;
			return getId().equals(c.getId());
		}
		else
			return false;
	}
	
	public int compareTo(CorpoCeleste c) {
		return Double.compare(getDistancia(), c.getDistancia());
	}
	
	public String toString() {
		return "ID: "+id+" Nome: "+nome+" Distancia: "+distancia;
	}
}
