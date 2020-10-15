/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca2;

/**
 *
 * @author renato
 */
public class TV extends Eletrodomestico{
    
    public int canal;
    public int volume;
    public int tamanho;

    public TV(int canal, int volume, int tamanho, int voltagem, int consumo) {
        super(false, voltagem, consumo);
        this.canal = canal;
        this.volume = volume;
        this.tamanho = tamanho;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
}
