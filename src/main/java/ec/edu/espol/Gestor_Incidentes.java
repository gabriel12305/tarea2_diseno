package ec.edu.espol;

import java.util.ArrayList;
import java.util.List;

public class Gestor_Incidentes {
    private List<Incidente> incidentes;

    public Gestor_Incidentes() {
        this.incidentes = new ArrayList<>();
    }

    public void reportarIncidente(Incidente incidente) {
        this.incidentes.add(incidente);
        System.out.println("Incidente reportado: " + incidente);
    }

    public List<Incidente> getIncidentes() {
        return incidentes;
    }
}
