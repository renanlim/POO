package br.com.ninja;
import java.util.*;

public class UtilsPalavrao extends Exception {
	public static void verifica(String texto) throws TextoCurtoException {
        if (texto.length() < 10) {
            throw new TextoCurtoException(texto.length());
        }
    }

    public static String moderar(String texto) {
        Set<String> palavroes = Utilidades.getPalavroes();
        for (String palavrão : palavroes) {
            texto = texto.replaceAll("(?i)" + palavrão, "#".repeat(palavrão.length()));
        }
        return texto;
    }
}
