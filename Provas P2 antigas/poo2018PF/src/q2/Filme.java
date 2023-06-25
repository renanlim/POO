package q2;

public class Filme implements Comparable<Filme>{
	private int id;
	private String titulo;
	private int ano;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Filme) {
			Filme x = (Filme)obj;
			return titulo.equals(x.titulo);
		}
		return false;
	}
	@Override
	public int compareTo(Filme o) {
		return titulo.compareTo(o.titulo);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return titulo;
	}
}
