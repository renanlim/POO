package q2;

import java.util.HashSet;
import java.util.Set;

public class Utils3 {
	public static Set processa(String [] filmes) {
		Set x = new HashSet();
		for (int i = 0; i < filmes.length; i++) {
			String [] f = filmes[i].split("#");
			Filme f1 = new Filme();
			f1.setId(Integer.parseInt(f[0]));
			f1.setTitulo(f[1]);
			f1.setAno(Integer.parseInt(f[2]));
			x.add(f1);
		}
		return x;
	}
}
