package ec.edu.espol;

public class Hospedaje_por_noches implements ServicioEspecializado{
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
