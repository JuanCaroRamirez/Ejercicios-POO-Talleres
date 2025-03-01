package EjerciciosTaller4;

public class PruebaCoche {
    public static void main(String[] args) {
        Coche coche = new Coche();

        coche.setMarca("Toyota");
        coche.setModelo("Corolla");

        // Acelerar
        coche.acelerar(50);
        coche.acelerar(-10);

        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Velocidad Máxima: " + coche.getVelocidadMaxima() + " km/h");

    }
}