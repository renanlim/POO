package br.com.astronauta.p2;


//Questao 6

public class StringUtils {
	public static String processa(String str) {
		return str.toUpperCase().replace("A", "4").replace("E", "3").replace("I", "1").replace("O", "0");
	}
}
