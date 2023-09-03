package ar.edu.unlu.poo.listadetareas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unlu.poo.consoleformat.*;

public class AdministradorDeTareas {

    private List<Tarea> listaDeTareas;

    public AdministradorDeTareas() {
        listaDeTareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        listaDeTareas.add(tarea);
    }

    public List<Tarea> obtenerTareasNoVencidasOrdenadas() {
        LocalDate fechaActual = LocalDate.now();
        return listaDeTareas.stream()
                .filter(tarea -> !tarea.getTareaVencida() && !tarea.getEstado())
                .sorted((tarea1, tarea2) -> {
                    // Ordenar primero por prioridad
                    int tareaConPrioridad = tarea1.getPrioridad().compareTo(tarea2.getPrioridad());
                    if (tareaConPrioridad != 0) {
                        return tareaConPrioridad;
                    }
                    // Ordenar luego por fecha de vencimiento
                    return tarea1.getFechaLimite().compareTo(tarea2.getFechaLimite());
                })
                .collect(Collectors.toList());
    }

    public Tarea buscarTareaPorTitulo(String titulo) {
        return listaDeTareas.stream()
                .filter(tarea -> tarea.getDescripcion().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }

    public String marcarTareaComoRealizada(Tarea tarea) {
        String mensaje = "";
        if (tarea != null) {
            tarea.marcarComoCompleta();
            mensaje = "Tarea '" + tarea.getDescripcion() + "' completada exitosamente!";
        } else {
            mensaje = "Error al procesar la tarea";
        }
        return mensaje;
    }

}
