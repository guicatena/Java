package com.mycompany.exercicioc;

//c) Faça um programa que recebe dois números inteiros distintos e exibe o maior.

import javax.swing.JOptionPane;


public class ExercicioC {

    public static void main(String[] args) {
        
        int numero1, numero2;
        
        numero1 = Integer.parseInt(
        JOptionPane.showInputDialog("Digite um numero inteiro: "));

        numero2 = Integer.parseInt(
        JOptionPane.showInputDialog("Digite outro numero inteiro: "));

        if (numero1 > numero2) {
        JOptionPane.showMessageDialog(null, numero1);
        }

        else {
        JOptionPane.showMessageDialog(null, numero2);
        }
    }
}
