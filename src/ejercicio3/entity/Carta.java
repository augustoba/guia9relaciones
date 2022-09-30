
package ejercicio3.entity;

import ejercicio3.Enum.*;


public class Carta {
    
    private NumeroCartas numero;
    private Palo palo;

    public NumeroCartas getNumero() {
        return numero;
    }

    public void setNumero(NumeroCartas numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return  numero.getNumero() + " de " + palo ;
    }
    
    
  

}
