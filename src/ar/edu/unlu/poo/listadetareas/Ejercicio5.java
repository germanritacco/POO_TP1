package ar.edu.unlu.poo.listadetareas;

import java.time.LocalDate;

public class Ejercicio5 {
    public void ejercicio5() {
        LocalDate fechaManana = LocalDate.now().plusDays(1);
        LocalDate fechaAyer = LocalDate.now().minusDays(1);

        Tarea tarea1 = new Tarea("Ir al supermercado mañana", "Media", false, fechaManana);
        Tarea tarea2 = new Tarea("Consultar repuesto del auto", "Alta", true, fechaAyer);
        Tarea tarea3 = new Tarea("Ir al cine a ver la nueva película de Marvel", "Baja", false, fechaAyer);

        System.out.println("Tarea 1: " + tarea1.mostrarTarea());
        System.out.println("Tarea 1 está vencida: " + tarea1.getTareaVencida());
        System.out.println("Tarea 1 está completa: " + tarea1.getEstado());

        System.out.println("Tarea 2: " + tarea2.mostrarTarea());
        System.out.println("Tarea 2 está vencida: " + tarea2.getTareaVencida());
        System.out.println("Tarea 2 está completa: " + tarea2.getEstado());

        System.out.println("Tarea 3: " + tarea3.mostrarTarea());
        System.out.println("Tarea 3 está vencida: " + tarea3.getTareaVencida());
        System.out.println("Tarea 3 está completa: " + tarea3.getEstado());
    }
}
