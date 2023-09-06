package ar.edu.unlu.poo.pila;

public class Nodo {

    private Object dato;

    private Nodo siguiente;

    public Nodo(Object datos) {
        this.dato = datos;
        this.siguiente = null;
    }

    public Object getDatos() {
        return dato;
    }

    public void setDatos(Object datos) {
        this.dato = datos;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
