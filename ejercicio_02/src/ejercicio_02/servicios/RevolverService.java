
package ejercicio_02.servicios;

import ejercicio_02.entidades.Revolver;

//@author Facundo Cruz
public class RevolverService {

    public Revolver llenarRevolver() {
        Revolver r1 = new Revolver();
        r1.setPosicionActual((int) (Math.random() * 6));
        r1.setPosicionAgua((int) (Math.random() * 6));
        return r1;
    }

    public boolean mojar(Revolver r1) {
        return r1.getPosicionActual() == r1.getPosicionAgua();
    }

    public void siguienteChorro(Revolver r1) {
        r1.setPosicionActual(r1.getPosicionActual() + 1);
        if (r1.getPosicionActual() == 6) {
            r1.setPosicionActual(0);
        }
    }
}
