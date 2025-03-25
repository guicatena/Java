/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício.pkg3;

import java.util.Scanner;

/**
 *
 * @author guica
 */
public class Exercício3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int c, f;
        
        
        System.out.print("Qual a temperatura em C: ");
        c= sc.nextInt();
        
        System.out.println("A temeperatura em F eh: " + (9*c+160)/5);

        
    }
    
}
