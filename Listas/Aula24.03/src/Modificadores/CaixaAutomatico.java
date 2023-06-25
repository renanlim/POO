package Modificadores;

import java.util.Scanner;

public class CaixaAutomatico {
	public static void main(String[] args) {
		Conta x = new Conta();
		x.nomeClente = "Renan";
		x.saldo = 100;
		System.out.println("Quanto quer sacar: ");
		Scanner s = new Scanner(System.in);
		double valor = s.nextDouble();
		x.saldo = x.saldo - valor;
		System.out.println("Liberando "+valor+ " reais...");
		System.out.println("Saldo "+x.saldo);
		s.close();
	}
}
