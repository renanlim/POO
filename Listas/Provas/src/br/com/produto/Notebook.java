package br.com.produto;

public class Notebook extends Produto implements Eletronico {

	public Notebook(String id) {
		super(id);
	}

	@Override
	public void ligar() {
		System.out.println("Ligado");
	}

	@Override
	public void desligar() {
		System.out.println("Desligado");

	}

}
