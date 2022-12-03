package ejercicio_extra_04;

import Entidades.Alumno;
import Entidades.Simulador;
import java.util.ArrayList;

public class Ejercicio_extra_04 {

    public static void main(String[] args) {
        Simulador sm = new Simulador();
        ArrayList<Alumno> alumnos = sm.generarAlumnos(sm.generarNombresCompletos(), sm.generarDocumentos());
        System.out.println("");
        for (Alumno aux : alumnos) {
            System.out.println(aux.toStringNew());
        }
        System.out.println("---------------------------------------------------------------------------");
        sm.mostrarVotos(sm.votacion(alumnos));
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(sm.recuentoVotos(alumnos));
        System.out.println("---------------------------------------------------------------------------");
        sm.mostrarFacilitadores(alumnos);
    }

}
