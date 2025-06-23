package ec.edu.espol;

public abstract class Servicios_Adicionales implements ServicioEspecializado{
    protected ServicioEspecializado servicioEspecializado;
    protected static Double precio;
    protected static int capacidad;

    public Servicios_Adicionales(ServicioEspecializado servicioEspecializado){
        this.servicioEspecializado =servicioEspecializado;
    }

    @Override
    public void iniciar(){ 
        servicioEspecializado.iniciar();
    }
}
