package ejercicio_extra_03.entidades;

import java.util.ArrayList;

public class GestionDePolizas {
    private ArrayList<Poliza> polizas;

    public GestionDePolizas() {
        this.polizas = new ArrayList();
    }

    public GestionDePolizas(ArrayList<Poliza> polizas) {
        this.polizas = polizas;
    }

    public ArrayList<Poliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(ArrayList<Poliza> polizas) {
        this.polizas = polizas;
    }
    
}
