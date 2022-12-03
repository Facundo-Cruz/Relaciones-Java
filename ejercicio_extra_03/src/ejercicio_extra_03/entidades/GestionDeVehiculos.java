package ejercicio_extra_03.entidades;

import java.util.ArrayList;

public class GestionDeVehiculos {
    private ArrayList<Vehiculo> vehiculos;

    public GestionDeVehiculos() {
        this.vehiculos = new ArrayList();
    }

    public GestionDeVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
}
