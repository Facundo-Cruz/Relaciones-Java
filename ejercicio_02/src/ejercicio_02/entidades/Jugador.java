
package ejercicio_02.entidades;


//@author Facundo Cruz

public class Jugador {
    private static int contadorJugadores = 1;
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador() {
        this.id = Jugador.contadorJugadores++;
        this.nombre = "Jugador " + this.id;
        this.mojado = false;
    }

    public Jugador(int id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
}