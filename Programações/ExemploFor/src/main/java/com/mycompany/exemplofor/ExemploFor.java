package com.mycompany.exemplofor;

import javax.swing.JOptionPane;


public class ExemploFor {

    public static void main(String[] args) {
        
        double nota1, nota2, media;
        
//        for(inicia o contador; parametro; incremento/decremento
          for(int i=1; i <=5; i++)
          {
            System.out.println("Aluno " + i);
             nota1 = Double.parseDouble(
                     JOptionPane.showInputDialog("Digite nota 1:"));
             nota2 = Double.parseDouble(
                     JOptionPane.showInputDialog("Digite nota 2:"));
             
             media= ((nota1 + nota2)/2);
             
             System.out.println("Aluno " + i + " - " + media);
             JOptionPane.showMessageDialog(null, ((nota1 + nota2)/2) );
             
          }
    }
}
