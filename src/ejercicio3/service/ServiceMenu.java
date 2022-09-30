
package ejercicio3.service;

import ejercicio3.entity.Baraja;
import java.util.Scanner;

public class ServiceMenu {
     
    ServiceBaraja servBaraja = new ServiceBaraja();
    
    Scanner read = new Scanner(System.in);
    
    public void menu(){
       int opc=0;
        
        do {
            
        
        System.out.println("                                          ******Menu Baraja********");
            System.out.println("1- Cargar mazo de cartas");
            System.out.println("2- Mezclar mazo de cartas");
            System.out.println("3 -Siguiente carta del mazo");
            System.out.println("4- Cartas disponibles en el mazo");
            System.out.println("5- Dar x cantidad de cartas del mazo");
            System.out.println("6- Mostrar cartas que salieron");
            System.out.println("7- Mostrar cartas restantes del mazo");
            System.out.println("8- Salir");
        
                        opc=read.nextInt();
        switch (opc) {
            
            case 1:
                levantarCarta();
                
                System.out.println("mazo de cartas cargado.....");
                break;
            case 2:
                
                servBaraja.barajar();
                
                break;
                
                case 3:
                servBaraja.siguienteCarta();
                break;
                
                case 4:
                     servBaraja.cartasDisponibles();
                
                break;
                case 5:
                servBaraja.darCartas();
                break;
                case 6:
                 servBaraja.cartasMonton();
                break;
                case 7:
                servBaraja.mostrarBaraja();
                break;
                case 8:
                    System.out.println("cerrando programa....");
                break;
            default:
                System.out.println("ingrese una opcion correcta");
        }
        } while (opc!=8);
    }
    
    
 
    
   

public Baraja levantarCarta(){
        return servBaraja.crearBaraja();
    }

}