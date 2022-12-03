//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.
package ejercicio_01;

//@author Facundo Cruz
import ejercicio_01.entidades.Perro;
import ejercicio_01.entidades.Persona;

public class Ejercicio_01 {

    public static void main(String[] args) {
        Perro p1 = new Perro("Pepito", "Caniche", 5, "Chico");
        Perro p2 = new Perro("Tomate", "Beagle", 10, "Mediano");
        Persona per1 = new Persona("Facu", "Cruz", 20, 44537914, p1);
        Persona per2 = new Persona("Agus", "Cañas", 35, 3137914, p2);
        System.out.println(per1);
        System.out.println(per2);
    }

}
