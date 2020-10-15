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
public class Eletrodomestico {
    
    private boolean ligado;
    private int voltagem;
    private int consumo;

    public Eletrodomestico(boolean ligado, int voltagem, int consumo) {
        this.ligado = ligado;
        this.voltagem = voltagem;
        this.consumo = consumo;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    
}
