package br.com.veiculo;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BombaCombustivel bc = new BombaCombustivel();
		bc.setQuantidadeLitros(5000);
		bc.setPrecoDoLitro(4.50);
		Carro c = new Carro("Hb20", 30	 );
		bc.completarTanque(c);
		ArrayList lista = new ArrayList();
		lista.add(new Carro("Civic", 50));
		lista.add(new Moto("Fan", 7));
		lista.add(new Moto("Titan", 10));
		bc.abastecerFila(lista);
		
		
	}
	public static String processa(String str) {
		String caixaAlta = str.toUpperCase();
		String inverte = caixaAlta
	}
}
