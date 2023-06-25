package LendoTeclado;

import java.util.Scanner;

public class LeituraTeclado {

	public static void main(String[] args) {
		System.out.println("Insira uma linha: ");
		Scanner scanner = new Scanner(System.in);
		String lendoLinha = scanner.nextLine();
		System.out.println("A linha de entrada foi: "+ lendoLinha);
		
		System.out.println("Insira uma idade: ");
		int lendoInteiro = scanner.nextInt();
		System.out.println("A idade e: "+ lendoInteiro);
		
		scanner.close();
	}

}
