package ejercicio_02.servicios;

import ejercicio_02.entidades.Jugador;
import ejercicio_02.entidades.Revolver;

//@author Facundo Cruz
public class JugadorService {

    public boolean disparo(Revolver r1, Jugador j1) {
        RevolverService sv = new RevolverService();
        boolean var = false;
        if (sv.mojar(r1)) {
            var = true;
        }
        sv.siguienteChorro(r1);
        return var;
    }

}
