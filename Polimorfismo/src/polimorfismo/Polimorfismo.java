/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;



/**
 *
 * @author renato
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("0.#");
        Calculadora calc = new Calculadora();
        Scanner leitor = new Scanner(System.in);
        
        int n1 = 0, n2 = 0;
        boolean informouInteiro = true;
        
        /*try{
            System.out.println("Informe o primeiro número: ");
            n1 = leitor.nextInt();

            System.out.println("Informe o segundo número: ");
            n2 = leitor.nextInt();
            
            System.out.println("A soma desses números é : ");
            System.out.println(calc.calcula(n1, n2));
        }catch(InputMismatchException ex){
            System.out.println("Você deve informar um número inteiro.\nO programa será finalizado.");
        }*/
        
        do{
            try{
                System.out.println("Informe o primeiro número: ");
                n1 = leitor.nextInt();
                informouInteiro = true;
            }catch (InputMismatchException ex){
                informouInteiro = false;
                System.out.println("Você deve informar um número inteiro.");
                leitor.nextLine();
            }
        }while(informouInteiro == false);
        
        do{
            try{
                System.out.println("Informe o segundo número: ");
                n2 = leitor.nextInt();
                informouInteiro = true;
            }catch (InputMismatchException ex){
                informouInteiro = false;
                System.out.println("Você deve informar um número inteiro.");
                leitor.nextLine();
            }
        }while(informouInteiro == false);
        
        double resultado = 0;
        boolean divisorZero = false;
        try{
            resultado = calc.calcula(n1, n2);
        }catch(ArithmeticException ex){
            divisorZero = true;
            System.out.println("Você não pode informar '0' no segundo número");
        }finally{
            if (divisorZero == false){
                System.out.println("A divisão do primeiro pelo segundo número é : ");
                System.out.println(resultado);
            }
        }
        
        
        
        
        
        
        
        //System.out.println(df.format(calc.calcula(1.4, 2.3)));
        //System.out.println(calc.calcula("Re", "nato"));
    }
    
}
