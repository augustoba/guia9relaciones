
package ejercicio2.entitiy;

public class Juego {
    
    private Jugador jugador;
    private Revolver bala;

    public Juego() {
        
    }

    public Juego(Jugador jugador, Revolver bala) {
        this.jugador = jugador;
        this.bala = bala;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Revolver getBala() {
        return bala;
    }

    public void setBala(Revolver bala) {
        this.bala = bala;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador=" + jugador + ", bala=" + bala + '}';
    }
    
    

}
