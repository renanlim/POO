package Modificadores;

public class Conta {
	String nomeClente;
	double saldo;
	public void sacar(double valor) {
		if((saldo - valor)>0) {
			saldo = saldo - valor;
			System.out.println("Saque realizado. Saldo = "+saldo);
		}else {
			System.out.println("Saque NAO realizado. Saldo ("+ saldo+ ") menor que o valor do saque: "+ valor);
		}
	}
	public void depositar(double valor) {
		saldo = saldo + valor;
		System.out.println("Saldo = "+saldo);
	}
	public void transferir(Conta destino, double valor) {
		sacar(valor);
		destino.depositar(valor);
	}
}
