package br.com.gustavoguanabara.uec;

public class Teste {
	public static void main(String[] args) {
		Lutador L[] = new Lutador[5];
		
		L[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75, 68.9, 11, 3, 1);
		L[0].apresentar();
		L[0].ganharLuta();
		L[0].status();
	}
}
