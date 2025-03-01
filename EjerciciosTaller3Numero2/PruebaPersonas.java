package EjerciciosTaller3Numero2;

public class PruebaPersonas {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Estudiante estudiante = new Estudiante();
        Profesor profesor = new Profesor();

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();

        Persona[] personas = { new Persona(), new Estudiante(), new Profesor() };
        for (Persona p : personas) {
            p.presentarse();
        }
    }
}