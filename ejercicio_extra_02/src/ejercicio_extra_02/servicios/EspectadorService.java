/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_02.servicios;

import ejercicio_extra_02.entidades.Espectador;
import java.util.ArrayList;

//@author Facundo Cruz
public class EspectadorService {

    public ArrayList<Espectador> crearEspectadores() {
        ArrayList<Espectador> espectadores = new ArrayList();
        espectadores.add(new Espectador("Pepe", 18, 1430.5));
        espectadores.add(new Espectador("Agus", 10, 5000.5));
        espectadores.add(new Espectador("Lau", 24, 4430.5));
        espectadores.add(new Espectador("Gonza", 6, 2430.5));
        espectadores.add(new Espectador("Tati", 40, 100));
        espectadores.add(new Espectador("Vale", 20, 900));
        espectadores.add(new Espectador("Lucas", 70, 0));
        espectadores.add(new Espectador("Exe", 18, 20000));
        espectadores.add(new Espectador("Yami", 32, 800));
        espectadores.add(new Espectador("Mel", 14, 300));
        espectadores.add(new Espectador("Elias", 54, 4530.2));
        espectadores.add(new Espectador("Walter", 56, 1130.5));
        
        return espectadores;
    }
}
