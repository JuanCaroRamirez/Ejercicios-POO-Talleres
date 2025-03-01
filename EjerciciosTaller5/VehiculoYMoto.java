package EjerciciosTaller5;

class Vehiculo {
    protected String tipo;
    protected String marca;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }
}

class Moto extends Vehiculo {
    private int cilindrada;

    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca);
        this.cilindrada = cilindrada;
    }

    public void mostrarDetalles() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Cilindrada: " + cilindrada);
    }
}

class PruebaVehiculo {
    public static void main(String[] args) {
        Moto moto = new Moto("Deportiva", "Yamaha", 600);
        moto.mostrarDetalles();

        // Si intentas acceder a miembros protected desde una clase no relacionada,
        // obtendras un error de compilacion
        // Vehiculo vehiculo = new Vehiculo("Automóvil", "Toyota");
        // System.out.println(vehiculo.tipo); // Error: tipo tiene acceso protected
    }
}