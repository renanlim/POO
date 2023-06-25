package br.com.plantas;

import java.util.*;

import br.com.produto.Produto;

public class Utils {
	public static boolean existe(ArrayList x, Produto produto) {
		return x.contains(produto);
	}
	
	public static Planta [] ordena(List x) {
		Planta [] plantas = new Planta[x.size()];
		x.toArray(plantas);
		for(int i = 1; i < plantas.length; i++) {
			Planta plantaAtual = plantas[i];
			int j = i-1;
			while(j >= 0 && plantas[j].getTamanho() >  plantaAtual.getTamanho()){
				plantas[j+1] = plantas[j];
				j--;				
			}
			plantas[j+1]=plantaAtual;
		}
		return plantas;
	}
	public static ArrayList retornaDados(ArrayList stringPlantas) {
//		String [] lista = new String[stringPlantas.size()];
//		stringPlantas.toArray(lista);
		ArrayList lista = new ArrayList();
		for(int i=0; i < stringPlantas.size(); i++) {
//		for(String s: stringPlantas) {
			String [] campos = ((String)stringPlantas.get(i)).split("#");
			String id = campos[0];
			String nome = campos[1];
			double tamanho = Double.parseDouble(campos[2]);
			String tipo = campos[3];
			if(tipo.equals("B")) {
				Briofita briofita = new Briofita(id,nome,tamanho);
				lista.add(briofita);
			}else if(tipo.equals("P")) {
				Pteridofita pteridofita = new Pteridofita(id,nome,tamanho);
				lista.add(pteridofita);
			}
		}
		return lista;
	}
}
