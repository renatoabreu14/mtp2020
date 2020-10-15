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
public class Heranca2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TV tv1 = new TV(0, 0, 32, 110, 95);
        TV tv2 = new TV(0, 0, 55, 220, 127);
        tv1.setLigado(true);
        tv1.setCanal(3);
        tv1.setVolume(25);
        mostrarCaracteristicas(tv1);
        mostrarCaracteristicas(tv2);
    }
    
    public static void mostrarCaracteristicas(TV obj){
        System.out.println("A TV tem as seguintes características.\nTamanho: "
        + obj.getTamanho() + "\nVoltagem: " + obj.getVoltagem() + "\nConsumo: "
        + obj.getConsumo());
        if (obj.isLigado()){
            System.out.println("Ligado: Sim\nCanal: "+obj.getCanal()+"\nVolume: "
            + obj.getVolume() + "\n");
        }else{
            System.out.println("Ligado: Não\n");
        }
    }

    
}
