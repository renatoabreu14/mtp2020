/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agendapessoas;

import java.util.Objects;

/**
 *
 * @author renato
 */
public class Telefone {
    private String identificador;
    private String numero;
    private int ddd;
    private String codigopais;
    private String operadora;

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getCodigopais() {
        return codigopais;
    }

    public void setCodigopais(String codigopais) {
        this.codigopais = codigopais;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    @Override
    public String toString() {
        return "Identificador: " + this.identificador + " | Operadora: " + this.operadora + " - " + this.codigopais + "(" + this.ddd + ")" + this.numero + "\n";
    }
    
    

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Telefone){
            Telefone telefone = (Telefone)obj;
            if (this.getIdentificador().equals(telefone.getIdentificador())){
                return true;
            }
        }
        return false;
    }
    
    
}
