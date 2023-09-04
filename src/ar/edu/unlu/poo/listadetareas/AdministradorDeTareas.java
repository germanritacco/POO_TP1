package ar.edu.unlu.poo.listadetareas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

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
                .sorted(Comparator.comparing(Tarea::getPrioridad)
                        .thenComparing(Tarea::getFechaLimite))
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
            mensaje = "Tarea '" + tarea.getDescripcion() + "' completada exitosamente! \n";
        } else {
            mensaje = "Error al procesar la tarea \n";
        }
        return mensaje;
    }

}
