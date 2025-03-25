package com.mycompany.tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);    
        int num, calc , resp = 1;
        
       while(resp == 1)      {
        System.out.print("Digite um número: ");
        num = sc.nextInt();
        
        for(int i=0; i <= 10; i++)
        {
            calc = num * i;
            System.out.println( num + " x " + i + " = " + calc );
        }
        System.out.println("Deseja continuar? 1-sim 2-nao");
        resp = sc.nextInt();
        }       
    }
}
