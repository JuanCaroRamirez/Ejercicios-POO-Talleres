package EjerciciosTaller3Numero2;
class Animal {
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {
    public void hacerSonido(String sonido) {
        System.out.println("El perro hace: " + sonido);
    }
}

class Gato extends Animal {
    public void hacerSonido() {
        System.out.println("El gato maulla.");
    }
}