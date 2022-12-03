package ejercicio_extra_03.entidades;

import java.util.ArrayList;

public class GestionDeCuotas {

    private ArrayList<Cuota> cuotas;

    public GestionDeCuotas() {
        this.cuotas = new ArrayList();
    }

    public GestionDeCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

}
