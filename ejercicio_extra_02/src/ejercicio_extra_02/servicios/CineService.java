/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_extra_02.servicios;

import ejercicio_extra_02.entidades.Asiento;
import ejercicio_extra_02.entidades.Cine;
import java.util.Scanner;

//@author Facundo Cruz
public class CineService {
    
    public Asiento[][] crearSala() {
        Asiento[][] sala = new Asiento[8][6];
        String letras = "ABCDEF";
        int num = 8;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                sala[i][j] = new Asiento(letras.charAt(j), num);
            }
            num--;
        }
        return sala;
    }
    
    public Cine crearCine() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PeliculaService sv = new PeliculaService();
        Cine c1 = new Cine();
        c1.setSala(crearSala());
        c1.setPelicula(sv.crearPelicula());
        System.out.println("Ingrese el precio de la entrada");
        c1.setPrecioEntrada(leer.nextDouble());
        return c1;
    }
    
    public boolean hayEspacio(Asiento[][] sala) {
        
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[0].length; j++) {
                if (sala[i][j].getEspectador() == null) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void mostrarSala(Asiento[][] sala) {
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[i].length; j++) {
                System.out.print(sala[i][j] + " ");
                if (j != sala[i].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println("");
        }
    }
}
