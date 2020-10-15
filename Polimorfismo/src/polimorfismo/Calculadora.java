/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author renato
 */
public class Calculadora {
    
    public int calcula(int n1, int n2){
        return n1 / n2;
    }
    
    public double calcula(double n1, double n2){
        return n1 + n2;
    }
    
    public String calcula(String s1, String s2){
        return s1 + s2;
    }
    
}
