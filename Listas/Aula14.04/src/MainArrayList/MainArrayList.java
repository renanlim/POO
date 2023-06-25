package MainArrayList;
import java.util.ArrayList;

import Animal.Gorila;

public class MainArrayList {
	public static void main(String[] args) { 
	ArrayList x = new ArrayList();
	x.add("Casa");
	x.add("Mesa");
	x.add("Abacate");
	System.out.println(x.size());
	x.add(new Gorila());
	System.out.println(x.contains("Mesa"));
	x.remove("Casa");
	System.out.println(x);
	mediaString(x);
	}
	
	public static void mediaString(ArrayList x) {
		float media = 0f;
		int cont = 0;
		for(int i = 0; i < x.size(); i++ ) {
			if(x.get(i) instanceof String) {
				cont++;
				media+=((String)x.get(i)).length();
				
			}
		}
		media/=cont;
		System.out.println("A media e: "+ media);
	}
	//Professor
	/* int cont = 0;
	 * int soma = 0;
	 * for(int i = 0; i < x.size(); i++){
	 * 	if(x.get(i) instanceof String){
	 * 		cont++;
	 * 		String k = (String)x.get(i);
	 * 		soma+=k.length();
	 *	}
	 *	syso(soma/(double)cont);
	 *}
	 * 
	 */
	//[Mesa, Abacate, Animal.Gorila@4617c264] --> representação de um objeto como tipo String
	//que é a mesma coisa que chamar o toString()
}
