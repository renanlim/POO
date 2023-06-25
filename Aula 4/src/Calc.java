
public class Calc {

	public static void main(String[] args) {
		System.out.println(media(2,4)); // sobrescrita de metodos: metodos 
		System.out.println(media(1,2,3));

	}
	
	// sobrescrita de metodos: metodos com o mesmo nome, mas quantidades diferentes de paramentros do mesmo tipo
	public static double media(double a, double b) {
		return ((a+b)/2);
	}
	public static double media(double a, double b,double c) {
		return ((a+b+c)/3);
	}

}
