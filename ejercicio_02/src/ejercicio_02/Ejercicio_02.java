package ejercicio_02;

//@author Facundo Cruz
import ejercicio_02.entidades.Juego;
import ejercicio_02.entidades.Jugador;
import ejercicio_02.entidades.Revolver;
import ejercicio_02.servicios.JuegoService;
import ejercicio_02.servicios.RevolverService;
import java.util.ArrayList;

public class Ejercicio_02 {

    public static void main(String[] args) {

        Juego game = new Juego();
        JuegoService sv = new JuegoService();
        RevolverService sv2 = new RevolverService();
        
        ArrayList<Jugador> jugadores = sv.llenarJugadores();
        Revolver r1 = sv2.llenarRevolver();
        sv.llenarJuego(jugadores, r1, game);
        sv.ronda(game);
    }

}
