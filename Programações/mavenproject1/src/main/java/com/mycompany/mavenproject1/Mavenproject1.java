package com.mycompany.mavenproject1;

import java.util.Scanner;


public class Mavenproject1 {

    public static void main(String[] args) {
        
   
        
        Scanner scanner = new Scanner(System.in);

        int totalIdade = 0;
        int totalPessoas = 0;
        int qtdFeminino30_40 = 0;
        int qtdMasculino60_70 = 0;

        while (true) {
            System.out.print("Digite a idade (ou um número negativo para sair): ");
            int idade = scanner.nextInt();
            if (idade < 0) {
                break;
            }

            System.out.print("Digite o sexo (1 para Feminino, 2 para Masculino): ");
            int sexo = scanner.nextInt();

            System.out.print("Digite o peso (em kg): ");
            double peso = scanner.nextDouble();

            totalIdade += idade;
            totalPessoas++;

            if (sexo == 1 && idade >= 30 && idade <= 40) {
                qtdFeminino30_40++;
            } else if (sexo == 2 && peso >= 60 && peso <= 70) {
                qtdMasculino60_70++;
            }
        }

        if (totalPessoas > 0) {
            double mediaIdade = (double) totalIdade / totalPessoas;
            System.out.println("\nMédia de idade das pessoas: " + mediaIdade);
        } else {
            System.out.println("\nNenhuma pessoa registrada.");
        }

        System.out.println("Quantidade de mulheres entre 30 e 40 anos: " + qtdFeminino30_40);
        System.out.println("Quantidade de homens com peso entre 60 e 70 kg: " + qtdMasculino60_70);

        scanner.close();
    }
}
    

