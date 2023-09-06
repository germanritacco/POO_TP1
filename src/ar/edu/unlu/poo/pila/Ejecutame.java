package ar.edu.unlu.poo.pila;

public class Ejecutame {

    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.apilar(1);
        pila.apilar(2);
        pila.apilar(3);

        pila.mostrar();
        System.out.println("Tope de la pila: " + pila.recuperar());

        pila.desapilar();
        pila.mostrar();

        System.out.println("Longitud de la pila: " + pila.longitud());
    }
}
