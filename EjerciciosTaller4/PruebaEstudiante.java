package EjerciciosTaller4;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        estudiante.setNombre("Juan");
        estudiante.setEdad(20);
        estudiante.setNotaPromedio(8.5);

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Nota Promedio: " + estudiante.getNotaPromedio());

        // Intentos incorrectos
        estudiante.setNombre(""); // Nombre no puede estar vacío
        estudiante.setEdad(150); // Edad fuera de rango
        estudiante.setNotaPromedio(11.0); // Nota fuera de rango
    }
}