package br.com.plantas;

public class Planta {
	protected String id;
	protected String nome;
	protected double tamanho;
	
	public Planta(String id) {
		this.id=id;
	}
//	public void setNome(String nome) {
//		this.nome = nome;
//	}
//	public String getNome() {
//		return nome;
//	}
	public void setTamanho(double t) {
		this.tamanho = t;
	}
	public double getTamanho() {
		return tamanho;
	}
	public String toString(){
		return id + nome + tamanho;
	}
	
	public boolean equals(Object p) {
		if(p instanceof Planta) {
			Planta planta = (Planta)p;
			return (id.equals(planta.id));		
		}
		
		return false;
	}
//	public boolean equals(Object p) {
//		if(p instanceof Planta) {
//			Planta planta = (Planta)p;
//			return (id == planta.id);		
//		}
//		
//		return false;
//	}
}
