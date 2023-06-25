package produto;
import java.util.*;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List lista= Utils.getLista();
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o id que deseja buscar: ");
		String id= sc.nextLine();
		Produto p= new Produto("123");
			p.setId(id);
		if(Utils.existe(lista, p)) {
			p=(Produto)lista.get(lista.indexOf(p));
			System.out.println(p);
		}
		else {
			System.out.println("Não existe produto com esse id");
		}
		System.out.println("Lista: " + lista);
		Map m = transformaListEmMap(lista);
		System.out.println("Mapa: "+m);
		Produto[] array=transformaMap(m);
		System.out.println("Array: ");
		for(Produto x:array) {
			System.out.println(x);
		}
	}
	public static Map<String, Produto> transformaListEmMap(List k){
		Map mapa= new HashMap<String, Produto>();
		Iterator it = k.iterator();
		while(it.hasNext()) {
			Object o= it.next();
			if(o instanceof Produto) {
				Produto p = (Produto)o;
				mapa.put(p.getId(),p);
			}
		}
		return mapa;
	}
	public static Produto[] transformaMap(Map<String, Produto> m) {
		Produto[] array = new Produto[m.size()];
		int cont=0;
		Iterator<Produto> it = m.values().iterator();
		while(it.hasNext()) {
			array[cont] = it.next();
			cont++;
		}
		return array;			
	}
}
