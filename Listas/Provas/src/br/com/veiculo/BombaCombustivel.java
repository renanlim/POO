package br.com.veiculo;

import java.util.ArrayList;

public class BombaCombustivel {
	private double quantidadeLitros;
	private double precoDoLitro;
	
	public double getQuantidadeLitros() {
		return quantidadeLitros;
	}

	public void setQuantidadeLitros(double quantidadeLitros) {
		this.quantidadeLitros = quantidadeLitros;
	}

	public double getPrecoDoLitro() {
		return precoDoLitro;
	}

	public void setPrecoDoLitro(double precoDoLitro) {
		this.precoDoLitro = precoDoLitro;m n
	}
	public void completarTanque(Abastecivel x) {
		System.out.println(x.toString());
		double cont = 0;
		while(getQuantidadeLitros() >= 0.1 && x.abastecer(0.1)) {
				cont+=0.1;
				setQuantidadeLitros(getQuantidadeLitros() - 0.1);
		}
		double preco = cont * this.precoDoLitro;
		System.out.println("Total de litros: "+cont);
		System.out.println("Preco: "+ preco);
	}
	
	public void abastecerFila(ArrayList x) {
		
		for(int i = 0; i < x.size(); i++) {
			Abastecivel a = (Abastecivel)x.get(i);
			completarTanque(a);
		}
	}
}
