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
public class Ex8 {
    public static void main(String[] args) {
        int l_sup, l_inf, soma_pares = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o limite inferior:");
        l_inf = leitor.nextInt();
        System.out.println("Informe o limite superior:");
        l_sup = leitor.nextInt();
        for (int i = l_inf + 1; i < l_sup; i++) {
            if ((i%2) == 0){ 
                System.out.println(i + " ");
                soma_pares += i;
            }
            
        }
        System.out.println("A soma dos números acima é: " + soma_pares);
    }
}
