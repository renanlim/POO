package br.com.plantas;

public class Briofita extends Planta {
	public Briofita(String id, String nome, double tamanho) {
		super(id);
		super.nome = nome;
		super.tamanho = tamanho;
//		super.setTamanho(tamanho);
//		super.setNome(nome);
	}
	
	
	public String toString() {
		return "[Briofita]" + id + nome + tamanho;
	}

}
