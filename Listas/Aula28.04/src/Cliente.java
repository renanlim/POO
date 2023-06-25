
public class Cliente {
	private String cpf;
	private int idade;
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCpf() {
		return cpf;
	}
	public Cliente(String cpf) {
		setCpf(cpf);
	}
	//dado dois objetos com o mesmo conteudo quero retornar true e sobrescrever
	public boolean equals(Object x) {
		if(x instanceof Cliente) {
			Cliente m = (Cliente)x;
			boolean b = getCpf().equals(m.getCpf());
			return b;
		}
	return false;
	}
}
