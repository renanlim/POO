package Questao3e4;

public class TestaCasa {

	public static void main(String[] args) {
		Casa c1 = new Casa();
		Casa c2 = new Casa();
		
		c1.cor = "azul";
		c1.numero = 43;
		
		c2.cor = "branco";
		c2.numero = 16;
		
		System.out.println("A casa de numero " + c1.numero + " tem cor " + c1.cor);
		System.out.println("A casa de numero " + c2.numero + " tem cor " + c2.cor);
		

	}

}
