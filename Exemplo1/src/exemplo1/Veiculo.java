/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

/**
 *
 * @author renato
 */
public class Veiculo {
    
    private String tipoCombustivel;
    private int numRodas;
    private String cor;
    private String proprietario;

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    
    public String mostrarCaracteristicas(){
        String retorno = "";
        retorno += "Cor: " + this.getCor() + "\n";
        retorno += "Num Rodas: " + this.getNumRodas()+ "\n";
        retorno += "Tipo Comb.: " + this.getTipoCombustivel()+ "\n";
        retorno += "Prop.: " + this.getProprietario()+ "\n";
        return retorno;
    }
    
}
