package ejercicio_2_guia11;

import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.ServicioRuleta;

public class Ejercicio_2_Guia11 {

    /**
     * Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben,
     * el juego se trata de un número de jugadores, que, con un revolver de
     * agua, el cual posee una sola carga de agua, se dispara y se moja.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioRuleta ruletaService = new ServicioRuleta();
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Revolver revolver = new Revolver();
        System.out.println();
        ruletaService.llenarJuego(jugadores, revolver);
        System.out.println();
        System.out.println("Disparando: ");
        for (int i = 0; i < jugadores.size(); i++) {
            System.out.println("Posicion revolver: " + revolver.getPosActual() + "\nPosicion agua: " + revolver.getPosAgua());
            boolean muerto = !ruletaService.ronda(jugadores.get(i), revolver);
            System.out.println(jugadores.get(i).getNombre() + " Se dispara!");
            if (ruletaService.disparo(jugadores.get(i), revolver)) {
                System.out.println("El " + jugadores.get(i).getNombre() + " Murio :/");
            } else {
                System.out.println("Sigue vivo!");
                System.out.println();
                ruletaService.siguienteChorro(revolver);
            }
            if (muerto) {
                break;
            }
        }
    }

}
