/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosc_java;

/**
 *
 * @author renato
 */
public class Ex6 {
    public static void main(String[] args) {
        double juca = 1.10;
        double chico = 1.50;
        double cresc_chico = 0.02;
        double cresc_juca = 0.03;
        int anos = 0;
        while(juca < chico){
            anos++;
            juca += cresc_juca;
            chico += cresc_chico;
        }
        System.out.println("Juca levou " + anos + " para ser maior de Chico.");
    }
}
