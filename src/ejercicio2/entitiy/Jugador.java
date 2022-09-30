
package ejercicio2.entitiy;

public class Jugador {
    
    private Integer id;
    private String nombre;
    private boolean mojado;
    

    public Jugador() {
        this.mojado=false;
        this.id =0;
       
        
    }

    public Jugador(Integer id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    

    @Override
    public String toString() {
        return   nombre + " N°" + id + " | MOJADO: " + mojado ;
    }
    

}
