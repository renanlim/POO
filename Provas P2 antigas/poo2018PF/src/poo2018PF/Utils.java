package poo2018PF;

import java.util.ArrayList;
import java.util.List;

public class Utils {
	public static boolean existe (List x, Produto y) {
		return x.contains(y);
	}
	public static List getLista() {
		ArrayList lista = new ArrayList();
		lista.add(new Televisao("234"));
		((Produto)lista.get(0)).setCor("preto");
		((Produto)lista.get(0)).setPreco(100);
		lista.add(new Televisao("456"));
		return lista;
	}
}
