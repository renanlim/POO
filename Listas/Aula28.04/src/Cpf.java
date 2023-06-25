import java.util.ArrayList;

public class Cpf {
	public static void main(String[] args) {
		ArrayList k = new ArrayList();
		k.add(new Cliente("333"));
		Cliente c = new Cliente("444");
		k.add(c);
		Cliente x = new Cliente("444");
		System.out.println(k.contains(x));
		System.out.println(x.equals(k.get(1)));
		System.out.println(k.indexOf(x));
		System.out.println(k.remove(x));
		System.out.println(k.size());
		
//		ArrayList j = new ArrayList();
//		j.add(new String("333"));
//		String u = new String("333");
//		System.out.println(j.contains(u)); //contains usa implicitamente o equals
//		System.out.println(j.get(0).equals(u));
		
//		//equals de string
//		//Nao pode fazer -0,5 na prova
//		//Se compara string com metodo equals, ele sobrescreve o metodo na superclass objeto
//		String m = new String("333");
//		System.out.println(m == u); //false
//		System.out.println(m.equals(u)); //true
//		
//		//equals String ve caractere por caractere
//		String z = new String(); //equals da string
//		Object b = z;
//		System.out.println(z.equals(b)); //true
//		
//		//equals de object funciona como ==
//		Cliente z = new Cliente(); //equals do objeto
//		Object b = z;
//		System.out.println(z == b); //true
//		System.out.println(z.equals(b)); //true
//		
//		Cliente z = new Cliente(); //equals do objeto olhando para String, object está acima de string
//		String b = z; //erro de compilação
		
		
	}
}
