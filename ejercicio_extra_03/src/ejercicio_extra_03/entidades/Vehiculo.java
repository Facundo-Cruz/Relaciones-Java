package ejercicio_extra_03.entidades;

import ejercicio_extra_03.enumeradores.TipoDeVehiculo;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int year;
    private int numeroDeMotor;
    private int chasis;
    private String color;
    private TipoDeVehiculo tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int year, int numeroDeMotor, int chasis, String color, TipoDeVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.numeroDeMotor = numeroDeMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumeroDeMotor() {
        return numeroDeMotor;
    }

    public void setNumeroDeMotor(int numeroDeMotor) {
        this.numeroDeMotor = numeroDeMotor;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoDeVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeVehiculo tipo) {
        this.tipo = tipo;
    }
    
}
