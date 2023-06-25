package br.com.veiculo;

public abstract class Veiculo {
	protected String modelo;
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Veiculo(String modelo) {
		this.modelo = modelo;
	}
	public String toString() {
		return modelo;
	}
}
