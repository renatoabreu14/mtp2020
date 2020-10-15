/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacaoteste;

import java.util.Scanner;

/**
 *
 * @author renato
 */
public class AplicacaoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //TipoDeDado nomeDaVariavel = Valor ou Instanciação de Classe
        Scanner leitor = new Scanner(System.in);
                
        double valor = 1;
        boolean sexoFem = false;
        String nome = "Renato";
        //String endereco = new String(leitor.next());
        
        if (valor > 1){
            //se verdadeiro
        }else{
            //se falso
        }
        
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            System.out.println(arg);
        }
                
        
        
        System.out.println("Texto desejado!");
        int numero = 0, total;
        numero++;
        System.out.println("Informe um número inteiro:");
        total = leitor.nextInt();
        System.out.println(total+" "+numero);
    }
}
