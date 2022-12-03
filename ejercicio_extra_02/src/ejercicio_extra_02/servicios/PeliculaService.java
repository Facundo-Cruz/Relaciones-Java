/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_02.servicios;

import ejercicio_extra_02.entidades.Pelicula;
import java.util.Scanner;

//@author Facundo Cruz
public class PeliculaService {

    public Pelicula crearPelicula() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Pelicula p1 = new Pelicula();
        System.out.println("Ingresa el nombre de la peli");
        p1.setTitulo(leer.next());
        System.out.println("Ingresa el director");
        p1.setDirector(leer.next());
        System.out.println("Ingresa la duración en hs");
        p1.setDuracion(leer.nextDouble());
        System.out.println("Ingresa la edad mínima para verla");
        p1.setEdadMinima(leer.nextInt());
        return p1;
    }
}
