package com.mycompany.exerciciod;

//d) Faça um programa que recebe dois números reais e exibe o menor deles e com duas casas decimais.

import javax.swing.JOptionPane;


public class ExercicioD {

    public static void main(String[] args) {
        
        double numero_1, numero_2;
        
        numero_1 = Double.parseDouble(
        JOptionPane.showInputDialog("Digite um numero real: "));

        numero_2 = Double.parseDouble(
        JOptionPane.showInputDialog("Digite outro numero real: "));

        if (numero_1 < numero_2) {
        JOptionPane.showMessageDialog(null, String.format("%.2f", numero_1));
        }

        else {
        JOptionPane.showMessageDialog(null, String.format("%.2f", numero_2));
        }
    }
}
