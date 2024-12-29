package servicio;

import entidad.Cartas;
import entidad.Palos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioBarajas {
    Scanner leer = new Scanner(System.in);
    ArrayList<Palos> palos = new ArrayList<>();
    ArrayList<Cartas> cartas = new ArrayList<>();
    ArrayList<Cartas> cartasDadas = new ArrayList<>();

    //Se añaden los palos de las cartas
    
    public void crearPalos() {
        palos.add(new Palos("Espadas"));
        palos.add(new Palos("Bastos"));
        palos.add(new Palos("Copas"));
        palos.add(new Palos("Oros"));
    }

    //Se crea la baraja con los palos y numeros, si es que no existe una anterior.
    
    public void crearBaraja() {
        crearPalos();
        if (cartas.size() > 0) {
            System.out.println("Ya existe una baraja");
        } else {
            System.out.println("Creando baraja...");
            String[] numero = {"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};

            for (int i = 0; i < palos.size(); i++) {
                for (int j = 0; j < numero.length; j++) {
                    cartas.add(new Cartas(numero[j], palos.get(i)));
                }
            }
            System.out.println("Se creó la baraja correctamente!");
        }
    }

//    • barajar(): cambia de posición todas las cartas aleatoriamente.
    
    public void barajar() {
        System.out.println("Barajando...");
//        for (int i = 0; i < cartas.size(); i++) {
//            int j = (int) (Math.random() * cartas.size());
//            Entidad.Cartas aux = cartas.get(i);
//            cartas.set(i, cartas.get(j));
//            cartas.set(j, aux);
//        }
        Collections.shuffle(cartas); // BY NICO SANTOS
        System.out.println("Se mezcló la baraja completamente!");
    }

//    • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//    se haya llegado al final, se indica al usuario que no hay más cartas.
    
    public Cartas siguienteCarta() {
        Cartas carta = new Cartas();
        if (cartas.size() == 0) {
            System.out.println("No hay cartas");
        } else {
            carta = cartas.get(0);
        }
        return carta;
    }

//    • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    
    public void cartasDisponibles() {
        System.out.println("Cartas disponibles: " + cartas.size());
    }

//    • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//    cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//    debemos indicárselo al usuario.
    
    public void darCartas() {
        System.out.println("Ingrese la cantidad de cartas que desea dar:");
        int cantidad = leer.nextInt();
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas");
        } else {
            int cont = 0;
            while (cont < cantidad) {
                System.out.println("Se dio la carta: " + siguienteCarta() + " al jugador");
                cartasDadas.add(cartas.get(0));
                cartas.remove(0);
                cont++;
            }
        }
    }

//    • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//    indicárselo al usuario
    
    public void cartasMonton() {
        System.out.println("Cartas del monton: " + cartasDadas.size());
        for (Cartas carta : cartasDadas) {
            System.out.println(carta);
        }
    }

//    • mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//    luego se llama al método, este no mostrara esa primera carta.
    
    public void mostrarBaraja() {
        System.out.println("Cartas de la baraja:");
        for (Cartas carta : cartas) {
            System.out.println(carta);
        }
    }
}
