package com.mycompany.exerciciob;

//b) Tendo como entrada a altura e o sexo de uma pessoa, construa um programa que exibe o peso ideal
//para ela, em quilos. Use as seguintes fórmulas (adote ℎ como a altura e m metros):
//•⁠  ⁠Homens: 72,7 × ℎ − 58
//•⁠  ⁠Mulheres: 62,1 × ℎ − 44,7

import javax.swing.JOptionPane;


public class ExercicioB {

    public static void main(String[] args) {
        
        double h, sexo, peso;

        h = Double.parseDouble(
        JOptionPane.showInputDialog("Qual é sua altura em metros? "));

        sexo = Double.parseDouble(
        JOptionPane.showInputDialog("Qual é seu sexo? (1) Homem (2) Mulher"));

        if (sexo == 1) {
        peso = (72.7 * h - 58);
        JOptionPane.showMessageDialog(null, String.format("%.2f", peso) + "Kg");
        }

        else {
        peso = (62.1 * h - 44.7);
        JOptionPane.showMessageDialog(null, String.format("%.2f", peso) + "Kg");
    }
}
}