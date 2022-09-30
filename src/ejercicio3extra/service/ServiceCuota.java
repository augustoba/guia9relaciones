
package ejercicio3extra.service;

import ejercicio3extra.Enum.FORMADEPAGO;
import ejercicio3extra.Enum.NUMERODECUOTA;
import ejercicio3extra.entity.Cuota;
import java.util.Date;
import java.util.Scanner;


public class ServiceCuota {
    private Scanner read = new Scanner(System.in);
    
    private Cuota cuota= new Cuota();
    
    

    
    public Cuota cargarCuota(){
        
        System.out.println("ingrese el monto de la cuota");
        cuota.setMontoCuota(read.nextDouble());
        cuota.setPagada(pagada());
        
        System.out.println("ingrese el numero de cuota");
        int i=0;
        for (NUMERODECUOTA aux : NUMERODECUOTA.values()) {
            i++;
            System.out.println((i) + "-"+aux);
            
        }
        
        cuota.setNumerodeCuota(NUMERODECUOTA.values()[(read.nextInt()-1)]);
       
               
       
        
        cuota.setFechaVencimiento(fechaVencimiento());
        
        
        
        cuota.setFormadePago(FORMADEPAGO.values()[formadePago()]);
        
        
        return cuota;
    }
    
    
    
    public Boolean pagada(){
        read.nextLine();
        System.out.println("la cuota esta pagada? si/no");
        
        return read.nextLine().equalsIgnoreCase("si");
    }
    
    
    public Date fechaVencimiento(){
        
        
        System.out.println("ingrese fecha de vencimiento");
        System.out.println("año");
        int anio=(read.nextInt()-1900);
        System.out.println("mes");
        int mes = (read.nextInt()-1);
        System.out.println("dia");
        int dia =read.nextInt();
        Date fecha = new Date(anio,mes,dia);
        
        return fecha;
    }
    
    public int formadePago(){
        
        int i=0;
        System.out.println("ingrese un tipo de pago");
        
        for (FORMADEPAGO aux : FORMADEPAGO.values()) {
            i++;
            System.out.println((i) + "- " + aux);
            
        }
        return (read.nextInt()-1);
    }

}
