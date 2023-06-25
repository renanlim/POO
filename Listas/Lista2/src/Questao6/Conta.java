package Questao6;

public class Conta {
	double saldo, teste;
	
	public void calcula() {
		if(saldo < 1000) {
			teste = saldo - 1000;
			if(teste < 0)
				System.out.println("Deu zebra");
		}
	}
}

/*public class Conta {
	double saldo;
	
	public void calcula() {
		if(saldo < 1000) {
			int teste = saldo - 1000;
			if(teste < 0)
				System.out.println("Deu zebra");
		}
	}
} */

// a variavel teste é do tipo inteiro e recebe a variavel saldo tipo double, incompatibilidade