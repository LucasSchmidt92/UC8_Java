/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

/**
 *
 * @author LUCASSCHMIDTGONÇALVE
 */
public class Dog extends Animal{
    
    private String breed;
    
    public Dog(String name, String species, double weight, String breed) {
        super(name, species, weight);
        this.breed = breed;
    }
    
    @Override //significa = sobrescrever
       public void emitirSom(){
        System.out.println("o cachorro latiu.");
    }
    

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    
    
}
