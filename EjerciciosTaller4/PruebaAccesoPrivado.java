package EjerciciosTaller4;

class Persona {
    private String nombre; // Propiedad privada
}

public class PruebaAccesoPrivado {
    public static void main(String[] args) {
        Persona persona = new Persona();

        // Intentar acceder directamente a una propiedad privada (error de compilación)
        // persona.nombre = "Juan"; // Error: nombre tiene acceso privado
    }
}