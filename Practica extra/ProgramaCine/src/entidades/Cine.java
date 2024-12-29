package entidades;

/**
 * De Cine nos interesa conocer la película que se está reproduciendo, la
    sala con los espectadores y el precio de la entrada.
 */
public class Cine {
    private Pelicula pelicula;
    private double entrada;

    public Cine() {
    }

    public Cine(Pelicula pelicula, double entrada) {
        this.pelicula = pelicula;
        this.entrada = entrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    
    
}
