package br.com.exercicioaula6.funcionario;

import java.util.*;
import java.util.Scanner;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] funcionarios = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite as informações do funcionário " + (i+1) + ": ");
            funcionarios[i] = sc.nextLine();
        }

        ArrayList listafuncionarios = Utils.retornaDados(funcionarios);

        System.out.println("Funcionários:");
        for (Funcionario f : listafuncionarios) {
            System.out.println(f.getNome() + " - Salário: R$ " + f.getSalario());
        }

        double mediaAnalistas = Utils.mediaSalarial(listafuncionarios, "A");
        double mediaProgramadores = Utils.mediaSalarial(listafuncionarios, "P");

        System.out.println("Média salarial dos analistas: R$ " + mediaAnalistas);
        System.out.println("Média salarial dos programadores: R$ " + mediaProgramadores);
    }
}

