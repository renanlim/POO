
public class Principal {

	public static void main(String[] args) {
		System.out.println("Esta � minha classe principal...");
		Cachorro c = new Cachorro();
		Cachorro d = new Cachorro();
		c.nome="Bidu";
		d.nome="Pluto";
		c.latir();
		d.latir();
		
	}
}
