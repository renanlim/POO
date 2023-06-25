package br.com.lojavirtual.main;
import br.com.lojavirtual.informatica.*; // * indica todas as CLASSES do pacote
// pacote não carrega nada da memoria
//import br.com.lojavirtual.*; // nao importa as classes que estao em informatica e instrumento, apenas as classes que estao em lojavirtual (ou seja, nenhuma)



public class Carrinho {
	public static void main(String[] args) {
		Teclado t1 = new Teclado(); // não sabe qual criar, por isso q importamos a classe q vamos usar
		br.com.lojavirtual.instrumento.Teclado t2 = new br.com.lojavirtual.instrumento.Teclado(); // nome totalmente qualificado= nome do pacote + nome da classe 
	}

}
