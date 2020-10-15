/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/*
2. Tendo como dados de entrada a altura e o sexo de uma pessoa (?M? masculino e ?F? feminino),
construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
- para homens: (72.7*h)-58
- para mulheres: (62.1*h)-44.7
*/

/**
 *
 * @author renato
 */
public class Ex2 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Programa para cálculo de peso ideal");
        System.out.println("Informe o sexo: ('m' ou 'f')");
        char sexo = leitor.next().charAt(0);
        System.out.println("Informe a altura: ");
        double altura = leitor.nextDouble();
        double pesoIdeal = 0;
        
        if (sexo == 'm'){
            pesoIdeal = (72.7*altura)-58;
        }else{
            pesoIdeal = (62.1*altura)-44.7;
        }
        
        System.out.println("O peso ideal para essa situação é: " + pesoIdeal + " Kg");
        
    }
    
}
