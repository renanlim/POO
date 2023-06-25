package Zoologico;

public class Zoo {

	public static void main(String[] args) {
//		Leao x = new Leao();
//		Animal y = new Leao();
//		x.Rugir();
//		x.Correr();
//		y.Correr();
//		
//		
//		Object o =x;
//		Animal a =x;
//		x.setNome("Simba");
//		System.out.println(x.getNome());
		
		Animal k [] = new Animal[1];
		
		k[0] = new Leao();
//		k[1] = new Urso();
//		k[2] = new Elefante();
//		k[3] = new Gato();
		
		for( int i = 0; i<k.length; i++) {
			if(k[i] instanceof Leao) {
				Leao x = (Leao)k[i];
				x.Rugir();
			}
			k[i].Correr();
		}

	}

}
