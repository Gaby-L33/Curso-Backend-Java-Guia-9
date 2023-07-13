package servicio;

import entidad.Perro;
import entidad.Persona;
import java.util.Scanner;

public class ServicioAdopcion {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona() {
        //Datos persona
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona:");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el apellido de la persona:");
        persona.setApellido(leer.next());
        System.out.println("Ingrese la edad de la persona:");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el documento de la persona:");
        persona.setDocumento(leer.next());
        return persona;
    }

    public Perro crearPerro() {
        //Datos perro
        Perro perro = new Perro();
        System.out.println("Ingrese el nombre del perro:");
        perro.setNombre(leer.next());
        System.out.println("Ingrese la raza del perro:");
        perro.setRaza(leer.next());
        System.out.println("Ingrese la edad del perro:");
        perro.setEdad(leer.nextInt());
        System.out.println("Ingrese el tamaño del perro:");
        perro.setTamano(leer.next());
        return perro;
    }
}
