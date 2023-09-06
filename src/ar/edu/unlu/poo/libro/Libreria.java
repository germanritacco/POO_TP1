package ar.edu.unlu.poo.libro;


import java.util.ArrayList;
import java.util.List;

public class Libreria {

    private List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> buscarPorTitulo(String titulo) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

    public List<Libro> buscarPorAutor(String autor) {
        List<Libro> resultados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().equalsIgnoreCase(autor)) {
                resultados.add(libro);
            }
        }
        return resultados;
    }

}
