package EjerciciosTaller4;

class Estudiante {

    private String nombre;
    private int edad;
    private double notaPromedio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe estar entre 0 y 120.");
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0.0 && notaPromedio <= 10.0) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Error: La nota promedio debe estar entre 0.0 y 10.0.");
        }
    }
}