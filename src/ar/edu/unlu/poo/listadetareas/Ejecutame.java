package ar.edu.unlu.poo.listadetareas;

import ar.edu.unlu.poo.consoleformat.AnsiColor;

public class Ejecutame {
    public static void main(String[] args) {
        System.out.println(AnsiColor.GREEN + "EJERCICIO 5: LISTA DE TAREAS \n");
        Ejercicio5 ej5 = new Ejercicio5();
        ej5.ejercicio5();
        System.out.println(AnsiColor.GREEN + "EJERCICIO 12: ADMINISTRADOR DE TAREAS \n");
        Ejercicio12 ej12 = new Ejercicio12();
        ej12.ejercicio12();
    }
}