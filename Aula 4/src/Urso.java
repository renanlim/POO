
public class Urso extends Animal {
	
	public Urso(String n) { //7- CONSTRUTORES N�O S�O HERDADOS
		super(n);
		// TODO Auto-generated constructor stub
	}

	public void correr() {
		System.out.println("Urso correndo"); //3
	}
	
	public String toString() {//8
		return "� Urso - " + super.toString(); //chama toString da classe pai 
	}
}
