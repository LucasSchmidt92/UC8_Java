/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array;

/**
 *
 * @author LUCASSCHMIDTGONÇALVE
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExercicioArray informacoes = new ExercicioArray();
        
        informacoes.Informacoes();
        
        // Não pode alterar o tamanho do array após criá-lo.
        // Primeiro Método
        
        int[] numeros = new int[3];
        numeros[0] = 13;
        numeros[1] = 10;
        numeros[2] = 7;
        // System.out.println(numeros[0]+" "+numeros[1]+" "+numeros[2]);
        // System.out.println(numeros.length);
        
        String[] nomes = new String[3];
        nomes[0] = "Gabriel";
        nomes[1] = "GaAbriel";
        nomes[2] = "GAabriel";
        // System.out.println(nomes[0]+" "+nomes[1]+" "+nomes[2]);
        
        // Segundo Método
        
        String[] pokemons = {"Sceptile", "Swellow", "Torkoal", "Weavile", "Swampert"};
        // System.out.println(pokemons[0]+" "+pokemons[2]+" "+pokemons[3]+" "+pokemons[4]+" "+pokemons[1]+" \n");
        
        // For Each
        
        /*for(String poke : pokemons){
            System.out.println(poke);
        }
        */
        
    }
}