package Questao3;

public class Impar {
	public static void main(String[] args) {
		
		int soma = 0;
		for(int i = 1; i < 10000 ; i++) {
			if(i%2 == 1) {
				soma+=i;
			}
		}
		System.out.println(soma);	
	}
}
