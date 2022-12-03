package ejercicio_extra_03.entidades;

import java.util.ArrayList;

public class GestionDeClientes {
    ArrayList<Cliente> clientes;

    public GestionDeClientes() {
        this.clientes = new ArrayList();
    }

    public GestionDeClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
