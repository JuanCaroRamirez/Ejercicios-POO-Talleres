package EjerciciosTaller5;

class Banco {
    protected double saldo; // Propiedad protected (no es segura)

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}

// Usar protected para saldo no es seguro porque permite el acceso desde
// subclases y clases en el mismo paquete
// Esto puede llevar a modificaciones no controladas del saldo

// Solucion: Encapsular saldo como private y proporcionar métodos públicos para
// acceder y modificar el saldo.
class BancoSeguro {
    private double saldo;

    public BancoSeguro(double saldoInicial) {
        this.saldo = saldoInicial;
    }

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

    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}

class PruebaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco(1000.0);
        banco.mostrarSaldo();

        BancoSeguro bancoSeguro = new BancoSeguro(2000.0);
        bancoSeguro.mostrarSaldo();
        bancoSeguro.setSaldo(2500.0);
        bancoSeguro.mostrarSaldo();
    }
}