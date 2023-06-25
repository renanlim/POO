package br.com.banco;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList tributaveis;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.tributaveis = new ArrayList();
    }

    public void adicionarBem(ArrayList Tributaveis) {
        bens.add(bem);
    }

    public void removerBem(Tributavel bem) {
        bens.remove(bem);
    }

    public ArrayList<Tributavel> getBens() {
        return bens;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

public class Briofita extends Planta{
	public Briofita(String id, String nome, double tamamho) {
		super(id,nome,tamanho);
		return "[Briofita]" + id + nome + tamanho;
	}
}