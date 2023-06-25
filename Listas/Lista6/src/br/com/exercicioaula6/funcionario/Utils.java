package br.com.exercicioaula6.funcionario;

import java.util.*;

public class Utils {
	public static boolean existe(ArrayList x, Funcionario y) {
		if(x instanceof Funcionario) {
			Funcionario f = (Funcionario)x;
			boolean b = getId().equals(f.getId());
			return b;
		}
		return false;
	}
	 public static ArrayList retornaDados(String[] array_funcionarios) {
		 ArrayList lista = new ArrayList();
	        
		 for (String s : array_funcionarios) {
	            String[] campos = s.split("#");
	            String id = campos[0];
	            String nome = campos[1];
	            double salario = Double.parseDouble(campos[2]);
	            String tipo = campos[3];

	            if (tipo.equals("A")) {
	                AnalistaSistemas analista = new AnalistaSistemas(id, nome, salario);
	                analista.setNome(nome);
	                analista.setSalario(salario);
	                lista.add(analista);
	            } else if (tipo.equals("P")) {
	                Programador programador = new Programador(id, nome, salario);
	                programador.setNome(nome);
	                programador.setSalario(salario);
	                lista.add(programador);
	            }
	        }
	        
	        return lista;
	 }
	public static double mediaSalarial(ArrayList listafuncionarios, String string) {
		// TODO Auto-generated method stub
		return 0;
	}
}
