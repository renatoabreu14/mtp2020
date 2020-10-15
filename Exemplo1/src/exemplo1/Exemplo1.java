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
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro car1 = new Carro();
        Moto mot1 = new Moto();
        
        car1.setCor("Cinza Prata");
        car1.setNumRodas(4);
        car1.setTipoCombustivel("Gasolina");
        car1.setProprietario("Adrielle");
        car1.setArCondicionado(true);
        car1.setCapacidadePortaMalas(380);
        
        mot1.setCor("Preta");
        mot1.setNumRodas(2);
        mot1.setTipoCombustivel("Flex");
        mot1.setProprietario("Cecília");
        mot1.setCilindrada(300);
        mot1.setPartidaEletrica(false);
        
        System.out.println(car1.mostrarCaracteristicas());
        System.out.println(mot1.mostrarCaracteristicas());
    }
    
}
