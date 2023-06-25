
public class PrincipalDeAnimal {

	public static void main(String[] args) {
		//Animal []x= {new Leao(), new Urso()};//0
		Animal []x= {new Leao("Simba"), new Urso("Panda")};//0

		correrTudo(x);
		
	}
	
	// o metodo estatico main nao compila chamando um metodo não estatico
	// pq nao tem objeto criado
	
	// metodos precisam de objetos para serem excutados, exceto os metodos STATIC
	
	
	public static void correrTudo(Animal y[]) {
		for(int i=0;i<y.length;i++) {
			//y[i].correr();  //0
			//System.out.println(y[i].toString());  //1
			
//			if(y[i] instanceof Leao) { //2
//				//y[i].rugir(); // apesar de termos certeza q o objeto é um leao, nao compila
//				((Leao)y[i]).rugir(); 
//				/*OU:
//				 * Leao U =(Leao)y.[i]
//				 * U.rugir();
//				 * */
//			}
//			y[i].correr();// fim 2
			
			//y[i].correr();//3- error de compilação pq tiramos o metodo correr da classe Animal
			
			
			
		}
	}

}
/*
 * O que sai na tela? 
	0- Leao correndo, Animal correndo
	1- Compila pq o metodo toString esta na classe object, todos os objetos herdam dessa classe
		Nome da classe + codigo hashcode(?) do objeto
	
 */