package br.com.exercicioaula6.funcionario;

public class AnalistaSistemas extends Funcionario {
	    
	    public AnalistaSistemas(String id, String nome, double salario) {
	        super(id);
	    }
	    
	    @Override
	    public String toString() {
	        return super.toString() + "Tipo: AnalistaSistemas\n";
	    }
	    
	    public void info() {
	        System.out.println(toString());
	    }

		public void setNome(String nome) {
		}

		public void setSalario(double salario) {
		}
}

