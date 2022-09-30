
package ejercicio3.service;

import ejercicio3.entity.Baraja;
import ejercicio3.entity.Carta;
import java.util.*;




public class ServiceBaraja {
    
    ServiceCarta servic = new ServiceCarta();
    
    Baraja baraja = new  Baraja(); 
    Scanner read = new Scanner(System.in);
    
    List<Carta> cartasUsadas= new ArrayList();
  
    
    public Baraja crearBaraja(){
        //Baraja baraja = new Baraja();
        
        Carta carta;
        for (int i = 0; i < 40; i++) {
            carta=servic.crearCarta(i);
            baraja.getCartas().add(carta);
            
            
        }
        return baraja;
        
    }
    public void barajar(){
        
        if (!baraja.getCartas().isEmpty()) {
            Collections.shuffle(baraja.getCartas());
            System.out.println("mazo de cartas mezclado...");
            System.out.println("----------------------------------------");
        }else  {
            
            System.out.println("no hay cartas en el mazo");
             System.out.println("----------------------------------------");
        }
        
        
        
        
//        System.out.println(baraja.getCartas().size());
//        for (Carta carta : baraja.getCartas()) {
//            System.out.println(carta);
//            
//            
//        }
        
        
        
    }
    
    public void siguienteCarta(){
        
        if (!baraja.getCartas().isEmpty()) {
            System.out.println("la carta siguiente es...");
            System.out.println(baraja.getCartas().get(0));
               cartasUsadas.add(baraja.getCartas().get(0)); 
                baraja.getCartas().remove(0);
                
            
            
        }else {
            System.out.println("no hay cartas en el mazo");
                    
                    }
        
        
        System.out.println("----------------------------------------");
        
    }
    
    public void cartasDisponibles(){
        
        if (!baraja.getCartas().isEmpty()) {
            System.out.println("quedan " + baraja.getCartas().size()+ " cartas disponibles en el mazo ");
         
            
        }else   {
            System.out.println("no hay cartas en el mazo");
        }
        
        System.out.println("----------------------------------------");
        
    }
    
    public void darCartas(){
        
        System.out.println("ingrese el numero de cartas que quiere");
        int cantidad=read.nextInt();
        
        if (baraja.getCartas().size()>=3) {
             System.out.println("las cartas entregadas son: ");
        for (int i = 0; i < cantidad; i++) {
                      
            System.out.println(baraja.getCartas().get(0));
               cartasUsadas.add(baraja.getCartas().get(0)); 
                baraja.getCartas().remove(0);
            
        }
        
            
        }else  {System.out.println("no se puede entregar la cantidad deseada");
                
                }
        
         System.out.println("----------------------------------------");
        
    }
    
    public void cartasMonton(){
        
        if (cartasUsadas.isEmpty()) {
            System.out.println("todavia no se entregaron cartas");
        }else  { 
        
        System.out.println("las cartas que ya salieron son...");
        
        for (Carta cartasUsada : cartasUsadas) {
            System.out.println(cartasUsada);
            
        }
        
         
        
    }
        System.out.println("----------------------------------------");
        }
    
    public void mostrarBaraja(){
        
        if (!baraja.getCartas().isEmpty()) {
            
            
        System.out.println("lista de cartas que quedan en el mazo");
       for (Carta carta : baraja.getCartas()) {
            System.out.println(carta);
            
            
        } 
        
    }else  {
                System.out.println("no quedan mas cartas en el mazo");
                }
       
        System.out.println("----------------------------------------");
        }
    
            
        }
        
    
    
    


