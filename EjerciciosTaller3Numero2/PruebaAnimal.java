package EjerciciosTaller3Numero2;

public class PruebaAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Perro perro = new Perro();
        Gato gato = new Gato();

        animal.hacerSonido();
        perro.hacerSonido("Guau");
        gato.hacerSonido();
    }
}