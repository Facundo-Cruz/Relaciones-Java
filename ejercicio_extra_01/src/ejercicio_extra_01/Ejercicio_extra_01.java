package ejercicio_extra_01;

//@author Facundo Cruz
import ejercicio_extra_01.entidades.Perro;
import ejercicio_extra_01.entidades.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio_extra_01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        List<Perro> perrera = new ArrayList();
        perrera.add(new Perro("Pepito", "Caniche", 5, "Chico"));
        perrera.add(new Perro("Tomate", "Beagle", 10, "Mediano"));
        perrera.add(new Perro("Ciro", "Dalmata", 2, "Grande"));
        perrera.add(new Perro("Teo", "Callejero", 6, "Mediano"));
        perrera.add(new Perro("Kati", "Doberman", 1, "Chico"));
        List<Persona> listaPersonas = new ArrayList();
        listaPersonas.add(new Persona("Facu", "Cruz", 20, 44537914));
        listaPersonas.add(new Persona("Agus", "Cañas", 35, 31379174));
        listaPersonas.add(new Persona("Vale", "Damonte", 20, 43379140));
        listaPersonas.add(new Persona("Nico", "Gonzales", 70, 11245922));
        listaPersonas.add(new Persona("Lauti", "Gabutti", 13, 51379424));

        for (Persona aux : listaPersonas) {
            System.out.println("Hola " + aux.getNombre() + " te mostraremos una lista para que eligas un perro");
            System.out.println("--------------------------------------------------------------------------");
            for (Perro aux2 : perrera) {
                System.out.println(aux2);
            }
            System.out.println("--------------------------------------------------------------------------");
            boolean adoptado = false;
            System.out.println("Ingrese el nombre de la mascota a adoptar");
            String nombreMascota = leer.next();
            for (Persona aux2 : listaPersonas) {
                if (aux2.getPerro() == null) {
                    continue;
                }
                if (aux2.getPerro().getNombre().equalsIgnoreCase(nombreMascota)) {
                    adoptado = true;
                    break;
                }
            }
            if (adoptado) {
                System.out.println("Lo sentimos ese perro ya ha sido adoptado :(");
            } else {
                boolean existe = false;
                for (Perro aux2 : perrera) {
                    if (aux2.getNombre().equalsIgnoreCase(nombreMascota)) {
                        aux.setPerro(aux2);
                        existe = true;
                        System.out.println("La mascota ha sido adoptada con éxito :)");
                        break;
                    }
                }
                if (!existe) {
                    System.out.println("La mascota ingresada no existe :/");
                }
            }
            System.out.println("***************************************************************************");
        }
        for (Persona aux : listaPersonas) {
            System.out.println(aux);
        }
    }

}
