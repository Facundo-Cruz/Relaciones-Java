package Entidades;

import java.util.HashSet;

public class Voto {

    private Alumno votante;
    private HashSet<Alumno> votados;

    public Voto() {
        this.votados = new HashSet();
    }

    public Voto(Alumno votante, HashSet<Alumno> votantes) {
        this.votante = votante;
        this.votados = votantes;
    }

    public Alumno getVotante() {
        return votante;
    }

    public void setVotante(Alumno votante) {
        this.votante = votante;
    }

    public HashSet<Alumno> getVotantes() {
        return votados;
    }

    public void setVotantes(Alumno a1) {
        this.votados.add(a1);
    }

    @Override
    public String toString() {
        return "Votante: " + votante + "[" + votante.getCantidadDeVotos() + " pulsos recibidos]\n \t #Votados: " + votados + "\n";
    }

}
