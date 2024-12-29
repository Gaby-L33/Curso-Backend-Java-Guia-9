package entidades;

/**
 * del espectador, nos interesa saber su
    nombre, edad y el dinero que tiene disponible.
 */
public class Espectador {
    private String nombre;
    private int edad;
    private double dineroDis;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dineroDis) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDis = dineroDis;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDineroDis() {
        return dineroDis;
    }

    public void setDineroDis(float dineroDis) {
        this.dineroDis = dineroDis;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dineroDis=" + dineroDis + '}';
    }
    
    
}
