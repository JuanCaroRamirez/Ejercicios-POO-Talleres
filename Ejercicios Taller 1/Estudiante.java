class Estudiante {
    String nombre;
    int edad;
    String curso;

    public Estudiante() {

        this.nombre = "Sin nombre";
        this.edad = 18;
        this.curso = "Sin curso";

    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;

    }

}