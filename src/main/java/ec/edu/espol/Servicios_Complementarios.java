package ec.edu.espol;

public class Servicios_Complementarios extends Servicios_Adicionales{
    private String tipo;
    private Double precio;
    private int capacidad;

    public Servicios_Complementarios(ServicioEspecializado servicioEspecializado) {
        super(servicioEspecializado);
    }

    @Override
    public void iniciar(){
        servicioEspecializado.iniciar();
        System.out.println("Se agrego un Servicio Complementario");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
