package com.mycompany.exercicioe;

//e) Faça um programa que recebe um número inteiro e exibe uma mensagem indicando 
//se ele é par ou ímpar (use o operador % para obter o resto de uma divisão inteira).


import javax.swing.JOptionPane;

public class ExercicioE {

    public static void main(String[] args) {
        
        int num1, resto;
        
        num1 = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um numero inteiro: "));

        resto = (num1 % 2);
        if (resto == 0) {
            JOptionPane.showMessageDialog(null, "Esse numero é par!");
        }

        else {
            JOptionPane.showMessageDialog(null, "Esse numero é impar!");
        }
    }
}
