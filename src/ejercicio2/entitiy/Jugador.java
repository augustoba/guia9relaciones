
package ejercicio2.entitiy;

public class Jugador {
    
    private Integer id;
    private String nombre;
    private boolean mojado;
    private static Integer contador;

    public Jugador() {
        this.contador=++contador;
        
        if (this.contador>6) {
            this.id=6;
            
        }else   {
          this.id= this.contador;  
        }
        
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

    public static Integer getContador() {
        return contador;
    }

    public static void setContador(Integer contador) {
        Jugador.contador = contador;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    

}
