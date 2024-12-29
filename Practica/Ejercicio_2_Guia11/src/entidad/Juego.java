package entidad;
//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
//Revolver

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadoresList;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadoresList, Revolver revolver) {
        this.jugadoresList = jugadoresList;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadoresList() {
        return jugadoresList;
    }

    public void setJugadoresList(ArrayList<Jugador> jugadoresList) {
        this.jugadoresList = jugadoresList;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Entidad.Juego{"
                + "revolver=" + revolver
                + '}';
    }
}
