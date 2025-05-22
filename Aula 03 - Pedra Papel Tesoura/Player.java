/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rockpaperscissors;
import java.util.Scanner;

/**
 *
 * @author LUCASSCHMIDTGONÇALVE
 */
public class Player {
    private String escolhido;

    public void choose() {
        Scanner scanner = new Scanner(System.in);
        boolean choose = false;
        while (!choose) {
            System.out.print("1. Pedra.\n2. Papel\n3. Tesoura.\nEscolha uma opção: ");
            int verificador = scanner.nextInt();

            switch (verificador) {
                case 1:
                    this.escolhido = "Pedra";
                    choose = true;
                    break;
                case 2:
                    this.escolhido = "Papel";
                    choose = true;
                    break;
                case 3:
                    this.escolhido = "Tesoura";
                    choose = true;
                    break;
                default:
                    System.out.println("Escolha Inválida!");
                    break;
            }
        }
    }

    public String getEscolhido() {
        return escolhido;
    }
}
