package ar.edu.unlu.poo.libro;

import java.util.List;

public class Ejecutame {

    public static void main(String[] args) {
        Libreria biblioteca = new Libreria();

        Libro libro1 = new Libro("Título del Libro 1", "Autor 1", 300, 10);
        Libro libro2 = new Libro("Título del Libro 2", "Autor 2", 400, 1);

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Determinar cuál de los dos tiene más páginas
        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("El libro 1 tiene más páginas.");
        } else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
            System.out.println("El libro 2 tiene más páginas.");
        } else {
            System.out.println("Ambos libros tienen la misma cantidad de páginas.");
        }

        // Buscar libros por título
        List<Libro> librosPorTitulo = biblioteca.buscarPorTitulo("Título del Libro 1");
        for (Libro libro : librosPorTitulo) {
            System.out.println("Resultado de la búsqueda por título: " + libro);
        }

        // Buscar libros por autor
        List<Libro> librosPorAutor = biblioteca.buscarPorAutor("Autor 2");
        for (Libro libro : librosPorAutor) {
            System.out.println("Resultado de la búsqueda por autor: " + libro);
        }

        // Intentar prestar un libro con 10 ejemplares y uno con 1 solo ejemplar
        libro1.prestar();
        libro2.prestar();

        // Mostrar la cantidad total de préstamos
        int totalPrestamos = libro1.getNumEjemplaresPrestados() + libro2.getNumEjemplaresPrestados();
        System.out.println("Cantidad total de préstamos: " + totalPrestamos);
    }
}
