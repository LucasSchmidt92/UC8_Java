/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

/**
 *
 * @author LUCASSCHMIDTGONÇALVE
 */
public class Tipos {
    
    String meuNome  = "Lucas";
    char minhaInicial = 'L';
    int minhaIdade = 32;
    double minhaAltura = 1.79;
    boolean verdadeiroOuFalso = true;
    
    public void verificaIdade(int idade){
       if (idade >= 18){
           System.out.println("Voce é maior de idade, pois tem " + idade + " anos.");
       } else {
           System.out.println("Voce é menor de idade, pois tem "+idade+ " anos.");
       }
    }
    
    //primeiro se é private ou public ou protected o metodo, depois devemos especifica o tipo de retono
    // e depois os parametros, se houverem
    //depoois colocamos o nome do metodo
    
    public int calculaSoma(int num1, int num2){
        return num1 + num2;
    }
    
    public void nacionalidade(String pais){
    
        switch (pais){
            case "Brasil":
                System.out.println("Voce é Brasileiro");
                break;
            case "Argentina":
              System.out.println("Voce é Artgentino");
                break;  
            default:
                System.out.println("Nacionalidade não encontrada");
                break;
            
    }
   
        
    }
}
