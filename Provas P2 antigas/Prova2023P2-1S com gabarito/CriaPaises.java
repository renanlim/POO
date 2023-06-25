import java.util.ArrayList;
import java.util.List;

public class CriaPaises {
	public static List retornaPaises() {
		ArrayList x = new ArrayList();
		Pais p1 = new Pais ("CAN", "Canada", 10);
		Pais p2 = new Pais ("USA", "Estados Unidos", 20);
		Pais p3 = new Pais ("MEX", "México", 30);
		p1.setPopulacao(100);
		p2.setPopulacao(200);
		p3.setPopulacao(300);
		p1.addPaisFronteira(p2);
		p2.addPaisFronteira(p1);
		p2.addPaisFronteira(p3);
		p3.addPaisFronteira(p2);
		x.add(p1);
		x.add(p2);
		x.add(p3);
		return x;
	}
	public static List retornaPaises (String [] array) throws FormatoIncorretoException{
		List lista = new ArrayList();
		for (int i=0; i<array.length; i++) {
			String [] dados = array[i].split("#");
			if (dados.length != 4) {
				throw new FormatoIncorretoException("Tamanho incorreto: " +dados.length+ " "+array[i]);
			} else {
				Pais p = new Pais (dados[0], dados[1], Double.parseDouble(dados[2]));
				p.setPopulacao(Integer.parseInt(dados[3]));
				lista.add(p);
			}
		}
		return lista;
	}
}
