/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosc_java;

import java.util.Scanner;

/**
 *
 * @author renato
 */
public class ExerciciosC_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leitor = new Scanner(System.in);
        int numero = 0, cont = 0;
        int soma = 0, produto = 1;
        do{
            System.out.println("Informe um número positivo (se deseja sair informe 0):");
            numero = leitor.nextInt();
            if (numero > 0){
                if ((numero % 2)==0){
                    soma = soma + numero;
                }else{
                    produto = produto * numero;
                }
                cont++;
            }
        }while(numero > 0);
        if (cont > 0){
            System.out.println(soma);
            System.out.println(produto);
        }else{
            System.out.println("Nenhuma número positivo foi informado.");
        }
    }
    
}
