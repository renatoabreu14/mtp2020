/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;


/**
 *
 * @author renato
 */

/*1. Faça um algoritmo que leia um no inteiro e mostre uma mensagem indicando se este número é par
ou ímpar, e se é positivo ou negativo.*/
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero = leitor.nextInt();
        if (numero >= 0){
            if ((numero % 2) == 0){
                System.out.println("O número informado é positivo e par");
            }else{
                System.out.println("O número informado é positivo e ímpar");
            }
        }else{
            if ((numero % 2) == 0){
                System.out.println("O número informado é negativo e par");
            }else{
                System.out.println("O número informado é negativo e ímpar");
            }
        }
    }
    
}
