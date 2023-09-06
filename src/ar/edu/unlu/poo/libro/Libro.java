package ar.edu.unlu.poo.libro;

public class Libro {

    private String titulo;
    private String autor;
    private int numPaginas;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    public Libro(String titulo, String autor, int numPaginas, int numEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.numEjemplares = numEjemplares;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public boolean sePuedePrestar() {
        return numEjemplares > 1; // Solo se puede prestar si quedan más de 1 ejemplar.
    }

    public void prestar() {
        if (sePuedePrestar()) {
            numEjemplares--;
            numEjemplaresPrestados++;
        } else {
            System.out.println("No se puede prestar el libro '" + titulo + "' porque solo queda 1 ejemplar.");
        }
    }

    public void devolver() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            numEjemplares++;
        }
    }

    @Override
    public String toString() {
        return "El libro '" + titulo + "' creado por el autor '" + autor + "' tiene " + numPaginas +
                " páginas, quedan " + numEjemplares + " ejemplares disponibles y se prestaron " +
                numEjemplaresPrestados + " ejemplares.";
    }
}