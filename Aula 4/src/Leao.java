
public class Leao extends Animal{
	public Leao(String n) { //corre�ao do problema 5, apenas nessa subclasse
		super(n);   // 7- CONSTRUTORES N�O S�O HERDADOS
	} 				// super-> construtor da classe pai


	public void correr() {
		System.out.println("Leao correndo");
	}
	
	void rugir() {
		System.out.println("Leao rugindo");
	}
	
	public String toString() {//8
		return "� Leao - " + super.toString(); //chama toString da classe pai 
	}

}
