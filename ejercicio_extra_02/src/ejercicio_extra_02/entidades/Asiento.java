/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicio_extra_02.entidades;


//@author Facundo Cruz

public class Asiento {
    private char letra;
    private int numero;
    private boolean ocupado;
    private Espectador espectador;

    public Asiento() {
        this.ocupado = false;
    }

    public Asiento(char letra, int numero) {
        this.letra = letra;
        this.numero = numero;
        this.ocupado = false;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
        this.ocupado = true;
    }

    @Override
    public String toString() {
        String texto = numero+""+letra;
        if (ocupado) {
            texto += "X";
        }else{
            texto += "  ";
        }
        return texto;
    }
    
}
