package br.com.ninja;

public class Chunin extends Ninja {
	public Chunin(String nome,String cpf, int idade) {
		super(nome,cpf,idade);
	}
	public Chunin(String cpf) {
		super(cpf);
	}
	public void treinar() {
		System.out.println("Chunin "+this.getNome()+" treinando");
	}
}
