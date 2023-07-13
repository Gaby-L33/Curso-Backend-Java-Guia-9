package ejercicio_persona;

import entidad.DNI;
import entidad.Persona;
import java.util.ArrayList;
import java.util.HashSet;

public class Ejercicio_Persona {

    /**
     * Realiza un programa en donde una clase Persona tenga como atributo
     * nombre, apellido y un objeto de clase Dni. La clase Dni tendrá como
     * atributos la serie (carácter) y número. Prueba acceder luego a los
     * atributos del dni de la persona creando objetos y jugando desde el main.
     */
    public static void main(String[] args) {
        DNI dni1 = new DNI();
        Persona persona1 = new Persona();
        persona1.setNombre("Gabriel");
        persona1.setApellido("Lewicki");
        ArrayList<Persona> personas = new ArrayList();
        personas.add(persona1);
        dni1.setSerie("asdadsdead");
        dni1.setNumero(44677037);
        HashSet<DNI> dnis = new HashSet();
        dnis.add(dni1);

        System.out.println("Mostrando los DNIs guardados: ");
        System.out.println("");
        System.out.println("Nombre: " + persona1.getNombre() + " / Apellido: " + persona1.getApellido() + " /");
        System.out.println("DNI: " + dni1.getNumero() + " / Numero de serie: " + dni1.getSerie());
        System.out.println("FIN DEL PROCEDIMIENTO.....");
        System.out.println("");
    }

}
