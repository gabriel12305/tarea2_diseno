package ec.edu.espol;

public class Fechas_Recurrentes extends Servicios_Adicionales{
    private Double precio;
    private int capacidad;

    public Fechas_Recurrentes(ServicioEspecializado servicioEspecializado) {
        super(servicioEspecializado);
    }

    @Override
    public void iniciar(){
        servicioEspecializado.iniciar();
        System.out.println("Se agrego una fecha recurrente");
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
