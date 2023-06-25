package Animal;

public class Gorila extends Animal implements Corredor, Pulador {
	public void correr() {
		System.out.println("Correndo");
	}
	public void parar() {
		System.out.println("Parando");
	}
	public void acelerar() {
		System.out.println("Acelerando");
	}
	public void pular() {
		System.out.println("Pulando");
	}
}
