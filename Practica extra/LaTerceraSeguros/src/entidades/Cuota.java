package entidades;

import java.util.Date;

/**
Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
 */
public class Cuota {
    private int numeroCuota;
    private double montoTotal;
    private boolean pagada;
    private Date fechaVencimiento;
    private String formaPago;

    public Cuota() {
    }

    public Cuota(int numeroCuota, double montoTotal, boolean pagada, Date fechaVencimiento, String formaPago) {
        this.numeroCuota = numeroCuota;
        this.montoTotal = montoTotal;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numeroCuota=" + numeroCuota + ", montoTotal=" + montoTotal + ", pagada=" + pagada + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + '}';
    }
    
    
}
