package ec.edu.espol;

import java.util.List;

public class Paquete {
    private String tipo;
    private List<ServicioEspecializado> servicios;
    

    public void agregarServicio(){
        System.out.println("Se agrega el servicio a la lista");
    }

    public void eliminarServicio(){
        System.out.println("Se elimina el servicio de la lista");
    }

    public void verServicios(){
        System.out.println("Ver los servicios de la lista");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<ServicioEspecializado> getServicios() {
        return servicios;
    }

    public void setServicios(List<ServicioEspecializado> servicios) {
        this.servicios = servicios;
    }

    
}
