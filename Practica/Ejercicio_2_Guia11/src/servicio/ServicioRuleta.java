package servicio;

import entidad.Jugador;
import entidad.Revolver;
import java.util.ArrayList;
import java.util.Random;

public class ServicioRuleta {

    ArrayList<Jugador> jugadoresList = new ArrayList<>();

//    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//    y el revolver para guardarlos en los atributos del juego.
    public void llenarJuego(ArrayList<Jugador> jugadoresList, Revolver revolver) {
        for (int i = 0; i < 6; i++) {
            Jugador playerX = new Jugador();
            playerX.setId((i + 1));
            playerX.setNombre("Jugador " + (i + 1));
            jugadoresList.add(playerX);
        }
        llenarRevolver(revolver);
    }
//    • mojar(): devuelve true si la posición del agua coincide con la posición actual

    public boolean mojar(Revolver revolverObj) {
        boolean seMurio = false;
        if (revolverObj.getPosActual() == revolverObj.getPosAgua()) {
            seMurio = true;
        }
        return seMurio;
    }
//    • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//      mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//      revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//      devuelve true, sino false.

    public boolean disparo(Jugador jugador, Revolver revolverObj) {
        boolean seMurio = false;
        if (mojar(revolverObj)) {
            jugador.setMojado(true);
            seMurio = true;
        }
        return seMurio;
    }

//  • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//    aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//    moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//    mojar. Al final del juego, se debe mostrar que jugador se mojó.
//    Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
    
    public boolean ronda(Jugador jugador, Revolver revolverObj) {
        boolean juegoSigue = true;
        if (disparo(jugador, revolverObj)) {
            juegoSigue = false;
        }
        return juegoSigue;
    }
//     •llenarRevolver(): le pone los valores de posición actual 
//     * y de posición del agua. Los valores deben ser
//     * aleatorios.

    public void llenarRevolver(Revolver revolverObj) {
        Random random = new Random();
        revolverObj.setPosActual(random.nextInt(6) + 1);
        revolverObj.setPosAgua(random.nextInt(6) + 1);
    }

//    • siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro(Revolver revolverObj) {
        if (revolverObj.getPosActual() < 6) {
            revolverObj.setPosActual(revolverObj.getPosActual() + 1);
        } else if (revolverObj.getPosActual() == 6) {
            revolverObj.setPosActual(1);
        }
    }

}
