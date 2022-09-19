package ejercicio2.service;

import ejercicio2.entitiy.Jugador;
import java.util.*;

public class ServiceJugador {

    private ServiceRevolver revolver;
    private ServiceJuego juego;
    private List<Jugador> jugadores;

    public ServiceJugador() {
        this.juego=new ServiceJuego();
        this.jugadores=new ArrayList();
        this.revolver=new ServiceRevolver();
    }
    
    
    

}
