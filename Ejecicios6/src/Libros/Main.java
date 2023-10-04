package Libros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del libro:");
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Precio: $");
        float precioLibro = scanner.nextFloat();
        System.out.print("Número de Páginas: ");
        int numPaginas = scanner.nextInt();
        System.out.print("Año de Publicación: ");
        int añoPublicacion = scanner.nextInt();

        System.out.println("Ingrese los datos del disco:");
        System.out.print("Título: ");
        scanner.nextLine(); 
        String tituloDisco = scanner.nextLine();
        System.out.print("Precio: $");
        float precioDisco = scanner.nextFloat();
        System.out.print("Duración en Minutos: ");
        float duracionMinutos = scanner.nextFloat();

        Libro libro = new Libro(tituloLibro, precioLibro, numPaginas, añoPublicacion);
        Disco disco = new Disco(tituloDisco, precioDisco, duracionMinutos);

        System.out.println("\nDatos del Libro:");
        libro.mostrar();

        System.out.println("\nDatos del Disco:");
        disco.mostrar();

        scanner.close();
    }
}