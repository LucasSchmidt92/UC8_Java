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

    

public class Exercicio1 {
    //Criar um metodo que verifica se um numero que usuario digitar é par ou não é?
    public void verificarNumero(){
        Scanner sc = new Scanner(System.in);
        
        int numeroDigitado;
        
        System.out.println("Digite um Número: ");
        numeroDigitado = sc.nextInt();
        
        String verificacao = (numeroDigitado % 2 == 0) ? "Par" : "Ímpar";
        
        System.out.println("O número escolhido é "+ numeroDigitado + " e ele é "+ verificacao);
        
        sc.close();
    }
}

