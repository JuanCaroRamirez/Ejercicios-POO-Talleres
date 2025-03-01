package EjerciciosTaller3.Personas;

public class PruebaPersonas {
    public static void main(String[] args) {
        Persona persona = new Persona("Carlos", 25);

        System.out.println("Edad: " + persona.edad);

        System.out.println("Nombre: " + persona.getNombre());

        // persona.nombre; / daria error porque `nombre` es privado
    }
}