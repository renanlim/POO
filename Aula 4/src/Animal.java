
public abstract class Animal {
	private String nome;
	private int idade;
	private double peso;
	private String cor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
//	void correr() { //(3) tiramos o metodo correr pq ele esta em leao e em urso
//		System.out.println("Animal correndo");
//	}
	
//	void correr() {
//	
//	}
	
	public abstract void correr();
	/* 4
	 * o metodo abstract é vazio na classe pai
	 * as classes filhos são obrigadas a implementar todos os metodos abstratos do pai
	 * o q não é abstrato é concreto
	 * Mas para ter um metodo abstrato, a classe tbm precisa ser abstrato, entao nao poderemos criar objetos dessa classe
	 * da para criar um array, pq array não instancia os objetos
	 * */
	
	public Animal(String n) { // 5 - é um construtor, e causa erro em todas as subclasses, agora não tem mais o construtor default
		nome=n;
	}
	
//	public Animal() { // 6- problema 5 resolvido
//		//na prova não vai poder criar esse construtor
//	}
	
	public String toString() {
		return nome+" - "+idade;
	}
	// Sobrecarga de construtores: posso ter quantos construtores quiser, mas cada um tem q receber quantidades diferentes do mesmo paramentro, senao nao tem como saber qual estamos chamando
	// ex: nao pode ter dois construtores que recebem uma string de parametro
	public Animal(String n, int i) {
		this(n); //chama o construtor dessa classe, que recebe uma string como parametro
		idade=i;
	}
	
}
