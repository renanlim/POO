package br.com.produto;

public class Produto {
	protected String id;
	protected String cor;
	protected double preco;
	
	public Produto(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String toString() {
		return "["+id+"-"+cor+"-"+preco+"]";
	}
}
