package laterceraseguros;

import entidades.Cliente;
import entidades.Cuota;
import entidades.Vehiculo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import servicios.ServiciosCuotas;

/**
Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
que quiere realizar la empresa.
 */
public class LaTerceraSeguros {

    public static void main(String[] args) {
        ServiciosCuotas servicioCuota = new ServiciosCuotas();
        // Crear un cliente
        Cliente cliente = new Cliente("Juan", "Pérez", "12345678", "juan.perez@example.com", "Calle Falsa 123", "123456789");

        // Crear un vehículo
        Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2020, "ABC123", "XYZ456", "Rojo", "Sedán");
        
        Cuota cuota1 = new Cuota(1, 5000, false, new Date(System.currentTimeMillis() + 2628000000L), "Efectivo");
        
        Cuota cuota2 = new Cuota(2, 5000, false, new Date(System.currentTimeMillis() + 5256000000L), "Efectivo");
        
        List<Cuota> listCuotas = new ArrayList();

    }
    
}
