package Questao5;

public class Conta {
	double saldo, testeSaldo;
	
	public void calcula() {
		if(saldo < 1000) {
			testeSaldo = saldo * 0.1;
		}
		System.out.println(testeSaldo);
	}
}


/*public class Conta {
	double saldo;
	
	public void calcula() {
		if(saldo < 1000) {
			double testeSaldo = saldo * 0.1;
		}
		System.out.println(testeSaldo);
	}
}*/

// a variavel precisa ser declarada fora do escopo pois ela dentro do if depois que acaba perde a referencia