package br.com.veiculo;

public class Carro extends Veiculo implements Abastecivel {
	private double tamanhoTanque;
	private double quantidadeAtual;
	
	public double getTamanhoTanque() {
		return tamanhoTanque;
	}

	public void setTamanhoTanque(double tamanhoTanque) {
		this.tamanhoTanque = tamanhoTanque;
	}

	public double getQuantidadeAtual() {
		return quantidadeAtual;
	}

	public void setQuantidadeAtual(double quantidadeAtual) {
		this.quantidadeAtual = quantidadeAtual;
	}


	public Carro(String modelo, double tamanhoTanque) {
		super(modelo);
		this.tamanhoTanque = tamanhoTanque;
	}

	@Override
	public boolean abastecer(double litros) {
		if(getQuantidadeAtual() + litros <= getTamanhoTanque()) {
			setQuantidadeAtual(getQuantidadeAtual() + litros);
			return true;
		}
		return false;
	}

}
