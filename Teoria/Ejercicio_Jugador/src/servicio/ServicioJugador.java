package servicio;

import entidad.Jugador;
import java.util.ArrayList;

public class ServicioJugador {
    
        public void mostrarJugadores(ArrayList<Jugador> jugadores) {
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.getNombre() + "/ Apellido: " + jugador.getApellido());
            System.out.println("/ Posicion: " + jugador.getPosicion() + "/ Numero: " + jugador.getNumero());
            System.out.println("-----------------------------");
        }
    }
}
