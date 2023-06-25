package br.com.exercicioaula6.funcionario;

import java.util.*;

public class Funcionario {
	private static String id;
	private String nome;
	private double salario;
	
	public Funcionario(String id) {
		setId(id);
	}
	public void setId(String id) {
		this.id = id;
	}
	public static String getId() {
		return id;
	}
	public String toString() {
        return id + " - " + nome + " - R$ " + String.format("%.2f", salario);
    }
	public static boolean existe(List x, Funcionario y) {
		if(x instanceof Funcionario) {
			Funcionario f = (Funcionario)x;
			boolean b = getId().equals(f.getId());
			return b;
		}
		return false;
	}
	public int getSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}
}
