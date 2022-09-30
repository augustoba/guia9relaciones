
package ejercicio1;

import ejercicio1.service.Service;

public class MainEjercicio1 {

   
    public static void main(String[] args) {
        Service service = new Service();
        service.cargarPersona();
        service.cargarPerro();
        service.mostrarPersonas();
        service.mostrarPerros();
        service.adoptarPerro();
        service.mostrarPerros();
        service.mostrarPersonas();
    }

}
