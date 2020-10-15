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
public class Carro extends Veiculo {
    
    private boolean arCondicionado;
    private int capacidadePortaMalas;

    public boolean isArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public int getCapacidadePortaMalas() {
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas) {
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public String mostrarCaracteristicas() {
        String retorno = "CARRO \n";
        retorno += super.mostrarCaracteristicas();
        retorno += "Tem ar condic.: " + (this.isArCondicionado()?"sim":"não") + "\n";
        retorno += "Cap. porta malas: " + this.getCapacidadePortaMalas() + "\n";
        return retorno; 
        
    }
    
}
