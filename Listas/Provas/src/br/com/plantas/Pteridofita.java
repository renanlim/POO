package br.com.plantas;

public class Pteridofita extends Planta {
	public Pteridofita(String id, String nome, double tamanho) {
		super(id);
		super.nome = nome;
		super.tamanho = tamanho;
//		super.setTamanho(tamanho);
//		super.setNome(nome);
	}
	
	
	public String toString() {
		return "[Pteridofita]" + id + nome + tamanho;
	}

}
