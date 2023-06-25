package Mochila;

import java.util.Scanner;

public class TesteMochila {
	public static void main(String[] args) {
		
		
		int somaAno = 0;
		float mediaAno;
		Mochila [] mochilas = new Mochila[4];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0 ; i < mochilas.length; i++) {
			mochilas[i] = new Mochila();
			System.out.print("Insira a cor da mochila: ");
			mochilas[i].cor = scanner.nextLine();
			System.out.print("Insira o ano de fabricacao da mochila: ");			
			mochilas[i].anoFabricacao =  Integer.parseInt(scanner.nextLine()); //o parseInt é para comer o /n que ficou do nextLine
			
			somaAno+=mochilas[i].anoFabricacao;
			
		}
		for(int i = 0; i < mochilas.length; i++) {
			System.out.println("A cor e: "+ mochilas[i].cor + " Ano e: "+ mochilas[i].anoFabricacao);	
		}
		mediaAno = (float)somaAno/mochilas.length;
		System.out.println("A media e: " + mediaAno);
		scanner.close();

	}
}
