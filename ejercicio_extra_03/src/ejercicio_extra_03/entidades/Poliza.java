package ejercicio_extra_03.entidades;

import ejercicio_extra_03.enumeradores.TipoDeCobertura;
import ejercicio_extra_03.enumeradores.TipoDePago;
import java.time.LocalDate;

public class Poliza {
    private Vehiculo vhlo;
    private Cliente cte;
    private int numeroDePoliza;
    private LocalDate fechaDeInicio;
    private LocalDate fechaDeFin;
    private int cantidadDeCuotas;
    private TipoDePago formaDePago;
    private Double montoTotalAsegurado;
    private boolean incluyeGranizo;
    private double montoMaxGranizo;
    private TipoDeCobertura tipoC;
    private GestionDeCuotas gCuotas;

    public Poliza() {
    }

    public Poliza(Vehiculo vhlo, Cliente cte, int numeroDePoliza, LocalDate fechaDeInicio, LocalDate fechaDeFin, int cantidadDeCuotas, TipoDePago formaDePago, Double montoTotalAsegurado, boolean incluyeGranizo, double montoMaxGranizo, TipoDeCobertura tipoC, GestionDeCuotas gCuotas) {
        this.vhlo = vhlo;
        this.cte = cte;
        this.numeroDePoliza = numeroDePoliza;
        this.fechaDeInicio = fechaDeInicio;
        this.fechaDeFin = fechaDeFin;
        this.cantidadDeCuotas = cantidadDeCuotas;
        this.formaDePago = formaDePago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.incluyeGranizo = incluyeGranizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.tipoC = tipoC;
        this.gCuotas = gCuotas;
    }

    public Vehiculo getVhlo() {
        return vhlo;
    }

    public void setVhlo(Vehiculo vhlo) {
        this.vhlo = vhlo;
    }

    public Cliente getCte() {
        return cte;
    }

    public void setCte(Cliente cte) {
        this.cte = cte;
    }

    public int getNumeroDePoliza() {
        return numeroDePoliza;
    }

    public void setNumeroDePoliza(int numeroDePoliza) {
        this.numeroDePoliza = numeroDePoliza;
    }

    public LocalDate getFechaDeInicio() {
        return fechaDeInicio;
    }

    public void setFechaDeInicio(LocalDate fechaDeInicio) {
        this.fechaDeInicio = fechaDeInicio;
    }

    public LocalDate getFechaDeFin() {
        return fechaDeFin;
    }

    public void setFechaDeFin(LocalDate fechaDeFin) {
        this.fechaDeFin = fechaDeFin;
    }

    public int getCantidadDeCuotas() {
        return cantidadDeCuotas;
    }

    public void setCantidadDeCuotas(int cantidadDeCuotas) {
        this.cantidadDeCuotas = cantidadDeCuotas;
    }

    public TipoDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(TipoDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(Double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public double getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(double montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public TipoDeCobertura getTipoC() {
        return tipoC;
    }

    public void setTipoC(TipoDeCobertura tipoC) {
        this.tipoC = tipoC;
    }

    public GestionDeCuotas getgCuotas() {
        return gCuotas;
    }

    public void setgCuotas(GestionDeCuotas gCuotas) {
        this.gCuotas = gCuotas;
    }

    
    
}
