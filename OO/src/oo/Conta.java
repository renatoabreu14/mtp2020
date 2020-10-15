/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oo;

/**
 *
 * @author renato
 */
public class Conta {
    
    private int numero;
    private String nome;
    private double saldo;
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public boolean sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    public boolean depositar(double valor){
        saldo += valor;
        return true;
    }
    
    public boolean transferir(Conta destino, double valor){
        if (this.sacar(valor)){
            if (destino.depositar(valor)){
                return true;
            }
            return false;
        }
        return false;
    }
    
    public String mostrarDados(){
        String dados = "Número: " + numero + "\n";
        dados += "Nome: " + nome + "\n";
        dados += "Saldo: " + saldo + "\n";
        return dados;
    }
    
}
