package poo2018PF;

public class Produto {
	private String id;
	private String cor;
	private double preco;
	public Produto (String id) {
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
	public boolean equals (Object o) {
		if (o instanceof Produto) {
			Produto p = (Produto)o;
			return p.id.equals(id);
		}
		return false;
	}
	public String toString() {
		return id + " " + cor + " " + preco;
	}
}
