package Modificadores;

public class ContaGetSet {
	private String nomeCliente;
	private double saldo;
	
	public boolean sacar(double valor) {
		if((saldo - valor)>0) {
			saldo-=valor;
			return true;
		}else {
			System.out.println("Saque nao realizado");
			return false;
		}
	}
	public void depositar(double valor) {
		saldo +=valor;
		System.out.println("Saldo = "+saldo);
	}
	public void setNomeCliente(String nc) {
		if(nc.length()<3) {throw new RuntimeException();}
		nomeCliente=nc;
	}
	public double getSaldo() {
		return saldo;
	}
}
