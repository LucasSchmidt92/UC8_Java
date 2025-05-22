/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprasarraylist;

/**
 *
 * @author LUCASSCHMIDTGONÇALVE
 */
public class Produto {
    private String nome;
    private double preco;
    protected String tipo;

    public Produto(String nome, double preco, String tipo) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
    
 
}