package Libros;

class Libro extends Publicacion {
    private int numPaginas;
    private int añoPublicacion;

    public Libro(String titulo, float precio, int numPaginas, int añoPublicacion) {
        super(titulo, precio);
        this.numPaginas = numPaginas;
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Número de Páginas: " + numPaginas);
        System.out.println("Año de Publicación: " + añoPublicacion);
    }
}
