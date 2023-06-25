package Questao7;

public class Conta {
	boolean saldo;
	
	public void calcula() {
		if(saldo) {
			System.out.println("Tem saldo");
		}else {
			System.out.println("Nao tem saldo");
		}
	}
}
/*public class Conta {
	double saldo;
	
	public void calcula() {
		if(saldo) {
			System.out.println("Tem saldo");
		}else {
			System.out.println("Nao tem saldo");
		}
	}
}

 O Java é diferente das linguagens C e C++ porque uma declaração
“if” assume uma expressão booleana e não um valor numérico. Assim, o saldo é tipo double (numerico) e nao boolean*/