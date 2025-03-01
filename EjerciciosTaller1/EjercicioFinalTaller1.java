package EjerciciosTaller1;

import java.util.Scanner;

public class EjercicioFinalTaller1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese número de páginas: ");
        int paginas = scanner.nextInt();
        Libro libro = new Libro(titulo, autor, paginas);

        System.out.print("Ingrese número de cuenta: ");
        String numeroCuenta = scanner.nextLine();
        System.out.print("Ingrese tipo de cuenta: ");
        String tipoCuenta = scanner.nextLine();
        System.out.print("Ingrese saldo: ");
        double saldo = scanner.nextDouble();
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);

        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese edad del estudiante: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese curso del estudiante: ");
        String curso = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        System.out.println("\nDetalles de los objetos creados:");
        System.out.println(libro);
        System.out.println(cuenta);
        System.out.println(estudiante);
    }
}
