
public class Leao extends Animal{
	public Leao(String n) { //correçao do problema 5, apenas nessa subclasse
		super(n);   // 7- CONSTRUTORES NÃO SÃO HERDADOS
	} 				// super-> construtor da classe pai


	public void correr() {
		System.out.println("Leao correndo");
	}
	
	void rugir() {
		System.out.println("Leao rugindo");
	}
	
	public String toString() {//8
		return "é Leao - " + super.toString(); //chama toString da classe pai 
	}

}
