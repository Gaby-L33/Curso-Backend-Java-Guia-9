package ejercicio_jugador;

import entidad.Jugador;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.ServicioJugador;

public class Ejercicio_Jugador {

    /**
     * Realiza un programa en donde exista una clase Jugador que contenga
     * nombre, apellido, posición y número. Luego otra clase Equipo que contenga
     * una colección de jugadores. Una vez hecho esto, desde el main
     * recorreremos el equipo mostrando la información de cada jugador.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta;
        ServicioJugador servicio = new ServicioJugador();
        ArrayList<Jugador> jugadores = new ArrayList();
        do {
            Jugador jugador = new Jugador();
            System.out.println("Ingrese el nombre del jugador:");
            jugador.setNombre(leer.next());
            
            System.out.println("Ingrese el apellido:");
            jugador.setApellido(leer.next());
            
            System.out.println("Ingrese la posicion: ");
            jugador.setPosicion(leer.nextInt());
            
            System.out.println("Ingrese el numero: ");
            jugador.setNumero(leer.nextInt());
            
            jugadores.add(jugador);
            
            System.out.println("Desea agregar otro jugador? s/n");
            respuesta = leer.next();
        } while (respuesta.equalsIgnoreCase("s"));
        
        System.out.println("MOSTRANDO JUGADORES:");
        
        servicio.mostrarJugadores(jugadores);
    }

}
