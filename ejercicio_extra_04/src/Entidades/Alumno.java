package Entidades;

public class Alumno {

    private String nombreCompleto;
    private int documento;
    private Integer cantidadDeVotos;

    public Alumno() {
    }

    public Alumno(String nombreCompleto, int documento, int cantidadDeVotos) {
        this.nombreCompleto = nombreCompleto;
        this.documento = documento;
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Integer getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(int cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }

    @Override
    public String toString() {
        return nombreCompleto;
    }
    public String toStringNew() {
        return nombreCompleto + " ---> " + documento + " --> " + cantidadDeVotos;
    }

}
