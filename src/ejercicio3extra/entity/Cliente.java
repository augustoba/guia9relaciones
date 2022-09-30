
package ejercicio3extra.entity;

public class Cliente {
    
    private String nombre;
    private String apellido;
    private Long dni;
    private String mail;
    private String domicilio;
    private Long telefono;

    public Cliente() {

        
    }

    public Cliente(String nombre, String apellido, Long dni, String mail, String domicilio, Long telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.mail = mail;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "CLIENTE:" + "\n--Nombre: " + nombre + ", Apellido: " + apellido
                + ",\n--Dni:" + dni + ", mail: " + mail  + ", Domicilio: " + domicilio + ", Telefono: " + telefono ;
    }
    

}
