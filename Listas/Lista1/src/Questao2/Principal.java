package Questao2;

public class Principal {
	public static void main(String[] args) {
		
		GatoTeste g1 = new GatoTeste();
		GatoTeste g2 = new GatoTeste();
		GatoTeste g3 = new GatoTeste();
		g1.nome = "Calef";
		g1.idade = 1;
		g1.vivo = true;
		g1.cor = "cinza";
		
		g2.nome = "Simba";
		g2.idade = 4;
		g2.vivo = true;
		g2.cor = "amarelo";
		
		g3.nome = "Tomoyo";
		g3.idade = 0;
		g3.vivo = false;
		g3.cor = "branco";
		
		System.out.println(g1.nome + " tem " + g1.idade + " ano , possui cor " + g1.cor + " e esta " + (g1.vivo?"vivo":"morto"));
		System.out.println(g2.nome + " tem " + g2.idade + " ano , possui cor " + g2.cor + " e esta " + (g2.vivo?"vivo":"morto"));
		System.out.println(g3.nome + " tem " + g3.idade + " ano , possui cor " + g3.cor + " e esta " + (g3.vivo?"vivo":"morto"));
	}
}