
public class Livro {
	   private String titulo;
	   private String autor;
	   private String editora;
	   private double preco;
	   
	   public Livro(String titulo, String autor, String editora, double preco) {
	      this.titulo = titulo;
	      this.autor = autor;
	      this.editora = editora;
	      this.preco = preco;
	   }
	   
	   @Override
	   public String toString() {
	      return "Livro [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + ", preco=" + preco + "]";
		   }
}
