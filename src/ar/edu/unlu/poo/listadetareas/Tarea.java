package ar.edu.unlu.poo.listadetareas;

import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private String prioridad;
    private boolean estado;
    private LocalDate fechaLimite;

    public Tarea(String descripcion, String prioridad, boolean estado, LocalDate fechaLimite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = estado;
        this.fechaLimite = fechaLimite;
    }

    public void setDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

    public void setPrioridad(String nuevaPrioridad) {
        this.prioridad = nuevaPrioridad;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean getTareaVencida() {
        return !estado && LocalDate.now().isAfter(fechaLimite);
    }

    public boolean getEstado() {
        return estado;
    }

    public String mostrarTarea() {
        if (getEstado()) {
            return "(Vencida) " + descripcion;
        } else {
            return descripcion;
        }
    }

}
