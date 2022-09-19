package ejercicio2.service;

import ejercicio2.entitiy.Revolver;
import java.util.Random;

public class ServiceRevolver {

    Revolver revolver = new Revolver();

    public void cargarRevolver() {

        Random random = new Random();
        revolver.setPosicionAgua(random.nextInt(6) + 1);
        revolver.setPosicionActual(random.nextInt(6) + 1);
    }
    
    public boolean mojado(){
       return revolver.getPosicionActual().equals(revolver.getPosicionAgua());
    }
    
    public void   siguienteJugador(){
        
        if (revolver.getPosicionActual().equals(6)) {
            revolver.setPosicionActual(1);
            
        }else {
            revolver.setPosicionActual(revolver.getPosicionActual()+1);
        }
    }
    public void mostrarRevolver(){
        System.out.println(revolver.toString());
    }
    

}
