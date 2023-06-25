package poo2018PF;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Insira o id");
		String id = s.nextLine();
		Produto p = new Produto(id);
		if (Utils.existe(Utils.getLista(), p)) {
			int indiceProduto = Utils.getLista().indexOf(p);
			Produto p2 = (Produto)Utils.getLista().get(indiceProduto);
			System.out.println(p2);
		} else {
			System.out.println("Produto não existe...");
		}
		System.out.println(transformaMap(transformaListEmMap(Utils.getLista())));
	}
	public static Map<String, Produto> transformaListEmMap(List k) {
		HashMap m = new HashMap();
		Iterator it = k.iterator();
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof Produto) {
				Produto p = (Produto) o;
				m.put(p.getId(), p);
			}
		}
		return m;
	}
	public static Produto [] transformaMap (Map<String, Produto> m) {
		
		Iterator it = m.values().iterator();
		int cont = 0;
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof Produto) {
				cont++;
			}
		}
		Produto p [] = new Produto [cont];
		Iterator it2 = m.values().iterator();
		
		int cont2 = 0;
		while (it2.hasNext()) {
			Object o = it2.next();
			if (o instanceof Produto) {
				p[cont2]=(Produto)o;
				cont2++;
			}
		}
		return p;
	}
}
