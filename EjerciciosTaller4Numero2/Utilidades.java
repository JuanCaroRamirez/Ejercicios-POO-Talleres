package EjerciciosTaller4Numero2;

class Utilidades {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return 0;
        }
    }
}

class PruebaUtilidades {
    public static void main(String[] args) {

        System.out.println("Suma: " + Utilidades.sumar(10, 5)); // 15.0
        System.out.println("Resta: " + Utilidades.restar(10, 5)); // 5.0
        System.out.println("Multiplicación: " + Utilidades.multiplicar(10, 5)); // 50.0
        System.out.println("División: " + Utilidades.dividir(10, 5)); // 2.0

        System.out.println("División por cero: " + Utilidades.dividir(10, 0)); // No se puede dividir por cero
    }
}