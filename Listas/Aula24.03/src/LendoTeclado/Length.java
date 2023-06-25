package LendoTeclado;

public class Length {
	public static void main(String [] args) {
		String array[]= new String[10];
		array[0] = "Renan";
		array[1] = "Matheus";
		for(int i= 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}


//A propriedade length tem como responsabilidade retornar a quantidade de caracteres de uma string ou o tamanho de um array. 
//Caso a string ou o array esteja vazio, é retornado o valor 0.