/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeiroprojeto;

/**
 *
 * @author LUCASSCHMIDTGONÇALVE
 */
public class Animal {
    private String name;
    private String species;
    private double weight;
    
    //se fosse typescript
    //constructor(name:string, species:string, weight:number(double)){
    //this.name = name;
    //this.species = species;
    //this.weight = weight;
    
    
    //o metodo construtor, em java, deve ser declardo como publico
    //não deve ir retorno nem void
    //Deve ter o mesmo nome exato da classe

    

    public Animal(String name, String species, double weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }
    
    public void emitirSom(){
        System.out.println("O animal emitiu um som");
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    
    
    
}
