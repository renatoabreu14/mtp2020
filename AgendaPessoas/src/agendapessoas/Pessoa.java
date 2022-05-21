/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendapessoas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author renato
 */
public abstract class Pessoa {
    private int codigo;
    private String nome;
    private List<Telefone> telefones;
    
    public Pessoa(){
        telefones = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    @Override
    public String toString() {
        String retorno = "Codigo: " + this.codigo + "\n";
        retorno += "Nome: " + this.nome + "\n";
        return retorno;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Pessoa){
            Pessoa pessoa = (Pessoa) obj;
            if (pessoa.getCodigo() == this.getCodigo()){
                return true;
            }
        }
        return false;
    }
    
    
}
