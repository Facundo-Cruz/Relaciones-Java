
package ejercicio_02.entidades;

import java.util.ArrayList;
import java.util.List;


//@author Facundo Cruz

public class Juego {
    private ArrayList<Jugador> jugadores;
    private Revolver r1;

    public Juego() {
        this.jugadores = new ArrayList();
       
    }

    public Juego(List<Jugador> jugadores, Revolver r1) {
        this.jugadores = new ArrayList();
        this.r1 = r1;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getR1() {
        return r1;
    }

    public void setR1(Revolver r1) {
        this.r1 = r1;
    }
    
}
