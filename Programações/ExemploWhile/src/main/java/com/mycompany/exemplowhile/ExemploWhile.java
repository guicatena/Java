package com.mycompany.exemplowhile;

import javax.swing.JOptionPane;


public class ExemploWhile {

    public static void main(String[] args) {
         double nota1, nota2;
         int contador = 1;
         
         while(contador <= 5) //while = enquanto
         {
             System.out.println("Aluno -> " + contador);
             
             nota1 = Double.parseDouble(
                     JOptionPane.showInputDialog("Digite nota 1:"));
             nota2 = Double.parseDouble(
                     JOptionPane.showInputDialog("Digite nota 2:"));
             
             JOptionPane.showMessageDialog(null, ((nota1 + nota2)/2) );
             
             contador++;
         }
     }
}
