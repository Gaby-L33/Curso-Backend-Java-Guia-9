package entidades;

/**
Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String documento;
    private String email;
    private String domicilio;
    private String telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String documento, String email, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", email=" + email + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
    
}
