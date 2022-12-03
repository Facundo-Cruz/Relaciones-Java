
package ejercicio_extra_03.entidades;

import ejercicio_extra_03.enumeradores.TipoDePago;
import java.time.LocalDate;

public class Cuota {
    private int numeroDeCuota;
    private double montoTotal;
    private boolean pagada;
    private LocalDate fechaVencimiento;
    private TipoDePago tipoDePago;

    public Cuota() {
    }

    public Cuota(int numeroDeCuota, double montoTotal, boolean pagada, LocalDate fechaVencimiento, TipoDePago tipoDePago) {
        this.numeroDeCuota = numeroDeCuota;
        this.montoTotal = montoTotal;
        this.pagada = pagada;
        this.fechaVencimiento = fechaVencimiento;
        this.tipoDePago = tipoDePago;
    }

    public int getNumeroDeCuota() {
        return numeroDeCuota;
    }

    public void setNumeroDeCuota(int numeroDeCuota) {
        this.numeroDeCuota = numeroDeCuota;
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

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public TipoDePago getTipoDePago() {
        return tipoDePago;
    }

    public void setTipoDePago(TipoDePago tipoDePago) {
        this.tipoDePago = tipoDePago;
    }
    
}
