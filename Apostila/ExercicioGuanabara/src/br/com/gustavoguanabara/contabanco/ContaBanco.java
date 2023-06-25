package br.com.gustavoguanabara.contabanco;

public class ContaBanco {
//	Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
// Status
	public void estadoAtual() {
		System.out.println("----------------------");
		System.out.println("Conta: "+ this.getNumConta());
		System.out.println("Tipo: "+ this.getTipo());
		System.out.println("Dono: "+ this.getDono());
		System.out.println("Saldo: "+ this.getSaldo());
		System.out.println("Status: "+ this.getStatus());
		System.out.println("----------------------");
	}
	
//	Metodos
	public 	void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if("CC".equals(t)) {
			this.setSaldo(50);
		}else
			this.setSaldo(150);
		
	}
	public 	void fecharConta() {
		if(this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro");
		}else if(this.getSaldo() < 0) {
			System.out.println("Conta em debito");
		}else
			setStatus(false);	
	}
	public 	void depositar(double v) {
		if(this.getStatus()) {
			this.setSaldo(this.getSaldo() + v);
		}else
			System.out.println("Impossivel depositar");
	}
	public 	void sacar( double v) {
		if(this.getStatus()) {
			if(this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado");
			}else
				System.out.println("Saldo insuficiente");
		}else
			System.out.println("Conta nao aberta");
		
	}
	//CC - CONTA CORRENTE e CP - CONTA POUPANCA
	public 	void pagarMensal() {
		int v;
		if ("CC".equals(this.getTipo())) {
			v = 12;
		} else {
			v = 20;
		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - v);
			System.out.println("Mensalidade paga");
		} else {
			System.out.println("Impossivel pagar um conta fechada");
		}		
	}
	
//	Metodo especiais
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta(int n) {
		this.numConta = n;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String t) {
		this.tipo = t;
	}
	public String getDono() {
		return this.dono;
	}
	public void setDono(String d) {
		this.dono = d;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double s) {
		this.saldo = s;
	}
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean s) {
		this.status = s;
	}
//	Construtor
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}
}
