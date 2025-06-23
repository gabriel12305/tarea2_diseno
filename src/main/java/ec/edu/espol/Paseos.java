package ec.edu.espol;

public class Paseos implements ServicioEspecializado{

    

    @Override
    public void iniciar() {
        System.out.println("Inicia el Servicio");
    }

    @Override
    public void setPrecio(Double precio) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrecio'");
    }

    @Override
    public void setCapacidad(int capacidad) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCapacidad'");
    }
}
