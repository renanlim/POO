package Animal;

public class Teste {

	public static void main(String[] args) {
		Animal [] k = new Animal[100];
		for(int i = 0; i < 100; i++) {
			if(i%2 == 0) {
				k[i] = new Peixe();
			}else
				k[i] = new Gorila();
		}
		iniciarCorrida(k);
	}
	public static void iniciarCorrida(Animal [] x) {
		for(int i = 0; i < x.length; i++) {
			if(x[i] instanceof Corredor) {
				System.out.print(i+"-");
				((Corredor)x[i]).correr();
			}
		}
	}

}
