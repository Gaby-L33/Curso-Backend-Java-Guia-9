
package programacine;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.util.Random;
import java.util.Scanner;
import servicios.ServiciosCine;

/**
 * Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
   (8 filas por 6 columnas).
 */
public class ProgramaCine {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServiciosCine servicioCine = new ServiciosCine();
        Pelicula pelicula = new Pelicula("El señor de los anillos", 180, 18, "Peter Jackson");
        Cine cine = new Cine(pelicula, 4999.9);
        
        String[] nombres = {"Ezequiel", "Gabriel", "Maria", "Ignacio", "Nicolas", "Irina", "Fabricio", 
            "Franco","Cristian", "Agustina"};
        Random rand = new Random();
        
        for (String nombre : nombres) {
            int edad = 10 + rand.nextInt(30); //Edades entre 10 y 40
            double dinero = 1000 + rand.nextDouble() * 10000; //Dinero entre 1000 y 10000
            Espectador espectador = new Espectador(nombre, edad, dinero);
            servicioCine.ubicarEspectador(espectador, pelicula, cine);
            
        }
        
        System.out.println("Estado de los asientos: ");
        servicioCine.mostrarAsientos();
    }
    
}
