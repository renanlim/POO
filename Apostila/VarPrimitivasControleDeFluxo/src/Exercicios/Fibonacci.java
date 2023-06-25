package Exercicios;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0, 1, 1, 2, 3, 5, 8....
		int anterior = 0;
		int atual = 1;
		for(int i = 1; i < 100; i++) {
			System.out.print(atual + ", ");
			atual = anterior + atual;
			anterior = atual - anterior;
		}

	}

}
