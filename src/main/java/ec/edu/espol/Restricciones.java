package ec.edu.espol;

import java.util.List;

public class Restricciones {
    private List<String> restricciones;

    public Restricciones(List<String> restricciones) {
        this.restricciones = restricciones;
    }

    public List<String> getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(List<String> restricciones) {
        this.restricciones = restricciones;
    }

    public void agregarRestriccion(String restriccion) {
        this.restricciones.add(restriccion);
    }

    public void eliminarRestriccion(String restriccion) {
        this.restricciones.remove(restriccion);
    }

    @Override
    public String toString() {
        return "Restricciones{" +
                "restricciones=" + restricciones +
                '}';
    }
}
