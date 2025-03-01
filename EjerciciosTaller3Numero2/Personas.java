package EjerciciosTaller3Numero2;

class Persona {
    public void presentarse() {
        System.out.println("Hola, soy una persona.");
    }
}

class Estudiante extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un estudiante.");
    }
}

class Profesor extends Persona {
    @Override
    public void presentarse() {
        System.out.println("Hola, soy un profesor.");
    }
}