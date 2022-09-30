package ejercicio1.service;

import ejercicio1.entity.Perro;
import ejercicio1.entity.Persona;
import java.util.*;

public class Service {

    private List<Persona> personas;
    private List<Perro> perros;
    private List<Perro> perrosDisponibles;
    private Scanner read;

    public Service() {
        this.personas = new ArrayList();
        this.perros = new ArrayList();
        this.read = new Scanner(System.in);
        this.perrosDisponibles = new ArrayList();
    }

    public Persona crearPersona() {
        Persona persona = new Persona();
        return persona;
    }

    public Perro crearPerro() {
        Perro perro = new Perro();
        return perro;
    }

    public void cargarPersona() {
        Persona persona = crearPersona();
        System.out.println("ingrese el nombre de la persona");
        persona.setNombre(read.nextLine());
        System.out.println("ingrese el apellido de la persona");
        persona.setApellido(read.nextLine());
        System.out.println("ingrese la edad de la persona");
        persona.setEdad(read.nextLine());
        System.out.println("ingrese el dni");
        persona.setDni(read.nextLong());
        personas.add(persona);
        read.nextLine();
    }

    public void cargarPerro() {
        Perro perro = crearPerro();
        System.out.println("ingrese el nombre del perro");
        perro.setNombre(read.nextLine());
        System.out.println("ingrese la raza");
        perro.setRaza(read.nextLine());
        System.out.println("ingrese el tamaño");
        perro.setTamanio(read.nextDouble());
        System.out.println("ingrese la edad");
        perro.setEdad(read.nextInt());
        perros.add(perro);
        perrosDisponibles.add(perro);
        read.nextLine();
    }

    public boolean buscarPersona(Long dni) {
        System.out.println("ingrese el dni de la persona que quiere adoptar un perro");
        dni = read.nextLong();
        boolean encontrado = false;
        for (Persona aux : personas) {
            if (dni.equals(aux.getDni())) {

                System.out.println(aux.toString());
                encontrado = true;

            }

            if (!encontrado) {
                System.out.println("no se encontro a la persona");

            }
        }

        return encontrado;
    }

    public boolean buscarPerro(String nombrePerro) {
        boolean encontrado = false;
        System.out.println("ingrese el nombre del perro");
        nombrePerro = read.nextLine();

        for (Perro aux : perros) {
            if (nombrePerro.equalsIgnoreCase(aux.getNombre())) {
                System.out.println(aux.toString());
                encontrado = true;

            }
            if (!encontrado) {
                System.out.println("no se encontro el perro");

            }
        }

        return encontrado;
    }

    public void adoptarPerro() {
        System.out.println("ingrese el dni de la persona ");
        Long dni = read.nextLong();
        read.nextLine();
        System.out.println("ingrese el nombre del perro");
        String nombrePerro = read.nextLine();
        boolean personaEcontrada = false;
        boolean perroEncontrado = false;
        Iterator<Perro> it = perrosDisponibles.iterator();
        for (Persona persona1 : personas) {

            if (dni.equals(persona1.getDni())) {
                personaEcontrada = true;
                
                if (personaEcontrada) {

                    while (it.hasNext()) {
                        if (it.next().getNombre().equalsIgnoreCase(nombrePerro)) {
                            it.remove();
                            perroEncontrado = true;
                        }
                    }

                    if (perroEncontrado) {

                        for (Perro perro2 : perros) {

                            if (nombrePerro.equalsIgnoreCase(perro2.getNombre())) {

                                persona1.setPerro(perro2);

                            }

                        }
                    }

                }

            }
        }

    }

    public void mostrarPersonas() {
        for (Persona aux : personas) {
            System.out.println(aux);

        }
    }

    public void mostrarPerros() {

        if (!perrosDisponibles.isEmpty()) {
            for (Perro aux : perrosDisponibles) {
                System.out.println(aux);

            }

        } else {
            System.out.println("no hay perros disponibles");
        }

    }

}
