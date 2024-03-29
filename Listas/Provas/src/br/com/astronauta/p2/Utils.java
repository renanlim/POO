package br.com.astronauta.p2;

import java.util.*;

public class Utils {
	
	public static boolean existe(Collection<CorpoCeleste> x, CorpoCeleste y) {
		return x.contains(y);
	}
	
	public static void ordena(List<CorpoCeleste> x) {
		Collections.sort(x);
	}
	
	public static Map<String, CorpoCeleste> retornaDados(Set<String> conjuntoCorpos) throws FormatoIncorretoException{
		Map<String, CorpoCeleste> mapa = new HashMap<String, CorpoCeleste>();
		Iterator it = conjuntoCorpos.iterator();
		while(it.hasNext()) {
			String linha = (String)it.next();
			String []dados = linha.split("#");
			CorpoCeleste c = null;
			if(dados.length!=4) {
				throw new FormatoIncorretoException(linha);
			}
			if(dados[3].equals("P")) {
				c = new Planeta(dados[0]);
			} 
			if(dados[3].equals("E")) {
				c = new Estrela(dados[0]);
			}
			c.setNome(dados[1]);
			c.setDistancia(Double.parseDouble(dados[2]));
			mapa.put(c.getId(), c);
		}
		return mapa;
	}
}
