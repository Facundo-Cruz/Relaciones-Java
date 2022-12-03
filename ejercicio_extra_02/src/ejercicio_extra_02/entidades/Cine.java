/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_extra_02.entidades;



//@author Facundo Cruz

public class Cine {
    private Pelicula pelicula;
    private Asiento[][] sala;
    private double precioEntrada;

    public Cine() {
        
    }

    public Cine(Pelicula pelicula, Asiento[][] sala, double precioEntrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
    
}
