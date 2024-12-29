package ejercicio_1_guia11;

import entidad.Perro;
import entidad.Persona;
import servicio.ServicioAdopcion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_1_Guia11 {

    /**
     * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a
     * contar de dos clases. Perro, que tendrá como atributos: nombre, raza,
     * edad y tamaño; y la clase Persona con atributos: nombre, apellido, edad,
     * documento y Perro. Ahora deberemos en el main crear dos Personas y dos
     * Perros. Después, vamos a tener que pensar la lógica necesaria para
     * asignarle a cada Persona un Perro y por ultimo, mostrar desde la clase
     * Persona, la información del Perro y de la Persona.
     */
    
//    Ejercicio Extra 1:
//    Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
//    tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
//    cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
//    al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
//    persona.
//    Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//    personas con sus respectivos perros.
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioAdopcion adopcionService = new ServicioAdopcion();
        List<Persona> personas = new ArrayList();
        List<Perro> perrosAdopcion = new ArrayList();
        //Cargar personas
        System.out.println("Cargar Personas");
        System.out.println("Cuantas personas quiere cargar: ");
        int res = leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < res; i++) {
            System.out.println("Persona " + (i + 1) + ":");
            personas.add(adopcionService.crearPersona());
        }
        //Cargar perros
        System.out.println("Cargar Perros");
        System.out.println("Ingrese la cantidad de perros a cargar: ");
        res = leer.nextInt();
        leer.nextLine();
        for (int i = 0; i < res; i++) {
            System.out.println("Perro " + (i + 1) + ":");
            perrosAdopcion.add(adopcionService.crearPerro());
        }
        System.out.println("Adoptando Perros:");
        for (Persona aux : personas) {
            System.out.println("Para la persona " + aux.getNombre() + " " + aux.getApellido()
                    + " \nseleccione el nombre de uno de los siguientes perros en adopción: ");
            for (Perro aux2 : perrosAdopcion) {
                System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
            }
            String adoptable = leer.next();
            boolean adoptado = false;
            for (int i = 0; i < perrosAdopcion.size(); i++) {
                if (adoptable.equalsIgnoreCase(perrosAdopcion.get(i).getNombre())) {
                    aux.setPerro(perrosAdopcion.get(i));
                    perrosAdopcion.remove(i);
                    adoptado = true;
                    break;
                }
            }
            if (!adoptado) {
                System.out.println("No se ha adoptado un perro válido");
            }
        }
        System.out.println("");
        System.out.println("Las siguientes personas han adoptado: ");
        for (Persona aux : personas) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " ha adoptado a " + aux.getPerro().getNombre() + " de raza " + aux.getPerro().getRaza());
            }

        }
    }

}
