import ar.edu.unlu.poo.lista.ListaEnlazada;

public class Main {
    public static void main(String[] args) {
        System.out.println(AnsiColor.BLUE + "" + AnsiColor.BOLD + "" + AnsiColor.DOUBLE_UNDERLINE + "Ejercicio 1: Lista enlazada simple" + AnsiColor.RESET);
        ListaEnlazada lista = new ListaEnlazada();
        lista.agregar("Hola");
        lista.agregar("Mundo");
        System.out.println(lista);
    }
}