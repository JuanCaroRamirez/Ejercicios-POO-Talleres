class Libro {
    String titulo;
    String autor;
    int numeroPaginas;

    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Anonimo";
        this.numeroPaginas = 100;

    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public void mostrarDetallesLibro() {
        System.out.println("Titulo: " + titulo + "Autor: " + autor + "Numero de paginas: " + numeroPaginas);

    }
}