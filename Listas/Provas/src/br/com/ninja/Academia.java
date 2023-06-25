package br.com.ninja;

import java.util.*;
public class Academia {
	private String nome;
	private List listaNinjas = new ArrayList();
	public Academia(String nome) {
		this.nome=nome;
	}
	public List getListaNinjas() {
		return listaNinjas;
	}
	public void matriculaNinja(Ninja n) {
		listaNinjas.add(n);
	}
	public boolean imprimeDadosNinjaSeExistir (Ninja n) {
		if(listaNinjas.contains(n)) {
			Ninja o = (Ninja)listaNinjas.get(listaNinjas.indexOf(n));
			System.out.println(o);
			return true;
		}
		else {
			return false;
		}
	}
	public String toString() {
		return nome+" - "+listaNinjas.size();
	}
}
