package br.com.plantas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ID: ");
		String id = sc.nextLine();
		Planta planta = new Planta(id);
		
		ArrayList strings = LerArquivo.retornaString("C:/plantas.txt");
		ArrayList lista = Utils.retornaDados(strings);
		if(Utils.existe(lista, planta)) {
			for(int i=0; i < lista.size(); i++) {
				Object p = lista.get(i);
				if(p.equals(planta)) {
					System.out.println(p);
				}
			}
//			for(Object p: lista) {				
//				if(p.equals(planta)) {
//					System.out.println(p);
//				}
//			}
		
		}else {
			
			System.out.println("A planta com ID "+id+" nao existe");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Planta p1 = new Briofita("1","Riccia fluitans", 9);
//		Planta p2 = new Planta("2");
//		p2.setTamanho(10);
//		Planta p3 = new Planta("3");
//		p3.setTamanho(3);
//		
//		ArrayList p = new ArrayList();
//		
//		p.add(p1);
//		p.add(p2);
//		p.add(p3);
//		
//		Planta x[] = Utils.ordena(p);
//		
//		for(int i = 0; i < x.length; i++) {			
//			System.out.println(x[i].toString());
//		}
//		
		
		
		
	}
}
