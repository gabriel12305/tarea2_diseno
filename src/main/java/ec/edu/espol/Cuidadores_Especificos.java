package ec.edu.espol;

public class Cuidadores_Especificos extends Servicios_Adicionales{
    private Double precio;
    private int capacidad;
    public Cuidadores_Especificos(ServicioEspecializado servicioEspecializado) {
        super(servicioEspecializado);
    }

    @Override
    public void iniciar(){
        servicioEspecializado.iniciar();
        System.out.println("Se agrego un cuidador especifico");
    }

    public Double getPrecio() {
        return precio;
    }
    @Override
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCapacidad() {
        return capacidad;
    }
    @Override
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
}
