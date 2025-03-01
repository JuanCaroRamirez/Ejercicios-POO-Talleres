package EjerciciosTaller4Numero2;

class CuentaBancaria {

    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: El saldo no puede ser negativo.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo: " + saldo);
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldoInicial;
    }
}

// Clase de prueba
class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("123456789", "Ahorros", 1000.0);

        cuenta.tipoCuenta = "Corriente";
        System.out.println("Tipo de Cuenta: " + cuenta.tipoCuenta);

        cuenta.setSaldo(1500.0);
        System.out.println("Saldo: " + cuenta.getSaldo());

        cuenta.mostrarDetalles();

    }
}