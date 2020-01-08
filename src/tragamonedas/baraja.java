/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tragamonedas;

import java.util.Random;

/**
 *
 * @author Mael
 */
public class baraja {

    public String sacarCarta() {
        return this.sacarNumero() + this.sacarPalo();
    }

    private String sacarNumero() {
        Random aleatorio = new Random();
        int numero=aleatorio.nextInt(13)+1;
        if(numero<=9){
             return "0" + numero;
        }else{
            return Integer.toString(numero);
        }
        
    }

    private String sacarPalo() {
        Random aleatorio = new Random();
        String palo = "";
        switch (Integer.toString(aleatorio.nextInt(4) + 1).charAt(0)) {
            case '1':
                palo = "_diamantes";
                break;
            case '2':
                palo = "_corazones";
                break;
            case '3':
                palo = "_treboles";
                break;
            case '4':
                palo = "_picas";
                break;
        }
        return palo;
    }

    public int extraerNumero(String carta) {
//        return Integer.parseInt(carta.substring(0, carta.length() - 1));
        
        return Integer.parseInt(carta.substring(0, 2));

    }
}
