package Libros;

class PublicacionLibros {
    protected String titulo;
    protected float precio;

    public PublicacionLibros(String titulo, float precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Precio: $" + precio);
    }
}
