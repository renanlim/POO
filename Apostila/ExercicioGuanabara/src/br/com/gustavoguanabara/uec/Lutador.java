package br.com.gustavoguanabara.uec;

public class Lutador {
	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	//Construtor
	public Lutador(String nome, String na, int idade, double altura, double peso, int vi, int der, int emp) {
		this.setNome(nome);
		this.setNacionalidade(na);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setPeso(peso);
		//this.setCategoria(cat);
		this.setVitorias(vi);
		this.setDerrotas(der);
		this.setEmpates(emp);
	}
	//Metodos
	public void apresentar() {
		System.out.println("Lutador: "+ this.nome);
		System.out.println("Nacionalidade: "+ this.nacionalidade);
		System.out.println("Idade: "+ this.idade);
		System.out.println("Peso: "+ this.peso);
		System.out.println("Altura: "+ this.altura);
		System.out.println("Categoria: "+ this.categoria);
	}
	public void status() {
		System.out.println("Vitorias: "+ this.vitorias);
		System.out.println("Derrotas: "+ this.derrotas);
		System.out.println("Empates: "+ this.empates);
	}
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
	}
	public void perderLuta() {
		this.setVitorias(this.getVitorias()+1);
		
	}
	public void empatarLuta() {
		this.setVitorias(this.getVitorias()+1);
		
	}
	
	
	
	
	//Metodos especiais
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return categoria;
	}
	private void setCategoria() {
		if(this.getPeso()<52.2) {
			this.categoria = "Invalido";
		}else if(this.getPeso() <= 70.3) {
			this.categoria = "Leve";
		}else if(this.getPeso() <= 83.9) {
			this.categoria = "Medio";		
		}else if(this.getPeso() <= 120.2) {
			this.categoria = "Pesado";
		}else
			this.categoria = "Invalido";
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
}
