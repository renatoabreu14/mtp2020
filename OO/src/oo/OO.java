/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo;

/**
 *
 * @author renato
 */
public class OO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conta contaRenato = new Conta();
        
        contaRenato.setNumero(12);
        contaRenato.setNome("Renato Oliveira Abreu");
        contaRenato.setSaldo(500);
        
        Conta contaCecilia = new Conta();
        
        contaCecilia.setNumero(15);
        contaCecilia.setNome("Cecília");
        contaCecilia.setSaldo(700);
        
        System.out.println(contaRenato.mostrarDados());
        
        System.out.println(contaCecilia.mostrarDados());
        
        if (contaRenato.sacar(500)){
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
        System.out.println(contaRenato.mostrarDados());
        
        if (contaCecilia.depositar(200)){
            System.out.println("Depósito realizado com sucesso!");
        }
        System.out.println(contaCecilia.mostrarDados());
        
        if (contaCecilia.transferir(contaRenato, 100)){
            System.out.println("Transferencia realizada com sucesso!");
            System.out.println(contaCecilia.mostrarDados());
            System.out.println(contaRenato.mostrarDados());
        }else{
            System.out.println("Transferencia não realizada!");
        }
        
    }
    
}
