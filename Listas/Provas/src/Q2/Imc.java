package Q2;

import java.util.*;
public class Imc {

	    public static void main(String[] args) {
	        
	        // Simulação do método BancoDeDados.getFunc(): List
	        List<String> funcionarios = BancoDeDados.getFunc();
	        
	        // Leitura do nome inserido no console
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Digite o nome do indivíduo: ");
	        String nomeInserido = sc.nextLine();
	        
	        // Variáveis para cálculo do IMC médio e proporção de indivíduos com IMC maior que o inserido
	        double somaImc = 0;
	        int qtdMaiores = 0;
	        
	        // Percorre a lista de funcionários procurando pelo indivíduo inserido
	        for (String funcionario : funcionarios) {
	            String[] campos = funcionario.split("#");
	            String nome = campos[0];
	            double peso = Double.parseDouble(campos[1]);
	            double altura = Double.parseDouble(campos[2]);
	            
	            // Se encontrou o indivíduo inserido, realiza o cálculo do IMC e exibe a saída
	            if (nome.equalsIgnoreCase(nomeInserido)) {
	                double imc = peso / (altura * altura);
	                somaImc += imc;
	                System.out.print(nome + " - " + imc + " - ");
	                System.out.printf("%.2f", altura);
	                
	                // Verifica se o IMC é maior que 40 para inserir o alerta
	                if (imc > 40) {
	                    System.out.print(" - ALERTA");
	                }
	                
	                System.out.println();
	                
	            // Se não encontrou, verifica se o IMC é maior que o do indivíduo inserido
	            } else {
	                double imc = peso / (altura * altura);
	                somaImc += imc;
	                if (imc > (Double.parseDouble(campos[1]) / (Double.parseDouble(campos[2]) * Double.parseDouble(campos[2])))) {
	                    qtdMaiores++;
	                }
	            }
	        }
	        
	        // Exibe o IMC médio e a proporção de indivíduos com IMC maior que o inserido
	        double imcMedio = somaImc / funcionarios.size();
	        double proporcaoMaiores = (double) qtdMaiores / funcionarios.size();
	        System.out.printf("IMC médio: %.2f\n", imcMedio);
	        System.out.printf("Proporção de indivíduos com IMC maior que o inserido: %.2f", proporcaoMaiores);
	    }

	}
