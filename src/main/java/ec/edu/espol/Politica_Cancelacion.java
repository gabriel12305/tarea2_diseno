package ec.edu.espol;

import java.time.LocalDateTime;

public class Politica_Cancelacion {
    private int id;
    private String descripcion;
    private LocalDateTime tiempoLimite;
    private double penalizacion;

    public Politica_Cancelacion(int id, String descripcion, LocalDateTime tiempoLimite, double penalizacion) {
        this.id = id;
        this.descripcion = descripcion;
        this.tiempoLimite = tiempoLimite;
        this.penalizacion = penalizacion;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDateTime getTiempoLimite() {
        return tiempoLimite;
    }

    public double getPenalizacion() {
        return penalizacion;
    }

    @Override
    public String toString() {
        return "Política_Cancelacion{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", tiempoLimite=" + tiempoLimite +
                ", penalizacion=" + penalizacion +
                '}';
    }
}
