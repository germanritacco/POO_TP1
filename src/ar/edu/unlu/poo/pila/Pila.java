package ar.edu.unlu.poo.pila;

public class Pila {

    private Nodo nuevo = null;

    public void apilar(Object Dato) {
        Nodo NodoAux = new Nodo();
        NodoAux.setDato(Dato);
        NodoAux.setTope(nuevo);
    }

    public Object desapilar() {
        Nodo NodoAux = new Nodo();
        NodoAux.setDato(nuevo.getDato());
        nuevo.setTope(nuevo.getSiguiente());
        return NodoAux.getDato();
    }

    public String mostrar() {
        Nodo nuevo;
        return "a";
    }

}

