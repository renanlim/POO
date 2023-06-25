package Modificadores;

import java.util.Scanner;

public class CaixaAutomaticoGetSet {
	public static void main(String[] args) {
		ContaGetSet x = new ContaGetSet();
		x.setNomeCliente("Renan");
		x.depositar(100);
		System.out.println("Quanto quer sacar: ");
		Scanner s = new Scanner(System.in);
		double valor = s.nextDouble();
		if(x.sacar(valor)) {
			System.out.println("Liberando "+valor+" reais");
			System.out.println("Saldo: "+x.getSaldo());
		}
		s.close();
	}
}
