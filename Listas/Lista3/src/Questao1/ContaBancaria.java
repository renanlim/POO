package Questao1;

public class ContaBancaria {
	private double saldo;
	private Data dataAbertura;
	
	//a) -- Atribuição do valor 0 ao saldo que é um campo privado do tipo double
	public ContaBancaria(){
		this.saldo = 0;
	}
	//b) -- Métodos get() e set() para o campo saldo
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//c) -- Métodos get() e set() para o campo dataAbertura
	public Data getDataAbertura() {
		return dataAbertura;
	}
	public void setDataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	//d)
	public String getDataAberturaFormatada() {
		return this.dataAbertura.toString();
	}
	//e)
	public String getSaldoFormatado() { 
        return String.format("R$ %.2f", this.saldo);
	}
	//f)
	public void depositar(double valor) {
		this.saldo += valor;
	}
	//g)
	public void sacar(double valor) {
		this.saldo -= valor;
	}
}
