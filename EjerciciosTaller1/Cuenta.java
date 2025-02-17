class CuentaBancaria {
    String numeroCuenta;
    double saldo;
    String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = "00000000";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorro";

    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;

    }
}
