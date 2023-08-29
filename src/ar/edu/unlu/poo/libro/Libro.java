package ar.edu.unlu.poo.libro;

public class Libro {

    private Object nombre;

    private Object autor;

    private Object paginas;

    private Object prestamos;

    private Object ejemplares;


    public void setNombre(Object dato) {
        nombre = dato;
    }

    public void setAutor(Object dato) {
        autor = dato;
    }

    public void setPaginas(Object dato) {
        paginas = dato;
    }

    public void setPrestamos (Object dato) {
        prestamos = dato;
    }

    public void setEjemplares (Object dato) {
        ejemplares = dato;
    }

    public Object getNombre() {
        return nombre;
    }

    public Object getAutor() {
        return autor;
    }

    public Object getPaginas() {
        return paginas;
    }

    public Object getPrestamos() {
        return prestamos;
    }

    public Object getEjemplares() {
        return ejemplares;
    }

    public Object buscar (String string){


    }
}
