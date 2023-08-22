package ar.edu.unlu.poo.pila;

public class Pila {

    private Nodo nuevo = null;

    public void apilar(Nodo pila, Object Dato) {
        Nodo NodoAux = nuevo;
        NodoAux.setDato(Dato);
        NodoAux.setSiguiente(pila.getTope());
        pila.setTope(NodoAux);
    }

}

