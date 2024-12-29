package servicios;

import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import java.util.Random;
import java.util.Scanner;

/**
 * Para representar la sala con los espectadores vamos a utilizar una matriz.
 * Los asientos son etiquetados por una letra y un número la fila A1 empieza al
 * final del mapa como se muestra en la tabla. También deberemos saber si el
 * asiento está ocupado por un espectador o no, si esta ocupado se muestra una
 * X, sino un espacio vacío. Se debe realizar una pequeña simulación, en la que
 * se generen muchos espectadores y se los ubique en los asientos aleatoriamente
 * (no se puede ubicar un espectador donde ya este ocupado el asiento). Los
 * espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta
 * que sólo se podrá sentar a un espectador si tiene el dinero suficiente para
 * pagar la entrada, si hay espacio libre en la sala y si tiene la edad
 * requerida para ver la película. En caso de que el asiento este ocupado se le
 * debe buscar uno libre. Al final del programa deberemos mostrar la tabla,
 * podemos mostrarla con la letra y numero de cada asiento o solo las X y
 * espacios vacíos.
 *
 */
public class ServiciosCine {

    Scanner leer = new Scanner(System.in);
    boolean[][] asientos = new boolean[8][6];

    public void mostrarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print((8 - i) + " ");
                System.out.print((char) ('A' + j) + " ");
                if(asientos[i][j] == true){
                    System.out.print("X |");
                } else{
                    System.out.print(" |");
                }
            }
            System.out.println();
        }
    }

    public boolean ubicarEspectador(Espectador espectador, Pelicula pelicula, Cine cine) {
        if (espectador.getEdad() < pelicula.getEdadMin()) {
            System.out.println(espectador.getNombre() + " no tiene la suficiente edad para ver la pelicula");
            System.out.println("---------------------------------------------");
            return false;
        }
        if (espectador.getDineroDis() < cine.getEntrada()) {
            System.out.println(espectador.getNombre() + " no tiene suficiente dinero para pagar la entrada");
            System.out.println("---------------------------------------------");
            return false;
        }

        Random rand = new Random();
        for (int i = 0; i < 100; i++) { // Intentar ubicar hasta 100 veces
            int fila = rand.nextInt(8);
            int columna = rand.nextInt(6);
            if (!asientos[fila][columna]) { //Analiza si esta libre
                asientos[fila][columna] = true;
                System.out.println(espectador.getNombre() + "se ha sentado en " + (8 - fila)
                        + (char) ('A' + columna));
                System.out.println("---------------------------------------------");
                return true; //Reserva exitosa
            }
        }
        System.out.println("No hay asientos disponible para " + espectador.getNombre());
        System.out.println("---------------------------------------------");
        return false;
    }
}
