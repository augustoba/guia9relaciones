package ejercicio2.service;


import ejercicio2.entitiy.Jugador;
import java.util.Scanner;

public class ServiceJugador {
Scanner read = new Scanner(System.in);
    
    
    public void disparo(){
        
        do {
            
       ServiceRevolver serrevolver = new ServiceRevolver();
    ServiceJuego serjuego = new ServiceJuego();
    
           
        serrevolver.cargarRevolver();
            System.out.println("asd");
       
        serjuego.llenarJuego();
            System.out.println("das");
        
        do {
            
            for (Jugador aux : serjuego.jugadores  ) {
                serrevolver.siguienteChorro();
                System.out.print("El " + aux.getNombre()+"N°" + aux.getId() + " disparo y...." );
                
                if (serrevolver.mojado()) {
                    
                    aux.setMojado(true);
                    System.out.println("(*********** SE MOJO..********)");
                    
                    break;
                    
                }else{
                    System.out.println("(----NO SE MOJO-----)");
                     System.out.println(" ");
                
                
            }
                
            }
                
            
        } while (!serrevolver.mojado());
        
        System.out.println("------------------------------------------------------------------------------------------------------");
        
        System.out.println("el resultado de la ronda es:");
        
        for (Jugador aux : serjuego.jugadores) {
            System.out.println(aux);
            
        }
        
            System.out.println("quiere volver a jugar? si/no");
        
        } while (read.nextLine().equalsIgnoreCase("si"));
        
    }
     

}
