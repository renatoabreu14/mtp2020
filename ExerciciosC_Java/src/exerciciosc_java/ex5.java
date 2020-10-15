/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosc_java;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author renato
 */
public class ex5 {
    
    public static void main(String[] args) {
        final int POPULACAO = 4;
        float altura=0, maiorH=0, menorH=4, somaHF=0, somaHP=0, qtdF=0, qtdM=0;
        int sexo;
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < POPULACAO; i++) {
            System.out.println("Informe a altura:");
            altura = leitor.nextFloat();
            System.out.println("Informe o sexo:");
            sexo = leitor.nextInt();
    
            somaHP += altura;
            if (altura > maiorH){
                maiorH = altura;
            }
            if (altura < menorH){
                menorH = altura;
            }
            if (sexo == 1){
                somaHF += altura;
                qtdF++;
            }else{
                qtdM++;
            }
        }
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        
        System.out.println("A maior altura e: " + df.format(maiorH) + ". A menor altura e: " + menorH);
        System.out.println("A media de altura das mulheres e: " + (somaHF / qtdF));
        System.out.println("A media de altura da população e: " + (somaHP / POPULACAO));
        System.out.println("A porcentagem de homens e: " + ((qtdM / POPULACAO) * 100) + "%");
    }
    
}
