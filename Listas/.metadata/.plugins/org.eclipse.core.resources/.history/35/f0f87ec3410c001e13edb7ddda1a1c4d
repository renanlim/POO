package br.com.ninja;

public class Ninja implements Treinamento, Comparable<Ninja> {
	private String nome, cpf;
	private int idade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Ninja(String nome, String cpf, int idade) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setIdade(idade);
	}
	public Ninja(String cpf) {
		this.setCpf(cpf);
	}
	public void treinar() {
		System.out.println("Ninja treinando");
	}
	public boolean equals(Object o) {
		if( o instanceof Ninja) {
			Ninja n = (Ninja)o;
			return this.cpf.equals(n.cpf);
		}
		else {
			return false;
		}
	}
	public String toString() {
		return "Nome: "+this.getNome()+" - CPF: "+this.getCpf()+" - Idade: "+this.getIdade();
	}
	public int compareTo(Ninja n) {
		return Integer.compare(this.getIdade(), n.getIdade());
	}
}
