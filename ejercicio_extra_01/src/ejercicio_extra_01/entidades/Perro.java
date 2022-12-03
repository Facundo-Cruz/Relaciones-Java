/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_extra_01.entidades;


//@author Facundo Cruz

public class Perro {
    private String nombre;
    private String raza;
    private int edad;
    private String size;

    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, String size) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.size = size;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad + ", Tamaño: " + size;
    }
    
}
