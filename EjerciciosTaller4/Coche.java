package EjerciciosTaller4;

class Coche {

    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
            System.out.println("Velocidad máxima incrementada a: " + this.velocidadMaxima + " km/h");
        } else {
            System.out.println("Error: El incremento debe ser positivo.");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
}