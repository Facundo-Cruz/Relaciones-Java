/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_02.servicios;

import ejercicio_02.entidades.Juego;
import ejercicio_02.entidades.Jugador;
import ejercicio_02.entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

//@author Facundo Cruz
public class JuegoService {

    public ArrayList<Jugador> llenarJugadores() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Jugador> jugadores = new ArrayList();
        System.out.println("Ingrese le cantidad de jugadores");
        int cant = leer.nextInt();
        if (cant < 1 || cant > 6) {
            cant = 6;
        }
        for (int i = 0; i < cant; i++) {
            jugadores.add(new Jugador());
        }
        return jugadores;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r1, Juego j1) {
        j1.setJugadores(jugadores);
        j1.setR1(r1);
    }

    public void ronda(Juego game) {
        JugadorService sv = new JugadorService();
        boolean gamerOver = false;
        while (gamerOver == false) {
            for (Jugador aux : game.getJugadores()) {
                if (!aux.isMojado()) {
                    System.out.println(aux.getNombre() + " se apunta.... y dispara!");
                    if (sv.disparo(game.getR1(), aux)) {

                        aux.setMojado(true);
                        System.out.println("¡¡¡MOJADO!!!");
                        gamerOver = true;
                        break;
                    } else {
                        System.out.println("Se salvó :)");
                    }
                }
            }
        }
    }
}
