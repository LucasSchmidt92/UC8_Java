/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraydinamico;
import java.util.ArrayList;
/**
 *
 * @author LUCASSCHMIDTGONÇALVE
 */
public class ArrayDinamico {

    public static void main(String[] args) {
         ArrayList<String> nomes = new ArrayList<>();
        
        // Adicionar elementos ao Array List
        nomes.add("Lucas");
        nomes.add("Clayson");
        nomes.add("Fagner");
        nomes.add(1, "Lucas Diferente"); // Dá para adicionar assim também
        
        System.out.println(nomes);
        
        nomes.remove(0); 
        System.out.println(nomes.get(2)); // Acessar uma posição do array
        System.out.println(nomes.indexOf("Fagner")); // Quais as posições que determinado valor aparece
        System.out.println(nomes.lastIndexOf("Clayson")); // Último index
        
        nomes.set(2, "Ignite");
        
        System.out.println(nomes);
        
        System.out.println(nomes.size()); // Tamanho do array list
    }
}
