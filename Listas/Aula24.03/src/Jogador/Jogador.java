package Jogador;

public class Jogador {
	private String nome;
	private double peso;
	private double altura;
	
	public String getNome() {  //get lendo
		return nome;
	}
	public void setNome(String nome) {  //set escrevendo
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Jogador(String n, double p, double a) {
		nome = n;
		peso = p;
		altura = a;
		System.out.println("Criando Objeto");
		System.out.println("Nome "+nome+", peso "+peso+ "kg e altura "+altura+"cm");
	}
}
