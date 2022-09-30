
package ejercicio3extra.service;

import ejercicio3extra.Enum.TIPODECOBERTURA;
import ejercicio3extra.entity.Cliente;
import ejercicio3extra.entity.Poliza;
import java.util.*;


public class ServicePoliza {
    
    
    private ServiceCuota servCuota= new ServiceCuota();
    private ServiceCliente servCliente = new ServiceCliente();
    private ServiceVehiculo servVehiculo = new ServiceVehiculo();
    private Poliza poliza= new Poliza();
    private Scanner read= new Scanner(System.in);
    private List<Poliza>polizas=new ArrayList();
    
    
    public Poliza crearPoliza(){
        this.poliza = new Poliza();
          
        return poliza;
    }
    
    
    public void CargarNuevaPoliza(){
        poliza.setCliente(servCliente.cargarCliente()); 
        poliza.setVehiculo(servVehiculo.CargarVehiculo());
        poliza.setGranizo(granizo());
        cobertura();
        poliza.setCuota(servCuota.cargarCuota());
        
        poliza.setMontoTotalAsegurado(montoTotalAsegurado());
        
        poliza.setFechafinPoliza(fechaFinPoliza());
        
        polizas.add( poliza);
            
        
    }
    
    
    public void mostrarPolizas(){
        
        for (Poliza poliza1 : polizas) {
            System.out.println(poliza1);
            
        }
    }
    
    
    public void CargarVehiculo(){
        
        servVehiculo.CargarVehiculo();
    }
    
    public boolean granizo(){
        boolean tieneCobertura=false;
        
        System.out.println("tiene cobertura contra granizo? si/no");
        if (read.nextLine().equalsIgnoreCase("si")) {
            System.out.println("ingrese el monto maximo de cobertura por granizo");
            poliza.setMontoMaxGranizo(read.nextInt());
            tieneCobertura=true;
       }
    
       
            return tieneCobertura;
            
        }
    
    public void cobertura(){
        
        int i =0;
        System.out.println("elija un tipo de cobertura");
        for (TIPODECOBERTURA aux : TIPODECOBERTURA.values()) {
            i++;
            System.out.println(i+"- "+ aux);
            
        }
        
        poliza.setTipodeCobertura(TIPODECOBERTURA.values()[(read.nextInt()-1)]);
        
    }
    
        
    
    
    public Integer montoTotalAsegurado(){
        System.out.println("ingrese el monto total asegurado");
        Integer monto= read.nextInt();
        return monto;
    }

    public Date fechaFinPoliza(){
         
        System.out.println("ingrese fecha fin poliza");
        System.out.println("año");
        int anio=(read.nextInt()-1900);
        System.out.println("mes");
        int mes = (read.nextInt()-1);
        System.out.println("dia");
        int dia =read.nextInt();
        Date fechafin = new Date(anio,mes,dia);
        read.nextLine();
        return fechafin;
        
    }
    
}
