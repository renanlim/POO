package br.com.produto;

import java.util.*;

public class Main {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite o ID do produto: ");
//		String id = sc.nextLine();
		String id = "CB28";
		Produto produto = new Produto(id);
		ArrayList<String> lista = Utils2.getLista();
		
//		if(Utils.existe(lista, produto)) {
//			for(int i =0; i<lista.size();i++) {
//				Object obj = lista.get(i);
//				if(obj.equals(produto)) {
//					System.out.println(obj);
//				}
//			}
//		}
		if (Utils.existe(lista, produto)) {
		    for (int i = 0; i < lista.size(); i++) {
		        Object p = lista.get(i);
		        if (p instanceof Produto && ((Produto) p).getId().equals(id)) {
		            System.out.println(p);
		        }
		    }
		}
		ArrayList k = new ArrayList();
		k.add(new Produto("P001"));
		k.add(new Notebook("N001"));
		k.add(new Produto("P002"));
		Produto[] produtos = transformaListEmArray(k);
		double soma = somaPrecos(produtos);
		System.out.println("Soma dos preços: " + soma);
	}


//	public Produto[] transformaListEmArray(List k) {
//		ArrayList lista = new ArrayList();
//		for (int i = 0; i < k.size(); i++) {
//			Object obj = k.get(i);
//			if (obj instanceof Produto) {
//				lista.add((Produto)obj);
//			}
//		}
//		Produto[] produto = new Produto[lista.size()];
//		lista.toArray(produto);
//		return produto;
//	}
    public static Produto[] transformaListEmArray(ArrayList lista) {
        List<Produto> produtos = new ArrayList<Produto>();
        for (Object obj : lista) {
            if (obj instanceof Produto) {
                produtos.add((Produto) obj);
            }
        }
        return produtos.toArray(new Produto[produtos.size()]);
    }
    
    public static double somaPrecos(Produto[] produtos) {
        double soma = 0.0;
        for (Produto produto : produtos) {
            soma += produto.getPreco();
        }
        return soma;
    }
}

