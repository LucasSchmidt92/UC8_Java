/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;
import java.util.Scanner;

/**
 *
 * @author LUCASSCHMIDTGONÇALVE
 */
public class ExercicioArray {
    
    public void Informacoes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu e-mail: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu Senha: ");
        String email = sc.nextLine();
        
        Usuario user = new Usuario(nome, email); 
        this.criarArray(user);
}
    
    public String[] criarArray(Usuario usuario){  
        String[] infos = {usuario.getEmail(), usuario.getSenha()};
        
        System.out.println("\nInformações do Usuário:");
        for(int i = 0; i < infos.length; i++){
            System.out.println(infos[i]);
        }
        return infos;
    }
}
    