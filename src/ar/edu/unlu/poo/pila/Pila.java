package ar.edu.unlu.poo.pila;

import java.util.EmptyStackException;

public class Pila {

    private Nodo tope;

    public Pila() {
        tope = null;
    }

    public void apilar(Object elemento) {
        Nodo nuevoNodo = new Nodo(elemento);
        nuevoNodo.siguiente = tope;
        tope = nuevoNodo;
    }

    public Object desapilar() {
        if (esVacia()) {
            throw new EmptyStackException();
        }
        Object elemento = tope.datos;
        tope = tope.siguiente;
        return elemento;
    }

    public Object recuperar() {
        if (esVacia()) {
            throw new EmptyStackException();
        }
        return tope.datos;
    }

    public boolean esVacia() {
        return tope == null;
    }

    public int longitud() {
        int n = 0;
        Pila pilaAuxiliar = new Pila();
        while (!esVacia()) {
            Object elemento = desapilar();
            pilaAuxiliar.apilar(elemento);
            n++;
        }
        // Recorro la pila auxiliar para pasarla a la original
        while (!pilaAuxiliar.esVacia()) {
            Object elemento = pilaAuxiliar.desapilar();
            apilar(elemento);
        }
        return n;
    }

    public void mostrar() {
        if (esVacia()) {
            System.out.println("La pila está vacía");
            return;
        }
        Pila pilaAuxiliar = new Pila();
        System.out.print("Contenido de la pila: ");
        // Recorro la pila desapilándola y pasándola a la auxiliar
        while (!esVacia()) {
            Object elemento = desapilar();
            System.out.print(elemento.toString() + " ");
            pilaAuxiliar.apilar(elemento);
        }
        System.out.println();
        // Recorro la pila auxiliar para pasarla a la original
        while (!pilaAuxiliar.esVacia()) {
            Object elemento = pilaAuxiliar.desapilar();
            apilar(elemento);
        }
    }

    private static class Nodo {
        Object datos;
        Nodo siguiente;

        Nodo(Object datos) {
            this.datos = datos;
        }
    }

}

