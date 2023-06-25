package poo2018PF;

public class Televisao extends Produto implements Ligavel{
	public Televisao (String id) {
		super(id);
	}
	public void ligavel() {
		System.out.println("ligando televisao");
	}
	
}
