package produto;

public class Televisao extends Produto implements Ligavel {
	 public Televisao(String id) {
	        super(id);
	    }

	    @Override
	    public void ligavel() {
	        System.out.println("Televisão ligada");
	    }
}
