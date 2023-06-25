import java.util.ArrayList;
import java.util.List;

public class Teste {
	public static void main(String[] args) {
//		ArrayList x = new ArrayList();
//		x.add("Casa");
//		x.add("Carro");
//		x.add("Navio");
//		x.add("Navio");
//		System.out.println(x.size()); //sai 4 porque no arrayList sai o numero de elementos preenchidos, diferente no vetor que sai o tamanho
//		System.out.println(x.get(0));
//		System.out.println(x.contains("Carro"));
//		System.out.println(x.indexOf("Carro"));
//		System.out.println(x.remove("Carro")); //retorna boolean
//		System.out.println(x.remove(2)); // retorna o objeto
		
//		String str = "Hello, world!";
//		char c = str.charAt(5);
//		System.out.println(c); // Output: o
		
		Pessoa x = new Pessoa("Renan");
		String result = x.toString();
		System.out.println(result); // Output: hello

		Livro y = new Livro("O rei", "Renan", "XYZ", 123.50);
		String r = y.toString();
		System.out.println(r); // Output: hello
		


	}
}
