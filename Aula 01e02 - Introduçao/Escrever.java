/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

import java.util.Scanner;

/**
 *
 * @author LUCASSCHMIDTGONÇALVE
 */
public class Escrever {
    public static void escrever(){
      // Cria um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        String nome;

        // Declara duas variáveis inteiras para armazenar os números digitados pelo usuário
        int numero1, numero2;
        
        System.out.println("Digite seu nome:");
        nome = sc.nextLine();

        // Solicita ao usuário que digite o primeiro número
        System.out.println("Digite um número: ");
        numero1 = sc.nextInt(); // Lê o próximo inteiro digitado pelo usuário e o armazena em numero1
        System.out.println("O usuario digitou: "+ numero1);
        
        // Solicita ao usuário que digite o segundo número
        System.out.println("Digite outro número: ");
        numero2 = sc.nextInt(); // Lê o próximo inteiro digitado pelo usuário e o armazena em numero2
        System.out.println("O usuario digitou: "+ numero2);
        
        // Exibe uma mensagem para indicar que o resultado será mostrado
        int soma = numero1 + numero2;
        System.out.println("OLa " + nome +" "+ soma + " é o resultado da soma");

        // Fecha o objeto Scanner para liberar os recursos utilizados
        sc.close();  
    }
    
    
}
