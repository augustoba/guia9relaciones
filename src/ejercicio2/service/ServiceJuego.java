
package ejercicio2.service;

import ejercicio2.entitiy.Jugador;
import ejercicio2.entitiy.Revolver;
import java.util.*;

public class ServiceJuego {
    
        private List<Jugador>jugadores;
        private List<Revolver> balas ;
        private Scanner read;

    public ServiceJuego() {
        this.jugadores=new ArrayList();
        this.balas=new ArrayList();
        this.read= new  Scanner(System.in);
    }
    
        public Jugador crearJugador(){
            Jugador jugador = new Jugador(); 
            return jugador;
        }
        
        public Revolver crearRevolver(){
            Revolver revolver =new Revolver();
            return revolver;
        }
        
        
        public  void cargarJuego(){
            System.out.println("ingrese el nombre del jugador");
        }

}
