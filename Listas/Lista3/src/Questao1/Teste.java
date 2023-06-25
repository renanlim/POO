package Questao1;

public class Teste {

	public static void main(String[] args) {
		Data dataAbertura = new Data(16, 11, 1998);
		ContaBancaria contaRenan = new ContaBancaria();
		contaRenan.setDataAbertura(dataAbertura);
		contaRenan.depositar(500);
		contaRenan.sacar(200);
		System.out.println(contaRenan.getDataAberturaFormatada());
		System.out.println(contaRenan.getSaldoFormatado());
		System.out.println(contaRenan.getSaldo());
		System.out.println(contaRenan.getDataAbertura());
	}
}
