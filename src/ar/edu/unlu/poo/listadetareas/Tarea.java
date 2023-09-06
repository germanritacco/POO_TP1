package ar.edu.unlu.poo.listadetareas;

import java.time.LocalDate;

import ar.edu.unlu.poo.consoleformat.*;

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

    public String getPrioridad() {
        return prioridad;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void marcarComoCompleta() {
        this.estado = true; // Establecer el estado como completo
    }

    public String toString() {
        String mensaje = "";
        if (getTareaVencida()) {
            mensaje = AnsiColor.RED + "(Vencida)";
        }
        mensaje += AnsiColor.BLUE + "" + AnsiColor.BOLD + " Descripción: " + AnsiColor.YELLOW + descripcion + "\n";
        mensaje += AnsiColor.BLUE + "" + AnsiColor.BOLD + " Prioridad: " + AnsiColor.YELLOW + prioridad + "\n";
        mensaje += AnsiColor.BLUE + "" + AnsiColor.BOLD + " Fecha de vencimiento: " + AnsiColor.YELLOW + fechaLimite + "\n";
        return mensaje;
    }

}
