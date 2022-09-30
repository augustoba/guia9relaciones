package ejercicio2.service;

import ejercicio2.entitiy.Revolver;
import java.util.Random;

public class ServiceRevolver {
    
     Random aleatorio = new Random();
    Revolver revolver= new Revolver();
    
    
    public void cargarRevolver(){
       
        revolver.setPosicionActual(aleatorio.nextInt(6)+1);
       // System.out.println("la pistola esta en la posicion numero" +revolver.getPosicionActual());
        revolver.setPosicionAgua(aleatorio.nextInt(6)+1);
      //  System.out.println("la  bala esta en el numero:" +revolver.getPosicionAgua());
             
        
    }
    
    public boolean mojado(){
        
      return revolver.getPosicionActual().equals(revolver.getPosicionAgua());
    }
    
    public void siguienteChorro(){
        if (revolver.getPosicionActual().equals(6)) {
            revolver.setPosicionActual(1);
           
        }else {
            revolver.setPosicionActual(revolver.getPosicionActual()+1);
        }
    }
    
    public void mostrarRevolver(){
        System.out.println(revolver);
    }
    
    

   
    

}
