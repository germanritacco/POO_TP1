package ar.edu.unlu.poo.listadetareas;

import ar.edu.unlu.poo.consoleformat.AnsiColor;
import java.time.LocalDate;
import java.util.List;

public class Ejercicio12 {

    public void ejercicio12() {
        AdministradorDeTareas administrador = new AdministradorDeTareas();

        // Crear tareas
        Tarea tarea1 = new Tarea("Ir al supermercado mañana", "Alta", false, LocalDate.now().plusDays(1));
        Tarea tarea2 = new Tarea("Consultar repuesto del auto", "Baja", false, LocalDate.now().minusDays(1));
        Tarea tarea3 = new Tarea("Hacer ejercicio", "Media", false, LocalDate.now().plusDays(2));
        Tarea tarea4 = new Tarea("Entregar TP2 para POO", "Alta", false, LocalDate.now().plusDays(2));
        Tarea tarea5 = new Tarea("Estudiar para el final de POO", "Alta", false, LocalDate.now().plusDays(30));

        // Agregar tareas al administrador
        administrador.agregarTarea(tarea1);
        administrador.agregarTarea(tarea2);
        administrador.agregarTarea(tarea3);
        administrador.agregarTarea(tarea4);
        administrador.agregarTarea(tarea5);

        // Marcar una tarea como realizada
        System.out.println(AnsiColor.YELLOW + administrador.marcarTareaComoRealizada(tarea2));

        // Obtener y mostrar tareas no vencidas ordenadas
        System.out.println(AnsiColor.MAGENTA + "Tareas no vencidas, ordenadas por prioridad y fecha de vencimiento: \n");
        List<Tarea> tareasNoVencidas = administrador.obtenerTareasNoVencidasOrdenadas();
        for (Tarea tarea : tareasNoVencidas) {
            System.out.println(tarea.mostrarTarea());
        }
    }
}
