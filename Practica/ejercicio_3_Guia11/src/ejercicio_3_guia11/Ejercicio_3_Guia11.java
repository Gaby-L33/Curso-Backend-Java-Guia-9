package ejercicio_3_guia11;

import java.util.Scanner;
import servicio.ServicioBarajas;

public class Ejercicio_3_Guia11 {

    /**
     * Realizar una baraja de cartas españolas orientada a objetos. Una carta
     * tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo
     * (espadas, bastos, oros y copas). Esta clase debe contener un método
     * toString() que retorne el número de carta y el palo. La baraja estará
     * compuesta por un conjunto de cartas, 40 exactamente.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioBarajas barajaService = new ServicioBarajas();

        int menu = 0;
        do {
            System.out.println("1. Crear baraja");
            System.out.println("2. Mezclar baraja");
            System.out.println("3. Dar cartas");
            System.out.println("4. Mostrar cartas del monton");
            System.out.println("5. Cartas disponibles");
            System.out.println("6. Mostrar baraja");
            System.out.println("7. Salir");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("*--------------------------*");
                    barajaService.crearBaraja();
                    break;
                case 2:
                    System.out.println("*--------------------------*");
                    barajaService.barajar();
                    break;
                case 3:
                    System.out.println("*--------------------------*");
                    barajaService.darCartas();
                    break;
                case 4:
                    System.out.println("*--------------------------*");
                    barajaService.cartasMonton();
                    break;
                case 5:
                    System.out.println("*--------------------------*");
                    barajaService.cartasDisponibles();
                    break;
                case 6:
                    System.out.println("*--------------------------*");
                    barajaService.mostrarBaraja();
                    break;
                case 7:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("*--------------------------*");
        } while (menu != 7);
    }

}
