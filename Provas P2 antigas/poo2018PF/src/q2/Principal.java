package q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public class Principal {
	public static void main(String[] args) {
		Set s = Utils3.processa(LocAntiga.getFilmes());
		System.out.println("Todal: "+s.size());
		Iterator it = s.iterator();
		ArrayList aux = new ArrayList();
		while (it.hasNext()) {
			Object o = it.next();
			if (!aux.contains(o)) {
				aux.add(o);
				System.out.println(o + " - "+Collections.frequency(s, o));	
			}
			
		}
		
		ArrayList paraOrdenar = new ArrayList(s);
		Collections.sort(paraOrdenar);
		System.out.println(paraOrdenar);
		
	}
}	
