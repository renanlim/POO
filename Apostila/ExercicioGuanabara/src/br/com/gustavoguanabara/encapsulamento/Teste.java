package br.com.gustavoguanabara.encapsulamento;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControleRemoto c1 = new ControleRemoto();
		c1.ligar();
		c1.maisVolume();
		//c1.ligarMudo();
		c1.play();
		
		c1.abrirMenu();
		c1.fecharMenu();
	}

}
