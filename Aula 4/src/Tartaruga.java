
public class Tartaruga extends Animal{
	
	// quando uma tartaruga for correr, não ira imprimir nada, pq o medoto correr de animal esta vazio

	public Tartaruga(String n) { // 7-CONSTRUTORES NÃO SÃO HERDADOS
		super(n);
		// TODO Auto-generated constructor stub
	}

	public void correr() { //tem q ter pq correr é abstract
		
	}
	
	public String toString() {//8
		return "é Tartaruga - " + super.toString(); //chama toString da classe pai 
	}
}
