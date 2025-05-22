/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissors;

/**
 *
 * @author LUCASSCHMIDTGONÇALVE
 */
public class Duel {
      String vencedor;
    
    public String duel(){
        Player player = new Player();
        String escolhaBot = this.bot();
        String escolhaPlayer;
        System.out.println(escolhaBot);
        
        player.choose();
        escolhaPlayer = player.getEscolhido();
        
        this.compare(escolhaPlayer, escolhaBot);
        //this.compare("Tesoura", "Tesoura");
        System.out.println("Player - "+escolhaPlayer+" VS "+escolhaBot+" - Bot");
        System.out.println("Você "+vencedor+" essa partida!");
        return this.vencedor;
    }
    
    public String bot(){
        String escolha = "";
        
        int numAleatorio = (int)(Math.random()*3)+1;
        
        switch(numAleatorio){
            case 1:
                escolha = "Pedra";
                break;
            case 2:
                escolha = "Papel";
                break;
            case 3:
                escolha = "Tesoura";
                break;
            default:
                System.out.println("Opção Inválida!");
        }
        return escolha;
    }
    
    public void compare(String player, String playerBot){
        if(player == playerBot){
            this.vencedor = "Empatou";
        } else if(player == "Tesoura"){
            if(playerBot == "Papel"){
                this.vencedor = "Venceu";
            } else {
                this.vencedor = "Perdeu";
            }
        } else if(player == "Papel"){
            if(playerBot == "Pedra"){
                this.vencedor = "Venceu";
            } else {
                this.vencedor = "Perdeu";
            }
        } else {
            if(playerBot == "Tesoura"){
                this.vencedor = "Venceu";
            } else {
                this.vencedor = "Perdeu";
            }
        }
    }
}