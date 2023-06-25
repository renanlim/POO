package br.com.ninja;
import java.util.*;
public class Utils {
	public static Map retornaMap(List listaNinjas) {
		Map mapa = new HashMap();
		Iterator it= listaNinjas.iterator();
		while(it.hasNext()) {
			Ninja n= (Ninja)it.next();
			mapa.put(n.getCpf(),n);
		}
		return mapa;
	}
}
