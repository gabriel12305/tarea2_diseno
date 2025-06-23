package ec.edu.espol;

public class Sesiones_Bienestar implements ServicioEspecializado {
    private Double precio;
    private int capacidad;
    @Override
    public void iniciar() {
        System.out.println("Inicia el Servicio");
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
}
