package Q2;

public class Media {
	public static double calcula(String numeros) {
        String[] numerosArray = numeros.split("#");
        int soma = 0;
        for (int i = 0; i < numerosArray.length; i++) {
            soma += Integer.parseInt(numerosArray[i]);
        }
        return (double) soma / numerosArray.length;
    }
}

