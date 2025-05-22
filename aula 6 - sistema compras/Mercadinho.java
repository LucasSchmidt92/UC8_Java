/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.comprasarraylist;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LUCASSCHMIDTGONÇALVE
 */
public class Mercadinho {
    ArrayList<Produto> carrinho;
    ArrayList<Produto> estoque;
    Scanner sc;
            
    public Mercadinho(){
        carrinho = new ArrayList<>();
        estoque = new ArrayList<>();
        sc = new Scanner(System.in);
        
        
    }
    
    public void MenuDoMercadinho(){
        boolean start = false;
        while(!start){
            System.out.println("O que vamos fazer?\n1 - Adicionar item ao Carrinho;\n"+
                    "2 - Remover item do Carrinho;\n3 - Ver meu Carrinho;\n4 - Finalizar a compra;\n5 - Desistir da compra\n"
                    +"Digite a opção desejada: ");
            
            int opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    this.listaDeProdutos();
                    System.out.println("Colocou o produto no carrinho!\n");
                    break;
                case 2:
                    if(carrinho.isEmpty()){
                        System.out.println("Não há itens para remover!\n");
                    } else {
                        this.mostrarCarrinho();
                        System.out.println("Escolha um item para remover: ");
                        int opcRemover = sc.nextInt()-1;  
                        
                        if(opcRemover >=0 || opcRemover > carrinho.size()){
                            System.out.println("O carrinho não está tão cheio assim!!\n");                           
                        } else {
                           carrinho.remove(opcRemover);
                           System.out.println("Esse produto não era necessário!\n"); 
                        }
                    }                    
                    break;
                case 3:
                    if(!carrinho.isEmpty()){                        
                        this.mostrarCarrinho();
                        System.out.println("Esses itens estão no seu carrinho!\n");
                    }
                    else {
                        System.out.println("Não há itens no carrinho!\n");
                    }
                    break;
                case 4:
                    if(!carrinho.isEmpty()){
                        double valor = 0;
                        
                        for(Produto item : carrinho){
                            valor+=item.getPreco();
                        }
                        System.out.println("Agora é a hora da verdade!");
                        System.out.println("A compra deu "+ valor);
                    } else {
                        System.out.println("Cara, você não comprou nada ainda!!");
                    }                    
                    break;
                case 5:
                    System.out.println("Acabou a grana!!!");
                    start = true;
                    break;
                default:
                    System.out.println("Você não pode fazer isso no mercadinho!!");
                    break;
            }
        }
    }
    
    public void listaDeProdutos(){
        boolean start = false;
        Produto produto;
        while(!start){
            System.out.println("Qual item você deseja?\n1 - Playstantion 5;\n"+
                    "2 - Iphone 16;\n3 - Camiseta do Internacional;\n4 - Picanha;\n5 - Desistir da compra\n"
                    +"Digite a opção desejada: ");
            
            int opcao = sc.nextInt();
            
            switch(opcao){
                case 1:
                    produto = new Eletronicos("Playstantion 5", 4999.99);
                    carrinho.add(produto);
                    System.out.println("Colocou o "+produto.getNome()+" no carrinho!");
                    start = true;
                    break;
                case 2:
                    produto = new Eletronicos("Iphone 16", 9780.20);
                    carrinho.add(produto);
                    System.out.println("Colocou o "+produto.getNome()+" no carrinho!");
                    start = true;
                    break;
                case 3:
                    produto = new Eletronicos("Camiseta do Internacional", 499.99);
                    carrinho.add(produto);
                    System.out.println("Colocou o "+produto.getNome()+" no carrinho!");
                    start = true;
                    break;
                case 4:
                    produto = new Eletronicos("Picanha", 89.99);
                    carrinho.add(produto);
                    System.out.println("Colocou o "+produto.getNome()+" no carrinho!");
                    start = true;
                    break;
                case 5:
                    System.out.println("Não que mais comprar!!!");
                    start = true;
                    break;
                default:
                    System.out.println("Você não pode fazer isso no mercadinho!!");
                    break;
            }
        }
    }
    
    public void mostrarCarrinho(){
        for(int i = 0; i < carrinho.size(); i++){
            System.out.println((i+1)+" - "+carrinho.get(i).getNome());
        }
    }
}
