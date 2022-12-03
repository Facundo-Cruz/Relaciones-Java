package ejercicio_extra_03.entidades;

public class EmpresaAseguradora {

    private GestionDeClientes gClientes;
    private GestionDeVehiculos gVehiculos;
    private GestionDePolizas gPolizas;
   

    public EmpresaAseguradora() {
    }

    public EmpresaAseguradora(GestionDeClientes gClientes, GestionDeVehiculos gVehiculos, GestionDePolizas gPolizas) {
        this.gClientes = gClientes;
        this.gVehiculos = gVehiculos;
        this.gPolizas = gPolizas;
    }

    public GestionDeClientes getgClientes() {
        return gClientes;
    }

    public void setgClientes(GestionDeClientes gClientes) {
        this.gClientes = gClientes;
    }

    public GestionDeVehiculos getgVehiculos() {
        return gVehiculos;
    }

    public void setgVehiculos(GestionDeVehiculos gVehiculos) {
        this.gVehiculos = gVehiculos;
    }

    public GestionDePolizas getgPolizas() {
        return gPolizas;
    }

    public void setgPolizas(GestionDePolizas gPolizas) {
        this.gPolizas = gPolizas;
    }

}
