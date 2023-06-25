package br.com.exercicioaula6.funcionario;

public class Programador extends Funcionario {
    
    public Programador(String id, String nome, double salario) {
        super(id);
    }
    @Override
    public String toString() {
        return super.toString() + "Tipo: Programador\n";
    }
    
    public void info() {
        System.out.println(toString());
    }
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		
	}

	public void setSalario(double salario) {
		// TODO Auto-generated method stub
		
	}
    
}
