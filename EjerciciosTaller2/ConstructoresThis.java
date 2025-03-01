package EjerciciosTaller2;

class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante() {
        this("Sin nombre", 18);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarEstudiante() {
        System.out.println("Estudiante: " + nombre + "Edad: " + edad);
    }
}
