package com.mycompany.exerciocioa;

//a) Faça um programa que recebe duas notas, exibe a média aritmética das notas e uma mensagem indicando 

import javax.swing.JOptionPane;

// se o aluno foi aprovado ou reprovado. A média para aprovação deve ser maior que seis.

public class ExerciocioA {

    public static void main(String[] args) {
    {
        double nota1, nota2, media;
        
        nota1 = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o valor da nota 1?"));

        nota2 = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o valor da nota 2?"));

        media = (nota1 + nota2) / 2;

        JOptionPane.showMessageDialog(null, "A média é de " + media);

        if (media >= 6) {
        JOptionPane.showMessageDialog(null, "Aluno aprovado!");
        }

        else {
        JOptionPane.showMessageDialog(null, "Aluno reprovado!");
        }
    }
}
}
