package ar.edu.unlu.poo.listadetareas;

import ar.edu.unlu.poo.consoleformat.AnsiColor;

import java.time.LocalDate;

public class Ejercicio5 {
    public void ejercicio5() {
        LocalDate fechaManana = LocalDate.now().plusDays(1);
        LocalDate fechaAyer = LocalDate.now().minusDays(1);

        Tarea tarea1 = new Tarea("Ir al supermercado mañana", "Media", false, fechaManana);
        Tarea tarea2 = new Tarea("Consultar repuesto del auto", "Alta", true, fechaAyer);
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel", "Baja", false, fechaAyer);

        System.out.print(AnsiColor.YELLOW + "Tarea 1: \n" + tarea1.mostrarTarea());
        System.out.println(AnsiColor.BLUE + "" + AnsiColor.BOLD + "Tarea 1 está vencida: " + AnsiColor.YELLOW + tarea1.getTareaVencida());
        System.out.println(AnsiColor.BLUE + "" + AnsiColor.BOLD + "Tarea 1 está completa: " + AnsiColor.YELLOW + tarea1.getEstado() + "\n");

        System.out.print("Tarea 2: \n" + tarea2.mostrarTarea());
        System.out.println(AnsiColor.BLUE + "" + AnsiColor.BOLD + "Tarea 2 está vencida: " + AnsiColor.YELLOW + tarea2.getTareaVencida());
        System.out.println(AnsiColor.BLUE + "" + AnsiColor.BOLD + "Tarea 2 está completa: " + AnsiColor.YELLOW + tarea2.getEstado() + "\n");

        System.out.print("Tarea 3: \n" + tarea3.mostrarTarea());
        System.out.println(AnsiColor.BLUE + "" + AnsiColor.BOLD + "Tarea 3 está vencida: " + AnsiColor.YELLOW + tarea3.getTareaVencida());
        System.out.println(AnsiColor.BLUE + "" + AnsiColor.BOLD + "Tarea 3 está completa: " + AnsiColor.YELLOW + tarea3.getEstado() + "\n");
    }
}
