package exercício.pkg4;

import java.util.Scanner;


public class Exercício4 {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int salarioFixo, vendas, salarioTotal, comissao;
        
        System.out.print("Digite o seu nome: ");
        nome= sc.next();
        
        
        System.out.print("Digite o salario: ");
        salarioFixo= sc.nextInt();
        
        
        System.out.print("Digite o numero de vendas: ");
        vendas= sc.nextInt();
        
        
        comissao= sc.nextInt((vendas*15)/100);

        System.out.println("Nome: " + nome);
        System.out.println("Numero de vendas: " + vendas);
        System.out.println("Comissao: " + (vendas*15)/100);
        System.out.println("Salario: " + salarioFixo);
        System.out.println("Salario total: " + (salarioFixo+comissao));
        
                
    }
    
}
