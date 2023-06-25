package br.tom;

import br.com.Pai;

public class Outro extends Pai {

	public static void main(String[] args) {
		Outro o = new Outro();
		o.metodoProtected(); //protected funciona
		o.metodoDefault(); //default não porque ele é package friend, ou seja, só quando estiver dentro do mesmo pacote
							//mesmo sendo extendido
							
	}

}
