package br.com.ninja;
import java.util.*;

public class ProgramaPalavrao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Entre com uma frase: ");
        String texto = sc.nextLine();
        try {
            UtilsPalavrao.verifica(texto);
            String textoModerado = UtilsPalavrao.moderar(texto);
            System.out.println("Texto moderado: " + textoModerado);
        } catch (TextoCurtoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
	}
}
