package EjerciciosTaller2;

class Ejemplo {
    private static String mensaje = "Hola";

    public static void mostrarMensaje() {
        System.out.println(this.mensaje); // Cannot use this in a static context
    }
}

// Codigo corregido
class Ejemplo {
    private static String mensaje = "Hola";

    public static void mostrarMensaje() {
        System.out.println(mensaje);
    }
}
