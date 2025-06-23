package ec.edu.espol;

import java.time.LocalDateTime;

public class Incidente {
    private int id;
    private String tipo;
    private String descripcion;
    private LocalDateTime fecha;

    public Incidente(int id, String tipo, String descripcion, LocalDateTime fecha) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Incidente{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
