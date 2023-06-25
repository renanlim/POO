package br.com.arvore;

public class TesteArvore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arvore v1 = new Arvore(); 

		System.out.println(v1.getNome()); 

		v1.setNome("Macieira"); 

		Arvore v2 = new Arvore(); 

		v2.setNome("Laranjeira"); 

		teste1(v1, v2); 

		System.out.println(v1.getNome()); 

		System.out.println(v2.getNome()); 

		v1.a = 81; 

		int x = v1.a; 

		v1.a=11; 

		v1.a = v2.a; 

		System.out.println(x); 

		teste2(v1.a, x, v1); 

		System.out.println(v1.getNome()); 

		System.out.println(x); 

		System.out.println(v1.a); 

		System.out.println(v1.b); 

		System.out.println(v2.a); 

		System.out.println(v2.b); 

		teste3(v2); 

		System.out.println(v2.getNome()); 

		System.out.println(v2.a); 

		} 

		public static void teste1(Arvore v1, Arvore v2) { 

		v1.setNome("Acacia "); 

		v1 = v2; 

		v1.setNome("Eucalipto"); 

		v2=v1; 

		} 

		public static void teste2(int x, int a, Arvore arv) { 

		a = 12; 

		x=18; 

		arv.setNome("Coqueiro"); 

		arv = new Arvore(); 

		arv.a = 46; 

		} 

		public static Arvore teste3(Arvore v2) { 

		v2 = new Arvore(); 

		v2.setNome("Mamoeiro"); 

		return v2; 

		} 

	} 
