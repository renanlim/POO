import java.util.List;
import java.util.Scanner;

public class SistemaPrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o código do país:");
		String codigo = sc.nextLine();
		List listaPaises = CriaPaises.retornaPaises();
		Pais p = new Pais(codigo);
		int i = listaPaises.indexOf(p);
		
		if (i>=0) {
		 	Pais pLista = (Pais)listaPaises.get(i);
		 	System.out.println(pLista);
		 	
		} else {
			System.out.println("País não existe");
		}

	}

}
