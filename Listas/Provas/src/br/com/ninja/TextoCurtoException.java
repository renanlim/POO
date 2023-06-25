package br.com.ninja;

public class TextoCurtoException extends Exception {
	public TextoCurtoException(int tam) {
        super("Texto inserido com " + tam + " caracteres.");
    }

    public TextoCurtoException() {
        //super("Texto inserido com menos de 10 caracteres.");
    }
}
