package ar.edu.unlu.poo.libro;

import ar.edu.unlu.poo.lista.Nodo;

import java.util.ArrayList;

public class Libreria {
    private Libro ejemplar = null;

    public ArrayList<Libro> agregar(){
        ArrayList<Libro> libreria = new ArrayList<>();
        Libro nuevoLibro = new Libro();
        nuevoLibro.setNombre("El señor de los anillos");
        nuevoLibro.setAutor("Tolkien");
        nuevoLibro.setPaginas(70);
        nuevoLibro.setEjemplares(4);
        nuevoLibro.setPrestamos(0);
        libreria.add(nuevoLibro);
        Libro nuevoLibro2 = new Libro();
        nuevoLibro2.setNombre("Cancion de hielo y fuego");
        nuevoLibro2.setAutor("Georg RR Martin");
        nuevoLibro2.setPaginas(45);
        nuevoLibro2.setEjemplares(1);
        nuevoLibro2.setPrestamos(0);
        libreria.add(nuevoLibro2);
        Libro nuevoLibro3 = new Libro();
        nuevoLibro3.setNombre("Harry Potter");
        nuevoLibro3.setAutor("J.K Rowling");
        nuevoLibro3.setPaginas(730);
        nuevoLibro3.setEjemplares(1000000);
        nuevoLibro3.setPrestamos(0);
        libreria.add(nuevoLibro3);
        return libreria;
    }

    public Object buscar(Object string, ArrayList<Libro> libreria){
        Integer i;
        for (i=0; i<= libreria.size();i++){
            Libro recuperarlibro = libreria.get(i);
            if ((recuperarlibro.getNombre().equals(string)) || (recuperarlibro.getAutor().equals(string))) {
                return recuperarlibro;
            }

        }
        return "No se encontro el libro";
    }
}
