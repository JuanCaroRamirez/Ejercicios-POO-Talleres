package EjerciciosTaller4;

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        } else {
            System.out.println("Error: La cantidad debe ser positiva.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: " + this.saldo);
    }
}

class PruebaCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000.0);

        cuenta.depositar(500.0);
        cuenta.mostrarSaldo();

    }
}