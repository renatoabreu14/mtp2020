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
public class Moto extends Veiculo{
    
    private int cilindrada;
    private boolean partidaEletrica;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean isPartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public String mostrarCaracteristicas() {
        String retorno = "MOTO \n";
        retorno += super.mostrarCaracteristicas();
        retorno += "Cilindrada: " + this.getCilindrada()+ "\n";
        retorno += "Part. elétrica: " + (this.isPartidaEletrica()?"sim":"não")+ "\n";
        return retorno;
    }
    
}
