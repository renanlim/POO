package br.com.astronauta.p2;

import java.util.*;
public class SistemaPrincipal {

	public static void main(String[] args) {
		Set<String> conjunto = LerArquivo.retornaStrings();
		Map<String, CorpoCeleste> mapa = null;
		
		try {
			mapa = Utils.retornaDados(conjunto);
		}catch(FormatoIncorretoException e) {
			System.out.println(e);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o id a ser pesquisado: ");
		String id = sc.nextLine();
		CorpoCeleste c = new CorpoCeleste(id);
		if(Utils.existe(mapa.values(), c)) {
			c=mapa.get(id);
			System.out.println(c);
		}else {
			System.out.println("A estrela com o ID "+id+" nao existe.");
		}
	}

}
