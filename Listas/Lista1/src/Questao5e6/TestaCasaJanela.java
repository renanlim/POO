package Questao5e6;

public class TestaCasaJanela {

	public static void main(String[] args) {
		Janela j = new Janela();
		
		j.cor = "azul";
		j.material = "vidro";
		
		Casa c = new Casa();
		c.cor = "amarela";
		c.numero = 43;
		c.janela = j;
		
		System.out.println("Cor: " + c.cor + " Numero: " + c.numero + " Janela " + c.janela.cor + " de " + c.janela.material);
	}

}
