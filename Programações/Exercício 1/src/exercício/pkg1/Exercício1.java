/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercício.pkg1;

import java.util.Scanner;

/**
 *
 * @author guica
 */
public class Exercício1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner (System.in);
        
        
        String  mae, pai, irma1, irma2;
        
//        System.out.print("Digite o sobrenome da familia: ");
//        sobrenome= sc.next();
        
        
        System.out.print("Digite o nome da mae: ");
        mae= sc.next();
        
        
        System.out.print("Digite o nome do pai: ");
        pai= sc.next();
        
        
        System.out.print("Digite o nome da irma mais velha: ");
        irma1= sc.next();

        System.out.print("Digite o nome da irma mais nova: ");
        irma2= sc.next();
        
        
//        System.out.print("Digite o seu nome: ");
//        nome= sc.next();

        
        System.out.println("Meus pais sao " + pai + " e " + mae);
        System.out.println("Meus irmaos sao " + irma1 + " e " + irma2);
        
        
        
        
    }
    
}
