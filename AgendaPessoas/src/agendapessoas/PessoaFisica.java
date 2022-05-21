/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agendapessoas;

/**
 *
 * @author renato
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private String dataNasc;
    private String apelido;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String toString() {
        String retorno = super.toString();
        retorno += "CPF: " + this.cpf + "\n";
        retorno += "Data de Nascimento: " + this.dataNasc + "\n";
        retorno += "Apelido: " + this.apelido + "\n";
        retorno += "Telefones:\n";
        for(Telefone telefone : this.getTelefones()){
            retorno += telefone.toString();
        }
        return retorno;
    }
    
    
}
