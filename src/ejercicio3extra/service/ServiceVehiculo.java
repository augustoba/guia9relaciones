
package ejercicio3extra.service;

import ejercicio3extra.entity.Vehiculo;
import java.util.*;
import ejercicio3extra.Enum.TIPODEVEHICULO;

public class ServiceVehiculo {
    
    private Scanner read= new Scanner(System.in);
    Vehiculo vehiculo = new Vehiculo();
    
    
    public Vehiculo crearVehiculo(){
        
        Vehiculo vehiculo = new Vehiculo();
        return vehiculo;
    }
    
    
    public Vehiculo CargarVehiculo(){
        Vehiculo vehiculo= crearVehiculo();
        System.out.println("ingrese el tipo de vehiculo");
        
        int i=0;
        for (TIPODEVEHICULO aux : TIPODEVEHICULO.values()) {
            i++;
           
            System.out.println(i +"- "+aux);
            
        }
        
                
        vehiculo.setTipodeVehiculo(TIPODEVEHICULO.values()[(read.nextInt()-1)]);
        read.nextLine();
        
        System.out.println("ingrese la marca del vehiculo");
        vehiculo.setMarca(read.nextLine());
        
        System.out.println("ingrese el modelo");
        vehiculo.setModelo(read.nextLine());
        
        System.out.println("ingrese el año");
        vehiculo.setAnio(read.nextInt());
        
        System.out.println("ingrese el numero de motor");
        vehiculo.setNumerodeMotor(read.nextLong());
        
        System.out.println("ingrese el numero de chasis");
        vehiculo.setNumerodeChasis(read.nextLong());
        
        read.nextLine();
        
        System.out.println("ingrese el color");
        vehiculo.setColor(read.nextLine());
        
        
        
        return vehiculo;
    }
    
    

}
