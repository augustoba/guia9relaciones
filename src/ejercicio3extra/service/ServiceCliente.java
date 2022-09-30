
package ejercicio3extra.service;

import ejercicio3extra.entity.Cliente;
import java.util.Scanner;

public class ServiceCliente {
    
    private Cliente cliente=new Cliente();
    private Scanner read= new Scanner(System.in);

    public ServiceCliente() {
      //  this.cliente=new Cliente();
    }
    
    
    public Cliente cargarCliente(){
        System.out.println("ingrese el nombre del cliente");
       
             cliente.setNombre(read.nextLine());
               
        System.out.println("ingrese el apellido del cliente");
        cliente.setApellido(read.nextLine());
        
        System.out.println("ingrese el DNI del cliente");
         cliente.setDni(read.nextLong());
        read.nextLine();
        
        System.out.println("ingrese el Email del cliente");
         cliente.setMail(read.nextLine());
        
        System.out.println("ingrese el domicilio del cliente");
         cliente.setDomicilio(read.nextLine());
        
        
        System.out.println("ingrese el telefono del cliente");
         cliente.setTelefono(read.nextLong());
        
        read.nextLine();
        
        return cliente;
        
    }

}
