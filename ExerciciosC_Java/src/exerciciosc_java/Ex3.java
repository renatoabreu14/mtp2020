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
public class Ex3 {
    
    public static void main(String[] args) {
        int cont = 0, i = 0;
        System.out.println("Informe um número:");
        Scanner leitor = new Scanner(System.in);
        int numero = leitor.nextInt();
        for (i = 1000; cont < numero; i++) {
            if ((i % 11) == 5){
                cont++;
            }
        }
        System.out.println(i-1);
    }
    
}
