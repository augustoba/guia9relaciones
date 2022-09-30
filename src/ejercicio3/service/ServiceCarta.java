
package ejercicio3.service;

import ejercicio3.Enum.*;
import ejercicio3.entity.Carta;

public class ServiceCarta {
    
    
    public Carta crearCarta(Integer i){
        
    Carta carta = new Carta();
    
    carta.setNumero(NumeroCartas.values()[(int)i/4]);
    carta.setPalo(Palo.values()[i%4]);
       // System.out.println(carta);
        return carta;
        
    }

    
}
