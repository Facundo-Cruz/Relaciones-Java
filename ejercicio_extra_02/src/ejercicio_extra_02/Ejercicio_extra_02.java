package ejercicio_extra_02;

//@author Facundo Cruz
import ejercicio_extra_02.entidades.Cine;
import ejercicio_extra_02.servicios.AsientoService;
import ejercicio_extra_02.servicios.CineService;
import ejercicio_extra_02.servicios.EspectadorService;

public class Ejercicio_extra_02 {

    public static void main(String[] args) {

        CineService sv = new CineService();
        EspectadorService sv2 = new EspectadorService();
        AsientoService sv3 = new AsientoService();
        Cine c1 = sv.crearCine();
        sv3.ubicarPersonas(c1, sv2.crearEspectadores());
        sv3.ubicarPersonas(c1, sv2.crearEspectadores());
        sv3.ubicarPersonas(c1, sv2.crearEspectadores());
        sv3.ubicarPersonas(c1, sv2.crearEspectadores());
        sv.mostrarSala(c1.getSala());
    }

}
