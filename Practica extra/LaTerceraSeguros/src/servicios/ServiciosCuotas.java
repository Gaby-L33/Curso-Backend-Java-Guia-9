package servicios;

import entidades.Cuota;
import entidades.Poliza;

public class ServiciosCuotas {
    public void agregarCuota(Poliza poliza, Cuota cuota) {
        poliza.getCuotas().add(cuota);
    }
}
