package EjerciciosTaller3Numero2;
public class PruebaVehiculo {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        Bicicleta bicicleta = new Bicicleta();

        vehiculo.moverse();    // Salida: El vehículo se está moviendo.
        bicicleta.moverse();   // Salida: La bicicleta está pedaleando.
    }
}
