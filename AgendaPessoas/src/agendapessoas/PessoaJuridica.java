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
public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String dataFund;
    private String nomeFantasia;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataFund() {
        return dataFund;
    }

    public void setDataFund(String dataFund) {
        this.dataFund = dataFund;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    
    @Override
    public String toString() {
        String retorno = super.toString();
        retorno += "CNPJ: " + this.cnpj + "\n";
        retorno += "Data de Fundação: " + this.dataFund + "\n";
        retorno += "Nome Fantasia: " + this.nomeFantasia + "\n";
        retorno += "Telefones:\n";
        for(Telefone telefone : this.getTelefones()){
            retorno += telefone.toString();
        }
        return retorno;
    }
    
}
