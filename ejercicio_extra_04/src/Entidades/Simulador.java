package Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Simulador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<String> generarNombresCompletos() {
        ArrayList<String> nombresCompletos = new ArrayList();
        ArrayList<String> nombres = new ArrayList();
        ArrayList<String> apellidos = new ArrayList();
        nombres.add("Pepe");
        nombres.add("Chiquito");
        nombres.add("Filomena");
        nombres.add("Agus");
        nombres.add("Fideo");
        nombres.add("Papu");
        nombres.add("Pancho");
        nombres.add("Lacra");
        nombres.add("Tomate");
        nombres.add("Cesar");
        nombres.add("Mortadela");
        apellidos.add("Tuki");
        apellidos.add("TukiMaster");
        apellidos.add("Langoni");
        apellidos.add("Cruz");
        apellidos.add("Valverde");
        apellidos.add("Gimenez");
        apellidos.add("Maddona");
        apellidos.add("Messi");
        apellidos.add("Toyota");
        apellidos.add("Ferrari");
        apellidos.add("Virgolini");
        for (int i = 0; i < 25; i++) {
            int index1 = (int) (Math.random() * nombres.size());
            int index2 = (int) (Math.random() * apellidos.size());
            nombresCompletos.add(nombres.get(index1) + " " + apellidos.get(index2));
        }
        return nombresCompletos;
    }

    public ArrayList<Integer> generarDocumentos() {
        ArrayList<Integer> documentos = new ArrayList();
        for (int i = 0; i < 20; i++) {
            int documento = (int) (Math.random() * (-20000000) + 50000000);
            documentos.add(documento);
        }
        return documentos;
    }

    public ArrayList<Alumno> generarAlumnos(ArrayList<String> nombres, ArrayList<Integer> documentos) {
        ArrayList<Alumno> alumnos = new ArrayList();
        System.out.println("Ingrese la cantidad de alumnos a generar");
        int cant = leer.nextInt();
        if (cant < 10) {
            System.out.println("Has ingresado una cantidad insuficiente, crearemos 10 alumnos por defecto");
            cant = 10;
        }

        for (int i = 0; i < cant; i++) {
            if (i > documentos.size() - 1) {
                System.out.println("Nos ha faltado crear " + (cant - documentos.size()) + " alumnos por falta de documentos :(");
                break;
            }
            int index1 = (int) (Math.random() * nombres.size());
            alumnos.add(new Alumno(nombres.get(index1), documentos.get(i), 0));
        }
        return alumnos;
    }

    public ArrayList<Voto> votacion(ArrayList<Alumno> alumnos) {

        ArrayList<Voto> votos = new ArrayList();
        for (Alumno aux : alumnos) {

            Voto v1 = new Voto();
            v1.setVotante(aux);

            HashSet<Integer> indices = new HashSet();
            while (indices.size() != 3) {
                indices.add((int) (Math.random() * alumnos.size()));
                int thisIndex = alumnos.indexOf(aux);
                if (indices.contains(thisIndex)) {
                    indices.remove(thisIndex);
                }
            }

            for (Integer x : indices) {
                alumnos.get(x).setCantidadDeVotos(alumnos.get(x).getCantidadDeVotos() + 1);
                v1.setVotantes(alumnos.get(x));
            }

            votos.add(v1);
        }
        return votos;
    }

    public void mostrarVotos(ArrayList<Voto> votos) {
        for (Voto aux : votos) {
            System.out.println(aux);
        }
    }

    public String recuentoVotos(ArrayList<Alumno> alumnos) {
        int cant = 0;
        for (Alumno aux : alumnos) {
            cant += aux.getCantidadDeVotos();
        }
        return "Hay un total de " + cant + " votos";
    }

    public void mostrarFacilitadores(ArrayList<Alumno> alumnos) {
        Collections.sort(alumnos, ordenarPorVotos);
        System.out.println("Los facilitadores principales son:");
        for (int i = 0; i < 5; i++) {
            System.out.println(alumnos.get(i).toStringNew());
        }
        System.out.println("\nY los facilitadores suplentes son:");
        for (int i = 5; i < 10; i++) {
            System.out.println(alumnos.get(i).toStringNew());
        }
    }
    public static Comparator<Alumno> ordenarPorVotos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t1.getCantidadDeVotos().compareTo(t.getCantidadDeVotos());
        }
    };

}
