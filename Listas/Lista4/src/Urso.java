
public class Urso extends Animal {
	
	public Urso(String n) { //7- CONSTRUTORES NÃO SÃO HERDADOS
		super(n);
		// TODO Auto-generated constructor stub
	}

	public void correr() {
		System.out.println("Urso correndo"); //3
	}
	
	public String toString() {//8
		return "é Urso - " + super.toString(); //chama toString da classe pai 
	}
}
