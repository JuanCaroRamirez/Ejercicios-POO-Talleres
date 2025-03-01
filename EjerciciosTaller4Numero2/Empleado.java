package EjerciciosTaller4Numero2;

class Empleado {

    public String nombre;
    private double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: El salario no puede ser negativo.");
        }
    }
}

class PruebaEmpleado {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();

        empleado.nombre = "Juan Pérez";
        System.out.println("Nombre: " + empleado.nombre);

        empleado.setSalario(2500.0);
        System.out.println("Salario: " + empleado.getSalario());

        empleado.setSalario(-1000.0);
    }
}