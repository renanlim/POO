import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String codigo;
	private String nome;
	private int populacao;
	private double dimensao;
	
	private List<Pais> paisesFronteira = new ArrayList<Pais>();
	
	public Pais (String codigo) {
		this.codigo = codigo.toUpperCase();
	}
	
	public Pais (String codigo, String nome, double dimensao) {
		this(codigo);
		this.nome = nome;
		this.dimensao = dimensao;
	}

	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	public double getDimensao() {
		return dimensao;
	}
	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	public String getNome() {
		return nome;
	}
	public String getCodigo() {
		return codigo;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Pais) {
			Pais p2 = (Pais) obj;
			return getCodigo().equals(p2.getCodigo());
		}
		return false;
	}
	
	public double getDensidade () {
		return populacao/dimensao;
	}
	public boolean fronteira (Pais p2) {
		return paisesFronteira.contains(p2);
	}
	public String toString() {
		String str = getNome() + "\n"+getDensidade()+ "\n";
		for (int i=0; i<paisesFronteira.size(); i++) {
			Pais p = paisesFronteira.get(i);
			str += p.getNome() + "\n";
		}
		return str;
		
	}
	public void addPaisFronteira(Pais p) {
		paisesFronteira.add(p);
	}
}
