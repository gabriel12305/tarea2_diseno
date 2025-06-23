package ec.edu.espol;

import java.time.LocalDateTime;
@SuppressWarnings("all")
public class Cita {
    private LocalDateTime fecha;
    private LocalDateTime  hora;
    private EstadoCita estado;
    private double pagoFinal;

    private GestorCitas gCitas;
    private Horario horario;
    private Mensajeria mensajeria;
    //Falta serviciio especial
    //Falta paquete
    

    public void verServiciosDisponibles() {}
    public void verPersonalDisponible() {}
    public void confirmacionCita() {}
}
