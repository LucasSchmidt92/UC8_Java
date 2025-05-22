/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissors;

/**
 *
 * @author LUCASSCHMIDTGONÇALVE
 */
public class Game {
      public void CheckScore(){
        int playerScore= 0;
        int botScore = 0;
        int rodadas = 0;
        Duel duel = new Duel();
        boolean acabou= false;
        
        while(acabou == false || rodadas <= 3){
            rodadas++;
            String resultado = duel.duel();
        
            switch(resultado){
                case "Venceu":
                    playerScore++;
                    break;
                case "Perdeu": 
                    botScore++;
                    break;
                default:
                    
                    break;
            }
            if(botScore > playerScore && rodadas >= 3 && botScore > 0) {
                System.out.println("O Bot foi o vencedor pelo placar de: "+botScore+" x "+playerScore);
                acabou = true;
            } else if (botScore < playerScore && rodadas >= 3 && playerScore > 0){
                System.out.println("O Player foi o vencedor pelo placar de: "+playerScore+" x "+botScore);
                acabou = true;    
            } else if(botScore > playerScore &&  botScore > 1){
                System.out.println("O Bot foi o vencedor pelo placar de: "+botScore+" x "+playerScore);
                acabou = true;               
            } else if(playerScore> botScore && playerScore > 1) {
              System.out.println("O Player foi o vencedor pelo placar de: "+playerScore+" x "+botScore);
              acabou = true;              
            }
            
        }
    }
}

