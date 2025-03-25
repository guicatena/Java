/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloturma;

import java.util.Scanner;

/**
 *
 * @author guica
 */
public class HelloTurma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        
        String nome;
        int n1, n2;
        
        System.out.print("Digite seu nome: ");
        nome= sc.next();
        System.out.println("Ola "+ nome);
        
        System.out.print("Digite um numero: ");
        n1 = sc.nextInt(); //leia
        
        System.out.print("Digite outro numero: ");
        n2 = sc.nextInt();
        
        System.out.println("Soma= " + (n1+n2));
        System.out.println("Subtracao= " + (n1-n2));
        System.out.println("Multiplicacao= " + (n1*n2));
        System.out.println("Divisao= " + (n1/n2));
        
        
        
    }
    
}
