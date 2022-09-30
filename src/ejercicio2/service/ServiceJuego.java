
package ejercicio2.service;


import ejercicio2.entitiy.Juego;
import ejercicio2.entitiy.Jugador;
import java.util.*;

public class ServiceJuego {
    
    Scanner read = new Scanner(System.in);
    ArrayList<Jugador>jugadores = new  ArrayList();
            
    public void llenarJuego() {
        System.out.println("ingrese la cantidad de jugadores");
        int jug=read.nextInt();
        
        for (int i = 0; i < jug; i++) {
            
            Jugador jugador = new Jugador();
            jugador.setNombre("JUGADOR");
            jugador.setId((i+1));
            jugador.setMojado(false);
            jugadores.add(jugador);
            
        }
    }   
    
   
    
    
    
    
    

}