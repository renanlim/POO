package br.com.gustavoguanabara.contabanco;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(123);
		p1.setDono("Renan");
		p1.abrirConta("CC");
		p1.depositar(300);
		p1.sacar(350);
		p1.fecharConta();
		p1.estadoAtual();
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(257);
		p2.setDono("Julia");
		p2.abrirConta("CP");
		p2.depositar(500);
		p2.sacar(100);
		p2.estadoAtual();
	}

}
