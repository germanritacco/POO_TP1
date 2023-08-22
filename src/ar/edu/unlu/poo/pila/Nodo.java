package ar.edu.unlu.poo.pila;

public class Nodo {

    private Object dato;

    private Nodo siguiente = null;

    private Nodo tope = null;

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public void setSiguiente(Nodo nodo) {
        this.siguiente = nodo;
    }

    public void setTope(Nodo nodo) {
        this.tope = nodo;
    }

    public Object getDato() {
        return dato;
    }

    public Nodo getTope() {
        return tope;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

}
