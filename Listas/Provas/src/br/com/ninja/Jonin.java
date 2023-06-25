package br.com.ninja;

public class Jonin extends Ninja {
	public Jonin(String nome,String cpf, int idade) {
		super(nome,cpf,idade);
	}
	public Jonin(String cpf) {
		super(cpf);
	}
	public void treinar() {
		System.out.println("Jonin "+this.getNome()+" treinando");
	}
}
