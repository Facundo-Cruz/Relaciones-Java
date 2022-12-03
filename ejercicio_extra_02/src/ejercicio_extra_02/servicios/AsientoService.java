/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_02.servicios;

import ejercicio_extra_02.entidades.Cine;
import ejercicio_extra_02.entidades.Espectador;
import java.util.ArrayList;

//@author Facundo Cruz
public class AsientoService {

    public void ubicarPersonas(Cine cine, ArrayList<Espectador> espectadores) {
        CineService sv = new CineService();
        for (Espectador aux : espectadores) {
            if (!sv.hayEspacio(cine.getSala())) {
                System.out.println("Lo sentimos no tenemos más espacio...");
                break;
            }
            if (cine.getPelicula().getEdadMinima() > aux.getEdad()) {
                System.out.println("Lo sentimos " + aux.getNombre() + ", no cumples con la edad suficiente para ver la pelicula.");
                continue;
            }
            if (aux.getDineroDisponible() < cine.getPrecioEntrada()) {
                System.out.println("Lo sentimos " + aux.getNombre() + ", no tienes el dinero suficiente para ver la pelicula.");
                continue;
            }
            boolean var = true;
            while (var) {
                int fila = (int) (Math.random() * 8);
                int columna = (int) (Math.random() * 6);
                if (cine.getSala()[fila][columna].getEspectador() == null) {
                    System.out.println("Gracias por tu compra "+aux.getNombre()+", tu butaca está en " + cine.getSala()[fila][columna]);
                    cine.getSala()[fila][columna].setEspectador(aux);
                    var = false;
                }
            }
        }
    }
}
