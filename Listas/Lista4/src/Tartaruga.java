
public class Tartaruga extends Animal{
	
	// quando uma tartaruga for correr, n�o ira imprimir nada, pq o medoto correr de animal esta vazio

	public Tartaruga(String n) { // 7-CONSTRUTORES N�O S�O HERDADOS
		super(n);
		// TODO Auto-generated constructor stub
	}

	public void correr() { //tem q ter pq correr � abstract
		
	}
	
	public String toString() {//8
		return "� Tartaruga - " + super.toString(); //chama toString da classe pai 
	}
}
