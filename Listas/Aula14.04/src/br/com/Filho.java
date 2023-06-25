package br.com;

public class Filho extends Pai{

	public static void main(String[] args) {
		Filho f = new Filho();
		f.metodoDefault();
		f.metodoProtected();
		//acesso ao public - menos ao private porque estão no mesmo package
	}

}
